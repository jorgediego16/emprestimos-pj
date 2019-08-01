package controllers;

import play.libs.ws.WSBodyReadables;
import play.libs.ws.WSBodyWritables;
import play.libs.ws.WSClient;
import play.libs.ws.WSResponse;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller implements WSBodyWritables, WSBodyReadables {

    private final WSClient ws;

    private static final String receitaURL = "https://www.receitaws.com.br/v1/cnpj/";

    @Inject
    public HomeController(WSClient ws) {
        this.ws = ws;
    }

    public CompletionStage<Result> consultaReceita (String cnpj) {
        return ws.url(receitaURL + cnpj).get().thenApply(
                (WSResponse r) -> ok(r.getBody(json()))
        );
    }

    public Result index() {
        return ok();
    }

}
