package com.decorators;

import com.pizza.Pizza;

public class PizzaDecorator implements Pizza{
	protected Pizza pizza;
	public PizzaDecorator(Pizza p) {
		this.pizza=p;
	}
	@Override
	public void bakePizza(){
		this.pizza.bakePizza();
	}
}
