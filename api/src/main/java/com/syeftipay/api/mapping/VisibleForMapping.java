package com.syeftipay.api.mapping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is meant to mark setters and getters that are supposed to be
 * protected or private but need to be made public because MapStruct currently
 * can only work with public setters and getters.
 * <p>
 * When the future version of MapStruct supports the non-public methods, access modifier of
 * setters and getters marked by this annotation should be changed properly.
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface VisibleForMapping {
  /**
   * The intended access modifier
   */
  String value() default "";
}
