package ca.mcit.scala.collections

import scala.io.{BufferedSource, Source}

object FilePractice extends App {

  val filepath = "/home/bd-user/Documents/ScalaClassMCIT/person.csv"
  val source: BufferedSource = Source.fromFile(filepath)
  val input = source.getLines()
      .map(line => line.split(","))
      .map(a => CsvPerson(a(0).toInt,a(1),a(2)))
      .foreach(person => println(person))


  source.close()

}

