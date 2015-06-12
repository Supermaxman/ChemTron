package me.weinzierl.main;

import me.weinzierl.main.resources.ResourceManager;
import me.weinzierl.objects.elements.ElementHandler;


public class ChemTron {
	public static Score score;
    public static void main(String[] args) {
       	ElementHandler.addElements();
       	new ResourceManager();
		//new SynthWindow();
       	ResourceManager.playStartup();
       	score = new Score();
       	new MainPracticeWindow(null);
       	//Solver.decompeq("H", "O", "2", "1", "H", "2", "O", "2");
       	//Solver.sdiseq("Mg", "Li", "N", "4", "4", "1", "Mg", "2", "N", "2", "Li", "2");
       	//Solver.ddiseq("Mg", "N", "Li", "O", "2", "1", "1", "2", "Mg", "2", "O", "2", "Li", "2", "N", "2");
    	//AB + CD ---> AD + CB
    }
}
