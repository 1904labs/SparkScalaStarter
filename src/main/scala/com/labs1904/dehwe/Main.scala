package com.labs1904.dehwe

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
case class Person(name: String, age: Int, dept: String)

object Main {

  val jobName = "SparkScalaStarter"

  def main(args: Array[String]) = {

    //Create a SparkSession object
    //Note: this line is not needed in the spark-shell: a SparkSession named "spark" is automatically created
    val spark = SparkSession.builder().master("local[1]").appName(jobName).getOrCreate()

    val ratingsDf = spark.read.option("header", true).option("inferSchema", true).csv("src/main/data/movie_ratings.csv")
    ratingsDf.printSchema()
  }

}
