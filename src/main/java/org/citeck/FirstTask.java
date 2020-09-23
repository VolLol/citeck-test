package org.citeck;

import java.util.*;

public class FirstTask {

    /**
     * @param arrayOfNumbers - массив цифр
     *                       Происходит итерация по все длинне полученного массива цифр.
     *                       Проводится проверка на наличие цифры в TreeMap.
     *                       Если цифра отсутствует в виде ключа, то добавляется новая запись.
     *                       Если цифра присутсвует в виде ключа, то значение увеличивается на единицу.
     *                       Далее все значения переносятся в List.
     * @return список с строками состоящими из числа и количество вхождений числа в массив
     */
    public static List<String> execute(Integer[] arrayOfNumbers) {
        Map<Integer, Integer> result = new TreeMap<>();
        for (Integer number : arrayOfNumbers) {
            if (!result.containsKey(number)) {
                result.put(number, 1);
            } else {
                Integer oldValue = result.get(number);
                result.replace(number, oldValue + 1);
            }
        }
        List<String> resultList = new ArrayList<>();
        for (Map.Entry pair : result.entrySet()) {
            resultList.add(pair.getKey() + "=" + pair.getValue());
        }
        return resultList;
    }

}
