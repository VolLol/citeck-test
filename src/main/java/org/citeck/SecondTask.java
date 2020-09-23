package org.citeck;

import java.util.Stack;

public class SecondTask {

    /**
     * @param input - строка со скобками
     *              Движемся посимвольно вдоль строки и проверяем:
     *              Если текущий символ является открывающим, то добавляем его в стэк
     *              Если текущий символ не является открывающим, то проверяем, что стэк не пустой,
     *              иначе выражение неверно и цикл прекращается.
     *              Если стэк заполнен и текущий символ является закрывающим и последний элемент в стэке является открывающим,
     *              то из стэка извлекается последний символ и выражение верно, иначе - выражение не верно и цикл прекращается.
     * @return закрываются/открываются все скобки
     */
    public static boolean execute(String input) {
        char[] inputArray = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        boolean itsOk = true;
        for (char c : inputArray) {
            if (c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    if (c == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else if (c == ')' && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        itsOk = false;
                        break;
                    }
                } else {
                    itsOk = false;
                    break;
                }
            }
        }
        if (!stack.isEmpty()) {
            itsOk = false;
        }
        return itsOk;
    }

}
