package controllers;

import Utils.JWTUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import models.Perfil;
import models.Usuario;
import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
@Api(value = "/api/todos", description = "Empréstimo controller")
public class HomeController extends Controller {

    Perfil perfil = new Perfil("Adm");
    Usuario usuario = new Usuario("adm", "adm", perfil);

    @ApiOperation(value = "get All Todos",
            notes = "Returns List of all Todos",
            response = String.class,
            httpMethod = "GET")
    public Result index() {
        return ok(JWTUtils.gerarJWT(usuario));
    }

}
