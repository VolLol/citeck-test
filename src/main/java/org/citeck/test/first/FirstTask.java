package org.citeck.test.first;

import java.util.Map;
import java.util.TreeMap;

public class FirstTask {

    public static void main(String[] args) {
        Integer[] arrayOfNumbers = new Integer[]{21, 2, 21, 2, 4, 5, 0, 0, 2, 0, 3, 5, 3, 3, 7, 1};
        Map<Integer, Integer> result = new TreeMap<>();
        for (Integer number : arrayOfNumbers) {
            if (!result.containsKey(number)) {
                result.put(number, 1);
            } else {
                Integer oldValue = result.get(number);
                result.replace(number, oldValue + 1);
            }
        }
        for (Map.Entry pair : result.entrySet()) {
            System.out.print("{" + pair.getKey() + "=" + pair.getValue() + "} ");
        }

    }
}
