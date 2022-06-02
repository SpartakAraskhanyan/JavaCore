package classwork.calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator mycalculator1 = new Calculator();
        System.out.print(mycalculator1.plus(4,6));
        System.out.println();
        Calculator mycalculator2 = new Calculator();
        System.out.print(mycalculator2.minus(10,5));
        System.out.println();
        Calculator mycalculator3 = new Calculator();
        System.out.print(mycalculator3.multiply(66,6));
        System.out.println();
        Calculator mycalculator4 = new Calculator();
        System.out.print(mycalculator4.divide(3,5));
    }
}
