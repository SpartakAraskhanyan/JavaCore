package chapters.chapter12.enumExample5;

import classwork.calculator.Calculator;

public class AutoBox5 {
    public static void main(String[] args) {
        boolean b = true;
        if (b){
            System.out.println("b ravno true");
            Character ch = 'x';
            char ch2 = ch;
            System.out.println("ch2 ravno " + ch2);

        }
    }
}
