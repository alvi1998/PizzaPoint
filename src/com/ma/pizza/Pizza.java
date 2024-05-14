package com.ma.pizza;

abstract class Pizza implements PizzaOrder
{
	
	public static final int PRICE=0;
    @Override
    public void small() {
        
        System.out.println("small Pizza Rs."+PRICE); // Replace with the actual price
    }

	@Override

	public void medium()
	{
		System.out.println("medium Pizza Rs."+PRICE);
	}

	@Override

	public void large()
	{
		System.out.println("large Pizza Rs."+PRICE);
	}

	 @Override
    public void coldDrink() {
        System.out.println("Cold Drink Rs."+PRICE); // Replace with the actual price
    }

	
}

