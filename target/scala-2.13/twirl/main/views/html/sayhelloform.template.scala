
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
/*1.2*/import play.mvc.Http.Request

object sayhelloform extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[Person],Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(pForm: Form[Person])(implicit request: Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Please enter your information")/*4.39*/ {_display_(Seq[Any](format.raw/*4.41*/("""
"""),_display_(/*5.2*/helper/*5.8*/.form(action = routes.HomeController.helloworldform)/*5.60*/ {_display_(Seq[Any](format.raw/*5.62*/("""
"""),_display_(/*6.2*/helper/*6.8*/.CSRF.formField),format.raw/*6.23*/("""
"""),_display_(/*7.2*/helper/*7.8*/.inputText(pForm("firstname"))),format.raw/*7.38*/(""" 
"""),_display_(/*8.2*/helper/*8.8*/.select(field = pForm("age"),options = Seq("18"->"18", "19"->"19","20"->"20", "21"->"21", "22"->"22", "23"->"23", "24"->"24","25"->"25"))),format.raw/*8.145*/("""
"""),format.raw/*9.1*/("""<input type="submit" value="Say hello"/> """)))}),format.raw/*9.43*/("""
""")))}))
      }
    }
  }

  def render(pForm:Form[Person],request:Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(pForm)(request,messages)

  def f:((Form[Person]) => (Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (pForm) => (request,messages) => apply(pForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-26T15:01:59.495378
                  SOURCE: C:/Users/HAAG/Desktop/formulaire/app/views/sayhelloform.scala.html
                  HASH: 42a944a611f5f938ff6546b7536a3d1833b182c6
                  MATRIX: 611->1|984->31|1156->110|1183->112|1228->149|1267->151|1294->153|1307->159|1367->211|1406->213|1433->215|1446->221|1481->236|1508->238|1521->244|1571->274|1599->277|1612->283|1770->420|1797->421|1869->463
                  LINES: 23->1|28->2|33->3|34->4|34->4|34->4|35->5|35->5|35->5|35->5|36->6|36->6|36->6|37->7|37->7|37->7|38->8|38->8|38->8|39->9|39->9
                  -- GENERATED --
              */
          