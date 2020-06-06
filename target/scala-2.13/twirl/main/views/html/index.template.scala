
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(nom: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""

"""),_display_(/*4.2*/main("Welcome to Play")/*4.25*/ {_display_(Seq[Any](format.raw/*4.27*/("""
  """),format.raw/*5.3*/("""<h1>Welcome to Play! """),_display_(/*5.25*/nom),format.raw/*5.28*/(""" """),format.raw/*5.29*/("""</h1>
""")))}),format.raw/*6.2*/("""
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
                  DATE: 2020-05-26T15:22:17.891633900
                  SOURCE: C:/Users/HAAG/Desktop/formulaire/app/views/index.scala.html
                  HASH: c1a1a2f2fa593997b1954b797fd0ba0381d2e5fd
                  MATRIX: 908->1|1015->15|1043->18|1074->41|1113->43|1142->46|1190->68|1213->71|1241->72|1277->79
                  LINES: 27->1|32->2|34->4|34->4|34->4|35->5|35->5|35->5|35->5|36->6
                  -- GENERATED --
              */
          