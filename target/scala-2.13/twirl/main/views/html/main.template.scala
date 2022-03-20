
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
    <title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*14.50*/routes/*14.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.97*/("""'>
    <link rel="shortcut icon" type="image/png" href='"""),_display_(/*15.55*/routes/*15.61*/.Assets.versioned("images/favicon.png")),format.raw/*15.100*/("""'>
    <style>
        #hiddenId"""),format.raw/*17.18*/("""{"""),format.raw/*17.19*/("""
            """),format.raw/*18.13*/("""visibility: hidden;
        """),format.raw/*19.9*/("""}"""),format.raw/*19.10*/("""
    """),format.raw/*20.5*/("""</style>

    <script src='"""),_display_(/*22.19*/routes/*22.25*/.Assets.versioned("javascripts/main.js")),format.raw/*22.65*/("""' type="text/javascript"></script>
    <!--
    <script src='"""),_display_(/*24.19*/routes/*24.25*/.Assets.versioned("javascripts/prism.js")),format.raw/*24.66*/("""' type="text/javascript"></script>
	 -->
</head>

<body>
    """),_display_(/*29.6*/content),format.raw/*29.13*/("""
"""),format.raw/*30.1*/("""</body>

</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: a4b0a9f949c8f0d42b2c0386882ecb4e881a8ebb
                  MATRIX: 1170->266|1295->296|1325->300|1409->357|1435->362|1521->421|1536->427|1598->468|1683->526|1698->532|1759->571|1821->605|1850->606|1892->620|1948->649|1977->650|2010->656|2067->686|2082->692|2143->732|2234->796|2249->802|2311->843|2404->910|2432->917|2461->919
                  LINES: 32->7|37->7|39->9|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|47->17|47->17|48->18|49->19|49->19|50->20|52->22|52->22|52->22|54->24|54->24|54->24|59->29|59->29|60->30
                  -- GENERATED --
              */
          