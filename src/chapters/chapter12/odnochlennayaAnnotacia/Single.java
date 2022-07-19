package chapters.chapter12.odnochlennayaAnnotacia;

import chapters.chapter12.markerExamples.MyMarker;

import java.lang.reflect.Method;

class Single {
    @MySingle(100)
    public static void myMeth() {
        Single ob = new Single();

        try {
            Method m = ob.getClass().getMethod("myMeth");
            MySingle anno = m.getAnnotation(MySingle.class);
            System.out.println(anno.value());
        } catch (NoSuchMethodException exc) {
            System.out.println("metod ne naiden");
        }

    }

    public static void main(String[] args) {
        myMeth();
    }
}
