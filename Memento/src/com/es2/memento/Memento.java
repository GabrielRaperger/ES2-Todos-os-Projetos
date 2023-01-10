package com.es2.memento;

import java.util.ArrayList;

public class Memento extends java.lang.Object{
    protected ArrayList<String> state = new ArrayList();

    public Memento(java.util.ArrayList<String> studentNames){

        this.state = new ArrayList<>(studentNames);
    }
    public java.util.ArrayList<String> getState(){
        return state;
    }
}
