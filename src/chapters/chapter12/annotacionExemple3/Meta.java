package chapters.chapter12.annotacionExemple3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description = "annotacia testovogo klassa")
@MyAnno(str = "Meta2", val = 99)
 class Meta2 {
    @What(description = "annotacia testovogo metoda")
    @MyAnno(str = "testing" , val = 100)
    public static void myMeth() {
        Meta2 ob = new Meta2();

        try {
            Annotation annos[] = ob.getClass().getAnnotations();
            System.out.println("vse annotacii dlya klassa Meta2:");
         for (Annotation a : annos)
             System.out.println(a);
            System.out.println();

            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("vse annotacii dlya metoda myMeth(): ");
            for (Annotation a : annos)
                System.out.println(a);
        }catch (NoSuchMethodException exc) {
            System.out.println("metod ne naiden.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
