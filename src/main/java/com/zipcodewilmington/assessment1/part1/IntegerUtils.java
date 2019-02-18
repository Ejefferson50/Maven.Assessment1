package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int total = 0;
        for (int index = 0; index <= n; index++){
            total += Integer.valueOf(index);
        }
        return total;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int total = 1;
        for (int index = 1; index <= n; index++){
            total *= Integer.valueOf(index);

        }
        return total;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        /*int reverse = 1;
        for (int index = val; index > 0; index--){
            reverse = Character.getNumericValue(index);
        }
        return reverse;
        */
        Integer reverse = Integer.reverse(val);

        return reverse;
    }
}
