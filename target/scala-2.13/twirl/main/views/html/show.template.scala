
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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Person,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(test: Person):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""

"""),_display_(/*4.2*/main("yo")/*4.12*/ {_display_(Seq[Any](format.raw/*4.14*/("""
  """),format.raw/*5.3*/("""<h1> """),_display_(/*5.9*/test/*5.13*/.getFirstname()),format.raw/*5.28*/(""" """),format.raw/*5.29*/("""</h1>
""")))}),format.raw/*6.2*/("""

 """))
      }
    }
  }

  def render(test:Person): play.twirl.api.HtmlFormat.Appendable = apply(test)

  def f:((Person) => play.twirl.api.HtmlFormat.Appendable) = (test) => apply(test)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-06-02T13:54:39.031147900
                  SOURCE: C:/Users/HAAG/Desktop/formulaire/app/views/show.scala.html
                  HASH: 9f5a055ac36e02de5fd8a39b348788ca92666924
                  MATRIX: 907->1|1015->16|1043->19|1061->29|1100->31|1129->34|1160->40|1172->44|1207->59|1235->60|1271->67
                  LINES: 27->1|32->2|34->4|34->4|34->4|35->5|35->5|35->5|35->5|35->5|36->6
                  -- GENERATED --
              */
          