// @GENERATOR:play-routes-compiler
// @SOURCE:/home/jorge/Documents/emprestimos-pj/conf/routes
// @DATE:Thu Aug 01 22:40:58 UTC 2019


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
