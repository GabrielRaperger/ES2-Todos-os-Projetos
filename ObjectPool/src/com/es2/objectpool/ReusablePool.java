package com.es2.objectpool;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class ReusablePool extends java.lang.Object{
    private static ReusablePool Instance;
    private int Size;
    ArrayList<HttpURLConnection> Listlivre;
    ArrayList<HttpURLConnection> Listutili;
    private ReusablePool(){
        Size=10;
        Listlivre=new ArrayList<>();
        Listutili=new ArrayList<>();
    }
    public static ReusablePool getInstance(){
        if (Instance == null)
            Instance = new ReusablePool();

        return Instance;
    }

        public synchronized java.net.HttpURLConnection acquire() throws IOException, PoolExhaustedException{
            if(Listutili.size() < Size){
                    Listlivre.add((HttpURLConnection) new URL("http://ipv.pt/%22").openConnection());
                    HttpURLConnection aux;
                    aux= Listlivre.get(0);
                    Listutili.add(Listlivre.get(0));
                    Listlivre.remove(0);
                        return aux;
            }else{
                throw new PoolExhaustedException();
            }
        }

    public synchronized void release(java.net.HttpURLConnection conn) throws ObjectNotFoundException{
        int  aux = Listutili.size();
        for(int i = 0; i<Listutili.size(); i++) {
            if (conn == Listutili.get(i)) {
                Listlivre.add(Listutili.get(i));
                Listutili.remove(i);

            }
        }
        if (aux == Listutili.size()) {
            throw new ObjectNotFoundException();
        }
    }
    public synchronized void resetPool(){
            Listlivre.clear();
            Listutili.clear();
    }

    public void setMaxPoolSize(int size){
        this.Size = size;
    }
}
