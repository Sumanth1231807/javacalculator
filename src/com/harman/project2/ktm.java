package com.harman.project2;

abstract class ktm {
    abstract void checkktm_price();

}
class duke extends ktm{
    void checkktm_price()
    {
        System.out.println("INR.200000");

    }

    public static void main(String[] args) {
        ktm myktm=new duke();
        myktm.checkktm_price();

    }
}