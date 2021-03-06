package com.pk4u.e_commerce.model;

public class Course {

    int id,catagory;
    String img,title,date,level,color,text;


    public Course(int id, String img, String title, String date, String level, String color, String text,int category) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.date = date;
        this.level = level;
        this.color = color;
        this.text = text;
        this.catagory = category;
    }

    public int getCatagory() {
        return catagory;
    }
    public void setCatagory(int catagory) {
        this.catagory = catagory;
    }

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

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
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

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
}