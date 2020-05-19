# Spark Scala Starter Project

A simple Scala project that demos reading in a csv file. 

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
