package com.softwareinstitute.training.scattergood.thomas;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {

        ArrayList<Book> ArrayListBook = new ArrayList<>();
        ArrayList<DVD> ArrayListDVD = new ArrayList<>();

        Book book1 = new Book("Metro 2033", 2005, "Post apocalyptic", "True", "Dimitri Gluhovsky", 430);
        Book book2 = new Book("Fellowship of the Ring", 1954, "Fantasy", "True", "J.R.R Tolkien", 423);
        Book book3 = new Book("A brief History of time", 1988, "Science", "False", "Stephen Hawking", 256);
        Book book4 = new Book("The Two Towers", 1954, "Fantasy", "True", "J.R.R Tolkien", 352);

        DVD dvd1 = new DVD("SpiderMan", 2001, "Superhero", "True", "Sam Raimi", 121);
        DVD dvd2 = new DVD("Inception", 2010, "Action/Sci-fi", "True", "Christopher Nolan", 148);

        ArrayListBook.add(book1);
        ArrayListBook.add(book2);
        ArrayListBook.add(book3);
        ArrayListBook.add(book4);

        ArrayListDVD.add(dvd1);
        ArrayListDVD.add(dvd2);

        System.out.println("Book List");
        System.out.println(ArrayListBook.get(0));
        System.out.println(ArrayListBook.get(1));
        System.out.println(ArrayListBook.get(2));
        System.out.println(ArrayListBook.get(3));

        System.out.println(" ");

        System.out.println("DVD List");
        System.out.println(ArrayListDVD.get(0));
        System.out.println(ArrayListDVD.get(1));
    }
}

       /* System.out.println("Title: " + book2.getTitle());
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

        */
