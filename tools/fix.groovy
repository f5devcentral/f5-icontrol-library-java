import groovy.io.FileType

//Build a list of wsdls
def wsdlDir = "src/main/resources/wsdl"
def wsdlList = []
def wsdlFiles = new File(wsdlDir)
wsdlFiles.eachFileRecurse (FileType.FILES) { file ->
  wsdlList << file.path.replaceAll(".wsdl","").split("/").reverse().first()
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
badNames.each { println "$it.key: $it.value" }


//Build a list of java files
def bindingsDir = "src/generated/java/iControl"
def javaList = []
def javaFiles = new File(bindingsDir)
javaFiles.eachFileRecurse (FileType.FILES) { file ->

  javaList << file
}
// javaList.each {  println it }

for (javaFile in javaList) {
  def name = javaFile.path.replaceAll(".java","").split("/").reverse().first()
  for (badName in badNames) {
      ant.replace(file: javaFile, token: badName.key, value: badName.value)
  }
  for (badName in badNames) {
      if (javaFile.path.contains(badName.key)) {
      	 javaFile.renameTo(javaFile.path.replaceAll(badName.key, badName.value))
      }
  }
}