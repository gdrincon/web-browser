
/**
 *
 * @author guillermo
 * @version 1.0
 *
 */

public class Application {

    public static void main(String[] args) {

        int option;
        ApplicationMenu app = new ApplicationMenu();
        app.showMainMenu();
        option = app.option();

    }
}
