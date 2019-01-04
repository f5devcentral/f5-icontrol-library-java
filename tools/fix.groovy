import groovy.io.FileType
import java.util.regex.Pattern
import java.io.File


println "Updating class names and references for backward compatibility"

//Build a list of wsdls
def wsdlList = []
def wsdlFiles = new File("${project.basedir}/src/main/resources/wsdl")
wsdlFiles.eachFileRecurse (FileType.FILES) { file ->
  wsdlList << file.path.replaceAll(".wsdl","").split(Pattern.quote(File.separator)).reverse().first()
}
//wsdlList.each {  println it.tokenize('.') }

// Build a list of bad names from wsdls
def badNames = [:]
wsdlList.each {
  def (family, name) = it.tokenize(".")
  if (!family.equals(family.capitalize())) {
    badNames.put(family.capitalize(),family)
  }
  if (!name.equals(name.capitalize())) {
    badNames.put(name.capitalize(),name)
  }

}
//badNames.each { println "$it.key: $it.value" }


//Build a list of java files
def javaList = []
def javaFiles = new File("${project.basedir}/src/generated/java/iControl")
javaFiles.eachFileRecurse (FileType.FILES) { file ->
  javaList << file
}
// javaList.each {  println it }

for (javaFile in javaList) {

  def name = javaFile.path.replaceAll(".java","").split(Pattern.quote(File.separator)).reverse().first()

  //update all references to all badNames inside the file contents
  for (badName in badNames) {
      ant.replace(file: javaFile, token: badName.key, value: badName.value)
  }

  //update the filename
  for (badName in badNames) {
      if (javaFile.path.contains(badName.key)) {
        def fixedName = name.replaceAll (badName.key, badName.value)
	println "Renaming class $name to $fixedName"
	javaFile.renameTo(javaFile.path.replaceAll(badName.key, badName.value))
      }
  }
}