package com.ma.pizza;

public class Order {
    private int smallQuantity;
    private int mediumQuantity;
    private int largeQuantity;
	private int coldDrinkQuantity;

    public Order() {
        this.smallQuantity = 0;
        this.mediumQuantity = 0;
        this.largeQuantity = 0;
		this.coldDrinkQuantity = 0;
    }

    void order(PizzaOrder po) {
        if (po instanceof SmallPizza) {
            po.small();
            
        } else if (po instanceof MediumPizza) {
            po.medium();
           
        } else if (po instanceof LargePizza) {
            po.large();
           
        }
        else if(po instanceof ColdDrink) {
        	po.coldDrink();
        }
    }

    public void setTotalSmallQuantity(int smallQuantity) {
        this.smallQuantity = smallQuantity;
    }

    public void setTotalMediumQuantity(int mediumQuantity) {
        this.mediumQuantity = mediumQuantity;
    }

    public void setTotalLargeQuantity(int largeQuantity) {
        this.largeQuantity = largeQuantity;
    }

	 public void setTotalColdDrinkQuantity(int coldDrinkQuantity) {
        this.coldDrinkQuantity = coldDrinkQuantity;
    }

    public int getTotalColdDrinkQuantity() {
        return coldDrinkQuantity;
    }

    public int getTotalSmallQuantity() {
        return smallQuantity;
    }

    public int getTotalMediumQuantity() {
        return mediumQuantity;
    }

    public int getTotalLargeQuantity() {
        return largeQuantity;
    }

    public int calculateTotalAmount() {
        int smallAmount = calculateAmount(smallQuantity, SmallPizza.PRICE);
        int mediumAmount = calculateAmount(mediumQuantity, MediumPizza.PRICE);
        int largeAmount = calculateAmount(largeQuantity, LargePizza.PRICE);
		int coldDrinkAmount = calculateAmount(coldDrinkQuantity, ColdDrink.PRICE);

        return smallAmount + mediumAmount + largeAmount+ coldDrinkAmount;
    }

    private int calculateAmount(int quantity, int price) {
        return quantity * price;
    }
}

