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

        DVD dvd1 = new DVD("SpiderMan", 2001, "Superhero", "True", "Sam Raimi", 121, 12);
        DVD dvd2 = new DVD("Inception", 2010, "Action/Sci-fi", "True", "Christopher Nolan", 148, 15);
        DVD dvd3 = new DVD ("The Pianist", 2002, "War drama", "False", "Roman Polanski", 150, 15);

        ArrayListBook.add(book1);
        ArrayListBook.add(book2);
        ArrayListBook.add(book3);
        ArrayListBook.add(book4);

        ArrayListDVD.add(dvd1);
        ArrayListDVD.add(dvd2);
        ArrayListDVD.add(dvd3);

        System.out.println("Book List");
        System.out.println(ArrayListBook.get(0));
        System.out.println(ArrayListBook.get(1));
        System.out.println(ArrayListBook.get(2));
        System.out.println(ArrayListBook.get(3));

        System.out.println(" ");

        System.out.println("DVD List");
        System.out.println(ArrayListDVD.get(0));
        System.out.println(ArrayListDVD.get(1));
        System.out.println(ArrayListDVD.get(2));
    }
}
