package com.catshit.basic.agilejava.annotation;

import java.lang.reflect.Field;

/**
 * @author Leon
 */
public class FruitInfoUtil {
    public static void getFruitInfo(Class<?> clazz) {
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName annotation = field.getAnnotation(FruitName.class);
                System.out.println(annotation.value());
            } else if (field.isAnnotationPresent(FruitColor.class)) {
                FruitColor annotation = field.getAnnotation(FruitColor.class);
                System.out.println(annotation.value());
            } else if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider annotation = field.getAnnotation(FruitProvider.class);
                System.out.println(annotation.id());
                System.out.println(annotation.name());
                System.out.println(annotation.address());
            }
        }
    }

    public static void main(String[] args) {
        getFruitInfo(Apple.class);
    }
}
