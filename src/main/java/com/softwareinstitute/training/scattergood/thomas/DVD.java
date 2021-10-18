package com.softwareinstitute.training.scattergood.thomas;

public class DVD extends com.softwareinstitute.training.scattergood.thomas.LibraryContents {
    //////////////////////////Attributes////////////////////////

    public String Director;
    public int AgeRating;

    /////////////////////////Constructors///////////////////////

    public DVD(String Title, int releaseYear, String Genre, String Fiction, String Director, int AgeRating) {
        super(Title, releaseYear, Genre, Fiction);
        this.Director = Director;
        this.AgeRating = AgeRating;
    }

    ////////////////////////Methods/////////////////////////////

    public String getDirector() {
        return Director;
    }


    public int getAgeRating(){return AgeRating;}

    public String toString() {
        return "Title: " + Title + ", " + "Release year:" + releaseYear + ", " + "Genre:" + Genre + ", " + "Fiction?:" + Fiction + ", " + "Director: " + Director + ", " + ", " +"Age Rating: " + AgeRating;
    }
}
