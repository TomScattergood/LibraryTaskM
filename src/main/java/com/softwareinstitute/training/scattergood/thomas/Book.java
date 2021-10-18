package com.softwareinstitute.training.scattergood.thomas;

public class Book extends com.softwareinstitute.training.scattergood.thomas.LibraryContents {

    //////////////////////////Attributes////////////////////////


    private String Author;
    private int PageCount;

    /////////////////////////Constructors///////////////////////

    public Book(String Title, int releaseYear, String Genre, String Fiction, String author, int PageCount) {
        super(Title, releaseYear, Genre, Fiction);
        this.Author = author;
        this.PageCount = PageCount;
    }

    ////////////////////////Methods/////////////////////////////

    public String getAuthor() {
        return Author;
    }

    public int getPageCount() {
        return PageCount;
    }

    public String toString(){
        return "Title: " + Title + ", " + "Release year: " + releaseYear + ", " + "Genre: " + Genre + ", " + "Fiction?: " + Fiction + ", " + "Author: " + Author + ", " + "Page count: " + PageCount;
    }

}