package me.weinzierl.objects.elements;

import me.weinzierl.main.resources.ResourceManager;

public class Solver {
	
	public static String syntheq(String st1, String st2, String am1, String am2, String rs1, String rm1, String rs2, String rm2) {
		if(am1.equals("")) {
			am1="1";
		}
		if(am2.equals("")) {
			am2="1";
		}
		if(rm1.equals("")) {
			rm1="1";
		}
		if(rm2.equals("")) {
			rm2="1";
		}
		int i1 = 1;
       	int i2 = 1;
       	int o1 = 1;
       	//Element m1 = ElementHandler.find(st1);
       	//Element n1 = ElementHandler.find(st2);
       	/*if(m1==null||n1==null) {
    		ResourceManager.playError();
       		return "Unknown Element";
       	}*/
       	//mol
	   	int a1 = Integer.parseInt(rm1);
	   	int a2 = Integer.parseInt(rm2);
	   	
	   	String s1 = "";
	   	if(a1!=1) {
	   		s1 = subscript(""+a1);
	   	}
	   	String s2 = "";
	   	if(a2!=1) {
	   		s2 = subscript(""+a2);
	   	}
	   	
	   	
		String r = st1+""+s1+""+st2+""+s2;
       	//end mol
		
	   	int b1 = Integer.parseInt(am1);
	   	int b2 = Integer.parseInt(am2);
	   	int solve = 0;
	   	while((i1*b1!=o1*a1)||(i2*b2!=o1*a2)) {
	   		if(i1*b1>o1*a1) {
	   			o1++;
	   		}else if (i1*b1<o1*a1){
		   		i1++;
	   		}
	   		if(i2*b2>o1*a2) {
	   			o1++;
	   		}else if(i2*b2<o1*a2) {
		   		i2++;
	   		}
	   		if(solve >=1000) {
        		ResourceManager.playError();
	   			return "Impossible";
	   			
	   		}
	   		solve++;
	   	}
	   	
	   	
	   	String x1 = "";
	   	if(b1!=1) {
	   		x1 = subscript(""+b1);
	   	}
	   	String x2 = "";
	   	if(b2!=1) {
	   		x2 = subscript(""+b2);
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
	   	ResourceManager.playSucess();

	   	System.out.println(z1+st1+x1+" + "+z2+st2+x2+" → "+e1+r);
		return (z1+st1+x1+" + "+z2+st2+x2+" → "+e1+r);
       	
       	
	}
	
	
	public static String decompeq(String st1, String st2, String am1, String am2, String rs1, String rm1, String rs2, String rm2) {
		if(am1.equals("")) {
			am1="1";
		}
		if(am2.equals("")) {
			am2="1";
		}
		if(rm1.equals("")) {
			rm1="1";
		}
		if(rm2.equals("")) {
			rm2="1";
		}
		int i1 = 1;
       	int i2 = 1;
       	int o1 = 1;
       	/*Element m1 = ElementHandler.find(st1);
       	Element n1 = ElementHandler.find(st2);
       	if(m1==null||n1==null) {
    		ResourceManager.playError();
       		return "Unknown Element";
       	}*/
       	//mol
	   	int a1 = Integer.parseInt(am1);
	   	int a2 = Integer.parseInt(am2);
	   	
	   	String s1 = "";
	   	if(a1!=1) {
	   		s1 = subscript(""+a1);
	   	}
	   	String s2 = "";
	   	if(a2!=1) {
	   		s2 = subscript(""+a2);
	   	}
	   	
	   	
		String r = st1+""+s1+""+st2+""+s2;
       	//end mol
		
	   	int b1 = Integer.parseInt(rm1);
	   	int b2 = Integer.parseInt(rm2);
	   	int solve = 0;
	   	while((i1*b1!=o1*a1)||(i2*b2!=o1*a2)) {
	   		if(i1*b1>o1*a1) {
	   			o1++;
	   		}else if (i1*b1<o1*a1){
		   		i1++;
	   		}
	   		if(i2*b2>o1*a2) {
	   			o1++;
	   		}else if(i2*b2<o1*a2) {
		   		i2++;
	   		}
	   		if(solve >=1000) {
        		ResourceManager.playError();
	   			return "Impossible";
	   		}
	   		solve++;
	   	}
	   	
	   	
	   	String x1 = "";
	   	if(b1!=1) {
	   		x1 = subscript(""+b1);
	   	}
	   	String x2 = "";
	   	if(b2!=1) {
	   		x2 = subscript(""+b2);
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
	   	ResourceManager.playSucess();

	   	System.out.println(e1+r+" → "+z1+st1+x1+" + "+z2+st2+x2);
		return (e1+r+" → "+z1+st1+x1+" + "+z2+st2+x2);
       	
       	
	}
	
	
	public static String sdiseq(String st1, String st2, String st3, String am1, String am2, String am3, String rs1, String rm1, String rs2, String rm2, String rs3, String rm3) {
		if(am1.equals("")) {
			am1="1";
		}
		if(am2.equals("")) {
			am2="1";
		}
		if(am3.equals("")) {
			am3="1";
		}
		if(rm1.equals("")) {
			rm1="1";
		}
		if(rm2.equals("")) {
			rm2="1";
		}
		if(rm3.equals("")) {
			rm3="1";
		}
		int i1 = 1;
       	int i2 = 1;
       	
       	int o1 = 1;
       	int o2 = 1;
       	
       	/*Element n1 = ElementHandler.find(st1);
       	Element m1 = ElementHandler.find(st2);
       	Element n2 = ElementHandler.find(st3);
       	
       	if(m1==null||n1==null||n2==null) {
    		ResourceManager.playError();
       		return "Unknown Element";
       	}*/
       	//mol
	   	int a1 = Integer.parseInt(am1);
	   	int a2 = Integer.parseInt(am2);
	   	int a3 = Integer.parseInt(am3);
	   
		//String r = n1.getId()+""+s1+""+n2.getId()+""+s2;
       	//end mol
		
	   	int b1 = Integer.parseInt(rm1);
	   	int b2 = Integer.parseInt(rm2);
	   	int b3 = Integer.parseInt(rm3);
	   	/*
	   	 * A + BC ---> AC + B
	   	 * 
	   	 * a1 = A#  i1 - A<#   a1*i1  am1
	   	 * a2 = B#  i2 - BC<#  a2*i2  am2
	   	 * a3 = C#  i2 - BC<#  a3*i2  am3
	   	 * 
	   	 * b1 = A#  o1 - AC<#  b1*o1  rm1
	   	 * b2 = C#  o1 - AC<#  b2*o1  rm2
	   	 * b3 = B#  o2 - B<#   b3*o2  rm3
	   	 * 
	   	 */
	   	int solve = 0;
	   	while((a1*i1!=b1*o1)||(a2*i2!=b3*o2)||(a3*i2!=b2*o1)) {
	   		if(a1*i1>b1*o1) {
	   			o1++;
	   		}else if (a1*i1<b1*o1){
		   		i1++;
	   		}
	   		if(a2*i2>b3*o2) {
	   			o2++;
	   		}else if (a2*i2<b3*o2){
		   		i2++;
	   		}
	   		
	   		if(a3*i2>b2*o1) {
	   			o1++;
	   		}else if (a3*i2<b2*o1){
		   		i2++;
	   		}
	   		if(solve >=1000) {
        		ResourceManager.playError();
	   			return "Impossible";
	   		}
	   		solve++;
	   	}
	   	
	   	
	   	String x1 = "";
	   	if(b1!=1) {
	   		x1 = subscript(""+b1);
	   	}
	   	String x2 = "";
	   	if(b2!=1) {
	   		x2 = subscript(""+b2);
	   	}
	   	String x3 = "";
	   	if(b3!=1) {
	   		x3 = subscript(""+b3);
	   	}
	   	String z1 = "";
	   	if(a1!=1) {
	   		z1 = subscript(""+a1);
	   	}
	   	String z2 = "";
	   	if(a2!=1) {
	   		z2 = subscript(""+a2);
	   	}
		String z3 = "";
	   	if(a3!=1) {
	   		z3 = subscript(""+a3);
	   	}
	   	String ii1 = "";
	   	if(i1!=1) {
	   		ii1 = ""+i1;
	   	}
		String ii2 = "";
	   	if(i2!=1) {
	   		ii2 = ""+i2;
	   	}
	   	String oo2 = "";
	   	if(o2!=1) {
	   		oo2 = ""+o2;
	   	}
	   	String oo1 = "";
	   	if(o1!=1) {
	   		oo1 = ""+o1;
	   	}
	   	ResourceManager.playSucess();

	   	
	   	System.out.println(ii1+st1+z1+" + "+ii2+st2+z2+st3+z3+" → "+oo1+st1+x1+st3+x2+" + "+oo2+st2+x3);
		return (ii1+st1+z1+" + "+ii2+st2+z2+st3+z3+" → "+oo1+st1+x1+st3+x2+" + "+oo2+st2+x3);
       	
       	
	}

	
	public static String ddiseq(String st1, String st2, String st3, String st4, String am1, String am2, String am3, String am4, String rs1, String rm1, String rs2, String rm2, String rs3, String rm3, String rs4, String rm4) {
		if(am1.equals("")) {
			am1="1";
		}
		if(am2.equals("")) {
			am2="1";
		}
		if(am3.equals("")) {
			am3="1";
		}
		if(am4.equals("")) {
			am4="1";
		}
		if(rm1.equals("")) {
			rm1="1";
		}
		if(rm2.equals("")) {
			rm2="1";
		}
		if(rm3.equals("")) {
			rm3="1";
		}
		if(rm4.equals("")) {
			rm4="1";
		}
		int i1 = 1;
       	int i2 = 1;
       	
       	int o1 = 1;
       	int o2 = 1;
       	
       	/*Element n1 = ElementHandler.find(st1);
       	Element m1 = ElementHandler.find(st2);
       	Element n2 = ElementHandler.find(st3);
       	Element m2 = ElementHandler.find(st4);
       	
       	if(m1==null||n1==null||n2==null||m2==null) {
    		ResourceManager.playError();
       		return "Unknown Element";
       	}*/
       	//mol
	   	int a1 = Integer.parseInt(am1);
	   	int a2 = Integer.parseInt(am2);
	   	int a3 = Integer.parseInt(am3);
	   	int a4 = Integer.parseInt(am4);
	   	
	   	
		//String r = n1.getId()+""+s1+""+n2.getId()+""+s2;
       	//end mol
		
	   	int b1 = Integer.parseInt(rm1);
	   	int b2 = Integer.parseInt(rm2);
	   	int b3 = Integer.parseInt(rm3);
	   	int b4 = Integer.parseInt(rm4);
	   	
	   	/*
	   	 * AB + CD ---> AD + CB
	   	 * 
	   	 * a1 = A#  i1 - AB<#  a1*i1  am1  n1  yes
	   	 * a2 = B#  i1 - AB<#  a2*i1  am2  m1  yes
	   	 * a3 = C#  i2 - CD<#  a3*i2  am3  n2  yes
	   	 * a4 = D#  i2 - CD<#  a4*i2  am4  m2  yes
	   	 * 
	   	 * b1 = A#  o1 - AD<#  b1*o1  rm1  n1  yes
	   	 * b2 = D#  o1 - AD<#  b2*o1  rm2  n2  yes
	   	 * b3 = C#  o2 - CB<#  b3*o2  rm3  m1  yes
	   	 * b4 = B#  o2 - CB<#  b4*o2  rm4  m2  yes
	   	 * 
	   	 */
	   	int solve = 0;
	   	//        yes              
	   	while((a1*i1!=b1*o1)||(a2*i1!=b4*o2)||(a3*i2!=b3*o2)||(a4*i2!=b2*o1)) {
	   		if(a1*i1>b1*o1) {
	   			o1++;
	   		}else if (a1*i1<b1*o1){
		   		i1++;
	   		}
	   		if(a2*i1>b4*o2) {
	   			o2++;
	   		}else if(a2*i1<b4*o2) {
	   			i1++;
	   		}
	   		if(a3*i2>b3*o2) {
	   			o2++;
	   		}else if(a3*i2<b3*o2) {
	   			i2++;
	   		}
	   		if(a4*i2>b2*o1) {
	   			o1++;
	   		}else if(a4*i2<b2*o1) {
	   			i2++;
	   		}
	   		if(solve >=1000) {
        		ResourceManager.playError();
	   			return "Impossible";
	   		}
	   		solve++;
	   	}
	   	
	   	
	   	String x1 = "";
	   	if(b1!=1) {
	   		x1 = subscript(""+b1);
	   	}
	   	String x2 = "";
	   	if(b2!=1) {
	   		x2 = subscript(""+b2);
	   	}
	   	String x3 = "";
	   	if(b3!=1) {
	   		x3 = subscript(""+b3);
	   	}
	   	String x4 = "";
	   	if(b4!=1) {
	   		x4 = subscript(""+b4);
	   	}
	   	
	   	String z1 = "";
	   	if(a1!=1) {
	   		z1 = subscript(""+a1);
	   	}
	   	String z2 = "";
	   	if(a2!=1) {
	   		z2 = subscript(""+a2);
	   	}
		String z3 = "";
	   	if(a3!=1) {
	   		z3 = subscript(""+a3);
	   	}
	   	String z4 = "";
	   	if(a4!=1) {
	   		z4 = subscript(""+a4);
	   	}
	   	String ii1 = "";
	   	if(i1!=1) {
	   		ii1 = ""+i1;
	   	}
		String ii2 = "";
	   	if(i2!=1) {
	   		ii2 = ""+i2;
	   	}
	   	String oo2 = "";
	   	if(o2!=1) {
	   		oo2 = ""+o2;
	   	}
	   	String oo1 = "";
	   	if(o1!=1) {
	   		oo1 = ""+o1;
	   	}
	   	/*
	   	 * AB + CD ---> AD + CB
	   	 * 
	   	 * a1 = A#  i1 - AB<#  a1*i1  am1  n1  yes
	   	 * a2 = B#  i1 - AB<#  a2*i1  am2  m1  yes
	   	 * a3 = C#  i2 - CD<#  a3*i2  am3  n2  yes
	   	 * a4 = D#  i2 - CD<#  a4*i2  am4  m2  yes
	   	 * 
	   	 * b1 = A#  o1 - AD<#  b1*o1  rm1  n1  yes
	   	 * b2 = D#  o1 - AD<#  b2*o1  rm2  m2  yes
	   	 * b3 = C#  o2 - CB<#  b3*o2  rm3  n2  yes
	   	 * b4 = B#  o2 - CB<#  b4*o2  rm4  m1  yes
	   	 * 
	   	 */
	   	ResourceManager.playSucess();
	   	System.out.println(ii1+st1+z1+st2+z2+" + "+ii2+st3+z3+st4+z4+" → "+oo1+st1+x1+st4+x2+" + "+oo2+st3+x3+st2+x4);
		return (ii1+st1+z1+st2+z2+" + "+ii2+st3+z3+st4+z4+" → "+oo1+st1+x1+st4+x2+" + "+oo2+st3+x3+st2+x4);
       	
       	
	}

		
	public static String ieq(String st1, String st2) {
		Element e1 = ElementHandler.find(st1);
       	Element e2 = ElementHandler.find(st2);
       	if(e1==null||e2==null) {
    		ResourceManager.playError();
       		return "Unknown Element";
       	}
	   	int a1 = 1;
	   	int a2 = 1;
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
	   		s1 = subscript(""+a1);
	   	}
	   	String s2 = "";
	   	if(a2!=1) {
	   		s2 = subscript(""+a2);
	   	}
	   	ResourceManager.playSucess();
		return e1.getId()+""+s1+""+e2.getId()+""+s2;
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
}
