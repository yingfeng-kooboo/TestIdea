package com.neuedu;

import com.neuedu.test.TestPrivate;

public class FirstDemo {
    public static void main(String[] args){
        System.out.println("Hello World!");
        Test test=new Test();
        test.Print();

        TestPrivate testP=new TestPrivate();
        testP.Test();


    }
}
