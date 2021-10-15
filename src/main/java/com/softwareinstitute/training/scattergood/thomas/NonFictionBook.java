package com.softwareinstitute.training.scattergood.thomas;

public class NonFictionBook extends Book{
    private boolean NonFiction;


    public NonFictionBook(String Title, int releaseYear, String Genre, String author, int PageCount, boolean NonFiction) {
        super(Title, releaseYear, Genre, author, PageCount);
        this.NonFiction=NonFiction;
    }

    public boolean isNonFiction(){
        return NonFiction;
        }
}
