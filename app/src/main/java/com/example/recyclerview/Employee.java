package com.example.recyclerview;

public class Employee {
    private String id;
    private String name;
    private String title;
    private int image;

    Employee(String id,String name,String title,int image){
        this.id = id;
        this.name = name;
        this.title = title;
        this.image = image;

    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


}
