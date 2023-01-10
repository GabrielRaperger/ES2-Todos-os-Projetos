package com.es2.composite;

import java.awt.*;

public abstract class Menu extends java.lang.Object{
    protected String Label;
    public Menu(){

    }
    public String getLabel(){
        return Label;
    }
    public void setLabel(java.lang.String label){
        this.Label=label;
    }
    public abstract void showOptions();
}