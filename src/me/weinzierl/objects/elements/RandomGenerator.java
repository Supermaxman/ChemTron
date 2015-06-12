package me.weinzierl.objects.elements;

import java.util.Random;

import me.weinzierl.main.resources.ResourceManager;

public class RandomGenerator {
	
	
	
	
	public static SynthAnswer rSynthEq() {
		int i1 = 1;
       	int i2 = 1;
       	int o1 = 1;
       	Element m1 = RandomGenerator.rMetal();
       	Element n1 = RandomGenerator.rNonMetal();
       	
       	//mol
	   	int a1 = 1;
	   	int a2 = 1;
	   	int c = (m1.getCharge()*a1)-(n1.getCharge()*a2);
	   	while(c!=0) {
	   		if(c>0) {
	   			a2++;
	   		}else {
	   			a1++;
	   		}
	       	c = (m1.getCharge()*a1)-(n1.getCharge()*a2);
	   	}
	   	String s1 = "";
	   	if(a1!=1) {
	   		s1 = subscript(""+a1);
	   	}
	   	String s2 = "";
	   	if(a2!=1) {
	   		s2 = subscript(""+a2);
	   	}
	   	
	   	
		String r = m1.getId()+""+s1+""+n1.getId()+""+s2;
       	//end mol
		
	   	int b1 = 1;
	   	int b2 = 1;
	   	while(i1*b1!=o1*a1) {
	   		i1++;
	   	}
	   	while(i2*b2!=o1*a2) {
	   		i2++;
	   	}
	   	
	   	String x1 = "";
	   	if(b1!=1) {
	   		x1 = subscript(""+b1);
	   	}
	   	String x2 = "";
	   	if(b2!=1) {
	   		s2 = subscript(""+b2);
	   	}
	   	
	   	String z1 = "";
	   	if(i1!=1) {
	   		z1 = ""+i1;
	   	}
	   	String z2 = "";
	   	if(i2!=1) {
	   		z2 = ""+i2;
	   	}
		String e1 = "";
	   	if(o1!=1) {
	   		e1 = ""+o1;
	   	}
	   	String f1 = m1.getId()+x1;
	   	String f2 = n1.getId()+x2;
	   	String f3 = r;
	   	int v1 = i1;
	   	int v2 = i2;
	   	int v3 = o1;
	   	SynthAnswer answer = new SynthAnswer(f1, f2, f3, v1, v2, v3);
	   	System.out.println(z1+m1.getId()+x1+" + "+z2+n1.getId()+x2+" --> "+e1+r);
		return answer;
       	
       	
	}

	public static DecompAnswer rDecompEq() {
		int i1 = 1;
       	int i2 = 1;
       	int o1 = 1;
       	Element m1 = RandomGenerator.rMetal();
       	Element n1 = RandomGenerator.rNonMetal();
       	
       	//mol
	   	int a1 = 1;
	   	int a2 = 1;
	   	int c = (m1.getCharge()*a1)-(n1.getCharge()*a2);
	   	while(c!=0) {
	   		if(c>0) {
	   			a2++;
	   		}else {
	   			a1++;
	   		}
	       	c = (m1.getCharge()*a1)-(n1.getCharge()*a2);
	   	}
	   	String s1 = "";
	   	if(a1!=1) {
	   		s1 = subscript(""+a1);
	   	}
	   	String s2 = "";
	   	if(a2!=1) {
	   		s2 = subscript(""+a2);
	   	}
	   	
	   	
		String r = m1.getId()+""+s1+""+n1.getId()+""+s2;
       	//end mol
		
	   	int b1 = 1;
	   	int b2 = 1;
	   	while(i1*b1!=o1*a1) {
	   		i1++;
	   	}
	   	while(i2*b2!=o1*a2) {
	   		i2++;
	   	}
	   	System.out.println(a1);
	   	System.out.println(a2);

	   	String x1 = "";
	   	if(b1!=1) {
	   		x1 = subscript(""+b1);
	   	}
	   	String x2 = "";
	   	if(b2!=1) {
	   		s2 = subscript(""+b2);
	   	}
	   	
	   	String z1 = "";
	   	if(i1!=1) {
	   		z1 = ""+i1;
	   	}
	   	String z2 = "";
	   	if(i2!=1) {
	   		z2 = ""+i2;
	   	}
		String e1 = "";
	   	if(o1!=1) {
	   		e1 = ""+o1;
	   	}
	   	String f1 = m1.getId()+x1;
	   	String f2 = n1.getId()+x2;
	   	String f3 = r;
	   	int v1 = i1;
	   	int v2 = i2;
	   	int v3 = o1;
	   	DecompAnswer answer = new DecompAnswer(f1, f2, f3, v1, v2, v3);
	   	System.out.println(e1+r+" --> "+z1+m1.getId()+x1+" + "+z2+n1.getId()+x2);
		return answer;
       	
       	
	}
	
	
	public static DispAnswer rDispEq() {
		
       	Molecule m1 = new Molecule(RandomGenerator.rMetal(), RandomGenerator.rNonMetal());
       	
       	Molecule m2 = new Molecule(RandomGenerator.rMetal(), m1.getE2());//make random metal or nonmetal switch

		
		
		int i1 = 1;
       	int i2 = 1;
       	int o1 = 1;
       	int o2 = 1;
       	
       	
	   	int solve = 0;
	   	while((m1.getA1()*i1!=o1)||(m1.getA2()*i1!=m2.getA2()*i2)||((o2!=m2.getA1()*i2))) {
	   		//1st
	   		if(m1.getA1()*i1>o1) {
	   			o1++;
	   		}else if (m1.getA1()*i1<o1){
		   		i1++;
	   		}
	   		
	   		
	   		//2nd
	   		if(m1.getA2()*i1>m2.getA2()*i2) {
	   			i2++;
	   		}else if (m1.getA2()*i1<m2.getA2()*i2){
		   		i1++;
	   		}
	   		//3rd
	   		if(o2>m2.getA1()*i2) {
	   			i2++;
	   		}else if (o2<m2.getA1()*i2){
		   		o2++;
	   		}
	   		if(solve >=1000) {
        		ResourceManager.playError();
	   			return null;
	   		}
	   		solve++;
	   	}
	   	
	   	
	   	DispAnswer answer = new DispAnswer(m1.getFormula(), m2.getE1().getId(), m2.getFormula(),m1.getE1().getId() , i1, o2, i2, o1);
	   	System.out.println(i1+m1.getFormula()+" + "+o2+m2.getE1().getId()+" --> "+i2+m2.getFormula()+" + "+o1+m1.getE1().getId());
		return answer;
		
	}
	
	
	
