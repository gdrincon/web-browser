
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
        Browser browser = new Browser();

        do {
            System.out.println(browser.getUrl());
            app.showMainMenu();
            option = app.setOptionNumber();
            app.selectOption(browser, option);

        } while(option != 0);

    }
}
