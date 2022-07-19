package chapters.chapter12.annotationExamples4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
 @interface MyAnno {
    String str() default "testirovanie";
    int val() default 9000;
}
