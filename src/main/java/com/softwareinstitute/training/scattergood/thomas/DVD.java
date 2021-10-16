package com.softwareinstitute.training.scattergood.thomas;

public class DVD extends com.softwareinstitute.training.scattergood.thomas.LibraryContents {

    //////////////////////////Attributes////////////////////////

    private String Director;
    private int Runtime;

    /////////////////////////Constructors///////////////////////

    public DVD(String Title, int releaseYear, String Genre, String Fiction, String Director, int Runtime) {
        super(Title, releaseYear, Genre, Fiction);
        this.Director = Director;
        this.Runtime = Runtime;
    }


    ////////////////////////Methods/////////////////////////////

    public String getDirector() {
        return Director;
    }

    public int getRuntime() {
        return Runtime;
    }

}
