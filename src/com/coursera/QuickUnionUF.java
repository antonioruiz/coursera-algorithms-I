package com.coursera;

public class QuickUnionUF extends UF {

    public QuickUnionUF(int n) {
        super(n);
    }

    @Override
    void union(int p, int q) {
        id[p]= id[q];
    }

    @Override
    boolean connected(int p, int q) {
        return root(p)==root(q);
    }

    /* recursive
    private int root(int p){
        if(id[p]==p){
            return  p;
        }else{
            return root(id[p]);
        }

    }*/

    //iterative
    private int root(int p) {
        while(id[p]!=p){
            p=id[p];
        }
        return p;
    }
}
