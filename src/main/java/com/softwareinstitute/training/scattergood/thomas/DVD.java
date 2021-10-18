package com.softwareinstitute.training.scattergood.thomas;

public class DVD extends com.softwareinstitute.training.scattergood.thomas.LibraryContents {
    //////////////////////////Attributes////////////////////////

    private String Director;
    private int Runtime;
    private int AgeRating;

    /////////////////////////Constructors///////////////////////

    public DVD(String Title, int releaseYear, String Genre, String Fiction, String Director, int Runtime, int AgeRating) {
        super(Title, releaseYear, Genre, Fiction);
        this.Director = Director;
        this.Runtime = Runtime;
        this.AgeRating = AgeRating;
    }

    ////////////////////////Methods/////////////////////////////

    public String getDirector() {
        return Director;
    }

    public int getRuntime() {
        return Runtime;
    }

    public int getAgeRating(){return AgeRating;}

    public String toString() {
        return "Title: " + Title + ", " + "Release year:" + releaseYear + ", " + "Genre:" + Genre + ", " + "Fiction?:" + Fiction + ", " + "Director: " + Director + ", " + "Runtime: " + Runtime + " Minutes" + ", " +"Age Rating: " + AgeRating;
    }
}
