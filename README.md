# AlationDemo
This repo containing the assignment framework for Alation

Have used the Java + Selenium with Cucumber for achieving the Behaviour Driven Development(BDD) for this assignment.
Using cucumber we can get the nice HTML report too. 

####The Reason for selecting this framework :
 Covert the requirements to Feature file directly and easily with use of cucumber
 Using Maven to build the required dependencies easily with the help of POM.xml
 Can run this framework inform maven and junit is additional advantage 
 We can get the clear and more details HTML report using cucumber and can check the error screenshots in the report
 To achieve the POM and maintaining the Object repository are easy compare to other framework
 
####How to run the tests :
To run the tests you need to use the Runner Class which is AllTest.java
Select the class and run as JUnit
Using the Tags specific scenarios can execute.

####Prerequisites:
To develop the framework you will need to download the following:

Java SDK, Version: 7 - if it's not installed or older than 7, get it from the Oracle website: http://www.oracle.com/technetwork/java/javase/downloads/index.html

Apache Maven, Version: 3 - if it's not installed or older than 3, get it from the Apache Maven Project website: http://maven.apache.org/download.cgi (If we want to run as Maven)

Used ChromeDriver for the convenience and need to update or downgrade depends the ChromeBrowser version.
No need to update the driver for the latest version(v67), otherwise need to change the driver under bin folder

Setting up Java SDK
Java SDK, Version: 7 - if it's not installed or older than 7, get it from the Oracle website: http://www.oracle.com/technetwork/java/javase/downloads/index.html

#####For Mac: Once you have downloaded the JDK and gone through the installation process.

Open up your .bash_profile using vim. vim ~/.bash_profile
Define your Java installation path. export JAVA_HOME=$(/usr/libexec/java_home)
Add JAVA_HOME to your PATH export PATH=$JAVA_HOME/jre/bin:$PATH
#####For Windows: Java SDK

Launch the downloaded exe and follow instructions
Set up JAVA_HOME environment variable (eg. C:\Program Files\Java\jdk1.7.0_67)
Update the Path environment variable to include %JAVA_HOME%\bin
In a console type: java -version, to determine if the installation has been successful

####Reports:
Reports are available in the path /Alation/target.As mentioned in runner file, html and json reports are available.
Locators are available in locators.yml file to maintain the locators, easy to change for future.

####Hooks :
Before and After functionalities are handled in this Class. As a first Step launching the Browser and Open the Amazon site are default and closing the brower in final steps are handle here.
