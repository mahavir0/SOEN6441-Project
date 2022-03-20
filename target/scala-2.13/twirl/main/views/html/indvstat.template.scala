
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
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._
/*1.2*/import model.Searchphraseresult
/*2.2*/import model.Resultlist
/*3.2*/import java.util

object indvstat extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[util.Map[String, Integer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(searchResults: util.Map[String, Integer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.44*/("""


    """),_display_(/*7.6*/main("FreeLancelot")/*7.26*/ {_display_(Seq[Any](format.raw/*7.28*/("""
        """),format.raw/*8.9*/("""<center>
            <article style="margin-top:50px;">
                <div>
                    <h4>Word Stats for an Individual Project</h4>
                    <table style="width: 30%; border: black 1px solid">
                        <tr>
                            <th>Word</th>
                            <th>Frequency</th>
                        </tr>
                    """),_display_(/*17.22*/for((key, value) <- searchResults) yield /*17.56*/ {_display_(Seq[Any](format.raw/*17.58*/("""
                        """),format.raw/*18.25*/("""<tr>
                            <td>"""),_display_(/*19.34*/key),format.raw/*19.37*/("""</td>
                            <td>"""),_display_(/*20.34*/value),format.raw/*20.39*/("""</td>
                        </tr>
                    """)))}),format.raw/*22.22*/("""
                    """),format.raw/*23.21*/("""</table>
                </div>
            </article>
        </center>
    """)))}))
      }
    }
  }

  def render(searchResults:util.Map[String, Integer]): play.twirl.api.HtmlFormat.Appendable = apply(searchResults)

  def f:((util.Map[String, Integer]) => play.twirl.api.HtmlFormat.Appendable) = (searchResults) => apply(searchResults)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/indvstat.scala.html
                  HASH: 61cc8bd216f8cf45e85a9a8de3266b5d65e085b6
                  MATRIX: 610->1|649->35|680->61|1023->80|1160->122|1196->133|1224->153|1263->155|1299->165|1720->559|1770->593|1810->595|1864->621|1930->660|1954->663|2021->703|2047->708|2137->767|2187->789
                  LINES: 23->1|24->2|25->3|30->4|35->4|38->7|38->7|38->7|39->8|48->17|48->17|48->17|49->18|50->19|50->19|51->20|51->20|53->22|54->23
                  -- GENERATED --
              */
          