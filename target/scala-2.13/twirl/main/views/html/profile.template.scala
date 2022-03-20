
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
/*1.2*/import model.Profile
/*2.2*/import model.projectInfo

object profile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Map[String, Profile],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(searchProfile: Map[String, Profile]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.39*/("""

"""),_display_(/*5.2*/main("FreeLancelot")/*5.22*/ {_display_(Seq[Any](format.raw/*5.24*/("""
"""),format.raw/*6.1*/("""<center>
    <article style="margin-top:50px;">
        <div>
            """),_display_(/*9.14*/if(searchProfile != null)/*9.39*/ {_display_(Seq[Any](format.raw/*9.41*/("""
            """),_display_(/*10.14*/for((searchTerms, user) <- searchProfile) yield /*10.55*/{_display_(Seq[Any](format.raw/*10.56*/("""
            """),format.raw/*11.13*/("""<h2>Owner Details</h2>
            <b>Publicname : """),_display_(/*12.30*/searchTerms),format.raw/*12.41*/("""</b>
            <style>
                        table """),format.raw/*14.31*/("""{"""),format.raw/*14.32*/("""
                            """),format.raw/*15.29*/("""border-collapse: collapse;
                        """),format.raw/*16.25*/("""}"""),format.raw/*16.26*/("""
                        """),format.raw/*17.25*/("""th """),format.raw/*17.28*/("""{"""),format.raw/*17.29*/("""
                            """),format.raw/*18.29*/("""background-color:lightskyblue;
                            Color:white;
                        """),format.raw/*20.25*/("""}"""),format.raw/*20.26*/("""
                        """),format.raw/*21.25*/("""th, td """),format.raw/*21.32*/("""{"""),format.raw/*21.33*/("""
                            """),format.raw/*22.29*/("""text-align:center;
                            border:1px solid black;
                            padding:5px

                        """),format.raw/*26.25*/("""}"""),format.raw/*26.26*/("""
                    """),format.raw/*27.21*/("""</style>
            <table border="1px" >
                """),_display_(/*29.18*/if(user.getId() != null)/*29.42*/ {_display_(Seq[Any](format.raw/*29.44*/("""
                """),format.raw/*30.17*/("""<tr>
                    <th>Owner_id</th>
                    <td>"""),_display_(/*32.26*/user/*32.30*/.getId()),format.raw/*32.38*/("""</td>
                </tr>
                """)))}),format.raw/*34.18*/("""
                """),_display_(/*35.18*/if(user.getUsername() != null)/*35.48*/{_display_(Seq[Any](format.raw/*35.49*/("""
                """),format.raw/*36.17*/("""<tr>
                    <th>Username</th>
                    <td>"""),_display_(/*38.26*/user/*38.30*/.getUsername()),format.raw/*38.44*/("""</td>
                </tr>
                """)))}),format.raw/*40.18*/("""

                """),_display_(/*42.18*/if(user.getCountry() != null)/*42.47*/{_display_(Seq[Any](format.raw/*42.48*/("""
                """),format.raw/*43.17*/("""<tr>
                    <th>Country</th>
                    <td>"""),_display_(/*45.26*/user/*45.30*/.getCountry()),format.raw/*45.43*/("""</td>
                </tr>
                """)))}),format.raw/*47.18*/("""
                """),_display_(/*48.18*/if(user.getCity() != null)/*48.44*/{_display_(Seq[Any](format.raw/*48.45*/("""
                """),format.raw/*49.17*/("""<tr>
                    <th>City</th>
                    <td>"""),_display_(/*51.26*/user/*51.30*/.getCity()),format.raw/*51.40*/("""</td>
                </tr>
                """)))}),format.raw/*53.18*/("""
                """),_display_(/*54.18*/if(user.getRole() != null)/*54.44*/{_display_(Seq[Any](format.raw/*54.45*/("""
                """),format.raw/*55.17*/("""<tr>
                    <th>role</th>
                    <td>"""),_display_(/*57.26*/user/*57.30*/.getRole()),format.raw/*57.40*/("""</td>
                </tr>
                """)))}),format.raw/*59.18*/("""
                """),_display_(/*60.18*/if(user.getChosenrole() != null)/*60.50*/{_display_(Seq[Any](format.raw/*60.51*/("""
                """),format.raw/*61.17*/("""<tr>
                    <th>Chosen_role</th>
                    <td>"""),_display_(/*63.26*/user/*63.30*/.getChosenrole()),format.raw/*63.46*/("""</td>
                </tr>
                """)))}),format.raw/*65.18*/("""
                """),_display_(/*66.18*/if(user.getProfiledescription() != null)/*66.58*/{_display_(Seq[Any](format.raw/*66.59*/("""
                """),format.raw/*67.17*/("""<tr>
                    <th>Profiledescription</th>
                    <td>"""),_display_(/*69.26*/user/*69.30*/.getProfiledescription()),format.raw/*69.54*/("""</td>
                </tr>
                """)))}),format.raw/*71.18*/("""
                """),_display_(/*72.18*/if(user.getRecommendations() != null)/*72.55*/{_display_(Seq[Any](format.raw/*72.56*/("""
                """),format.raw/*73.17*/("""<tr>
                    <th>Recommendations</th>
                    <td>"""),_display_(/*75.26*/user/*75.30*/.getRecommendations()),format.raw/*75.51*/("""</td>
                </tr>
                """)))}),format.raw/*77.18*/("""
                """),_display_(/*78.18*/if(user.getRegistrationdate() != null)/*78.56*/{_display_(Seq[Any](format.raw/*78.57*/("""
                """),format.raw/*79.17*/("""<tr>
                    <th>RegstationDate</th>
                    <td>"""),_display_(/*81.26*/user/*81.30*/.getRegistrationdate()),format.raw/*81.52*/("""</td>
                </tr>
                """)))}),format.raw/*83.18*/("""
                """),_display_(/*84.18*/if(user.getCompany() != null)/*84.47*/{_display_(Seq[Any](format.raw/*84.48*/("""
                """),format.raw/*85.17*/("""<tr>
                    <th>Company</th>
                    <td>"""),_display_(/*87.26*/user/*87.30*/.getCompany()),format.raw/*87.43*/("""</td>
                </tr>
                """)))}),format.raw/*89.18*/("""
                """),_display_(/*90.18*/if(user.getHourylyrate() != null)/*90.51*/{_display_(Seq[Any](format.raw/*90.52*/("""
                """),format.raw/*91.17*/("""<tr>
                    <th>HourylyRate</th>
                    <td>"""),_display_(/*93.26*/user/*93.30*/.getHourylyrate()),format.raw/*93.47*/("""</td>
                </tr>
                """)))}),format.raw/*95.18*/("""
                """),_display_(/*96.18*/if(user.getPrimarylanguage() != null)/*96.55*/{_display_(Seq[Any](format.raw/*96.56*/("""
                """),format.raw/*97.17*/("""<tr>
                    <th>Primarylanguage</th>
                    <td>"""),_display_(/*99.26*/user/*99.30*/.getPrimarylanguage()),format.raw/*99.51*/("""</td>
                </tr>
                """)))}),format.raw/*101.18*/("""
                """),_display_(/*102.18*/if(user.getLimitedaccount() != null)/*102.54*/{_display_(Seq[Any](format.raw/*102.55*/("""
                """),format.raw/*103.17*/("""<tr>
                    <th>Limitedaccount</th>
                    <td>"""),_display_(/*105.26*/user/*105.30*/.getLimitedaccount()),format.raw/*105.50*/("""</td>
                </tr>
                """)))}),format.raw/*107.18*/("""
                """),_display_(/*108.18*/if(user.getCode() != null)/*108.44*/{_display_(Seq[Any](format.raw/*108.45*/("""
                """),format.raw/*109.17*/("""<tr>
                    <th>CountryCode</th>
                    <td>"""),_display_(/*111.26*/user/*111.30*/.getCode()),format.raw/*111.40*/("""</td>
                </tr>
                """)))}),format.raw/*113.18*/("""
                """),_display_(/*114.18*/if(user.getSign() != null)/*114.44*/{_display_(Seq[Any](format.raw/*114.45*/("""
                """),format.raw/*115.17*/("""<tr>
                    <th>CountrySign</th>
                    <td>"""),_display_(/*117.26*/user/*117.30*/.getSign()),format.raw/*117.40*/("""</td>
                </tr>
                """)))}),format.raw/*119.18*/("""
                """),_display_(/*120.18*/if(user.getCurrencyname() != null)/*120.52*/{_display_(Seq[Any](format.raw/*120.53*/("""
                """),format.raw/*121.17*/("""<tr>
                    <th>CurrencyName</th>
                    <td>"""),_display_(/*123.26*/user/*123.30*/.getCurrencyname()),format.raw/*123.48*/("""</td>
                </tr>
                """)))}),format.raw/*125.18*/("""
                """),_display_(/*126.18*/if(user.getPublicname() != null)/*126.50*/{_display_(Seq[Any](format.raw/*126.51*/("""
                """),format.raw/*127.17*/("""<tr>
                    <th>Publicname</th>
                    <td>"""),_display_(/*129.26*/user/*129.30*/.getPublicname()),format.raw/*129.46*/("""</td>
                </tr>
                """)))}),format.raw/*131.18*/("""
                """),_display_(/*132.18*/if(user.getEmailverified() != null)/*132.53*/{_display_(Seq[Any](format.raw/*132.54*/("""
                """),format.raw/*133.17*/("""<tr>
                    <th>Email_Verified</th>
                    <td>"""),_display_(/*135.26*/user/*135.30*/.getEmailverified()),format.raw/*135.49*/("""</td>
                </tr>
                """)))}),format.raw/*137.18*/("""
                """),_display_(/*138.18*/if(user.getTimezone() != null)/*138.48*/{_display_(Seq[Any](format.raw/*138.49*/("""
                """),format.raw/*139.17*/("""<tr>
                    <th>TimeZone</th>
                    <td>"""),_display_(/*141.26*/user/*141.30*/.getTimezone()),format.raw/*141.44*/("""</td>
                </tr>
                """)))}),format.raw/*143.18*/("""
                """),_display_(/*144.18*/if(user.getSkills().size()>0)/*144.47*/{_display_(Seq[Any](format.raw/*144.48*/("""
                """),format.raw/*145.17*/("""<tr>
                    <th>Skills</th>
                    <td>"""),_display_(/*147.26*/for((key,value) <- user.getSkills()) yield /*147.62*/{_display_(Seq[Any](format.raw/*147.63*/("""
                        """),_display_(/*148.26*/key),format.raw/*148.29*/("""
                        """)))}),format.raw/*149.26*/("""
                    """),format.raw/*150.21*/("""</td>
                </tr>
                """)))}/*152.18*/else/*152.22*/{_display_(Seq[Any](format.raw/*152.23*/("""
                """),format.raw/*153.17*/("""<tr>
                    <th>Skills</th>
                    <td>Users does not have any skills</td>
                </tr>
                """)))}),format.raw/*157.18*/("""
                """),_display_(/*158.18*/if( user.getQualifications().size()>0)/*158.56*/{_display_(Seq[Any](format.raw/*158.57*/("""
                """),format.raw/*159.17*/("""<tr>
                    <th>Qualifications</th>
                    <td>"""),_display_(/*161.26*/for((key,value) <- user.getQualifications()) yield /*161.70*/{_display_(Seq[Any](format.raw/*161.71*/("""
                        """),_display_(/*162.26*/key),format.raw/*162.29*/("""
                        """)))}),format.raw/*163.26*/("""
                    """),format.raw/*164.21*/("""</td>
                </tr>
                """)))}/*166.18*/else/*166.22*/{_display_(Seq[Any](format.raw/*166.23*/("""
                """),format.raw/*167.17*/("""<tr>
                    <th>Qualifications</th>
                    <td>Users does not have any Qualifications</td>
                </tr>
                """)))}),format.raw/*171.18*/("""
            """),format.raw/*172.13*/("""</table>
            <h3>Projects</h3>
            <table>
                """),_display_(/*175.18*/if( user.getProjects().size()>0)/*175.50*/{_display_(Seq[Any](format.raw/*175.51*/("""
                """),format.raw/*176.17*/("""<tr>
                    <th>Project Id</th>
                    <th>Submit Date</th>
                    <th>Title</th>
                    <th>Description</th>
                </tr>
                """),_display_(/*182.18*/for(projects <- user.getProjects()) yield /*182.53*/{_display_(Seq[Any](format.raw/*182.54*/("""
                """),format.raw/*183.17*/("""<tr>
                    <td>"""),_display_(/*184.26*/projects/*184.34*/.getProjectid()),format.raw/*184.49*/("""</td>
                    <td>"""),_display_(/*185.26*/projects/*185.34*/.getSubmitdate()),format.raw/*185.50*/("""</td>
                    <td>"""),_display_(/*186.26*/projects/*186.34*/.getTitle()),format.raw/*186.45*/("""</td>
                    <td>"""),_display_(/*187.26*/projects/*187.34*/.getDescription()),format.raw/*187.51*/("""</td>
                </tr>
                """)))}),format.raw/*189.18*/("""
                """)))}/*190.18*/else/*190.22*/{_display_(Seq[Any](format.raw/*190.23*/("""
                """),format.raw/*191.17*/("""<p>This user does not have project</p>
                """)))}),format.raw/*192.18*/("""
            """),format.raw/*193.13*/("""</table>
            """)))}),format.raw/*194.14*/("""
            """)))}),format.raw/*195.14*/("""
        """),format.raw/*196.9*/("""</div>
    </article>
</center>
""")))}))
      }
    }
  }

  def render(searchProfile:Map[String, Profile]): play.twirl.api.HtmlFormat.Appendable = apply(searchProfile)

  def f:((Map[String, Profile]) => play.twirl.api.HtmlFormat.Appendable) = (searchProfile) => apply(searchProfile)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/profile.scala.html
                  HASH: f2904afe3a3d925b96c446304145021b5b2aad76
                  MATRIX: 610->1|638->24|983->51|1115->88|1145->93|1173->113|1212->115|1240->117|1344->195|1377->220|1416->222|1458->237|1515->278|1554->279|1596->293|1676->346|1708->357|1793->414|1822->415|1880->445|1960->497|1989->498|2043->524|2074->527|2103->528|2161->558|2287->656|2316->657|2370->683|2405->690|2434->691|2492->721|2660->861|2689->862|2739->884|2828->946|2861->970|2901->972|2947->990|3044->1060|3057->1064|3086->1072|3164->1119|3210->1138|3249->1168|3288->1169|3334->1187|3431->1257|3444->1261|3479->1275|3557->1322|3605->1343|3643->1372|3682->1373|3728->1391|3824->1460|3837->1464|3871->1477|3949->1524|3995->1543|4030->1569|4069->1570|4115->1588|4208->1654|4221->1658|4252->1668|4330->1715|4376->1734|4411->1760|4450->1761|4496->1779|4589->1845|4602->1849|4633->1859|4711->1906|4757->1925|4798->1957|4837->1958|4883->1976|4983->2049|4996->2053|5033->2069|5111->2116|5157->2135|5206->2175|5245->2176|5291->2194|5398->2274|5411->2278|5456->2302|5534->2349|5580->2368|5626->2405|5665->2406|5711->2424|5815->2501|5828->2505|5870->2526|5948->2573|5994->2592|6041->2630|6080->2631|6126->2649|6229->2725|6242->2729|6285->2751|6363->2798|6409->2817|6447->2846|6486->2847|6532->2865|6628->2934|6641->2938|6675->2951|6753->2998|6799->3017|6841->3050|6880->3051|6926->3069|7026->3142|7039->3146|7077->3163|7155->3210|7201->3229|7247->3266|7286->3267|7332->3285|7436->3362|7449->3366|7491->3387|7570->3434|7617->3453|7663->3489|7703->3490|7750->3508|7854->3584|7868->3588|7910->3608|7989->3655|8036->3674|8072->3700|8112->3701|8159->3719|8260->3792|8274->3796|8306->3806|8385->3853|8432->3872|8468->3898|8508->3899|8555->3917|8656->3990|8670->3994|8702->4004|8781->4051|8828->4070|8872->4104|8912->4105|8959->4123|9061->4197|9075->4201|9115->4219|9194->4266|9241->4285|9283->4317|9323->4318|9370->4336|9470->4408|9484->4412|9522->4428|9601->4475|9648->4494|9693->4529|9733->4530|9780->4548|9884->4624|9898->4628|9939->4647|10018->4694|10065->4713|10105->4743|10145->4744|10192->4762|10290->4832|10304->4836|10340->4850|10419->4897|10466->4916|10505->4945|10545->4946|10592->4964|10688->5032|10741->5068|10781->5069|10836->5096|10861->5099|10920->5126|10971->5148|11038->5195|11052->5199|11092->5200|11139->5218|11315->5362|11362->5381|11410->5419|11450->5420|11497->5438|11601->5514|11662->5558|11702->5559|11757->5586|11782->5589|11841->5616|11892->5638|11959->5685|11973->5689|12013->5690|12060->5708|12252->5868|12295->5882|12402->5961|12444->5993|12484->5994|12531->6012|12766->6219|12818->6254|12858->6255|12905->6273|12964->6304|12982->6312|13019->6327|13079->6359|13097->6367|13135->6383|13195->6415|13213->6423|13246->6434|13306->6466|13324->6474|13363->6491|13442->6538|13481->6557|13495->6561|13535->6562|13582->6580|13671->6637|13714->6651|13769->6674|13816->6689|13854->6699
                  LINES: 23->1|24->2|29->3|34->3|36->5|36->5|36->5|37->6|40->9|40->9|40->9|41->10|41->10|41->10|42->11|43->12|43->12|45->14|45->14|46->15|47->16|47->16|48->17|48->17|48->17|49->18|51->20|51->20|52->21|52->21|52->21|53->22|57->26|57->26|58->27|60->29|60->29|60->29|61->30|63->32|63->32|63->32|65->34|66->35|66->35|66->35|67->36|69->38|69->38|69->38|71->40|73->42|73->42|73->42|74->43|76->45|76->45|76->45|78->47|79->48|79->48|79->48|80->49|82->51|82->51|82->51|84->53|85->54|85->54|85->54|86->55|88->57|88->57|88->57|90->59|91->60|91->60|91->60|92->61|94->63|94->63|94->63|96->65|97->66|97->66|97->66|98->67|100->69|100->69|100->69|102->71|103->72|103->72|103->72|104->73|106->75|106->75|106->75|108->77|109->78|109->78|109->78|110->79|112->81|112->81|112->81|114->83|115->84|115->84|115->84|116->85|118->87|118->87|118->87|120->89|121->90|121->90|121->90|122->91|124->93|124->93|124->93|126->95|127->96|127->96|127->96|128->97|130->99|130->99|130->99|132->101|133->102|133->102|133->102|134->103|136->105|136->105|136->105|138->107|139->108|139->108|139->108|140->109|142->111|142->111|142->111|144->113|145->114|145->114|145->114|146->115|148->117|148->117|148->117|150->119|151->120|151->120|151->120|152->121|154->123|154->123|154->123|156->125|157->126|157->126|157->126|158->127|160->129|160->129|160->129|162->131|163->132|163->132|163->132|164->133|166->135|166->135|166->135|168->137|169->138|169->138|169->138|170->139|172->141|172->141|172->141|174->143|175->144|175->144|175->144|176->145|178->147|178->147|178->147|179->148|179->148|180->149|181->150|183->152|183->152|183->152|184->153|188->157|189->158|189->158|189->158|190->159|192->161|192->161|192->161|193->162|193->162|194->163|195->164|197->166|197->166|197->166|198->167|202->171|203->172|206->175|206->175|206->175|207->176|213->182|213->182|213->182|214->183|215->184|215->184|215->184|216->185|216->185|216->185|217->186|217->186|217->186|218->187|218->187|218->187|220->189|221->190|221->190|221->190|222->191|223->192|224->193|225->194|226->195|227->196
                  -- GENERATED --
              */
          