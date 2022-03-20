
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[String, Resultlist],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(searchResults: Map[String, Resultlist]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.42*/("""

	"""),_display_(/*5.3*/main("FreeLancelot")/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/("""
		"""),format.raw/*6.3*/("""<center>
			<article style="margin-top:50px;">
				<h1>Welcome to FreeLancelot</h1>
				<form action="/" method="GET">
					<input type="text" name="searchPhrase" placeholder="Enter search terms"/>
					<input id="submitbtn" type="submit" value="Go!" />
					<br />
					<input type="text" id="hiddenId" name="sessionId" value="" />
				</form>
				<div>
				"""),_display_(/*16.6*/if(searchResults != null)/*16.31*/ {_display_(Seq[Any](format.raw/*16.33*/("""
					"""),_display_(/*17.7*/for((searchTerms, searchResultlist) <- searchResults) yield /*17.60*/{_display_(Seq[Any](format.raw/*17.61*/("""

						"""),_display_(/*19.8*/if(searchResultlist.getResult().size()>0)/*19.49*/{_display_(Seq[Any](format.raw/*19.50*/("""
							"""),format.raw/*20.8*/("""<p>Search terms : """),_display_(/*20.27*/searchTerms),format.raw/*20.38*/(""" """),format.raw/*20.39*/(""": Flesh reading Ease Index: """),_display_(/*20.68*/searchResultlist/*20.84*/.getFleschIndex()),format.raw/*20.101*/("""  """),format.raw/*20.103*/("""FKGL : """),_display_(/*20.111*/searchResultlist/*20.127*/.getFkgl()),format.raw/*20.137*/("""</p>
							<a href=""""),_display_(/*21.18*/routes/*21.24*/.HomeController.wordStat(searchTerms)),format.raw/*21.61*/("""">Global Stats</a>
							<table>
								<tr>
									<th>Owner_id</th>
									<th>Date</th>
									<th>Title</th>
									<th>Type</th>
									<th>Skills</th>
									<th></th>
									<th></th>
									<th>Education Level</th>
								</tr>
								"""),_display_(/*33.10*/for(result <- searchResultlist.getResult()) yield /*33.53*/{_display_(Seq[Any](format.raw/*33.54*/("""
									"""),format.raw/*34.10*/("""<tr>
										<td><a href='"""),_display_(/*35.25*/routes/*35.31*/.HomeController.profile(result.getOwner_id())),format.raw/*35.76*/("""'>"""),_display_(/*35.79*/result/*35.85*/.getOwner_id()),format.raw/*35.99*/("""</a></td>
										<td>"""),_display_(/*36.16*/result/*36.22*/.getDate()),format.raw/*36.32*/("""</td>
										<td>"""),_display_(/*37.16*/result/*37.22*/.getTitle()),format.raw/*37.33*/("""</td>
										<td>"""),_display_(/*38.16*/result/*38.22*/.getType()),format.raw/*38.32*/("""</td>
										<td>"""),_display_(/*39.16*/for((key,value) <- result.getSkills()) yield /*39.54*/{_display_(Seq[Any](format.raw/*39.55*/("""
											"""),format.raw/*40.12*/("""<u><a href=""""),_display_(/*40.25*/routes/*40.31*/.HomeController.skill(value,key)),format.raw/*40.63*/("""" target="_blank">"""),_display_(/*40.82*/key),format.raw/*40.85*/("""</a></u>
										""")))}),format.raw/*41.12*/("""
										"""),format.raw/*42.11*/("""</td>
										<td><a href=""""),_display_(/*43.25*/routes/*43.31*/.HomeController.indvStat(searchTerms, result.getIndex())),format.raw/*43.87*/("""">Stats</a></td>
										<td><a href=""""),_display_(/*44.25*/routes/*44.31*/.HomeController.readability(searchTerms, result.getIndex())),format.raw/*44.90*/("""">Readability</a></td>
										<td>"""),_display_(/*45.16*/searchResultlist/*45.32*/.getEdLevel()),format.raw/*45.45*/("""</td>
									</tr>
								""")))}),format.raw/*47.10*/("""
							"""),format.raw/*48.8*/("""</table>
						""")))}/*49.8*/else/*49.12*/{_display_(Seq[Any](format.raw/*49.13*/("""
							"""),format.raw/*50.8*/("""<p>Search terms : """),_display_(/*50.27*/searchTerms),format.raw/*50.38*/(""" """),format.raw/*50.39*/(""": Flesh reading Ease Index: ## FKGL: ##.##</p>
							<p>There are no project for the term : """),_display_(/*51.48*/searchTerms),format.raw/*51.59*/("""</p>
						""")))}),format.raw/*52.8*/("""
					""")))}),format.raw/*53.7*/("""
				""")))}),format.raw/*54.6*/("""
				"""),format.raw/*55.5*/("""</div>
			</article>
		</center>
		<script>
				const characters ='ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';

				function generateString() """),format.raw/*61.31*/("""{"""),format.raw/*61.32*/("""
					"""),format.raw/*62.6*/("""console.log("In the function");
					let result = ' ';
					const charactersLength = characters.length;
					for ( let i = 0; i < 8; i++ ) """),format.raw/*65.36*/("""{"""),format.raw/*65.37*/("""
						"""),format.raw/*66.7*/("""result += characters.charAt(Math.floor(Math.random() * charactersLength));
					"""),format.raw/*67.6*/("""}"""),format.raw/*67.7*/("""
					"""),format.raw/*68.6*/("""return result;
				"""),format.raw/*69.5*/("""}"""),format.raw/*69.6*/(""";

				window.onload=function()"""),format.raw/*71.29*/("""{"""),format.raw/*71.30*/("""
					"""),format.raw/*72.6*/("""var mb = document.getElementById("submitbtn");
					mb.addEventListener("click", checkCookie);
					console.log("In the window after loading");
				"""),format.raw/*75.5*/("""}"""),format.raw/*75.6*/(""";

				function setCookie(id)"""),format.raw/*77.27*/("""{"""),format.raw/*77.28*/("""
					"""),format.raw/*78.6*/("""console.log("setcokkie id "+id);
					const date = new Date();
					date.setTime(date.getTime() + (365 * 24 * 60 * 60 * 1000));
					var expires = "expires="+date.toUTCString();
					document.cookie = "sessionId="+id+";"+expires+";path=/";
				"""),format.raw/*83.5*/("""}"""),format.raw/*83.6*/(""";

				function getCookie()"""),format.raw/*85.25*/("""{"""),format.raw/*85.26*/("""
					"""),format.raw/*86.6*/("""let name = "sessionId=";
					let spli = document.cookie.split(';');
					for(var j=0;j < spli.length; j++)"""),format.raw/*88.39*/("""{"""),format.raw/*88.40*/("""
						"""),format.raw/*89.7*/("""let char = spli[j];
						while(char.charAt(0) == ' ') """),format.raw/*90.36*/("""{"""),format.raw/*90.37*/("""
							"""),format.raw/*91.8*/("""char = char.substring(1);
						"""),format.raw/*92.7*/("""}"""),format.raw/*92.8*/("""
						"""),format.raw/*93.7*/("""if(char.indexOf(name) == 0) """),format.raw/*93.35*/("""{"""),format.raw/*93.36*/("""
							"""),format.raw/*94.8*/("""return char.substring(name.length, char.length);
						"""),format.raw/*95.7*/("""}"""),format.raw/*95.8*/("""
					"""),format.raw/*96.6*/("""}"""),format.raw/*96.7*/("""
					"""),format.raw/*97.6*/("""id = "";
					console.log("getcookie id "+id);
					return id;
				"""),format.raw/*100.5*/("""}"""),format.raw/*100.6*/(""";

				function checkCookie() """),format.raw/*102.28*/("""{"""),format.raw/*102.29*/("""
					"""),format.raw/*103.6*/("""var id = getCookie();
					console.log("id "+id);
					if(id != "")"""),format.raw/*105.18*/("""{"""),format.raw/*105.19*/("""
						"""),format.raw/*106.7*/("""console.log("checkcookie id if not null"+id);
						//alert(id);
						document.getElementById("hiddenId").value = id
					"""),format.raw/*109.6*/("""}"""),format.raw/*109.7*/("""
					"""),format.raw/*110.6*/("""else"""),format.raw/*110.10*/("""{"""),format.raw/*110.11*/("""
						"""),format.raw/*111.7*/("""id = generateString();
						console.log("checkcookie id "+id);
						if(id != "" && id != null)"""),format.raw/*113.33*/("""{"""),format.raw/*113.34*/("""
							"""),format.raw/*114.8*/("""setCookie(id);
						"""),format.raw/*115.7*/("""}"""),format.raw/*115.8*/("""
					"""),format.raw/*116.6*/("""}"""),format.raw/*116.7*/("""
				"""),format.raw/*117.5*/("""}"""),format.raw/*117.6*/(""";
		</script>
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
                  SOURCE: app/views/index.scala.html
                  HASH: 8153c554d0766bcc09daf5120988684b251cfeb0
                  MATRIX: 610->1|649->35|994->61|1129->101|1160->107|1188->127|1227->129|1257->133|1653->503|1687->528|1727->530|1761->538|1830->591|1869->592|1906->603|1956->644|1995->645|2031->654|2077->673|2109->684|2138->685|2194->714|2219->730|2258->747|2289->749|2325->757|2351->773|2383->783|2433->806|2448->812|2506->849|2809->1125|2868->1168|2907->1169|2946->1180|3003->1210|3018->1216|3084->1261|3114->1264|3129->1270|3164->1284|3217->1310|3232->1316|3263->1326|3312->1348|3327->1354|3359->1365|3408->1387|3423->1393|3454->1403|3503->1425|3557->1463|3596->1464|3637->1477|3677->1490|3692->1496|3745->1528|3791->1547|3815->1550|3867->1571|3907->1583|3965->1614|3980->1620|4057->1676|4126->1718|4141->1724|4221->1783|4287->1822|4312->1838|4346->1851|4409->1883|4445->1892|4480->1909|4493->1913|4532->1914|4568->1923|4614->1942|4646->1953|4675->1954|4797->2049|4829->2060|4872->2073|4910->2081|4947->2088|4980->2094|5177->2263|5206->2264|5240->2271|5410->2413|5439->2414|5474->2422|5582->2503|5610->2504|5644->2511|5691->2531|5719->2532|5780->2565|5809->2566|5843->2573|6021->2724|6049->2725|6108->2756|6137->2757|6171->2764|6447->3013|6475->3014|6532->3043|6561->3044|6595->3051|6732->3160|6761->3161|6796->3169|6880->3225|6909->3226|6945->3235|7005->3268|7033->3269|7068->3277|7124->3305|7153->3306|7189->3315|7272->3371|7300->3372|7334->3379|7362->3380|7396->3387|7494->3457|7523->3458|7584->3490|7614->3491|7649->3498|7747->3567|7777->3568|7813->3576|7967->3702|7996->3703|8031->3710|8064->3714|8094->3715|8130->3723|8257->3821|8287->3822|8324->3831|8374->3853|8403->3854|8438->3861|8467->3862|8501->3868|8530->3869
                  LINES: 23->1|24->2|29->3|34->3|36->5|36->5|36->5|37->6|47->16|47->16|47->16|48->17|48->17|48->17|50->19|50->19|50->19|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|64->33|64->33|64->33|65->34|66->35|66->35|66->35|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|71->40|71->40|71->40|72->41|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|78->47|79->48|80->49|80->49|80->49|81->50|81->50|81->50|81->50|82->51|82->51|83->52|84->53|85->54|86->55|92->61|92->61|93->62|96->65|96->65|97->66|98->67|98->67|99->68|100->69|100->69|102->71|102->71|103->72|106->75|106->75|108->77|108->77|109->78|114->83|114->83|116->85|116->85|117->86|119->88|119->88|120->89|121->90|121->90|122->91|123->92|123->92|124->93|124->93|124->93|125->94|126->95|126->95|127->96|127->96|128->97|131->100|131->100|133->102|133->102|134->103|136->105|136->105|137->106|140->109|140->109|141->110|141->110|141->110|142->111|144->113|144->113|145->114|146->115|146->115|147->116|147->116|148->117|148->117
                  -- GENERATED --
              */
          