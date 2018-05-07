import scala.xml.XML
import scalatags.Text.all._

import java.nio.file.Files
import java.nio.file.Paths

import com.geirsson.reavealjs.RevealJs
import com.geirsson.reavealjs.SlideDeck
import com.geirsson.reavealjs.Themes

object Decks {
  val flatMap_Oslo_2016 = SlideDeck(
    "Opinionated, automatic code formatting with scalafmt",
    "",
    "Ólafur Páll Geirsson",
    Themes.moon,
    scalatex.flatMap2016())
  val scala_Italy = SlideDeck(
    "Opinionated, automatic code formatting with scalafmt",
    "",
    "Ólafur Páll Geirsson",
    Themes.white,
    scalatex.scalaItaly())
  val scala_eXchange = SlideDeck("Smooth migrations to Dotty with scalafix",
                                 "",
                                 "Ólafur Páll Geirsson",
                                 Themes.beige,
                                 scalatex.scalax())
  val scalasphere = SlideDeck("Refactor with scalafix and scala.meta",
                              "",
                              "Ólafur Páll Geirsson",
                              Themes.blood,
                              scalatex.scalasphere())
  val flatmap_Oslo_2017 = SlideDeck("Move fast and refactor things",
                                    "",
                                    "Ólafur Páll Geirsson",
                                    Themes.simple,
                                    scalatex.flatMap2017())
  val zinc = SlideDeck("Scala's incremental compiler",
                       "",
                       "Jorge Vicente Cantero",
                       Themes.simple,
                       scalatex.zinc())
  val klarna = SlideDeck("A cost analysis of Scala",
                         "",
                         "Jorge Vicente Cantero",
                         Themes.simple,
                         scalatex.klarna())
  val bsp = SlideDeck("The BSP protocol and new IDEAs",
    "",
    "Jorge Vicente Cantero & Justin Kaeser",
    Themes.simple,
    scalatex.bsp())
}

object Main extends App {

  val pp = new scala.xml.PrettyPrinter(80, 2)
  val scalatexOutput = RevealJs.render(Decks.bsp)
//  println(scalatexOutput)
  Files.write(Paths.get("target", "scala-2.11", "classes", "index.html"),
              scalatexOutput.getBytes)
}
