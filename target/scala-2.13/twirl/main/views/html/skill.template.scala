
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

object skill extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[String, Resultlist],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(searchResults: Map[String, Resultlist]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.42*/("""


"""),_display_(/*6.2*/main("FreeLancelot")/*6.22*/ {_display_(Seq[Any](format.raw/*6.24*/("""
	"""),format.raw/*7.2*/("""<center>
		<article style="margin-top:50px;">
			<div>
			"""),_display_(/*10.5*/if(searchResults != null)/*10.30*/ {_display_(Seq[Any](format.raw/*10.32*/("""
				"""),_display_(/*11.6*/for((searchTerms, searchResultlist) <- searchResults) yield /*11.59*/{_display_(Seq[Any](format.raw/*11.60*/("""
					"""),format.raw/*12.6*/("""<h1>Skill : """),_display_(/*12.19*/searchTerms),format.raw/*12.30*/(""" """),format.raw/*12.31*/("""</h1>
					<table>
						<tr>
							<th>Owner_id</th>
							<th>Date</th>
							<th>Title</th>
							<th>Type</th>
							<th>Skills</th>
						</tr>
						"""),_display_(/*21.8*/for(result <- searchResultlist.getResult()) yield /*21.51*/{_display_(Seq[Any](format.raw/*21.52*/("""
							"""),format.raw/*22.8*/("""<tr>
								<td><a href='"""),_display_(/*23.23*/routes/*23.29*/.HomeController.profile(result.getOwner_id())),format.raw/*23.74*/("""'>"""),_display_(/*23.77*/result/*23.83*/.getOwner_id()),format.raw/*23.97*/("""</a></td>
								<td>"""),_display_(/*24.14*/result/*24.20*/.getDate()),format.raw/*24.30*/("""</td>
								<td>"""),_display_(/*25.14*/result/*25.20*/.getTitle()),format.raw/*25.31*/("""</td>
								<td>"""),_display_(/*26.14*/result/*26.20*/.getType()),format.raw/*26.30*/("""</td>
								<td>"""),_display_(/*27.14*/for((key,value) <- result.getSkills()) yield /*27.52*/{_display_(Seq[Any](format.raw/*27.53*/("""
									"""),format.raw/*28.10*/("""<u><a href=""""),_display_(/*28.23*/routes/*28.29*/.HomeController.skill(value,key)),format.raw/*28.61*/("""">"""),_display_(/*28.64*/key),format.raw/*28.67*/("""</a></u>
								""")))}),format.raw/*29.10*/("""
								"""),format.raw/*30.9*/("""</td>
							</tr>
						""")))}),format.raw/*32.8*/("""
					"""),format.raw/*33.6*/("""</table>
				""")))}),format.raw/*34.6*/("""
			""")))}),format.raw/*35.5*/("""
			"""),format.raw/*36.4*/("""</div>
		</article>
	</center>
""")))}))
      }
    }
  }

  def render(searchResults:Map[String, Resultlist]): play.twirl.api.HtmlFormat.Appendable = apply(searchResults)

  def f:((Map[String, Resultlist]) => play.twirl.api.HtmlFormat.Appendable) = (searchResults) => apply(searchResults)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/skill.scala.html
                  HASH: ea563f0902ff323a37883af7de796fe5e797d269
                  MATRIX: 610->1|649->35|994->61|1129->101|1161->108|1189->128|1228->130|1257->133|1345->195|1379->220|1419->222|1452->229|1521->282|1560->283|1594->290|1634->303|1666->314|1695->315|1891->485|1950->528|1989->529|2025->538|2080->566|2095->572|2161->617|2191->620|2206->626|2241->640|2292->664|2307->670|2338->680|2385->700|2400->706|2432->717|2479->737|2494->743|2525->753|2572->773|2626->811|2665->812|2704->823|2744->836|2759->842|2812->874|2842->877|2866->880|2916->899|2953->909|3011->937|3045->944|3090->959|3126->965|3158->970
                  LINES: 23->1|24->2|29->3|34->3|37->6|37->6|37->6|38->7|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|43->12|52->21|52->21|52->21|53->22|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|60->29|61->30|63->32|64->33|65->34|66->35|67->36
                  -- GENERATED --
              */
          