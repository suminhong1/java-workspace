package com.kh.example.practice2;

import com.kh.example.practice2.model.Circle;

public class Run {

	public static void main(String[] args) {
		Circle c = new Circle();
		
		
		System.out.println("원의 둘레 : " + c.radius * 2 * Circle.PI);
		System.out.println("원의 넓이 : " + c.radius * c.radius * Circle.PI);
		System.out.println(c.radius);
		
		c.incrementRadius();
		c.incrementRadius();
		System.out.println("원의 둘레 : " + c.radius * 2 * Circle.PI);
		System.out.println("원의 넓이 : " + c.radius * c.radius * Circle.PI);
		System.out.println(c.radius);
		System.out.println(c.PI);
	}

}
