package com.nishthasoft.observerdesign;

public class EndUser implements Observer{

    String name;

    public EndUser(String name, SubjectLibrary subjectLibrary) {
        subjectLibrary.subscribeObserver(this);
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String avail) {

        System.out.println("Hello "+ name + "! we are glad to notify you that your book is now " + avail);

    }
}
