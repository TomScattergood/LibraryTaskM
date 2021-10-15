package com.softwareinstitute.training.scattergood.thomas;

import java.util.logging.Logger;

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

    public int getPageCount() {
        return PageCount;
    }

}