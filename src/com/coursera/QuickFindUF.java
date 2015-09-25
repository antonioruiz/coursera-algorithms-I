package com.coursera;

public class QuickFindUF extends UF {

    public QuickFindUF(int n) {
        super(n);
    }

    @Override
    void union(int p, int q) {

        for(int i =0;i < id.length; i++){
            if(id[i] == id[p]){
                id[i] = id[q];
            }
        }
    }

    @Override
    boolean connected(int p, int q) {
        return id[p]==id[q];
    }
}
