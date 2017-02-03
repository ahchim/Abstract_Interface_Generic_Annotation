package com.ahchim;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

// ������ ��� - CONSTRUCTOR, ENUM, LOCAL VARIABLE, METHOD, ..
@Target(TYPE)
// ������̼� ������ �����ܰ� - SOURCE, CLASS, RUNTIME
@Retention(RUNTIME)
public @interface Annotation {
	public String val() default "��";
	public String key();
}

// �������̵嵵 public @interface Override �� ������� �ִ�.
