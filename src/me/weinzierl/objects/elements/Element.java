package me.weinzierl.objects.elements;


class Hydrogen extends Element{
    public Hydrogen(){
        super("Hydrogen","H",true,1);
    }
}
class Lithium extends Element{
    public Lithium(){
        super("Lithium","Li",true,1);
    }
}
class Beryllium extends Element{
    public Beryllium(){
        super("Beryllium","Be",true,2);
    }
}
class Sodium extends Element{
    public Sodium(){
        super("Sodium","Na",true,1 );
    }
}
class Magnesium extends Element{
    public Magnesium(){
        super("Magnesium","Mg",true ,2);
    }
}
class Potassium extends Element{
    public Potassium(){
        super("Potassium","K", true,1 );
    }
}
class Calcium extends Element{
    public Calcium(){
        super("Calcium","Ca",true , 2);
    }
}
class Rubidium extends Element{
    public Rubidium(){
        super("Rubidium","Rb",true , 1);
    }
}
class Strontium extends Element{
    public Strontium(){
        super("Strontium","Sr",true , 2);
    }
}
class Cesium extends Element{
    public Cesium(){
        super("Cesium","Cs",true ,1 );
    }
}
class Barium extends Element{
    public Barium(){
        super("Barium","Ba",true , 2);
    }
}
class Aluminum extends Element{
    public Aluminum(){
        super("Aluminum","Al",true , 3);
    }
}
class Boron extends Element{
    public Boron(){
        super("Boron","B",false ,3);
    }
}
class Nitrogen extends Element{
    public Nitrogen(){
        super("Nitrogen","N",false ,3 );
    }
}
class Oxygen extends Element{
    public Oxygen(){
        super("Oxygen","O",false ,2 );
    }
}
class Florine extends Element{
    public Florine(){
        super("Florine","F",false ,1 );
    }
}
class Phosphorus extends Element{
    public Phosphorus(){
        super("Phosphorus","P",false ,3 );
    }
}
class Sulfur extends Element{
    public Sulfur(){
        super("Sulfur","S",false ,2 );
    }
}
class Chlorine extends Element{
    public Chlorine(){
        super("Chlorine","Cl",false ,1 );
    }
}
class Selenium extends Element{
    public Selenium(){
        super("Selenium","Se",false , 2);
    }
}
class Bromine extends Element{
    public Bromine(){
        super("Bromine","Br",false , 1);
    }
}
class Iodine extends Element{
    public Iodine(){
        super("Iodine","I",false , 1);
    }
}




public class Element{
    private String name;
    private String id;
    private boolean metal;
    private int charge;
    
    public Element(String n, String i, Boolean m, Integer c){
        name = n;
        id = i;
        metal = m;
        charge = c;
        if(metal){
        	ElementHandler.metals.add(this);
        }else{
            ElementHandler.nonmetals.add(this);
        }
        ElementHandler.all.add(this);
        
    }
    
    public String getName(){
        return name;
    }
    
    public String getId(){
        return id;
    }
    
    public boolean isMetal(){
        return metal;
    }
    
    public Integer getCharge(){
        return charge;
    }
    
}