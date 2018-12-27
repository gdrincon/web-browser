import java.util.Scanner;

/**
 *
 * @author guillermo
 * @version 1.0
 *
 */

public class ApplicationMenu {

    public void showMainMenu() {
        System.out.println("************************************");
        System.out.println("*        ******************        *");
        System.out.println("********** MENU PRINCIPAL **********");
        System.out.println("*        ******************        *");
        System.out.println("************************************");
        System.out.println("*           Anar a [1]             *");
        System.out.println("*           Enrere [2]             *");
        System.out.println("*           Endavant [3]           *");
        System.out.println("*  Afegir a adreces d'interès [4]  *");
        System.out.println("* Eliminar d'adreces d'interès [5] *");
        System.out.println("*    Veure adreces d'interès [6]   *");
        System.out.println("*       Veure historial [7]        *");
        System.out.println("*     Veure nombre visites [8]     *");
        System.out.println("*            Sortir [0]            *");
        System.out.println("************************************");
        System.out.println("*         Escull una opció [?]     *");
        System.out.println("************************************");
    }

    public int option() {

        Scanner input = new Scanner(System.in);
        int option = 0;

        try {
            option = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            option = -1;
        }

        return option;
    }

    public void selectOption(Browser browser, int option) {

        switch (option) {
            case 1:
                String url = browser.inputUrl();
                browser.goToUrl(url);
                break;
            case 2:
                browser.goBack();
                break;
            case 3:
                browser.goForward();
                break;
            case 4:
                browser.addBookmark(browser.getUrl());
                break;
            case 5:
                browser.removeBookmark(browser.getUrl());
                break;
            case 6:
                browser.seeBookmark();
                break;
            case 7:
                browser.seeHistory();
                break;
            case 8:
                browser.seeMostVisited();
                break;
            case 0:
                break;
            default:
                System.out.println("Opcio incorrecta");
                break;
        }
    }
}
