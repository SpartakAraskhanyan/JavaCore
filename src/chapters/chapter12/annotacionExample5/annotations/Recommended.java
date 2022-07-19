package chapters.chapter12.annotacionExample5.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface Recommended {
}
