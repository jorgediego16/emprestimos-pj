// @GENERATOR:play-routes-compiler
// @SOURCE:/home/desenvolvedor0/Documentos/emprestimos-pj/conf/routes
// @DATE:Thu Aug 01 10:53:17 BRT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
