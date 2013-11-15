// Using breaks in a scala library
import scala.util.control.Breaks._
import java.io._

val in = new BufferedReader(new InputStreamReader(System.in))

breakable {
  whiel(true) {
    println("? ")
    if (in.readLine() == "") break
  }
}