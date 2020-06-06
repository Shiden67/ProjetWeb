
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._

object helloworld extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(nom: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>hello """),_display_(/*4.14*/nom),format.raw/*4.17*/(""" """),format.raw/*4.18*/("""</h1>
""")))}),format.raw/*5.2*/("""
"""))
      }
    }
  }

  def render(nom:String): play.twirl.api.HtmlFormat.Appendable = apply(nom)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (nom) => apply(nom)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-26T15:01:59.453347900
                  SOURCE: C:/Users/HAAG/Desktop/formulaire/app/views/helloworld.scala.html
                  HASH: 8ada1eb9031a8d96ad30a74787b99d4b56dc8790
                  MATRIX: 913->1|1020->15|1047->17|1078->40|1117->42|1146->45|1183->56|1206->59|1234->60|1270->67
                  LINES: 27->1|32->2|33->3|33->3|33->3|34->4|34->4|34->4|34->4|35->5
                  -- GENERATED --
              */
          