# EnhancedSparkCSV
An enhanced version of Spark-CSV with extra logging functionalities 

## Features
- Malformed rows logging with rejection cause appended
- Parameterised dynamic log paths

## Usage
1) Run ```sbt package``` in the main directory
2) Move the packaged JAR file from ```EnhancedSparkCSV/target/scala-2.11``` to your project's class path
3) Move ```log4j.properties``` from ```EnhancedSparkCSV/extras``` to your project's resources directory
4) Pass the log paths as JVM arguments or set them programmatically (check the provided examples in ```EnhancedSparkCSV/extras```)
