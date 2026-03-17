package lippia.web.services;

import com.crowdar.core.PropertyManager;
import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class ArtPlacerService {
    public static void navegarWebLogin(){
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }
    public static void navegarWebSignUp(){navigateTo(PropertyManager.getProperty("signup.url"));}
}
