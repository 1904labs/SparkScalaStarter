package com.labs1904.dehwe

import org.apache.spark.sql.SparkSession
case class Person(name: String, age: Int, dept: String)

object Main {

  val jobName = "SparkScalaStarter"

  def main(args: Array[String]) = {

    val spark = SparkSession.builder().appName(jobName).getOrCreate()
    import spark.implicits._

    val peopleDs = spark.read.option("header", true).option("inferSchema", true).csv("file:///tmp/people.txt").as[Person]
    peopleDs.printSchema()

    val doubledAges = peopleDs.select($"name", $"age"*2, $"dept")
    doubledAges.foreach(person=>println(person))
    
  }

}
