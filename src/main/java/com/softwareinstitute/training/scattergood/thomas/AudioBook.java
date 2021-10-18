package com.softwareinstitute.training.scattergood.thomas;

public class AudioBook extends LibraryContents{
    //////////////////////////Attributes////////////////////////
    private String Narrator;
    private String Author;
    private int Runtime;

    /////////////////////////Constructors///////////////////////
    public AudioBook(String Title, int releaseYear, String Genre, String Fiction, String Narrator, String Author, int Runtime) {
        super(Title, releaseYear, Genre, Fiction);
        this.Narrator = Narrator;
        this.Author = Author;
        this.Runtime = Runtime;
    }

    ////////////////////////Methods/////////////////////////////
    public String getNarrator(){return Narrator;}

    public String getAuthor(){return Author;}

    public int getRuntime(){return Runtime;}

public String toString(){
return "Title: " + Title + ", " + "Release Year:" + releaseYear + ", " + "Genre: " + Genre + ", " + "Fiction?: " + Fiction + ", " + "Narrator: " + Narrator + ", " + "Author: " + Author + ", " + "Runtime: " + Runtime + " Minutes";
}
    }
