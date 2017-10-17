package com.thoughtworks.calculator;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.function.Function;

/**
 * Created by dhwang on 17/10/2017.
 */
public class Calculator {
    public int add(String s) throws NegativeNumberNotValidException {

        if ("".equals(s)) {
            return 0;
        }
        String[] dataArr = s.split(",|n");
        validateIfHaveNegativeNumbers(dataArr);
        if (dataArr.length > 1) {

            int sum = Arrays.stream(dataArr).mapToInt(value -> Integer.parseInt(value)).sum();
            return sum;
        }
        return Integer.parseInt(s);
    }

    private void validateIfHaveNegativeNumbers(String[] dataArr) throws NegativeNumberNotValidException {
        for (String data : dataArr) {
            int number = Integer.parseInt(data);
            if(number < 0){
                throw new NegativeNumberNotValidException("Negative number can not be added!");
            }
        }
    }
}
