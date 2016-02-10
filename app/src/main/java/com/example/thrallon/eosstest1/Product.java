package com.example.thrallon.eosstest1;

/**
 * Created by Thrallon on 31/1/2016.
 */
public class Product {
    private int id;
    private String name;


    public Product(){
        super();
    }

    public Product(int id, String name) {
        super();
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return this.id + ". " + this.name ;
    }
}
