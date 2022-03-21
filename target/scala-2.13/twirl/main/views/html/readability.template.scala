
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

object readability extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[String, String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(searchResults : Map[String, String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.39*/("""


"""),_display_(/*7.2*/main("FreeLancelot")/*7.22*/ {_display_(Seq[Any](format.raw/*7.24*/("""
    """),format.raw/*8.5*/("""<center>
        <article style="margin-top:50px;">
            <div>
                <h4>Readability for an Individual Project</h4>
                <p>The Flesch–Kincaid readability tests are readability tests designed to indicate how difficult a passage in English is to understand. There are two tests: the Flesch Reading-Ease, and the Flesch–Kincaid Grade Level.</p>
                <a href="https://en.wikipedia.org/wiki/Flesch%E2%80%93Kincaid_readability_tests">Click here to know more!</a>
                """),_display_(/*14.18*/for( (keys,value) <- searchResults) yield /*14.53*/{_display_(Seq[Any](format.raw/*14.54*/("""
                    """),_display_(/*15.22*/if(keys.equals("FleshIndex"))/*15.51*/{_display_(Seq[Any](format.raw/*15.52*/("""
                        """),format.raw/*16.25*/("""<p>Flesch Readability Index: """),_display_(/*16.55*/value),format.raw/*16.60*/("""</p>
                    """)))}),format.raw/*17.22*/("""
                    """),_display_(/*18.22*/if(keys.equals("FKGL"))/*18.45*/{_display_(Seq[Any](format.raw/*18.46*/("""
                        """),format.raw/*19.25*/("""<p>FKGL: """),_display_(/*19.35*/value),format.raw/*19.40*/("""</p>
                    """)))}),format.raw/*20.22*/("""
                """)))}),format.raw/*21.18*/("""
            """),format.raw/*22.13*/("""</div>
        </article>
    </center>
""")))}))
      }
    }
  }

  def render(searchResults:Map[String, String]): play.twirl.api.HtmlFormat.Appendable = apply(searchResults)

  def f:((Map[String, String]) => play.twirl.api.HtmlFormat.Appendable) = (searchResults) => apply(searchResults)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/readability.scala.html
                  HASH: 841daba07222e9adf51baf607efb6f8a6a180e39
                  MATRIX: 610->1|649->35|680->61|1020->80|1152->117|1184->124|1212->144|1251->146|1283->152|1830->672|1881->707|1920->708|1970->731|2008->760|2047->761|2101->787|2158->817|2184->822|2242->849|2292->872|2324->895|2363->896|2417->922|2454->932|2480->937|2538->964|2588->983|2630->997
                  LINES: 23->1|24->2|25->3|30->4|35->4|38->7|38->7|38->7|39->8|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|52->21|53->22
                  -- GENERATED --
              */
          