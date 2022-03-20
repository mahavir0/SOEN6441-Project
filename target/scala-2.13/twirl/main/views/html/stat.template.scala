
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

object stat extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[util.Map[String, Resultlist],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(searchResults: util.Map[String, Resultlist]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.47*/("""


    """),_display_(/*7.6*/main("FreeLancelot")/*7.26*/ {_display_(Seq[Any](format.raw/*7.28*/("""
        """),format.raw/*8.9*/("""<center>
            <article style="margin-top:50px;">
                <div>
                """),_display_(/*11.18*/if(searchResults != null)/*11.43*/ {_display_(Seq[Any](format.raw/*11.45*/("""
                    """),_display_(/*12.22*/for((searchTerms, searchResultlist) <- searchResults) yield /*12.75*/{_display_(Seq[Any](format.raw/*12.76*/("""
                        """),format.raw/*13.25*/("""<p>Word Stats for the Search Term: """),_display_(/*13.61*/searchTerms),format.raw/*13.72*/(""" """),format.raw/*13.73*/("""</p>

                        <table style="width: 30%; border: black 1px solid">
                            <tr>
                                <th>Word</th>
                                <th>Frequency</th>
                            </tr>
                        """),_display_(/*20.26*/for(result <- searchResultlist.getResult()) yield /*20.69*/ {_display_(Seq[Any](format.raw/*20.71*/("""
                            """),_display_(/*21.30*/for((key, value) <- result.getWordStats()) yield /*21.72*/ {_display_(Seq[Any](format.raw/*21.74*/("""
                                """),format.raw/*22.33*/("""<tr>
                                    <td>"""),_display_(/*23.42*/key),format.raw/*23.45*/("""</td>
                                    <td>"""),_display_(/*24.42*/value),format.raw/*24.47*/("""</td>
                                </tr>
                            """)))}),format.raw/*26.30*/("""
                        """)))}),format.raw/*27.26*/("""
                        """),format.raw/*28.25*/("""</table>
                    """)))}),format.raw/*29.22*/("""
                """)))}),format.raw/*30.18*/("""
                """),format.raw/*31.17*/("""</div>
            </article>
        </center>
    """)))}))
      }
    }
  }

  def render(searchResults:util.Map[String, Resultlist]): play.twirl.api.HtmlFormat.Appendable = apply(searchResults)

  def f:((util.Map[String, Resultlist]) => play.twirl.api.HtmlFormat.Appendable) = (searchResults) => apply(searchResults)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/stat.scala.html
                  HASH: 460157033920ae27dd4ad5ab446533ee6a06b60c
                  MATRIX: 610->1|649->35|680->61|1022->80|1162->125|1198->136|1226->156|1265->158|1301->168|1426->266|1460->291|1500->293|1550->316|1619->369|1658->370|1712->396|1775->432|1807->443|1836->444|2141->722|2200->765|2240->767|2298->798|2356->840|2396->842|2458->876|2532->923|2556->926|2631->974|2657->979|2763->1054|2821->1081|2875->1107|2937->1138|2987->1157|3033->1175
                  LINES: 23->1|24->2|25->3|30->4|35->4|38->7|38->7|38->7|39->8|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|44->13|51->20|51->20|51->20|52->21|52->21|52->21|53->22|54->23|54->23|55->24|55->24|57->26|58->27|59->28|60->29|61->30|62->31
                  -- GENERATED --
              */
          