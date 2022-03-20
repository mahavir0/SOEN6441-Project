
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


Seq[Any](format.raw/*4.1*/("""
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
                  HASH: 4cb0335d6b6928c0f8ac43be094f0958f53bf0d7
                  MATRIX: 610->1|638->23|983->49|1114->87|1141->89|1169->109|1208->111|1235->112|1336->187|1369->212|1408->214|1449->228|1506->269|1545->270|1586->283|1665->335|1697->346|1780->401|1809->402|1866->431|1945->482|1974->483|2027->508|2058->511|2087->512|2144->541|2268->637|2297->638|2350->663|2385->670|2414->671|2471->700|2635->836|2664->837|2713->858|2800->918|2833->942|2873->944|2918->961|3013->1029|3026->1033|3055->1041|3131->1086|3176->1104|3215->1134|3254->1135|3299->1152|3394->1220|3407->1224|3442->1238|3518->1283|3564->1302|3602->1331|3641->1332|3686->1349|3780->1416|3793->1420|3827->1433|3903->1478|3948->1496|3983->1522|4022->1523|4067->1540|4158->1604|4171->1608|4202->1618|4278->1663|4323->1681|4358->1707|4397->1708|4442->1725|4533->1789|4546->1793|4577->1803|4653->1848|4698->1866|4739->1898|4778->1899|4823->1916|4921->1987|4934->1991|4971->2007|5047->2052|5092->2070|5141->2110|5180->2111|5225->2128|5330->2206|5343->2210|5388->2234|5464->2279|5509->2297|5555->2334|5594->2335|5639->2352|5741->2427|5754->2431|5796->2452|5872->2497|5917->2515|5964->2553|6003->2554|6048->2571|6149->2645|6162->2649|6205->2671|6281->2716|6326->2734|6364->2763|6403->2764|6448->2781|6542->2848|6555->2852|6589->2865|6665->2910|6710->2928|6752->2961|6791->2962|6836->2979|6934->3050|6947->3054|6985->3071|7061->3116|7106->3134|7152->3171|7191->3172|7236->3189|7338->3264|7351->3268|7393->3289|7470->3334|7516->3352|7562->3388|7602->3389|7648->3406|7750->3480|7764->3484|7806->3504|7883->3549|7929->3567|7965->3593|8005->3594|8051->3611|8150->3682|8164->3686|8196->3696|8273->3741|8319->3759|8355->3785|8395->3786|8441->3803|8540->3874|8554->3878|8586->3888|8663->3933|8709->3951|8753->3985|8793->3986|8839->4003|8939->4075|8953->4079|8993->4097|9070->4142|9116->4160|9158->4192|9198->4193|9244->4210|9342->4280|9356->4284|9394->4300|9471->4345|9517->4363|9562->4398|9602->4399|9648->4416|9750->4490|9764->4494|9805->4513|9882->4558|9928->4576|9968->4606|10008->4607|10054->4624|10150->4692|10164->4696|10200->4710|10277->4755|10323->4773|10362->4802|10402->4803|10448->4820|10542->4886|10595->4922|10635->4923|10689->4949|10714->4952|10772->4978|10822->4999|10887->5044|10901->5048|10941->5049|10987->5066|11159->5206|11205->5224|11253->5262|11293->5263|11339->5280|11441->5354|11502->5398|11542->5399|11596->5425|11621->5428|11679->5454|11729->5475|11794->5520|11808->5524|11848->5525|11894->5542|12082->5698|12124->5711|12228->5787|12270->5819|12310->5820|12356->5837|12585->6038|12637->6073|12677->6074|12723->6091|12781->6121|12799->6129|12836->6144|12895->6175|12913->6183|12951->6199|13010->6230|13028->6238|13061->6249|13120->6280|13138->6288|13177->6305|13254->6350|13292->6368|13306->6372|13346->6373|13392->6390|13480->6446|13522->6459|13576->6481|13622->6495|13659->6504
                  LINES: 23->1|24->2|29->3|34->4|35->5|35->5|35->5|36->6|39->9|39->9|39->9|40->10|40->10|40->10|41->11|42->12|42->12|44->14|44->14|45->15|46->16|46->16|47->17|47->17|47->17|48->18|50->20|50->20|51->21|51->21|51->21|52->22|56->26|56->26|57->27|59->29|59->29|59->29|60->30|62->32|62->32|62->32|64->34|65->35|65->35|65->35|66->36|68->38|68->38|68->38|70->40|72->42|72->42|72->42|73->43|75->45|75->45|75->45|77->47|78->48|78->48|78->48|79->49|81->51|81->51|81->51|83->53|84->54|84->54|84->54|85->55|87->57|87->57|87->57|89->59|90->60|90->60|90->60|91->61|93->63|93->63|93->63|95->65|96->66|96->66|96->66|97->67|99->69|99->69|99->69|101->71|102->72|102->72|102->72|103->73|105->75|105->75|105->75|107->77|108->78|108->78|108->78|109->79|111->81|111->81|111->81|113->83|114->84|114->84|114->84|115->85|117->87|117->87|117->87|119->89|120->90|120->90|120->90|121->91|123->93|123->93|123->93|125->95|126->96|126->96|126->96|127->97|129->99|129->99|129->99|131->101|132->102|132->102|132->102|133->103|135->105|135->105|135->105|137->107|138->108|138->108|138->108|139->109|141->111|141->111|141->111|143->113|144->114|144->114|144->114|145->115|147->117|147->117|147->117|149->119|150->120|150->120|150->120|151->121|153->123|153->123|153->123|155->125|156->126|156->126|156->126|157->127|159->129|159->129|159->129|161->131|162->132|162->132|162->132|163->133|165->135|165->135|165->135|167->137|168->138|168->138|168->138|169->139|171->141|171->141|171->141|173->143|174->144|174->144|174->144|175->145|177->147|177->147|177->147|178->148|178->148|179->149|180->150|182->152|182->152|182->152|183->153|187->157|188->158|188->158|188->158|189->159|191->161|191->161|191->161|192->162|192->162|193->163|194->164|196->166|196->166|196->166|197->167|201->171|202->172|205->175|205->175|205->175|206->176|212->182|212->182|212->182|213->183|214->184|214->184|214->184|215->185|215->185|215->185|216->186|216->186|216->186|217->187|217->187|217->187|219->189|220->190|220->190|220->190|221->191|222->192|223->193|224->194|225->195|226->196
                  -- GENERATED --
              */
          