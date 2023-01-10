package com.es2.design.patterns.composite;

import com.es2.design.patterns.factory.Calcado;

public class Fio extends Calcado {
    protected String Fio;
    protected Fio(String type) {
        super(type);
    }
    public String getFio(){
        return Fio;
    }
    public void setFio(String Fio){
        this.Fio = Fio;
    }
}
