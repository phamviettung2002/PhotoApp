package com.example.photoapp;

public class PhoTo {
    private int id_photo;
    private String Source_photo;
    private String Title_photo;
    private String Sub_photo;

    public PhoTo(int id_photo, String source_photo, String title_photo, String sub_photo) {
        this.id_photo = id_photo;
        Source_photo = source_photo;
        Title_photo = title_photo;
        Sub_photo = sub_photo;
    }

    public PhoTo() {
    }

    public int getId_photo() {
        return id_photo;
    }

    public void setId_photo(int id_photo) {
        this.id_photo = id_photo;
    }

    public String getSource_photo() {
        return Source_photo;
    }

    public void setSource_photo(String source_photo) {
        Source_photo = source_photo;
    }

    public String getTitle_photo() {
        return Title_photo;
    }

    public void setTitle_photo(String title_photo) {
        Title_photo = title_photo;
    }

    public String getSub_photo() {
        return Sub_photo;
    }

    public void setSub_photo(String sub_photo) {
        Sub_photo = sub_photo;
    }
}
