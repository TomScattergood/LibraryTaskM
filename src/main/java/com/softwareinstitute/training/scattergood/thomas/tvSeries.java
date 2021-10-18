package com.softwareinstitute.training.scattergood.thomas;

public class tvSeries extends DVD {
    //////////////////////////Attributes////////////////////////
    private int EpisodeCount;

    /////////////////////////Constructors///////////////////////
    public tvSeries(String Title, int releaseYear, String Genre, String Fiction, String Director, int AgeRating, int EpisodeCount) {
        super(Title, releaseYear, Genre, Fiction, Director, AgeRating);
        this.EpisodeCount = EpisodeCount;
    }

    ////////////////////////Methods/////////////////////////////

    public int getEpisodeCount(){return EpisodeCount;}

    public String toString(){
        return "Title: " + Title + ", " + "Release year: " + releaseYear + ", " + "Genre: " + Genre + ", " + "Fiction?: " + Fiction + ", " + "Director: " + Director + ", " + "Age Rating: " + AgeRating +", " + "Episode Count: " + EpisodeCount;
    }
}
