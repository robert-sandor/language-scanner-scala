import scanner.Scanner

/**
  * Created by sando on 12/11/2016.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val scanner:Scanner = new Scanner()
    scanner.scanFile("source.txt")
  }
}
