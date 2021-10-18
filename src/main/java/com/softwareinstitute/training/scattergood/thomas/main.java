package com.softwareinstitute.training.scattergood.thomas;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {

        ArrayList<Book> ArrayListBook = new ArrayList<>();
        ArrayList<Film> ArrayListFilm = new ArrayList<>();
        ArrayList<AudioBook> ArrayListAB = new ArrayList<>();
        ArrayList<tvSeries> ArrayListTV = new ArrayList<>();


        Book book1 = new Book("Metro 2033", 2005, "Post apocalyptic", "True", "Dimitri Gluhovsky", 430);
        Book book2 = new Book("Fellowship of the Ring", 1954, "Fantasy", "True", "J.R.R Tolkien", 423);
        Book book3 = new Book("A brief History of time", 1988, "Science", "False", "Stephen Hawking", 256);
        Book book4 = new Book("The Two Towers", 1954, "Fantasy", "True", "J.R.R Tolkien", 352);
        Book book5 = new Book("The Return of The King", 1955, "Fantasy", "True", "J.R.R Tolkien", 416);

        Film film1 = new Film("SpiderMan", 2001, "Superhero", "True", "Sam Raimi", 121, 12, "Tobey Maguire");
        Film film2 = new Film("Inception", 2010, "Action/Sci-fi", "True", "Christopher Nolan", 148, 15, "Leonardo DiCaprio");
        Film film3 = new Film ("The Pianist", 2002, "War drama", "False", "Roman Polanski", 150, 15, "Adrien Brody");


        AudioBook audiobook1 = new AudioBook("Mythos:The Greek Myths Retold", 2017, "Mythology", "True", "Stephen Fry", "Stephen Fry", 925);
        AudioBook audiobook2 = new AudioBook("How to Build a Universe", 2017, "Educational Sciences", "False", "Brian cox, Robin Ince", "Brian Cox, Robin Ince, Alexandra Feachem", 341);

        tvSeries tvSeries1 = new tvSeries("Breaking bad", 2008, "Crime drama", "True", "Vince Gilligan", 18, 62);
        tvSeries tvSeries2 = new tvSeries("Wonders of the Universe", 2010, "Documentary", "False", "Chris Holt", 3, 4);


        ArrayListBook.add(book1);
        ArrayListBook.add(book2);
        ArrayListBook.add(book3);
        ArrayListBook.add(book4);
        ArrayListBook.add(book5);

        ArrayListFilm.add(film1);
        ArrayListFilm.add(film2);
        ArrayListFilm.add(film3);

        ArrayListAB.add(audiobook1);
        ArrayListAB.add(audiobook2);

        ArrayListTV.add(tvSeries1);
        ArrayListTV.add(tvSeries2);

        System.out.println("Book List");
        System.out.println(ArrayListBook.get(0));
        System.out.println(ArrayListBook.get(1));
        System.out.println(ArrayListBook.get(2));
        System.out.println(ArrayListBook.get(3));
        System.out.println(ArrayListBook.get(4));

        System.out.println(" ");

        System.out.println("Film List:");
        System.out.println(ArrayListFilm.get(0));
        System.out.println(ArrayListFilm.get(1));
        System.out.println(ArrayListFilm.get(2));

        System.out.println(" ");

        System.out.println("Audiobook list:");
        System.out.println(ArrayListAB.get(0));
        System.out.println(ArrayListAB.get(1));

        System.out.println(" ");

        System.out.println("TV series list");
        System.out.println(ArrayListTV.get(0));
        System.out.println(ArrayListTV.get(1));
    }
}
