package ru.qq.practice_9;

import java.util.Map;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Convertor {
    private Map<Class<?>, Boolean> flags;
    private Object value;

    public Convertor() {
        flags = initializeFlags();
    }

    private static Map<Class<?>, Boolean> initializeFlags() {
        return Stream.of(String.class, Integer.class, Boolean.class, Character.class)
                .collect(Collectors.toMap(key -> key, key -> false));
    }


    private boolean correctFlagType(Class<?> type){
        return flags.containsKey(type);
    }

    private void changeFlag(Class<?> type){
        if(!correctFlagType(type))
            return;

        flags.keySet().forEach(key -> flags.put(key, false));

        flags.put(type, true);
    }

    private boolean validateInput(Class<?> type){
        if(value == null){
            System.out.println("Set val");
            return false;
        }

        if(flags.get(type))
            return true;

        System.out.println("Current type not " + type);

        return false;
    }

    public void createVal(Class<?> type, Object value){
        if(!correctFlagType(type))
            throw new IllegalArgumentException("Provide smth from: {String, Integer, Boolean, Character}");

        changeFlag(type);

        this.value = value;
    }

    public void deleteVal(){
        flags = initializeFlags();
        value = null;
    }

    public void setValue(Object value) {
        boolean isValid = flags.entrySet().stream()
                .anyMatch(entry -> entry.getValue() && entry.getKey().isInstance(value));

        if (!isValid) {
            System.out.println("value isnt valid");
            return;
        }

        this.value = value;
    }

    private void setFlags(Map<Class<?>, Boolean> flags) {
        this.flags = flags;
    }

    public Convertor cloneVal(){
        Convertor conv = new Convertor();

        conv.setValue(value);
        conv.setFlags(flags);

        return conv;
    }

    public void concatenate(String str){
        if(!validateInput(String.class))
            return;

        value = value + str;
    }

    public void add(int num){
        if(!validateInput(Integer.class))
            return;

        value = (Integer) value + num;
    }

    public void subtraction(int num){
        if(!validateInput(Integer.class))
            return;

        value = (Integer) value - num;
    }

    public void division(int num){
        if(num == 0)
            return;

        if(!validateInput(Integer.class))
            return;

        value = (Integer) value / num;
    }

    public void multiplication(int num){
        if(!validateInput(Integer.class))
            return;

        value = (Integer) value * num;
    }

    public void binaryAnd(boolean val){
        if(!validateInput(Boolean.class))
            return;

        value = (Boolean) value && val;
    }

    public void changeCharValue(Character ch){
        if(!validateInput(Character.class))
            return;

        value = ch;
    }

    public void printValue(){
        System.out.println(value);
    }
}
