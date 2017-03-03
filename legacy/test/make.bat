Set JAVALIB=C:\dev\Perforce\devcentral\dc4\Labs\iControlAssembly\java\3rdparty\jar\Axis1.fix2
:Set JAVALIB=D:\src\perforce\DevCentral\DC4\Labs\iControlAssembly\java\3rdparty.fix
set AXIS_CLASSPATH=%JAVALIB%\axis.jar;%JAVALIB%\commons-discovery.jar;%JAVALIB%\commons-logging.jar;%JAVALIB%\jaxrpc.jar;%JAVALIB%\junit.jar;%JAVALIB%\saaj.jar;%JAVALIB%\wsdl4j.jar;%JAVALIB%\activation.jar;%JAVALIB%\mail.jar
c:\jdk1.6.0_20\bin\javac -classpath %AXIS_CLASSPATH%;..\..\target\iControl-13.0.0.jar SystemInfo.java
:c:\jdk1.6.0_20\bin\javac -classpath %AXIS_CLASSPATH%;..\lib\iControl.jar PoolMember.java
:c:\jdk1.6.0_20\bin\javac -classpath %AXIS_CLASSPATH%;..\lib\iControl.jar Main.java
:c:\Progra~1\Java\jdk1.6.0_45\bin\javac -classpath %AXIS_CLASSPATH%;..\lib\iControl.jar LocalLBMonitor.java
