package com.ahchim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GenericMain {
	public static void main(String[] args) {
		Integer[] intArray = {10, 20, 30, 40};
		String[] stringArray = {"가", "나", "다", "라"};
		printArray(intArray);
		printArray(stringArray);
		
		// 와일드 카드로 사용하는 제네릭
		ArrayList<Triangle> tri = new ArrayList<>(Arrays.asList((new Triangle()), (new Triangle()), (new Triangle())));
		ArrayList<Rectangle> rect = new ArrayList<>(Arrays.asList((new Rectangle()), (new Rectangle()), (new Rectangle())));
		
		ArrayList<Shape> shapeList = new ArrayList<>();
		shapeList.add(tri.get(0));
		shapeList.add(tri.get(1));
		shapeList.add(tri.get(2));
		
		drawShapes(shapeList);
		
		CR3F cr3f = new CR3F();
		
		// HeaterInterface를 구현한 구현체
		CR1F cr1f = new CR1F();
		
		// HeaterInterface를 받을 수 있는 개게
		HeaterRun hr = new HeaterRun();
		
		// HeaterInterface를 구현한 모든 객체를 받을 수 있다.
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

// 정보를 ForAnno가 가지고 간다.
@Annotation(key = "xxxxxxxx")
class ForAnno{
}

//클래스 생성시 제너릭을 적용하면 클래스 내부멤버의 타입을 동적으로 변경할 수 있다.
//임의의 이름을 지정해주면 무엇이든 받을 수 있는거다.
class Person<T> {
 public T who;
}

//class ArrayList<T>{
// public T data;
//}

