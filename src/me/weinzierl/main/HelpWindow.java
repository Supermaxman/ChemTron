package me.weinzierl.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.WindowConstants;

import me.weinzierl.main.resources.ResourceManager;

//Imports

//End Imports

public class HelpWindow extends JFrame implements ActionListener {
	
	
    
	private static final long serialVersionUID = 1L;

	public static String name;

    private final JTextPane label1;
    private final JLabel label2;


    public HelpWindow(Point point) {
        //Initialize
        this.setIconImage(ResourceManager.icon.getImage());
    	label1 = new JTextPane();
        label2 = new JLabel("            © Max Weinzierl, 2012");
        label1.setText("Do not use Polyatomic Ions or Transition Metals in the Ionic Calculator, It does not understand them yet.\n\n" +
        		"Try to put the reactants and products in the correct order, or you may get a wrong answer.\n\n" +
        		"Please inform me of any calculation errors you encounter.\n\n" +
        		"For Polyatomic Ions, The resulting equation may not look nice. I am still working on the formatting.\n\n" +
        		"I do not condone the use of this calculator on homework, only to check your answers and practice better.");
        label1.setFocusable(false);
        label1.setEditable(false);
        label1.setBackground(new Color(238, 238, 238));
        label1.setPreferredSize(new Dimension(300, 400));
        label2.setPreferredSize(new Dimension(180, 40));
        
        
        setLayout(new FlowLayout());
        //add(label1);
        
        add(label1);
        add(label2);
        
        setSize(new Dimension(400, 500));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setPreferredSize(new Dimension(600, 200));
        getContentPane().doLayout();
        setResizable(false);
        setLocation(point);
        
        this.setTitle("Help");
        this.setVisible(true);
    }


    public void actionPerformed(ActionEvent event) {
        //Object source = event.getSource();
        
    }
    }