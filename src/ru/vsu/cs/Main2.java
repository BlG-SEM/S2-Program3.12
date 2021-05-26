package ru.vsu.cs;

import java.util.Stack;

public class Main2 {

    /*
    Задача 3. Стеки/очереди
    Требуется решить задачу в 2-х вариантах:
    1. С использованием стека / очереди, самостоятельно реализованных на основе связного списка.
    2. С использованием реализации стека / очереди, которая уже есть в стандартной библиотеки языка Java.

    12. В стеке записаны строки. Переставить элементы стека в обратном порядке.
   Допускается использование в качестве вспомогательных структур данных только стеков.
     */
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("1");
        stack.add("2");
        stack.add("3");
        stack.add("4");
        stack.add("5");

        System.out.println("Stack before rearrange:");
        System.out.println(stack);

        rearrange(stack);

        System.out.println("Stack after rearrange:");
        System.out.println(stack);
    }

    public static void rearrange(Stack<String> stack) {
        Stack<String> temp1 = new Stack<>();
        Stack<String> temp2 = new Stack<>();

        while (!stack.isEmpty()) {
            temp1.push(stack.pop());
        }

        while (!temp1.isEmpty()) {
            temp2.push(temp1.pop());
        }

        while (!temp2.isEmpty()) {
            stack.push(temp2.pop());
        }
    }
}
