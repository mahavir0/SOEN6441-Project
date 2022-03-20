
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


Seq[Any](format.raw/*5.1*/("""

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
                  HASH: fb093f1e74e5d7728189eee2f9652f2e68ba028b
                  MATRIX: 610->1|649->34|680->59|1022->77|1161->123|1193->130|1221->150|1260->152|1295->161|1417->256|1451->281|1491->283|1540->305|1609->358|1648->359|1701->384|1764->420|1796->431|1825->432|2123->703|2182->746|2222->748|2279->778|2337->820|2377->822|2438->855|2511->901|2535->904|2609->951|2635->956|2739->1029|2796->1055|2849->1080|2910->1110|2959->1128|3004->1145
                  LINES: 23->1|24->2|25->3|30->4|35->5|37->7|37->7|37->7|38->8|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|43->13|50->20|50->20|50->20|51->21|51->21|51->21|52->22|53->23|53->23|54->24|54->24|56->26|57->27|58->28|59->29|60->30|61->31
                  -- GENERATED --
              */
          