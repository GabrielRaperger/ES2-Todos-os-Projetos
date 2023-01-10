package com.es2.design.patterns.composite;

import com.es2.design.patterns.factory.Calcado;

public class Cortica extends Calcado {
    protected String Cortica;
    protected Cortica(String type) {
        super(type);
    }
    public String getCortica(){
        return Cortica;
    }
    public void setCortica(String Cortica){
        this.Cortica = Cortica;
    }
}
