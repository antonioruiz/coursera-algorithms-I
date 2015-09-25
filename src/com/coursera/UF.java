package com.coursera;

public abstract class UF {

    int[] id;

    public UF(int n) {
        id = new int[n];
        for(int i =0; i<n; n++){
            id[i]=i;
        }
    }

    abstract void union(int p, int q);
    abstract boolean connected(int p, int q);

}
