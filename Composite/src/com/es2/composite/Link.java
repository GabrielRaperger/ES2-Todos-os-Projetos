package com.es2.composite;

public class Link extends Menu{
    private String Url;
    public Link(){

    }
    public String getURL(){
        return Url;
    }
    public void setURL(String URL){
        this.Url = URL;
    }

    @Override
    public void showOptions() {
        System.out.println(this.Label);
        System.out.println(this.Url);
    }
}
