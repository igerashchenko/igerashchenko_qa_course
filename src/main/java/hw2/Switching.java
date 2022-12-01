package hw2;

import java.util.Scanner;

/*
1.Реализовать программу которая будет выводить размер в байтах в зависимости от суффикса, используя конструкцию switch-case.
Доступно 3 суффикса: K(килобайты),M(мегабайты),G(гигабайты).
Например на вход подается строка 1K. После преобразований вывод должен быть "1024 bytes".


2.Реализовать код для расчета количества возможных маршрутов для доставки N клиентам.
Использовать конструкцию do while и понятие факториала
 */
public class Switching {
    public static void main(String[] args) {
        Scanner sc = new Scanner();
        inBytes(String.valueOf(sc));
    }

    public static void inBytes(String message){
        String n;
        switch (message.endsWith(String n)){
            case n = "K":
                System.out.println("In 1 kilobyte 1000 bytes");
                break;
            case n = "M":
                System.out.println("In 1 megabyte 1 000 000 bytes");
                break;
            case n = "G":
                System.out.println("In 1 gigabyte 1 billion bytes");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + message);
        }
    }
}
