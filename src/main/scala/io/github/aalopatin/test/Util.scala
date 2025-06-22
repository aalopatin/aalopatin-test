package io.github.aalopatin.test

import org.apache.spark.sql.{Dataset, SparkSession}

import java.lang

/**
 * Utility object for testing Spark DataFrame creation.
 */
object Util {

  /**
   * Returns a simple Spark Dataset of Long values ranging from 1 to 9 (inclusive).
   *
   * This method is useful for testing purposes when a basic DataFrame is needed.
   *
   * @param spark The implicit SparkSession used to create the Dataset.
   * @return A Dataset[Long] containing the range 1 to 9.
   */
  def returnDataFrame(implicit spark: SparkSession): Dataset[lang.Long] = {
    spark.range(1, 10, 1)
  }
}
