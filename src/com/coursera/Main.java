package com.coursera;

public class Main {

    public static void main(String[] args) {
	    UF unionFind = new QuickFindUF(10);
        unionFind.union(5,6);
        unionFind.union(6,7);
        System.out.println("7 and 5 connected " + unionFind.connected(7, 5));
        unionFind.union(0, 9);
        unionFind.union(0, 1);
        System.out.println("0,1 connected " + unionFind.connected(0,1));
        System.out.println("0,7 connected " + unionFind.connected(0,7));
        unionFind.union(1,5);
        System.out.println("0,7 connected " + unionFind.connected(0,7));
        System.out.println("0,2 connected " + unionFind.connected(0,2));
        System.out.println("0,0 connected " + unionFind.connected(0,0));

    }
}
