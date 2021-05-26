package ru.vsu.cs;

public class Main {

    /*
    Задача 3. Стеки/очереди
    Требуется решить задачу в 2-х вариантах:
    1. С использованием стека / очереди, самостоятельно реализованных на основе связного списка.
    2. С использованием реализации стека / очереди, которая уже есть в стандартной библиотеки языка Java.

   12. В стеке записаны строки. Переставить элементы стека в обратном порядке. 
   Допускается использование в качестве вспомогательных структур данных только стеков.
     */
    public static void main(String[] args) {
        MyStack<String> stack = new MyStack<>();
        stack.push("5");
        stack.push("4");
        stack.push("3");
        stack.push("2");
        stack.push("1");

        System.out.println("Stack before rearrange:");
        print(stack);
        rearrange(stack);

        System.out.println();
        System.out.println("Stack after rearrange:");
        print(stack);
    }

    public static void rearrange(MyStack<String> stack) {
        MyStack<String> temp1 = new MyStack<>();
        MyStack<String> temp2 = new MyStack<>();

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
    public static void print(MyStack stack) {
        int i = 0;
        MyNode ptr = stack.getHead();

        while (i < stack.getSize()) {
            System.out.print(ptr + "; ");
            ptr = ptr.getNext();
            i++;
        }
    }
}
