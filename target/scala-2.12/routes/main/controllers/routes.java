// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jorge/Documents/emprestimos-pj/conf/routes
// @DATE:Thu Aug 01 22:40:58 UTC 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseEmprestimoController EmprestimoController = new controllers.ReverseEmprestimoController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseEmprestimoController EmprestimoController = new controllers.javascript.ReverseEmprestimoController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
