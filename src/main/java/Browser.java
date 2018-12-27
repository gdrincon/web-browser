import java.util.Scanner;

public class Browser {
    private String url;



    public Browser() {
        this.url=url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String inputUrl() {
        String url;
        Scanner kb = new Scanner(System.in);

        do {
            System.out.print("URL: ");
            url = kb.nextLine();
        } while (url.isEmpty());

        return url;
    }

    public void goToUrl(String url) {
    }

    public void goBack() {
    }

    public void goForward() {
    }

    public void seeBookmark() {
    }

    public void seeHistory() {
    }

    public void seeMostVisited() {
    }

    public void addBookmark(String s) {
    }

    public void removeBookmark(String s) {
    }


}
