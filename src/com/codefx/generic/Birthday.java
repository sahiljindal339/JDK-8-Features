package com.codefx.generic;

/**
 * @author sahil.kumar01
 *
 */
public class Birthday {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Note : Need of Generic explain in below code
		/*
		 * GiftBox gift = new GiftBox();
		 * 
		 * // Note : Object creation of Tablet using Static Factory Method // this logic
		 * will work when we are passing Object of Tablet
		 * gift.wrap(Tablet.getTablet(1000, "SAMSUNG"));
		 * 
		 * // There is error because at line 20 we are casting that object
		 * gift.wrap("Gift");
		 * 
		 * if(gift.unwrap() `instanceof` Object) { Tablet
		 * giftTablet=(Tablet)gift.unwrap(); System.out.println(giftTablet.toString());
		 * } else System.out.println("where is my Tablet :)  ");
		 * 
		 */

		// Code Implementation using `GENERIC`
		// Note Basics : `GiftBox<Tablet> make sure in Giftbox we have to pass Object of
		// Tablet
		GiftBox<Tablet> gift = new GiftBox<>();
		gift.wrap(Tablet.getTablet(10000, "APPLE"));

		// Note : In `STATIC` method we can't add T because Generic concept apply on
		// Instance LEVEL
		// not on Class LEVEL
		Tablet giftTablet = gift.unwrap();
		System.out.println(giftTablet.toString());
	}

}
