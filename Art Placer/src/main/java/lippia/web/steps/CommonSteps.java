package lippia.web.steps;

import io.cucumber.java.en.*;
import lippia.web.services.LoginService;
import lippia.web.services.ArtPlacerService;
import lippia.web.services.CommonService;

public class CommonSteps {
    @And("el usuario hace click en el boton {string}")
    public void clickBotonGenerico(String textoBoton) {
        CommonService.clickElementoPorTexto(textoBoton);
    }

    @When("el usuario hace click en el enlace {string}")
    public void clickEnlaceGenerico(String textoEnlace) {
        CommonService.clickElementoPorTexto(textoEnlace);
    }

    @Then("se muestra el mensaje {string}")
    public void verificarMensajePantalla(String mensaje) {
        CommonService.verificarTextoVisible(mensaje);
    }
}
