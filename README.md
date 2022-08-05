# Send an email with the Nylas Java SDK!

Using this sample, you can quickly see how easy it is to start sending emails with Nylas. This readme will cover what you need to get started with this
sample, and provide one way you can run it. You are welcome to run it using something besides IntelliJ and Maven. If you do, feel free to reach out with 
suggestions for this readme. 

# Prerequisites

To try out this project you'll need:
* A Nylas developer account - [sign up for an account here](https://dashboard.nylas.com/). 
* Familiarity with Java

# Get Started - Installation

If you want to follow along with these instructions, you will need IntelliJ, Maven, and Java. Now that all of these tools are easily installable using
homebrew, set up is simple. 

## Install Java
To install Java, just type: 

`brew install java`

## Install Maven
To install Maven, type:

`brew install maven`

## Install IntelliJ
Can you guess what you'll be typing? This one's a little bit less intuitive, but you can install IntelliJ with:

`brew install intellij-idea-ce`

# Set up the Project 
There are a few ways you can set up your project. A really simple way to do this with IntelliJ is like this: 

1. Open IntelliJ and start a new empty project. 

2. Give your project a name in the **Name** field. 

3. Make sure you choose **Java** for the language. 

4. For Build system, choose **Maven**. 

5. Click **Create**. 

6. Your **pom.xml** file will look like this: 

```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>example</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>18</maven.compiler.source>
        <maven.compiler.target>18</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

</project>
```

7. Open the pom.xml file from this repository and copy everything between the <dependencies></dependencies> tags. 

8. Paste what you copied into your pom.xml file, between the </version> end tag and the <properties> tag. It will look like this: 

``` 
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>example</artifactId>
    <version>1.0-SNAPSHOT</version>
<dependencies>
        <dependency>
            <groupId>com.nylas.sdk</groupId>
            <artifactId>nylas-java-sdk</artifactId>
            <version>1.13.0</version>
        </dependency>
</dependencies>
<properties>
        <maven.compiler.source>18</maven.compiler.source>
        <maven.compiler.target>18</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
</properties>

</project>
```

9. In the upper right corner of where you pasted your dependencies, you'll see a little **m** icon with a recycle button next to it. Press that to refresh 
your dependencies and add them. 

You've now set up your dependencies for your project.

## Add a run/debug configuration
The next step is to get a run/debug configuration so we can add our environment variables. 

1. Now let's add a run/debug configuration. Click the drop down that says **Current File** in the top right. 

2. Choose **Edit Configurations**. 

3. Likely, there's no configurations provided for your project, so click **Add new**. 

4. From the list of configuration choices, choose **Application**. 

5. Give your configuration a **name** in the Name field. 

6. For the Main class field, type **emailSend**. 

7. Now it's time to add environment variables to our configuration. 

8. Retrieve your access token out of your Nylas dashboard. If you forgot or lost your token, you can read our documentation about [Generating Access Tokens](https://developer.nylas.com/docs/the-basics/manage-accounts/generate-access-tokens/)
for help. 

9. In the Environment variables field in your configuration in IntelliJ, type ACCESS_TOKEN=your token. 

10. You need to add two more - RECIPIENT_NAME and RECIPIENT_EMAIL. 

11. After adding your variables, click **Apply** and then **OK**. 

You're now ready to build and run your application! 



