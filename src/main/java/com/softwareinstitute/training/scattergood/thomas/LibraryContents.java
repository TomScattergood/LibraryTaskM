    package com.softwareinstitute.training.scattergood.thomas;

    public class LibraryContents {

        //////////////////////////Attributes////////////////////////

        private String Title;
        private int releaseYear;
        private String Genre;
        //private boolean borrow;



        /////////////////////////Constructors///////////////////////

        public LibraryContents(String Title, int releaseYear, String Genre) {//boolean Borrow) {
            this.Title = Title;
            this.releaseYear = releaseYear;
            this.Genre = Genre;
            //this.borrow = borrow;
        }

        ////////////////////////Methods/////////////////////////////

        public String getTitle(){return Title;}
        public void title (String title){
            System.out.println("The title of the item is " + title );
        }


        public int getReleaseYear(){return releaseYear;}
        public void ReleaseYear (int releaseYear) {
            System.out.println("The release year of the item is " + releaseYear);
        }

        public String getGenre(){return Genre;}
        public void Genre (String Genre) {
            System.out.println("The genre of the item is " + Genre);
        }
        // public Boolean get (boolean borrowable){
        //  System.out.println("This book is " + borrowable);
        //}

    }
