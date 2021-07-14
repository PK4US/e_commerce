package com.pk4u.e_commerce.model;

public class Course {

    int id;
    String img;
    String tittle;
    String date;
    String level;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Course(int id, String img, String tittle, String date, String level, String color) {
        this.id = id;
        this.img = img;
        this.tittle = tittle;
        this.date = date;
        this.level = level;
        this.color = color;
    }

    String color;
}
