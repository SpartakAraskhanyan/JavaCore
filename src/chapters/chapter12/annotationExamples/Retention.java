package chapters.chapter12.annotationExamples;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String str();
    int val();
}
