
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

object helloworldform extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Person,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(a: Person):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.13*/(""" 
"""),_display_(/*2.2*/main("Hello ...")/*2.19*/{_display_(Seq[Any](format.raw/*2.20*/("""
    """),format.raw/*3.5*/("""Hello """),_display_(/*3.12*/a/*3.13*/.firstname),format.raw/*3.23*/(""" """),format.raw/*3.24*/(""", """),_display_(/*3.27*/a/*3.28*/.age),format.raw/*3.32*/(""" """),format.raw/*3.33*/("""saved 
""")))}))
      }
    }
  }

  def render(a:Person): play.twirl.api.HtmlFormat.Appendable = apply(a)

  def f:((Person) => play.twirl.api.HtmlFormat.Appendable) = (a) => apply(a)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-26T15:01:59.463355800
                  SOURCE: C:/Users/HAAG/Desktop/formulaire/app/views/helloworldform.scala.html
                  HASH: 96ba6a9e9bcca27e53da9ad15b33d6f05b5c2b45
                  MATRIX: 917->1|1023->12|1051->15|1076->32|1114->33|1145->38|1178->45|1187->46|1217->56|1245->57|1274->60|1283->61|1307->65|1335->66
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|34->3|34->3|34->3|34->3|34->3|34->3
                  -- GENERATED --
              */
          