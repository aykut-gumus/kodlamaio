package entities;

public class Educator {
    private int educatorId;
    private String educatorFirstName;
    private String educatorLastName;

    public Educator() {
    }

    public Educator(int educatorId, String educatorFirstName, String educatorLastName) {
        this.educatorId = educatorId;
        this.educatorFirstName = educatorFirstName;
        this.educatorLastName = educatorLastName;
    }

    public int getEducatorId() {
        return educatorId;
    }

    public void setEducatorId(int educatorId) {
        this.educatorId = educatorId;
    }

    public String getEducatorFirstName() {
        return educatorFirstName;
    }

    public void setEducatorFirstName(String educatorFirstName) {
        this.educatorFirstName = educatorFirstName;
    }

    public String getEducatorLastName() {
        return educatorLastName;
    }

    public void setEducatorLastName(String educatorLastName) {
        this.educatorLastName = educatorLastName;
    }
}