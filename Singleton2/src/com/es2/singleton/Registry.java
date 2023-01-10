package com.es2.singleton;

public class Registry {

    private static Registry Instance;
    private String path;
    private String connectionString;
    private Registry() {
    }

    public static Registry getInstance() {
        if (Instance == null)
            Instance = new Registry();

        return Instance;
    }

    public String getPath(){
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    public String getConnectionString(){
        return connectionString;
    }

    public void setConnectionString(String connectionString){
        this.connectionString = connectionString;
    }
}