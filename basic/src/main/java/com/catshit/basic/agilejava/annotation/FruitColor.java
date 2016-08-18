package com.catshit.basic.agilejava.annotation;

import java.lang.annotation.*;

/**
 * @author Leon
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FruitColor {
    enum Color {
        BULE, RED, GREEN
    }

    Color value() default Color.GREEN;
}
