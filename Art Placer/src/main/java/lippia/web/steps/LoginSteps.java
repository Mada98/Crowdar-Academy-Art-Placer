package lippia.web.steps;

import io.cucumber.java.en.*;
import lippia.web.services.LoginService;
import lippia.web.services.ArtPlacerService;

public class LoginSteps {

    @Given("el usuario se encuentra en la pagina de login de ArtPlacer")
    public void home() {
        ArtPlacerService.navegarWeb();
    }

    @When("el usuario con onboarding completo se autentica en la aplicacion")
    public void autenticacionUsuario() {
        LoginService.autenticarUsuario();
    }

    @Then("se muestra el mensaje de bienvenida")
    public void verificarLoginExitoso() {
        LoginService.detectarLogin();
    }

    @When("el usuario ingresa {string} y {string} en los campos correspondientes")
    public void ingresarCredenciales(String email, String password) {
        LoginService.completarFormulario(email, password);
    }

    @And("el usuario ingresa {string} en el campo de recuperacion")
    public void ingresarRecuperacion(String email) {
        LoginService.completarCampoRecuperacion(email);
    }
}
