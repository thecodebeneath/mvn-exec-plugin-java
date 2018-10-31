# mvn-exec-plugin-java
Execute a Java program from a maven build, async and without terminating the build on exit

# What's going on?
- Using the exec-maven-plugin:java goal is nice, but if the application launched executes a System.exit(), implicitly or explicitly, it will abnormally terminate the maven build.
- For cases like this, we can just use the exec-maven-plugin:exec goal, and "wrap" the java call. This will allow the maven build to finish normally.

# Example
- This project launches an interactive java GUI application as part of the package phase of the build. When the user exits the app, the build will finish and display the maven project summary. 
- Examine the pom.xml file for how to do this.
