package ru.qq.practice_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Вариант 1

        int n = 10;

        Container[] arr = getArr(n);

        Arrays.stream(arr).forEach(Container::print);
    }


    private static Container[] getArr(int size){
        Container[] ans = new Container[size];

        for(int i = 0; i < size; i++){
            if(i % 2 == 0) ans[i] = new Container(i + 1);
            else ans[i] = new Container(NumToWordConvertor.numberToWords(i + 1));
        }

        return ans;

    }


}
