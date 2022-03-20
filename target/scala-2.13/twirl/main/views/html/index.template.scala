
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


Seq[Any](format.raw/*4.1*/("""
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
							"""),format.raw/*50.8*/("""<p>Search terms : """),_display_(/*50.27*/searchTerms),format.raw/*50.38*/(""" """),format.raw/*50.39*/(""": Flesh reading Ease Index: ##</p>
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
                  HASH: 12516af75445faa35e4f613e3d598c6963774e62
                  MATRIX: 610->1|649->34|994->59|1128->100|1156->103|1184->123|1223->125|1252->128|1638->488|1672->513|1712->515|1745->522|1814->575|1853->576|1888->585|1938->626|1977->627|2012->635|2058->654|2090->665|2119->666|2175->695|2200->711|2239->728|2270->730|2306->738|2332->754|2364->764|2413->786|2428->792|2486->829|2777->1093|2836->1136|2875->1137|2913->1147|2969->1176|2984->1182|3050->1227|3080->1230|3095->1236|3130->1250|3182->1275|3197->1281|3228->1291|3276->1312|3291->1318|3323->1329|3371->1350|3386->1356|3417->1366|3465->1387|3519->1425|3558->1426|3598->1438|3638->1451|3653->1457|3706->1489|3752->1508|3776->1511|3827->1531|3866->1542|3923->1572|3938->1578|4015->1634|4083->1675|4098->1681|4178->1740|4243->1778|4268->1794|4302->1807|4363->1837|4398->1845|4432->1861|4445->1865|4484->1866|4519->1874|4565->1893|4597->1904|4626->1905|4735->1987|4767->1998|4809->2010|4846->2017|4882->2023|4914->2028|5105->2191|5134->2192|5167->2198|5334->2337|5363->2338|5397->2345|5504->2425|5532->2426|5565->2432|5611->2451|5639->2452|5698->2483|5727->2484|5760->2490|5935->2638|5963->2639|6020->2668|6049->2669|6082->2675|6353->2919|6381->2920|6436->2947|6465->2948|6498->2954|6633->3061|6662->3062|6696->3069|6779->3124|6808->3125|6843->3133|6902->3165|6930->3166|6964->3173|7020->3201|7049->3202|7084->3210|7166->3265|7194->3266|7227->3272|7255->3273|7288->3279|7383->3346|7412->3347|7471->3377|7501->3378|7535->3384|7631->3451|7661->3452|7696->3459|7847->3582|7876->3583|7910->3589|7943->3593|7973->3594|8008->3601|8133->3697|8163->3698|8199->3706|8248->3727|8277->3728|8311->3734|8340->3735|8373->3740|8402->3741
                  LINES: 23->1|24->2|29->3|34->4|35->5|35->5|35->5|36->6|46->16|46->16|46->16|47->17|47->17|47->17|49->19|49->19|49->19|50->20|50->20|50->20|50->20|50->20|50->20|50->20|50->20|50->20|50->20|50->20|51->21|51->21|51->21|63->33|63->33|63->33|64->34|65->35|65->35|65->35|65->35|65->35|65->35|66->36|66->36|66->36|67->37|67->37|67->37|68->38|68->38|68->38|69->39|69->39|69->39|70->40|70->40|70->40|70->40|70->40|70->40|71->41|72->42|73->43|73->43|73->43|74->44|74->44|74->44|75->45|75->45|75->45|77->47|78->48|79->49|79->49|79->49|80->50|80->50|80->50|80->50|81->51|81->51|82->52|83->53|84->54|85->55|91->61|91->61|92->62|95->65|95->65|96->66|97->67|97->67|98->68|99->69|99->69|101->71|101->71|102->72|105->75|105->75|107->77|107->77|108->78|113->83|113->83|115->85|115->85|116->86|118->88|118->88|119->89|120->90|120->90|121->91|122->92|122->92|123->93|123->93|123->93|124->94|125->95|125->95|126->96|126->96|127->97|130->100|130->100|132->102|132->102|133->103|135->105|135->105|136->106|139->109|139->109|140->110|140->110|140->110|141->111|143->113|143->113|144->114|145->115|145->115|146->116|146->116|147->117|147->117
                  -- GENERATED --
              */
          