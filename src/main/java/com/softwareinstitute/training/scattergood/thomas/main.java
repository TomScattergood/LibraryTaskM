package com.softwareinstitute.training.scattergood.thomas;

import java.util.ArrayList;
import java.util.Collection;

class Main {


    public static void main(String[] args) {
        // what do books, and dvds have in common
        //titles, release year, length/runtime creator (director/author)

        Book book1 = new Book ("Metro 2033", 2005,"Post apocalyptic fiction", "true" , "Dimitri Gluhovsky",430);
        ArrayList book1Array = new ArrayList((Collection) book1);

        Book book2 = new Book ("Fellowship of the Ring", 1954, "Fantasy", "true", "J.R.R Tolkien", 423);
        Book book3 = new Book("A brief History of time", 1988, "Science", "false", "Stephen Hawking",256);
        Book book4 = new Book("The Two Towers", 1954, "Fantasy", "true", "J.R.R Tolkien", 352);

        DVD dvd1 = new DVD ("SpiderMan", 2001, "Superhero", "false", "Sam Raimi", 121);
        DVD dvd2 = new DVD ("Inception", 2010, "Action/Sci-fi", "false", "Christopher Nolan", 148);



        System.out.println(book1Array);


        System.out.println(" ");

        System.out.println("Title: " + book2.getTitle());
        System.out.println("Release year: " + book2.getReleaseYear());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Genre: " + book2.getGenre());
        System.out.println("PageCount: " + book2.getPageCount() + " pages");
        System.out.println("Fiction of Non-fiction?: " + book2.getFiction());

        System.out.println(" ");

        System.out.println("Title: " + book3.getTitle());
        System.out.println("Release year: " + book3.getReleaseYear());
        System.out.println("Author: " + book3.getAuthor());
        System.out.println("Genre: " +book3.getGenre());
        System.out.println("PageCount: " + book3.getPageCount() + " pages");
        System.out.println("Fiction or Non-fiction?: " + book3.getFiction());

        System.out.println(" ");

        System.out.println("Title: " + dvd1.getTitle());
        System.out.println("Release year: " + dvd1.getReleaseYear());
        System.out.println("Director: " + dvd1.getDirector());
        System.out.println("Genre: " + dvd1.getGenre());
        System.out.println("Fiction or Non-fiction?:" + dvd1.getFiction());
        System.out.println("Runtime: " + dvd1.getRuntime() + " minutes");

        System.out.println(" ");

        System.out.println("Title: " + dvd2.getTitle());
        System.out.println("Release year:" + dvd2.getReleaseYear());
        System.out.println("Director: " + dvd2.getDirector());
        System.out.println("Genre: " + dvd2.getGenre());
        System.out.println("Fiction or Non-fiction?:" + dvd2.getFiction());
        System.out.println("Runtime: " + dvd2.getRuntime() + " minutes");
    }

}
