package com.harman.project2;

public class override {
    void show(){
        System.out.println("hi bro,i am superclass");

    }
}
class child extends override{
    void show()
    {
        super.show();
        System.out.println("hi dude,i am subclass");
    }
}
class main{
    public static void main(String[] args) {
        child obj=new child();
        obj.show();
    }
}
