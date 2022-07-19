package chapters.chapter12.annotacionExamples2;

import java.lang.reflect.Method;

public class Meta {
   @MyAnno(str = "dva parametra", val = 19)
    public static void myMeth(String srt, int i) {
       Meta ob = new Meta();
       try {
           Class<?> c = ob.getClass();
           Method m = c.getMethod("myMeth", String.class, int.class);
           MyAnno anno = m.getAnnotation(MyAnno.class);
           System.out.println(anno.str() + " " + anno.val());
       }catch (NoSuchMethodException exc) {
           System.out.println("metod ne naiden.");
       }
   }

    public static void main(String[] args) {
        myMeth("Test", 10);
    }
}
