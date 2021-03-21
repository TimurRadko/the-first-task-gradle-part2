package com.epam.esm;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        for (String singleStr : str) {
            if (!StringUtils.isPositiveNumber(singleStr)) {
                return false;
            }
        }
        return true;
    }
}
