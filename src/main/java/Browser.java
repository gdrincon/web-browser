import java.util.*;


public class Browser {

    private String url;
    private Date date;
    private Deque<String> browserBack = new ArrayDeque<>();
    private Deque<String> browserForward = new ArrayDeque<>();
    private Set<String> bookmarks = new LinkedHashSet<>();
    private Map<String, Date>  history = new LinkedHashMap<>();
    private Map<Integer, String>  mostVisited = new LinkedHashMap<>();

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

    public void goToUrl(String url) {

        setUrl(url);
        setDate();
        browserBack.push(getUrl());
        history.put(getUrl(), getDate());

    }

    public void goBack() {

        if (browserBack.peek() != null) {
            browserForward.push(browserBack.peek());
            browserBack.pop();
            setUrl(browserBack.peek());
        }
    }

    public Deque getGoBack() {
        return browserBack;
    }

    public void goForward() {

        if (browserForward.peek() != null) {
            browserBack.push(browserForward.peek());
            setUrl(browserForward.peek());
            browserForward.pop();
        } else {
            setUrl(browserBack.peek());
        }
    }

    public Deque getGoForward() {
        return browserForward;
    }

    public void getBookmarks() {
        System.out.println(bookmarks);
    }

    public void getHistory() {

        System.out.println(history.toString());
    }

    public void getMostVisited() {
        System.out.println(mostVisited);
    }

    public void addBookmark() {

        bookmarks.add(getUrl());
    }

    public void removeBookmark(String s) {

        if (bookmarks.contains(getUrl())) {
            bookmarks.remove(getUrl());
        }
    }

    @Override
    public String toString() {
        return "url: '" + url + '\'' +
                ", data: " + date;
    }
}
