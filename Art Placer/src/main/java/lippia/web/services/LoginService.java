package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;

public class LoginService extends ActionManager {

    public static void autenticarUsuario() {
        String email = PropertyManager.getProperty("artplacer.email");
        String password = PropertyManager.getProperty("artplacer.password");

        setInput(LoginConstants.INPUT_EMAIL, email);
        setInput(LoginConstants.INPUT_PASSWORD, password);
        click(LoginConstants.BUTTON_LOGIN);
    }

    public static void detectarLogin() {
        Assert.assertTrue(isVisible(LoginConstants.STRING_TITLE_XPATH), "El mensaje de bienvenida no es visible luego del Login");
    }

    public static void completarFormulario(String email, String password) {
        setInput(LoginConstants.INPUT_EMAIL, email);
        setInput(LoginConstants.INPUT_PASSWORD, password);
    }

    public static void completarCampoRecuperacion(String email) {
        if (email.equals("artplacer.email")) {
            email = PropertyManager.getProperty("artplacer.email");
        }
        setInput(LoginConstants.INPUT_FORGOT_EMAIL, email);
    }
}