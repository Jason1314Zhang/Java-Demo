package com.example;

public class hello {
    public static void main(String[] args){
        System.out.println("hello");
        Generay<Integer> gen=new Generay<Integer>(10);
        int a=gen.getKey();
        System.out.println("value a ="+a);
        gen.printkey();
        String str=new String("this is string ");
        System.out.println(str);

    }
}

class Generay<T>{
    private T key;
    public Generay(T key){
        this.key=key;
    }

    public T getKey() {
        return key;
    }
    public void printkey(){
        System.out.println(key);
    }
}
