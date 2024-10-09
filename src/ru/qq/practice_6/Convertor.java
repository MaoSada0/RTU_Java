package ru.qq.practice_6;

public class Convertor {
    private final static String[] hundreds = {"", "Сто", "Двести", "Триста", "Четыреста", "Пятьсот", "Шестьсот", "Семьсот", "Восемьсот", "Девятьсот"};
    private final static String[] tens = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
    private final static String[] teens = {"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
    private final static String[] units = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};

    public static String convertNumberToText(int number) throws InvalidNumberException {
        if (number < 100 || number > 999)
            throw new InvalidNumberException("You must provide positive three-digit number");

        int h = number / 100;
        int t = (number % 100) / 10;
        int u = number % 10;

        StringBuilder result = new StringBuilder();

        result.append(hundreds[h]).append(" ");

        if (t == 1)
            result.append(teens[u]);
        else
            result.append(tens[t]).append(" ").append(units[u]);

        return result.toString().replaceAll("\\s+", " ");
    }
}
