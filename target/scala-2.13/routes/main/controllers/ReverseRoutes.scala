// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def profile(ownerid:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "profile/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("ownerid", ownerid)))
    }
  
    // @LINE:9
    def indvStat(search:String, index:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "indvstats/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("search", search)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("index", index)))
    }
  
    // @LINE:8
    def wordStat(search:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "wordstats/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("search", search)))
    }
  
    // @LINE:11
    def readability(search:String, index:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "readability/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("search", search)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("index", index)))
    }
  
    // @LINE:6
    def index(searchPhrase:String = "", sessionId:String = ""): Call = {
      
      Call("GET", _prefix + play.core.routing.queryString(List(if(searchPhrase == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("searchPhrase", searchPhrase)), if(sessionId == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("sessionId", sessionId)))))
    }
  
    // @LINE:7
    def skill(id:String, skill:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "skill/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("skill", skill)))
    }
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
