package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.SignUpConstants;
import org.testng.Assert;

public class SignUpService extends ActionManager {
    public static void registroUsuario() {
        String emailDinamico = "rama.test" + System.currentTimeMillis() + "@gmail.com";
        String password = PropertyManager.getProperty("art.placer.password");
        setInput(SignUpConstants.INPUT_FIRSTNAME, "Test");
        setInput(SignUpConstants.INPUT_LASTNAME, "Test");
        setInput(SignUpConstants.INPUT_EMAIL, emailDinamico);
        setInput(SignUpConstants.INPUT_PASSWORD, password);
    }

    public static void seleccionarPlan() {
        click(SignUpConstants.BUTTON_ADVANCED);
    }

    public static void formularioPago() {
        String creditCard = PropertyManager.getProperty("credit.card");
        String expDate = PropertyManager.getProperty("exp.date");
        String cvc = PropertyManager.getProperty("cvc");
        setInput(SignUpConstants.INPUT_CREDIT_CARD, creditCard);
        setInput(SignUpConstants.INPUT_EXP_DATE, expDate);
        setInput(SignUpConstants.INPUT_CVC, cvc);
        click(SignUpConstants.BUTTON_ADVANCED);
    }
}
