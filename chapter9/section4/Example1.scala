package chapter9.section4

import java.io.PrintWriter
import java.io.File
import java.util.Date

object Example1 {
  def withPrintWriter(file: File, op: PrintWriter => Unit) {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

  def withPrintWriterCurrying(file: File)(op: PrintWriter => Unit) {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

  withPrintWriter(new File("date.txt"), writer => writer.println(new Date))

  val file = new File("dateCurrying.txt")
  withPrintWriterCurrying(file) {
    writer => writer.println(new Date)
  }
}