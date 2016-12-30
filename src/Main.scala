import scanner.Scanner

/**
  * Created by sando on 12/11/2016.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val scanner = new Scanner("settings.txt")
    scanner.scanFile("source.txt")
  }
}
