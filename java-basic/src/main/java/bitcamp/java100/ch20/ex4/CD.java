package bitcamp.java100.ch20.ex4;

public class CD {
    private String title;
    private String singer;
    
    public CD() {
        System.out.println("CD()");
    }

    public CD(String title, String singer) {
        super();
        this.title = title;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
    
    
}
