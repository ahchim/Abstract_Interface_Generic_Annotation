package com.ahchim;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

// 적용할 대상 - CONSTRUCTOR, ENUM, LOCAL VARIABLE, METHOD, ..
@Target(TYPE)
// 어노테이션 정보의 유지단계 - SOURCE, CLASS, RUNTIME
@Retention(RUNTIME)
public @interface Annotation {
	public String val() default "값";
	public String key();
}

// 오버라이드도 public @interface Override 로 만들어져 있다.
