package com.es2.composite;

import java.util.ArrayList;

public class SubMenu extends Menu{
    ArrayList<Menu> ListSubMenu = new ArrayList<>();
    public SubMenu(){

    }
    public void addChild(Menu child){
        ListSubMenu.add(child);
    }
    public void removeChild(Menu child){
        ListSubMenu.remove(child);
    }
    @Override
    public void showOptions(){
        System.out.println(this.Label);
       for (Menu menu : ListSubMenu) {
           menu.showOptions();
        }
    }
}
