package ru.qq.practice_9;
public class Convertor {

    private String value;
    private TypeOfData type;

    public Convertor(int value) {
        this.value = Integer.toString(value);
        this.type = TypeOfData.INTEGER;
    }

    public Convertor(String value) {
        this.value = value;
        this.type = TypeOfData.STRING;
    }

    public Convertor(boolean value) {
        this.value = Boolean.toString(value);
        this.type = TypeOfData.BOOLEAN;
    }

    public Convertor(char value) {
        this.value = Character.toString(value);
        this.type = TypeOfData.CHARACTER;
    }

    public void deleteData(){
        this.value = null;
        this.type = null;
    }

    public void setValue(int value) {
        this.value = Integer.toString(value);
        this.type = TypeOfData.INTEGER;
    }


    public void setValue(String value) {
        this.value = value;
        this.type = TypeOfData.STRING;
    }

    public void setValue(boolean value) {
        this.value = Boolean.toString(value);
        this.type = TypeOfData.BOOLEAN;
    }

    public void setValue(char value) {
        this.value = Character.toString(value);
        this.type = TypeOfData.CHARACTER;
    }

    public Convertor getClone(){
        return new Convertor(value);
    }

    public void print(){
        System.out.println(value);
    }

    private void checkType(TypeOfData expectedType) {
        if (!type.equals(expectedType)) {
            throw new UnsupportedOperationException("Type of this convertor is not " + expectedType);
        }
    }

    public void concatenate(String str) {
        checkType(TypeOfData.STRING);

        value = value + str;
    }

    public void add(int num) {
        checkType(TypeOfData.INTEGER);

        value = String.valueOf(
                Integer.parseInt(value) + num
        );
    }

    public void subtract(int num) {
        checkType(TypeOfData.INTEGER);

        value = String.valueOf(
                Integer.parseInt(value) - num
        );
    }

    public void divide(int num) {
        checkType(TypeOfData.INTEGER);

        if(num == 0)
            throw new ArithmeticException("Division by zero");

        value = String.valueOf(
                Integer.parseInt(value) / num
        );
    }

    public void multiply(int num) {
        checkType(TypeOfData.INTEGER);

        value = String.valueOf(
                Integer.parseInt(value) * num
        );
    }


    public void binaryAnd(boolean b) {
        checkType(TypeOfData.BOOLEAN);

        value = String.valueOf(
                Boolean.parseBoolean(value) && b
        );
    }

    public void setChar(char ch){
        checkType(TypeOfData.CHARACTER);

        value = String.valueOf(ch);
    }
}
