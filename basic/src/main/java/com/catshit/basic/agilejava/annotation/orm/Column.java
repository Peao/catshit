package com.catshit.basic.agilejava.annotation.orm;

import java.lang.annotation.*;

/**
 * @author Leon
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface Column {
    String name() default "";
}
