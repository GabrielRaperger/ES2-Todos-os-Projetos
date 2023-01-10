package com.es2.design.patterns.composite;

import com.es2.design.patterns.factory.Calcado;

public class Tecido extends Calcado {
    protected String Tecido;
    protected Tecido(String type) {
        super(type);
    }
    public String getTecido(){
        return Tecido;
    }
    public void setTecido(String Tecido){
        this.Tecido = Tecido;
    }
}
