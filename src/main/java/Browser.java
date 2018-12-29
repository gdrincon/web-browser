import java.util.Date;
import java.util.Scanner;
import java.util.Stack;

public class Browser {

    private String url;
    private Date date;
    private Stack<String> browserStack = new Stack<>();


    public Browser() {


    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getDate() {
        return date;
    }

    public void setDate() {
        date=new Date();
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

        setUrl(url);
        setDate();

        browserStack.push(getUrl());
        System.out.println(browserStack);
    }

    public void goBack() {

        browserStack.pop();
        System.out.println(browserStack);
    }

    public void goForward() {

        browserStack.push(getUrl());
        System.out.println(browserStack);
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

    @Override
    public String toString() {
        return "url: '" + url + '\'' +
                ", data: " + date;
    }
}
