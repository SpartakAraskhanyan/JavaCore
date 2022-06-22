package chapters.chapter7.AccessTest;

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();
        ob.a = 10;
        ob.b = 20;
        ob.setc(100);
        System.out.println("a, b, u c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
