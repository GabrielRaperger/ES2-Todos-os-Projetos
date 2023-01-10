package com.es2.decorator;

import java.io.IOException;

public class Decorator extends java.lang.Object implements AuthInterface{

    public Decorator(AuthInterface auth) {

    }

    @Override
    public void auth(String username, String password) throws AuthException, IOException {
          try {
              Auth a = new Auth();
              a.auth(username, password);

          }catch (IOException c){
              throw new IOException();
          }
    }
}
