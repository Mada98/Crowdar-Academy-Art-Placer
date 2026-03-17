package lippia.web.steps;

import io.cucumber.java.en.*;
import lippia.web.services.SignUpService;
import lippia.web.services.ArtPlacerService;

public class SignUpSteps {

    @Given ("el usuario se encuentra en la pagina de sign up de ArtPlacer")
    public void home() {
        ArtPlacerService.navegarWebSignUp();
    }

    @When ("el usuario completa el formulario de registro con datos validos")
    public void registroUsuario() {SignUpService.registroUsuario();}

    @And ("el usuario completa el formulario de pago con datos validos")
    public void formularioPago() {SignUpService.formularioPago();}

    @And ("el usuario selecciona el plan de subscripcion {string}")
    public void seleccionarPlans(String nombreDelPlan) {SignUpService.seleccionPlan(nombreDelPlan);}
}
