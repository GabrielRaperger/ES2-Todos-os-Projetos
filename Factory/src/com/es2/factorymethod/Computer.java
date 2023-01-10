package com.es2.factorymethod;

public class Computer extends Object implements Product{

    private String Brand;

    protected Computer() {
        }

    public String getBrand(){
        return Brand;
    }
    public void setBrand(String brand){
        this.Brand = brand;
    }
}
