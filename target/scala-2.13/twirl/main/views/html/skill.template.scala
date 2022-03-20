
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


Seq[Any](format.raw/*4.1*/("""

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
                  HASH: df33eb5909410e1a290ad49b90f818bfce0aff44
                  MATRIX: 610->1|649->34|994->59|1128->100|1156->103|1184->123|1223->125|1251->127|1336->186|1370->211|1410->213|1442->219|1511->272|1550->273|1583->279|1623->292|1655->303|1684->304|1871->465|1930->508|1969->509|2004->517|2058->544|2073->550|2139->595|2169->598|2184->604|2219->618|2269->641|2284->647|2315->657|2361->676|2376->682|2408->693|2454->712|2469->718|2500->728|2546->747|2600->785|2639->786|2677->796|2717->809|2732->815|2785->847|2815->850|2839->853|2888->871|2924->880|2980->906|3013->912|3057->926|3092->931|3123->935
                  LINES: 23->1|24->2|29->3|34->4|36->6|36->6|36->6|37->7|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|42->12|51->21|51->21|51->21|52->22|53->23|53->23|53->23|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|58->28|58->28|58->28|58->28|58->28|59->29|60->30|62->32|63->33|64->34|65->35|66->36
                  -- GENERATED --
              */
          