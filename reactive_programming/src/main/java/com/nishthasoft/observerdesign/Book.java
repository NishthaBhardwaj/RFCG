package com.nishthasoft.observerdesign;

import java.util.ArrayList;

public class Book implements SubjectLibrary{

    private String name;
    private String type;
    private String author;
    private double price;
    private String inStock;

    public ArrayList<Observer> getObsList() {
        return obsList;
    }

    public void setObsList(ArrayList<Observer> obsList) {
        this.obsList = obsList;
    }

    private ArrayList<Observer> obsList = new ArrayList<Observer>();

    public Book(String name, String type, String author, double price, String inStock) {
        this.name = name;
        this.type = type;
        this.author = author;
        this.price = price;
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }

    @Override
    public void subscribeObserver(Observer obs) {

        obsList.add(obs);

    }

    @Override
    public void unsubscribeObserver(Observer observer) {
        obsList.remove(observer);

    }

    @Override
    public void notifyObserver() {

        if(inStock.equalsIgnoreCase("avail")) {
            System.out.println(
                    "Book name :" + this.name +
                            "Book Type :" +this.type +
                            "Price   :"   + this.price +
                            " Author :"   + this.author +
                            " is now " + this.inStock +". So, Please notify all users.\n"
            );

            for(Observer observer: obsList) {
                observer.update(this.inStock);
            }

        }

        }

}
