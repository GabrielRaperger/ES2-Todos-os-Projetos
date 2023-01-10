package com.es2.design.patterns.factory;

import com.es2.design.patterns.decorator.EncomendaPersonalizada;

public class Creator {
    public Creator(){}
    public static Object setCreator(String Type){

        if (Type.equalsIgnoreCase( "Encomenda")){
            return new EncomendaPersonalizada();
        }
        else if (Type.equalsIgnoreCase("Calcado")){
            return new Calcado(Type);
        }
        else{
            System.out.println("Não foi possivel realizar o pedido");
            return null;
        }
    }
}
