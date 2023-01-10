package com.es2.factorymethod;

public class Software extends Object implements Product {

    private String Brand;

    protected Software() {
    }

    public String getBrand(){
        return Brand;
    }
    public void setBrand(String brand){
        this.Brand = brand;
    }
}

