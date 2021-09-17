package com.epam.rd.autotasks;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Factorial {
    public String factorial(String n) {
        if (n == null) {
            throw new IllegalArgumentException();
        }
        //проверяю дробное ли число
        if (n.matches("^[0-9]+\\.[0-9]+$")){
            throw new IllegalArgumentException();
        }
        //отдельный случай для пустой строки
        if (n.equals("")){
            throw new IllegalArgumentException();
        }
        //проверяю любой символ кроме чисел
        if (n.matches("[^0-9]")){
            throw new IllegalArgumentException();
        }

        if (Integer.parseInt(n) < 0) {
            throw new IllegalArgumentException();
        }
        BigDecimal number = new BigDecimal(n);
        BigDecimal result = new BigDecimal(String.valueOf(1));

        for (int i = 1; i <= number.longValue(); i++) {
            result = result.multiply(new BigDecimal(String.valueOf(i)));
        }
        return String.valueOf(result);
    }
}

