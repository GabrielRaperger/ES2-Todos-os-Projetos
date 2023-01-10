package com.es2.memento;

import java.util.ArrayList;

public class BackupService extends java.lang.Object {
    protected ArrayList<Memento> back = new ArrayList();
    private Server a;
    public BackupService(Server server){
       this.a= server;
    }
    public void takeSnapshot(){
        back.add(a.backup());
    }
    public void restoreSnapshot(int snapshotNumber) throws NotExistingSnapshotException{
        if (snapshotNumber < 0 || snapshotNumber > back.size()-1) {
            throw new NotExistingSnapshotException();
        }else {
            a.restore(back.get(snapshotNumber));
            }
        }
    }
