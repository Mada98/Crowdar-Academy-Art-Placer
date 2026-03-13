package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;


public class CommonService extends ActionManager {

    public static void clickElementoPorTexto(String texto) {
        String xpathDinamico = String.format("xpath://*[text()='%s' or contains(text(), '%s') or @value='%s']", texto, texto, texto);
        waitClickable(xpathDinamico);
        click(xpathDinamico);
    }

    public static void verificarTextoVisible(String textoEsperado) {
        String xpathDinamico = String.format("xpath://*[contains(text(), '%s')]", textoEsperado);
        waitVisibility(xpathDinamico);
        Assert.assertTrue(isVisible(xpathDinamico), "Error: El texto esperado no esta renderizado en el DOM.");
    }
}
