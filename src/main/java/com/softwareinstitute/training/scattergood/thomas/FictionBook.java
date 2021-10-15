package com.softwareinstitute.training.scattergood.thomas;

public class FictionBook extends com.softwareinstitute.training.scattergood.thomas.Book {
    private boolean fiction;



    public FictionBook(String Title, int releaseYear, String Genre, String author, int PageCount, boolean fiction) {
        super(Title, releaseYear, Genre, author, PageCount);
        this.fiction=fiction;
    }

    public boolean isFiction() {
        return fiction;
    }

    public void setFiction(boolean fiction) {
        this.fiction = fiction;
    }
}
