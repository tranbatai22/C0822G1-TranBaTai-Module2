package posts;

public class Posts {
    private int id;
    private String title;
    private String subtitle;
    private String content;
    private int viewt;

    public Posts(int id, String title, String subtitle, String content, int viewt) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.content = content;
        this.viewt = viewt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getViewt() {
        return viewt;
    }

    public void setViewt(int viewt) {
        this.viewt = viewt;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "id =" + id +
                ", title =" + title + '\'' +
                ", subtitle =" + subtitle + '\'' +
                ", content =" + content + '\'' +
                ", viewt = " + viewt +
                '}';
    }
}
