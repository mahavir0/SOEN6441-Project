
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
                """),_display_(/*12.18*/for( (keys,value) <- searchResults) yield /*12.53*/{_display_(Seq[Any](format.raw/*12.54*/("""
                    """),_display_(/*13.22*/if(keys.equals("FleshIndex"))/*13.51*/{_display_(Seq[Any](format.raw/*13.52*/("""
                        """),format.raw/*14.25*/("""<p>Flesch Readability Index: """),_display_(/*14.55*/value),format.raw/*14.60*/("""</p>
                    """)))}),format.raw/*15.22*/("""
                    """),_display_(/*16.22*/if(keys.equals("FKGL"))/*16.45*/{_display_(Seq[Any](format.raw/*16.46*/("""
                        """),format.raw/*17.25*/("""<p>FKGL: """),_display_(/*17.35*/value),format.raw/*17.40*/("""</p>
                    """)))}),format.raw/*18.22*/("""
                """)))}),format.raw/*19.18*/("""
            """),format.raw/*20.13*/("""</div>
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
                  HASH: ae955cb76bb7e339b068b20c3f52f43f1b3b585a
                  MATRIX: 610->1|649->35|680->61|1020->80|1152->117|1184->124|1212->144|1251->146|1283->152|1464->306|1515->341|1554->342|1604->365|1642->394|1681->395|1735->421|1792->451|1818->456|1876->483|1926->506|1958->529|1997->530|2051->556|2088->566|2114->571|2172->598|2222->617|2264->631
                  LINES: 23->1|24->2|25->3|30->4|35->4|38->7|38->7|38->7|39->8|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|50->19|51->20
                  -- GENERATED --
              */
          