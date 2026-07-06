package com.miit.enumexplorer;
public class MegaStore {

    public enum DiscountType {
        Standard,
        Seasonal,
        Weight;
    }
    
	public static double getDiscountedPrice(double cartWeight, double totalPrice, DiscountType discountType) {
		
		double pc = switch (discountType) {

		case Weight -> {
			if (cartWeight <= 10) {
				yield 6;
			} else {
				yield 18;
			}
		}
		case Standard -> 6;
		case Seasonal -> 12;
		default -> throw new UnsupportedOperationException("Waiting to be implemented.");
		};

		return totalPrice*(1-(pc / 100.0));
	}
    public static void main(String[] args) {        
    	
    	int[] arr=new int[4];
    	int[] arr1= {1,2,(int) 3.8,4};
    	
    	for(int a:arr1) {
    		
    	}
        System.out.println(getDiscountedPrice(12, 100, DiscountType.Weight));
    }
}