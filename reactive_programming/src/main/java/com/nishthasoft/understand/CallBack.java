package com.nishthasoft.understand;

public interface CallBack {

    //void call();

    void pushData(String data);
    void pushComplete();
    void pushError(Exception e);

}
