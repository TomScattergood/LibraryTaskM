package com.softwareinstitute.training.scattergood.thomas;

class Main {

    public static void main(String[] args) {
        // what do books, and dvds have in common
        //titles, release year, length/runtime creator (director/author)

        FictionBook fictionbook1 = new FictionBook ("Metro 2033", 2005,"Post apocalyptic fiction", "Dimitri Gluhovsky", 430, true);
        FictionBook fictionbook2 = new FictionBook ("Fellowship of the Ring", 1954, "Fantasy", "J.R.R. Tolkien,", 423, true);

        NonFictionBook nonFictionBook1 = new NonFictionBook("A breif History of time", 1988, "Science", "Stephen Hawking", 256,true);
        DVD dvd1 = new DVD ("SpiderMan", 2001, "Superhero", "Sam Raimi", 121);

        System.out.println("Title: " + fictionbook1.getTitle());
        System.out.println("Release year: " + fictionbook1.getReleaseYear());
        System.out.println("Genre: " + fictionbook1.getGenre());
        System.out.println("Author: " + fictionbook1.getAuthor());
        System.out.println("PageCount: " + fictionbook1.getPageCount() + " pages");
        System.out.println("Fiction?: " + fictionbook1.isFiction());

        System.out.println(" ");

        System.out.println("Title: " + fictionbook2.getTitle());
        System.out.println("Release year: " + fictionbook2.getReleaseYear());
        System.out.println("Genre: " + fictionbook2.getGenre());
        System.out.println("Author: " + fictionbook2.getAuthor());
        System.out.println("PageCount: " + fictionbook2.getPageCount() + " pages");
        System.out.println("Fiction?: " + fictionbook2.isFiction());

        System.out.println(" ");

        System.out.println("Title: " + nonFictionBook1.getTitle());
        System.out.println("Release year: " + nonFictionBook1.getReleaseYear());
        System.out.println("Genre: " + nonFictionBook1.getGenre());
        System.out.println("Author: " + nonFictionBook1.getAuthor());
        System.out.println("PageCount: " + nonFictionBook1.getPageCount() + " pages");
        System.out.println("Fiction?: " + nonFictionBook1.isNonFiction());

        System.out.println(" ");

        System.out.println("Title: " + dvd1.getTitle());
        System.out.println("Release year: " + dvd1.getReleaseYear());
        System.out.println("Genre: " + dvd1.getGenre());
        System.out.println("Director: " + dvd1.getDirector());
        System.out.println("Runtime: " + dvd1.getRuntime() + " minutes");
    }
}
