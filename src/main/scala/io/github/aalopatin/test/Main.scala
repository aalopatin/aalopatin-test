package io.github.aalopatin.test

import io.github.aalopatin.test.Util.returnDataFrame
import org.apache.spark.sql.SparkSession

object Main extends App {
    implicit val spark = SparkSession.builder().master("local[*]").getOrCreate()
    spark.sparkContext.setLogLevel("WARN")

    returnDataFrame.show()

}
