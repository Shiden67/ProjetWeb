
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

object sayhello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/(""" 
"""),format.raw/*2.1*/("""<html>
"""),_display_(/*3.2*/helper/*3.8*/.form(action = routes.HomeController.helloworld())/*3.58*/ {_display_(Seq[Any](format.raw/*3.60*/(""" 
"""),format.raw/*4.1*/("""<input type="text" name="fname"/>
<input type="submit" value="Say hello"/>
""")))}),format.raw/*6.2*/(""" 
"""),format.raw/*7.1*/("""</html>
 """))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-26T15:01:59.487371900
                  SOURCE: C:/Users/HAAG/Desktop/formulaire/app/views/sayhello.scala.html
                  HASH: 2baf3de6db0a30dc54dd8719a9d8716d16d603ca
                  MATRIX: 904->1|1000->3|1028->5|1061->13|1074->19|1132->69|1171->71|1199->73|1304->149|1332->151
                  LINES: 27->1|32->1|33->2|34->3|34->3|34->3|34->3|35->4|37->6|38->7
                  -- GENERATED --
              */
          