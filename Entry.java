import java.time.LocalDateTime;

public class Entry {

    private int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;

    public Entry(int id, String title, String body){

        this.id = id;
        this.title = title;
        this.body = body;
    }
    public int getId(){
        return id;
    }

    public String updateTitle(){
        return title;
    }

    public void updateTitle(String title){
        this.title = title;
    }
    public String updateBody(){
        return body;
    }

    public void updateBody(String body){
        this.body = body;
    }
}
