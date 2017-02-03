package com.ahchim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GenericMain {
	public static void main(String[] args) {
		Integer[] intArray = {10, 20, 30, 40};
		String[] stringArray = {"��", "��", "��", "��"};
		printArray(intArray);
		printArray(stringArray);
		
		// ���ϵ� ī��� ����ϴ� ���׸�
		ArrayList<Triangle> tri = new ArrayList<>(Arrays.asList((new Triangle()), (new Triangle()), (new Triangle())));
		ArrayList<Rectangle> rect = new ArrayList<>(Arrays.asList((new Rectangle()), (new Rectangle()), (new Rectangle())));
		
		ArrayList<Shape> shapeList = new ArrayList<>();
		shapeList.add(tri.get(0));
		shapeList.add(tri.get(1));
		shapeList.add(tri.get(2));
		
		drawShapes(shapeList);
		
		CR3F cr3f = new CR3F();
		
		// HeaterInterface�� ������ ����ü
		CR1F cr1f = new CR1F();
		
		// HeaterInterface�� ���� �� �ִ� ����
		HeaterRun hr = new HeaterRun();
		
		// HeaterInterface�� ������ ��� ��ü�� ���� �� �ִ�.
		hr.run(cr1f);
		
		ForAnno anno = new ForAnno();
		String anno_val = anno.getClass().getAnnotation(Annotation.class).val();
		String anno_key = anno.getClass().getAnnotation(Annotation.class).key();
		
		System.out.println("anno_key="+anno_key+", anno_val="+anno_val);
	}
	
	public static void drawShapes(List<? extends Shape> lists){
		for(Shape s : lists){
			s.drawShape();
		}
	}
	
	public static <E> void printArray(E[] elements){
		for(E element : elements){
			System.out.print(element + "/");
		}
		System.out.println();
	}
	
}

// ������ ForAnno�� ������ ����.
@Annotation(key = "xxxxxxxx")
class ForAnno{
}

//Ŭ���� ������ ���ʸ��� �����ϸ� Ŭ���� ���θ���� Ÿ���� �������� ������ �� �ִ�.
//������ �̸��� �������ָ� �����̵� ���� �� �ִ°Ŵ�.
class Person<T> {
 public T who;
}

//class ArrayList<T>{
// public T data;
//}

