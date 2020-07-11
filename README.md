# Spring Boot JMX Logging - Tomcat - JConsole

This is a simple spring boot project that uses Tomcat to showcase the usage of JMX logging with JConsole. It sets up JMX under Eclipse.
 
## Core Concepts

* **JMX**: Java Management Extensions. Java technology that supplies tools for managing and monitoring applications, system objects, devices and service-oriented networks.
* **RPC**: Remote Procedure Call. Distributed computing concept where a process running on one host can call other on another remote host.
* **RMI**: Remote Method Invocation. Java specific implementation of a Remote Procedure Call.
* **MBeans**: MBeans are bean classes that can be registered with a JMX bus to listen to events arriving on the bus or to send events on the bus or to collect various sorts of data from the other participating Mbeans. It is most often used for health monitoring of application servers. It can check the number of active connections, amount of free memory and many other statistics to an analysis engine.

## Setup
Set up the following properties for the Java VM

```
-Dcom.sun.management.jmxremote.port=7091
-Dcom.sun.management.jmxremote.rmi.port=7091
-Dcom.sun.management.jmxremote.authenticate=false
-Dcom.sun.management.jmxremote.ssl=false
```
_You can force JMX and RMI ports to be same which will mean that you'll only need to punch one hole in the Firewall (if that is your concern). Explicitly setting these values will stop RMI from picking random ports. Setting them to the same value will make sure it opens less ports to listen on._

## Useful Links
* [Connect JVisualVm or JConsole to a remote Tomcat running on AWS EC2 Instance](https://www.youtube.com/watch?v=3o4hS7hg_RU&t=6s)
* [Tomcat JMX under Eclipse](http://www.bigsoft.co.uk/blog/2009/01/18/switch-on-tomcat-jmx-under-eclipse)
* [JMX documentation](https://docs.oracle.com/javase/9/management/monitoring-and-management-using-jmx-technology.htm)

## Technologies used in the example

1. Spring Boot 2.x (spring-boot-starter-web, spring-boot-starter-tomcat)
2. Java 8+
3. Tomcat 8.5.x
4. Maven 3.6.x
 
## Exposed methods in the example

**1. Health Check. HTTP Method: GET**
```
http://localhost:8080/springbootjmx/users/
```

## About me
I am Carlos Becerra - MSc. Softwware & Systems.  But to tell you the truth, I'd prefer to be a passionate developer. You can contact me via:

* [Google+](https://plus.google.com/+CarlosBecerraRodr%C3%ADguez)
* [Twitter](https://twitter.com/CarlosBecerraRo)

_**Any improvement or comment about the project is always welcome! As well as others shared their code publicly I want to share mine! Thanks!**_

## License
```javas
Copyright 2020 Carlos Becerra

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

