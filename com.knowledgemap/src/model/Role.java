package model;

public class Role {
    int id;
    String title;
    String note;


    public Role(int id,
                String title,
                String note) {

        this.id = id;
        this.title = title;
        this.note = note;
    }

    public Role() {

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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
