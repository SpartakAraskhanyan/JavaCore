package chapters.chapter12.annotationExamples4;

import java.lang.reflect.Method;

class Meta3 {
    @MyAnno()
    public static void myMeth(){
        Meta3 ob = new Meta3();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        }catch (NoSuchMethodException exc){
            System.out.println("metod ne naiden.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