	public static DispAnswer rDoubleDispEq() {
		
       	Molecule m1 = new Molecule(RandomGenerator.rMetal(), RandomGenerator.rNonMetal());
       	
       	Molecule m2 = new Molecule(RandomGenerator.rMetal(), RandomGenerator.rNonMetal());

       	Molecule m3 = new Molecule(m1.getE1(), m2.getE2());

       	Molecule m4 = new Molecule(m2.getE1(), m1.getE2());

		int i1 = 1;
       	int i2 = 1;
       	int i3 = 1;
       	int i4 = 1;
       	
       	
	   	int solve = 0;
	   	while((m1.getA1()*i1!=m3.getA1()*i3)||
	   			(m1.getA2()*i1!=m4.getA2()*i4)||
	   			(m2.getA1()*i2!=m4.getA1()*i4)||
	   			(m2.getA2()*i2!=m3.getA2()*i3)) {
	   		//1st
	   		if(m1.getA1()*i1>m3.getA1()*i3) {
	   			i3++;
	   		}else if (m1.getA1()*i1<m3.getA1()*i3){
		   		i1++;
	   		}
	   		
	   		if(m1.getA2()*i1>m4.getA2()*i4) {
	   			i4++;
	   		}else if (m1.getA2()*i1<m4.getA2()*i4){
		   		i1++;
	   		}
	   		
	   		if(m2.getA1()*i2>m4.getA1()*i4) {
	   			i4++;
	   		}else if (m2.getA1()*i2<m4.getA1()*i4){
		   		i2++;
	   		}
	   		
	   		if(m2.getA2()*i2>m3.getA2()*i3) {
	   			i3++;
	   		}else if (m2.getA2()*i2<m3.getA2()*i3){
		   		i2++;
	   		}
	   		
	   		if(solve >=1000) {
        		ResourceManager.playError();
	   			return null;
	   		}
	   		solve++;
	   	}
	   	
	   	
	   	DispAnswer answer = new DispAnswer(m1.getFormula(), m2.getFormula(), m3.getFormula(),m4.getFormula() , i1, i2, i3, i4);
	   	System.out.println(i1+m1.getFormula()+" + "+i2+m2.getFormula()+" --> "+i3+m3.getFormula()+" + "+i4+m4.getFormula());
		return answer;
	}
	
	
	
	public static String superscript(String str) {
    str = str.replaceAll("0", "⁰");
    str = str.replaceAll("1", "¹");
    str = str.replaceAll("2", "²");
    str = str.replaceAll("3", "³");
    str = str.replaceAll("4", "⁴");
    str = str.replaceAll("5", "⁵");
    str = str.replaceAll("6", "⁶");
    str = str.replaceAll("7", "⁷");
    str = str.replaceAll("8", "⁸");
    str = str.replaceAll("9", "⁹");         
    return str;
}

public static String subscript(String str) {
    str = str.replaceAll("0", "₀");
    str = str.replaceAll("1", "₁");
    str = str.replaceAll("2", "₂");
    str = str.replaceAll("3", "₃");
    str = str.replaceAll("4", "₄");
    str = str.replaceAll("5", "₅");
    str = str.replaceAll("6", "₆");
    str = str.replaceAll("7", "₇");
    str = str.replaceAll("8", "₈");
    str = str.replaceAll("9", "₉");
    return str;
}


public static String bsubscript(String str) {
    str = str.replaceAll("₀", "0");
    str = str.replaceAll("₁", "1");
    str = str.replaceAll("₂", "2");
    str = str.replaceAll("₃", "3");
    str = str.replaceAll("₄", "4");
    str = str.replaceAll("₅", "5");
    str = str.replaceAll("₆", "6");
    str = str.replaceAll("₇", "7");
    str = str.replaceAll("₈", "8");
    str = str.replaceAll("₉", "9");
    return str;
}

public static Element rMetal() {
	return ElementHandler.metals.get(new Random().nextInt(ElementHandler.metals.size()));
	
}
public static Element rNonMetal() {
	return ElementHandler.nonmetals.get(new Random().nextInt(ElementHandler.nonmetals.size()));
	
}
}
