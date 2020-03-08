# Spark Scala Starter Project

A simple Scala project that reads in a local CSV file from "/tmp/people.txt". File should have 1 header line and 3 columns representing name, age, and department.

## File Example
```
Name,Age,Dept
Tim,36,Data Engineering
```
## Building the jar file
From the project directory, eg, /home/tim/SparkScalaStarter:
`mvn clean package`
`
## Running The Example Program

From the project directory, eg, /home/tim/SparkScalaStarter:

```
spark-submit \
--master local[1] \
--num-executors 1 \
--class com.labs1904.dehwe.Main \
target/SparkScalaStarter-1.0-SNAPSHOT.jar
```
