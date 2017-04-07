package com.decorators;

import com.pizza.Pizza;

public class AddTopping extends PizzaDecorator{
	public AddTopping(Pizza p) {
		super(p);
	}
	@Override
	public void bakePizza(){
		super.bakePizza();
		System.out.println("Adding topping to pizza");
	}
}
