package ru.qq.practice_5;

public class Container {
    private String str;
    private int num;

    public Container(String str) {
        this.str = str;
    }

    public Container(int num) {
        this.num = num;
    }


    public void print(){
        if(str == null){
            System.out.println(num);
            return;
        }

        System.out.println(str);
    }
}
