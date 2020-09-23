package org.citeck;

public class ThirdTask {

    /**
     * @param input - целое число
     *              В качестве аргумента принимает целое число. Преобразует число в строку.
     *              Проверяет есть ли в строке нули.
     *              Если в строке есть нули, то ищет место вхождения последнего нуля в строке и заменяет его на единицу.
     *              Если в строке нет нулей, то возвращает исходное число.
     * @return число, где самый правый ноль изменён на еденицу или исходное число
     */
    public static String execute(int input) {
        String inputString = String.valueOf(input);
        String result;
        if (inputString.contains("0")) {
            int lastPlaceOfZeroInALine = inputString.lastIndexOf("0");
            char[] inputArray = inputString.toCharArray();
            inputArray[lastPlaceOfZeroInALine] = '1';
            result = new String(inputArray);
        } else {
            result = inputString;
        }
        return result;
    }
}
