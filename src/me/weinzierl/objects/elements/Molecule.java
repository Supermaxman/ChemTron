package me.weinzierl.objects.elements;

public class Molecule {
	
	private String formula;
	private int a1 = 1;
	private int a2 = 1;
	private Element e1;
	private Element e2;
	
	
	
	public Molecule(Element e1, Element e2){
		this.e1 = e1;
		this.e2 = e2;
	   	int c = (e1.getCharge()*a1)-(e2.getCharge()*a2);
	   	while(c!=0) {
	   		if(c>0) {
	   			a2++;
	   		}else {
	   			a1++;
	   		}
	       	c = (e1.getCharge()*a1)-(e2.getCharge()*a2);
	   	}
	   	String s1 = "";
	   	if(a1!=1) {
	   		s1 = RandomGenerator.subscript(""+a1);
	   	}
	   	String s2 = "";
	   	if(a2!=1) {
	   		s2 = RandomGenerator.subscript(""+a2);
	   	}
		formula = e1.getId()+""+s1+""+e2.getId()+""+s2;
		
		
	}
	
	public String getFormula() {
		
		return formula;
	}
	
	public int getA1() {
		
		return a1;
	}
	public int getA2() {
		
		return a2;
	}
	public Element getE1() {
		
		return e1;
	}
	public Element getE2() {
		
		return e2;
	}
}
