
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

object all extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Person],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(liste: List[Person]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Liste des personnes")/*2.29*/{_display_(Seq[Any](format.raw/*2.30*/("""
"""),format.raw/*3.1*/("""<h1>Liste des """),_display_(/*3.16*/liste/*3.21*/.size()),format.raw/*3.28*/(""" """),format.raw/*3.29*/("""personnes </h1> 
<a href = """"),_display_(/*4.13*/routes/*4.19*/.HomeController.sayhelloform),format.raw/*4.47*/(""""> Add Person</a>

<ul>
  """),_display_(/*7.4*/for(p <- liste) yield /*7.19*/ {_display_(Seq[Any](format.raw/*7.21*/("""
   """),format.raw/*8.4*/("""<li> <a href=""""),_display_(/*8.19*/routes/*8.25*/.HomeController.show(p.getId())),format.raw/*8.56*/("""">"""),_display_(/*8.59*/p/*8.60*/.getFirstname),format.raw/*8.73*/("""</a></li> 
   """)))}),format.raw/*9.5*/("""
"""),format.raw/*10.1*/("""</ul> 
""")))}))
      }
    }
  }

  def render(liste:List[Person]): play.twirl.api.HtmlFormat.Appendable = apply(liste)

  def f:((List[Person]) => play.twirl.api.HtmlFormat.Appendable) = (liste) => apply(liste)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-28T22:49:39.640106
                  SOURCE: C:/Users/HAAG/Desktop/formulaire/app/views/all.scala.html
                  HASH: 8a8aca78f1350d86459eb9671e59393d4781d7b4
                  MATRIX: 912->1|1027->24|1062->51|1100->52|1127->53|1168->68|1181->73|1208->80|1236->81|1291->110|1305->116|1353->144|1405->171|1435->186|1474->188|1504->192|1545->207|1559->213|1610->244|1639->247|1648->248|1681->261|1725->276|1753->277
                  LINES: 27->1|32->2|32->2|32->2|33->3|33->3|33->3|33->3|33->3|34->4|34->4|34->4|37->7|37->7|37->7|38->8|38->8|38->8|38->8|38->8|38->8|38->8|39->9|40->10
                  -- GENERATED --
              */
          