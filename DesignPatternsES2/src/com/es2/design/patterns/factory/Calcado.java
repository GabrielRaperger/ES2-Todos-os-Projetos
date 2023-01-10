package com.es2.design.patterns.factory;

import com.es2.design.patterns.composite.Cortica;
import com.es2.design.patterns.composite.Fio;
import com.es2.design.patterns.composite.Tecido;

public class Calcado {

    protected String Type;

    protected Calcado(String type){
        Type = type;
    }
    public String getComponents(){
        return Type;
    }


}
