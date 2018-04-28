#jws

````
$ mvn package

$ chmod +x target/generated-resources/appassembler/jsw/app1/bin/app1

$ chmod +x target/generated-resources/appassembler/jsw/app1/bin/wrapper-linux-x86-32

$ target/generated-resources/appassembler/jsw/app1/bin/app1 start

$ ps -ef | grep java
(to check that it is running)

$ target/generated-resources/appassembler/jsw/app1/bin/app1 stop
````
ref [jws](http://www.mojohaus.org/appassembler/appassembler-maven-plugin/usage-jsw.html)

##todo
 - exclude config,eg:logback.xml,config.properties
 - test run in different os
 - fix bug:
 - the process is not pretty,include to many jar