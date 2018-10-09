package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MyList<Integer> myList = new MyList<Integer>();
        myList.Add(19);
        myList.Add(22);
        myList.Add(36);
        myList.Add(43);
        myList.Add(56);

        System.out.println(myList.get(-1));

    }
}
