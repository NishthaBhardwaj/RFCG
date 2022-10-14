package com.nishthasoft.observerdesign;

public class ObserverDesignPattern {

    public static void main(String[] args) {
        Book book = new Book("Goosebumps", "Horro", "XYZ", 200, "SoldOut");
        Book book1 = new Book("Goosebumps1", "Horro", "XYZ", 200, "SoldOut");

        EndUser user = new EndUser("John", book);
        EndUser user1 = new EndUser("John1", book1);
       // EndUser user2 = new EndUser("John1", null);


        book1.setInStock("avail");
        book.setInStock("avail");
        book.notifyObserver();
        book1.notifyObserver();



    }




}
