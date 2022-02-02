package com.example.homework7.ui.home;

public class ModelForFirst {
    private String comment;
    private int photo;

    public ModelForFirst(String comment, int photo) {
        this.comment = comment;
        this.photo = photo;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
