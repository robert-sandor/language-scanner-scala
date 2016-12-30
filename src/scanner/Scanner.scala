package scanner

import java.io.BufferedReader

import scala.collection.mutable
import scala.io.Source

/**
  * Created by sando on 12/11/2016.
  */
class Scanner(settingsFile: String) {
  private val settingsReader: BufferedReader = Source.fromFile(settingsFile).bufferedReader()

  private val delimitersString: String = settingsReader.readLine()
  val delimiters: Set[String] = delimitersString.split(" ").toSet

  private val reservedString:String = settingsReader.readLine()
  val reserved:Set[String] = reservedString.split(" ").toSet

  val programInternalForm:mutable.HashMap[String, Int] = new mutable.HashMap
  settingsReader.lines().forEach((line) => {programInternalForm.put(line.split(" ")(0), line.split(" ")(1).toInt)})

  def scanLine(line: String): Unit = {
//    line.split(" ").foreach(println)
  }

  def scanFile(file: String): Unit = {
    Source.fromFile(file).getLines().foreach(line => scanLine(line))
  }
}
