package com.es2.memento;

import java.util.ArrayList;
import java.util.List;

public class Server extends java.lang.Object{
    protected ArrayList<String> serve = new ArrayList();
    public Server(){

    }
    public void addStudent(String studentName) throws ExistingStudentException{
        if (serve.contains(studentName)){
            throw new ExistingStudentException();
        }else {
            serve.add(studentName);
        }
    }
    public Memento backup(){
        return new Memento(serve);
    }
    public void restore(Memento state){
       serve = state.getState();
    }

    public ArrayList<java.lang.String> getStudentNames(){
        return serve;
    }
}
