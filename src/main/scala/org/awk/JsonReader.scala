package org.awk

import org.apache.spark.sql.SparkSession
import org.json4s._
import org.json4s.jackson.JsonMethods._

// класс для распарсенного JSON'а
case class Wine (id: Int, country: String, points: Int, title: String, variety: String, winery: String)

object JsonReader extends App{

  // default значение параметра для parse()
  implicit val formats = DefaultFormats

  // функция для парсинга JSON в case класс
  def convertToCaseClass(s: String): Wine = { parse(s).extract[Wine] }

  val ss = SparkSession.builder().appName("JsonReader").getOrCreate()

  val sc = ss.sparkContext

  val filename = args(0)

  // читаем JSON файл, парсим в объекты, забираем 100 штук на driver
  val res = sc
    .textFile(filename)
    .map(convertToCaseClass)
    .take(100)

  // вывод
  res.foreach(println)
}
