package com.catshit.basic.agilejava.annotation.orm;

import java.lang.annotation.*;

/**
 * @author Leon
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Entity {
    /**
     * 表名称
     */
    String value() default "";
}
