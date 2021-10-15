package com.softwareinstitute.training.scattergood.thomas;

public class Book extends com.softwareinstitute.training.scattergood.thomas.LibraryContents {

    //////////////////////////Attributes////////////////////////

    private String Author;
    private int PageCount;

    /////////////////////////Constructors///////////////////////

    public Book(String Title, int releaseYear, String Genre, String author, int PageCount) {
        super(Title, releaseYear, Genre);
        this.Author = author;
        this.PageCount = PageCount;
    }

    ////////////////////////Methods/////////////////////////////

    public String getAuthor() {
        return Author;
    }

    public void setAuthor() {
        this.Author = Author;
    }

    public void Author(String Author) {
        System.out.println("The author of this book is " + Author);
    }

    public int getPageCount() {
        return PageCount;
    }

    public void setPageCount() {
        this.PageCount = PageCount;
    }

    public void PageCount(int pageCount) {
        System.out.println("The page count of this book is " + PageCount);
    }
}