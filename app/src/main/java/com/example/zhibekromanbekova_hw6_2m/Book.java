package com.example.zhibekromanbekova_hw6_2m;

public class Book {
    private String image;
    private String author;
    private String name;

    public Book(String image, String author, String name) {
        this.image = image;
        this.author = author;
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
}
