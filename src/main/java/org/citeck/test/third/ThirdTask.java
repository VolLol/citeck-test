package org.citeck.test.third;

public class ThirdTask {

    public static void main(String[] args) {
        int input = 101111;
        String inputString = String.valueOf(input);
        String result;
        if (inputString.contains("0")) {
            int lastPlaceOfZeroInALine = inputString.lastIndexOf("0");
            result = inputString.substring(0, lastPlaceOfZeroInALine);
            result = result.concat("1");
            if (inputString.length() > result.length()) {
                result = result.concat(inputString.substring(lastPlaceOfZeroInALine + 1));
            }
        } else {
            result = inputString;
        }
        System.out.println(result);
    }
}
