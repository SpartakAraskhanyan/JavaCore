package chapters.chapter10;

import java.util.Random;

public class Exc0 {
    public static void main(String[] args) {
        int d = 0;
        int a = 42 / d;
    }
}

class Exc1 {
    static void subroutine() {
        int d = 0;
        int a = 10 / d;
    }

    public static void main(String[] args) {
        Exc1.subroutine();
    }
}


class Exc2 {
    public static void main(String[] args) {
        int d, a;
        try {
            d = 0;
            a = 42 / d;
        } catch (ArithmeticException e) {
            System.out.println("delenie na nol.");
        }
        System.out.println("posle operatora catch");
    }
}


class HandleError {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random r = new Random();

        for (int i = 0; i < 32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("delenie na nol: " + e);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("oshibka indeksaci za predelami " + "massiva" + e);
            }
            System.out.println("posle bloka operatorov try / catch");
        }
    }
}

class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("perexvat isklucheni obshego classa Exception");

//            }catch (ArithmeticException e){
//                System.out.println("etot kod voobshe nedostizhim");
        }
    }
}


class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a = " + a);
            try {
                if (a == 1) a = a / (a - a);
                if (a == 2) {
                    int c[] = {1};
                    c[42] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("index za predelami massiva: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("delenie na nol: " + e);
        }
    }
}

class MethNestTry {
    static void nesttry(int a) {
        try {
            if (a == 1) a = a / (a - a);
            if (a == 2) {
                int c[] = {1};
                c[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index za predelami massiva: " + e);
        }
    }

    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a = " + a);
            nesttry(a);
        } catch (ArithmeticException e) {
            System.out.println("delenie na nol: " + e);
        }
    }
}


class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("demonstracia");
        } catch (NumberFormatException e) {
            System.out.println("iskluchenie perexvacheno v tele " + "metoda demoproc() .");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("povtorni perexvat: " + e);
        }
    }
}


//class ThrowsDemo {
//    static void throwOne() {
//        System.out.println("v tele metoda throwOne(). ");
//        throw new IllegalAccessException("demonstracia");
//    }
//
//    public static void main(String[] args) {
//        throwOne();
//    }
//}


class ThrowsDemo {
    static void throwOne() throws IllegalAccessError {
        System.out.println("v tele metoda throwOne");
        throw new IllegalAccessError("demonsracia");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessError e) {
            System.out.println("perexvacheno iskluchenie: " + e);
        }
    }
}


class FinallyDemo {
    static void procA() {
        try {
            System.out.println("v tele metoda procA()");
            throw new RuntimeException("demonstracia");
        } finally {
            System.out.println("blok operatora finally v metode procA()");

        }
    }

    static void procB() {
        try {
            System.out.println("v tele metoda procB()");
            return;
        } finally {
            System.out.println("blok operatora finally v metode procB()");

        }
    }

    static void procC() {
        try {
            System.out.println("v tele metoda procC()");
        } finally {
            System.out.println("blok operatora finally v metode procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("iskluchenie perexvacheno");
        }
        procB();
        procC();
    }
}


class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "MyException[" + detail + "]";
    }
}

class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("vizvan metod compute(" + a + ")");
        if (a > 10)
            throw new MyException(a);
        System.out.println("normalnoe zavershenie");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("perexvacheno iskluchenie: " + e);
        }
    }
}


class ChainDemo {
    static void demoproc() {
        NullPointerException e = new NullPointerException("verxni yroven");
        e.initCause(new ArithmeticException("prichina"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("perexvacheno iskluchenie: " + e);
            System.out.println("pervoprichina: " + e.getCause());
        }
    }
}

class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int vals[] = {1, 2, 3};
        try {
            int result = a / b;
            vals[10] = 19;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("iskluchenie perexvacheno: " + e);
        }
        System.out.println("posle mnogokratnogo perexvata.");
    }
}

