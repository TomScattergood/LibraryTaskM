package com.softwareinstitute.training.scattergood.thomas;

public class Film extends DVD{
    //////////////////////////Attributes////////////////////////
    private String mainStar;
    private int Runtime;

    /////////////////////////Constructors///////////////////////

    public Film(String Title, int releaseYear, String Genre, String Fiction, String Director, int Runtime, int AgeRating, String mainStar) {
        super(Title, releaseYear, Genre, Fiction, Director, AgeRating);
        this.Runtime=Runtime;
        this.mainStar = mainStar;

    }
    ////////////////////////Methods/////////////////////////////
    public String getMainStar(){return mainStar;}

    public int getRuntime(){return Runtime;}

    public String toString(){
        return "Title: " + Title +", " +"Release year: " + releaseYear + ", " + "Genre: " + Genre + ", " + "Fiction?: " + Fiction + ", " + "Director: " + Director + ", " + "Runtime: " + Runtime + " Minutes" + ", " +"Age Rating: " + AgeRating + ", " + "Main Star: " + mainStar;

    }
}

