// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jorge/Documents/emprestimos-pj/conf/routes
// @DATE:Thu Aug 01 22:40:58 UTC 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseEmprestimoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def consultaReceita(cnpj:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "consulta/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("cnpj", cnpj)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
