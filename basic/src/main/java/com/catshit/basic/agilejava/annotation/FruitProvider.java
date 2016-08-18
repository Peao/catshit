package com.catshit.basic.agilejava.annotation;

import java.lang.annotation.*;

/**
 * @author Leon
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FruitProvider {
    int id() default -1;

    String name() default "";

    String address() default "";
}
