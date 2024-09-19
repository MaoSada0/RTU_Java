package ru.qq.practice_1;
import java.util.Scanner;

public class Main {
    final static double ROUBLES_PER_YUAN = 11.91; // 1 юань = 11,91 руб

    public static void main(String[] args) {

        firstTask();
        secondTask();
    }

    private static void firstTask(){
        Scanner sc = new Scanner(System.in);

        System.out.print("yuans: ");
        String temp = sc.nextLine();

        while(!checkIsDigit(temp) || !isLong(temp)){

            if(!checkIsDigit(temp)) System.out.println(temp + " is not correct");
            else System.out.println(temp + " is too big");

            System.out.print("yuans: ");
            temp = sc.nextLine();
        }

        long yuan = Long.parseLong(temp);

        double roubles = yuan * ROUBLES_PER_YUAN;

        System.out.println("roubles: " + roubles);
    }

    private static void secondTask(){
        Scanner sc = new Scanner(System.in);

        System.out.print("rubles: ");
        String temp = sc.nextLine();


        while(!checkIsDigit(temp) || !isLong(temp)){
            if(!checkIsDigit(temp)) System.out.println(temp + " is not correct");
            else System.out.println(temp + " is too big");

            System.out.print("rubles: ");
            temp = sc.nextLine();
        }

        long rubles = Long.parseLong(temp);

        double yuan = rubles / ROUBLES_PER_YUAN;

        System.out.print("yuan: ");

        if((long) yuan == yuan) System.out.print((long) yuan);
        else {
            System.out.printf("%.2f", yuan);
        }

        System.out.println(" " + getSuffix(yuan));

    }

    private static String getSuffix(double yuan){ // китайск юан

        if(yuan == (int) yuan){
            if(yuan >= 10 && yuan <= 20) return "китайских юаней";

            int d = (int) (yuan % 10);
            return helpGetSuffix(d);

        }

        return "китайских юаней";
    }

    private static String helpGetSuffix(int num){
        if(num == 1) return "китайский юань";

        if(num >= 2 && num <= 4) return "китайских юаня";

        return "китайских юаней";
    }

    private static boolean checkIsDigit(String s) {
        return s.chars().allMatch(Character::isDigit);
    }

    public static boolean isLong(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}