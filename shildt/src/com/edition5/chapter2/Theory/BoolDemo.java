package com.edition5.chapter2.Theory;


class BoolDemo {
    public static void main(String args[]) {
        boolean b;
        b = false;

        System.out.println("b is " + b);

        b = true;
        System.out.println("b is " + b);
        // Логическое значение можно использовать для

        // управления условным оператором if.
        if (b) System.out.println("This is executed.");

        b = false;
        if (b) System.out.println("This is not executed.");
        // Логическое значение получается в результате
        // выполнения оператора отношения.
        System.out.println("10 > 9 is " + (10 > 9));
    }
}