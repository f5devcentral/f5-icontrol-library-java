Set JAVALIB=C:\dev\Perforce\devcentral\dc4\Labs\iControlAssembly\java\3rdparty\jar\Axis1.fix2
set AXIS_CLASSPATH=%JAVALIB%\axis.jar;%JAVALIB%\commons-discovery.jar;%JAVALIB%\commons-logging.jar;%JAVALIB%\jaxrpc.jar;%JAVALIB%\junit.jar;%JAVALIB%\saaj.jar;%JAVALIB%\wsdl4j.jar;%JAVALIB%\activation.jar;%JAVALIB%\mail.jar

:set HOST=dc1-prd-asm-01.dc.local
set HOST=bigip.joesmacbook.com
:set HOST=10.128.1.245
set UID=admin
set PWD=admin
set TIMEOUT=10000


c:\Progra~1\Java\jdk1.6.0_45\bin\java.exe -classpath %AXIS_CLASSPATH%;.;..\lib\iControl.jar SystemInfo %HOST% 443 %UID% %PWD% %TIMEOUT%
:c:\jdk1.6.0_16\bin\java.exe -classpath %AXIS_CLASSPATH%;.;..\lib\iControl.jar PoolMember theboss 443 admin admin pool_1 add 1.1.1.1 80
:c:\jdk1.6.0_16\bin\java.exe -classpath %AXIS_CLASSPATH%;.;..\lib\iControl.jar PoolMember theboss 443 admin admin dc-llix-web
:c:\jdk1.6.0_16\bin\java.exe -classpath %AXIS_CLASSPATH%;.;..\lib\iControl.jar PoolMember theboss 443 admin admin pool_1 remove 1.1.1.1 80
:c:\jdk1.6.0_16\bin\java.exe -classpath %AXIS_CLASSPATH%;.;..\lib\iControl.jar PoolMember theboss 443 admin admin pool_1 sessstate 10.10.10.149 80 enable
:c:\jdk1.6.0_16\bin\java.exe -classpath %AXIS_CLASSPATH%;.;..\lib\iControl.jar Main 
:c:\jdk1.6.0_16\bin\java.exe -classpath %AXIS_CLASSPATH%;.;..\lib\iControl.jar PoolMember theboss 443 admin admin noerror getgtmrule foo 10

:c:\jdk1.6.0_16\bin\java.exe -classpath %AXIS_CLASSPATH%;.;..\lib\iControl.jar PoolMember theboss 443 admin admin DC5

:c:\jdk1.6.0_20\bin\java.exe -classpath %AXIS_CLASSPATH%;.;..\lib\iControl.jar LocalLBMonitor 10.50.5.11 443 h-Joe C@nUH3arMe!

:c:\jdk1.6.0_20\bin\java.exe -classpath %AXIS_CLASSPATH%;.;..\lib\iControl.jar PoolMember 10.50.5.11 443 %UID %PWD
:c:\jdk1.6.0_20\bin\java.exe -classpath %AXIS_CLASSPATH%;.;..\lib.11.3-1.6\iControl.jar LocalLBMonitor dc1-prd-asm-01.dc.local 443 %UID% %PWD%
:c:\jdk1.6.0_20\bin\java.exe -classpath %AXIS_CLASSPATH%;.;..\lib.11.3-1.5\iControl.jar LocalLBMonitor %HOST% 80 %UID% %PWD% %TIMEOUT%
