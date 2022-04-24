# cucumberPrec
Study: https://www.guru99.com/gherkin-test-cucumber.html

# Pre prerequisite 
1.	Java (JDK+JRE, version 1.8)
2.	Java programming 
3.	GitHub account
4.	Git configured with your system

# IntelliJ community edition IDE
1. Comes with Maven as build tool
2. Plugins that needs to install in IntelliJ (File>Settings>Plugins)
    * Cucumber for Java plugins
    * Gherkin plugins
    
# Create new Maven Project
1. Create a brand-new project in github.com with README file and .gitignore
2. Copy the git url https://github.com/taltekc/cucumberPrec.git 
3. Git clone https://github.com/taltekc/cucumberPrec.git into local PC
4. Now  project should be cloned in your local PC
5. Open the location where you cloned the project to verify if cloned successfully worked. Example: C:\Users\TalentTEK\Documents\GitHub\cucumberPrec
6. Go to IntelliJ – Click on File>New>Project>Maven
    * Ensure Project SDK set to Java 1.8
    * Click on “Create from archetype” checkbox
    * Click on “maven-archetype-quickstart” from the list
    * Click “Next” button
7. Name should be the same name that you used in Github. Example: “cucumberPrec”
8. GroupId: org.{your Company name}. Example: “org.taltektc”
9. Click “Next” and then click “Finish” button
10. Wait few min and you will get a pop up for POM.xml – click on and keep waiting until all the dependency get downloaded/installed in your local pc
11. Congrats – You created maven project. 
12. Go to POM.xml file and remove the junit dependency
13. Add the dependency which will include the cucumber dependency including maven
14. Remove existing build from POM.xml file and replace the below
15. Save and refresh the project. Wait until all dependency is configured/installed

# Git Bash
1. git add . (to add all the un commit files)
2. git commit -m "message" (what you changed inside the string)
3. git push (push the changes to cloud)

# How to install
mvn compile

# How to run in default
mvn verify

# How to run in different browser, env and tags
mvn verify -Denv=qa -Dbrowser=ch 


