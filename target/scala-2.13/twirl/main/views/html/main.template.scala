
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


Seq[Any](format.raw/*8.1*/("""
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
                  HASH: a8d09ac69c3a169dee35cc099c5ae8bdfeb7207a
                  MATRIX: 1165->260|1289->291|1316->292|1396->345|1422->350|1507->408|1522->414|1584->455|1668->512|1683->518|1744->557|1804->589|1833->590|1874->603|1929->631|1958->632|1990->637|2045->665|2060->671|2121->711|2210->773|2225->779|2287->820|2375->882|2403->889|2431->890
                  LINES: 32->7|37->8|38->9|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|46->17|46->17|47->18|48->19|48->19|49->20|51->22|51->22|51->22|53->24|53->24|53->24|58->29|58->29|59->30
                  -- GENERATED --
              */
          