package net.nahuelberardi.listview;

public class DataModel {

    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public DataModel (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


}
