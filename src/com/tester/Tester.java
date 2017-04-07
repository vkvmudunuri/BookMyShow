package com.tester;

import com.decorators.AddCheese;
import com.decorators.AddTopping;
import com.pizza.Pizza;
import com.pizza.PlainPizza;

public class Tester {
	public static void main(String[] args) {
		Pizza p=new PlainPizza();
		p.bakePizza();
		System.out.println("\n");
		
		p=new AddCheese(p);
		p.bakePizza();
		System.out.println("\n");
		
		p=new AddTopping(p);
		p.bakePizza();
		System.out.println("\n");
	}
}
