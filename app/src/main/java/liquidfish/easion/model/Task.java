package liquidfish.easion.model;

import java.util.Date;

/**
 * Created by Rick on 31-5-2016.
 */
public class Task {

    private int id;
    private Date creationDate;
    private String sender;
    private String label; //title
    private String message;
    private int progress;
    private String link;

   //TODO add date in constructor
    public Task(int id, String sender, String label, String message, int progress, String link) {
        this.id = id;
       // this.creationDate = creationDate;
        this.sender = sender;
        this.label = label;
        this.message = message;
        this.progress = progress;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getSender() {
        return sender;
    }

    public String getLabel() {
        return label;
    }

    public String getMessage() {
        return message;
    }

    public int getProgress() {
        System.out.println("getting progress: " + progress);
        return progress;
    }

    public String getLink() {
        return link;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
}
