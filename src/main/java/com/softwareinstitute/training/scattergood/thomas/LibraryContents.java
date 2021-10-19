    package com.softwareinstitute.training.scattergood.thomas;

    public class LibraryContents {

        //////////////////////////Attributes////////////////////////

        public String Title;
        public String Genre;
        public int releaseYear;
        public String Fiction;

        /////////////////////////Constructors///////////////////////

        public LibraryContents(String Title, int releaseYear, String Genre, String Fiction) {
            this.Title = Title;
            this.releaseYear = releaseYear;
            this.Genre = Genre;
            this.Fiction=Fiction;
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
        public void BookGenre (String BookGenre) {
            System.out.println("The genre of the book is " + BookGenre);
        }

        public String getFiction(){return Fiction;}

    }
