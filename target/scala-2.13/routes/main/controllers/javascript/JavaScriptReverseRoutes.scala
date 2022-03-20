// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.profile",
      """
        function(ownerid0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("ownerid", ownerid0))})
        }
      """
    )
  
    // @LINE:9
    def indvStat: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.indvStat",
      """
        function(search0,index1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "indvstats/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("search", search0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("index", index1))})
        }
      """
    )
  
    // @LINE:8
    def wordStat: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.wordStat",
      """
        function(search0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "wordstats/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("search", search0))})
        }
      """
    )
  
    // @LINE:11
    def readability: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.readability",
      """
        function(search0,index1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "readability/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("search", search0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("index", index1))})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function(searchPhrase0,sessionId1) {
          return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(searchPhrase0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("searchPhrase", searchPhrase0)), (sessionId1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("sessionId", sessionId1))])})
        }
      """
    )
  
    // @LINE:7
    def skill: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.skill",
      """
        function(id0,skill1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "skill/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("skill", skill1))})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
