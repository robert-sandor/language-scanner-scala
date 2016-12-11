package scanner

import scala.io.Source

/**
  * Created by sando on 12/11/2016.
  */
class Scanner {

  def scanLine(line: String) = {
    println(line)
  }

  def scanFile(file: String): Unit = {
    Source.fromFile(file).getLines().foreach(line => scanLine(line))
  }
}
