package com.decorators;

import com.pizza.Pizza;

public class AddCheese extends PizzaDecorator{
	public AddCheese(Pizza p) {
		super(p);
	}
	@Override
	public void bakePizza(){
		super.bakePizza();
		System.out.print(" Adding cheese to pizza.");
	}
}
