package me.weinzierl.objects.elements;

import java.util.ArrayList;

public class ElementHandler {

	    public static ArrayList<Element> metals = new ArrayList<Element>();
	    public static ArrayList<Element> nonmetals = new ArrayList<Element>();
	    public static ArrayList<Element> all = new ArrayList<Element>();

	    public static void addElements(){
	    	new Hydrogen();
	        new Lithium();
	        new Beryllium();
	        new Sodium();
	        new Magnesium();
	        new Potassium();
	        new Calcium();
	        new Rubidium();
	        new Strontium();
	        new Cesium();
	        new Barium();
	        new Aluminum();
	        new Boron();
	        new Nitrogen();
	        new Oxygen();
	        new Florine();
	        new Phosphorus();
	        new Sulfur();
	        new Chlorine();
	        new Selenium();
	        new Bromine();
	        new Iodine();

	    }
	    public static Element find (String s) {
	    	for(Element e : all) {
	    		if(e.getId().equalsIgnoreCase(s)||e.getName().equalsIgnoreCase(s)) {
	    			return e;
	    		}
	    	}
	    	return null;
	    }
}
