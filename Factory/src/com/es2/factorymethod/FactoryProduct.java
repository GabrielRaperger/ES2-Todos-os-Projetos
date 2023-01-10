package com.es2.factorymethod;

public abstract class FactoryProduct extends Object{

    public FactoryProduct(){

    }
    public static Product makeProduct(String type) throws UndefinedProductException{
           if(type.equalsIgnoreCase("Software")){
                return new Software();
           }
            else if(type.equalsIgnoreCase("Computer")){
                return new Computer();
            }
            else{
            throw new UndefinedProductException();
           }
    }

}