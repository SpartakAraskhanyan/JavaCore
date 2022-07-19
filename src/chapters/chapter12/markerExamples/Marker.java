package chapters.chapter12.markerExamples;

import java.lang.reflect.Method;

class Marker {
    @MyMarker
    public static void myMeth(){
        Marker ob = new Marker();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            if (m.isAnnotationPresent(MyMarker.class))
                System.out.println("markernaia annotacia MyMarker prisutstvyet. ");
        }catch (NoSuchMethodException exc) {
            System.out.println("metod ne naiden. ");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
