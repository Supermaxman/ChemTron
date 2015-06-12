package me.weinzierl.main;

import javax.swing.*;

import me.weinzierl.main.resources.ResourceManager;
import me.weinzierl.objects.elements.Solver;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Imports

//End Imports

public class SingleDispWindow extends JFrame implements ActionListener {
	
	
	
	private static final long serialVersionUID = 1L;
	
	public static String name;
	
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;
    private final JLabel label4;
    private final JLabel label5;
    
    private final JTextField i1;
    private final JTextField s1;
    private final JTextField i2;
    private final JTextField s2;
    private final JTextField i3;
    private final JTextField s3;
    private final JTextField i4;
    private final JTextField s4;
    private final JTextField i5;
    private final JTextField s5;
    private final JTextField i6;
    private final JTextField s6;
    private final JButton button;

    public SingleDispWindow(Point point) {
        //Initialize
        this.setIconImage(ResourceManager.icon.getImage());

        label1 = new JLabel("Enter equation:");
        label2 = new JLabel("  +");
        label3 = new JLabel("     →");
        label4 = new JLabel("");
        label5 = new JLabel("  +");

        i1 = new JTextField("");
        s1 = new JTextField("");
        i2 = new JTextField("");
        s2 = new JTextField("");
        i3 = new JTextField("");
        s3 = new JTextField("");
        i4 = new JTextField("");
        s4 = new JTextField("");
        i5 = new JTextField("");
        s5 = new JTextField("");
        i6 = new JTextField("");
        s6 = new JTextField("");
        button = new JButton("Calculate");
        button.setPreferredSize(new Dimension(100, 25));
        button.addActionListener(this);
        //Arrange

        label1.setPreferredSize(new Dimension(100, 40));
        label2.setPreferredSize(new Dimension(25, 40));
        label3.setPreferredSize(new Dimension(40, 40));
        label4.setPreferredSize(new Dimension(400, 20));
        label5.setPreferredSize(new Dimension(25, 40));
        i1.setPreferredSize(new Dimension(25, 25));
        s1.setPreferredSize(new Dimension(20, 20));
        i2.setPreferredSize(new Dimension(25, 25));
        s2.setPreferredSize(new Dimension(20, 20));
        i3.setPreferredSize(new Dimension(25, 25));
        s3.setPreferredSize(new Dimension(20, 20));
        i4.setPreferredSize(new Dimension(25, 25));
        s4.setPreferredSize(new Dimension(20, 20));
        i5.setPreferredSize(new Dimension(25, 25));
        s5.setPreferredSize(new Dimension(20, 20));
        i6.setPreferredSize(new Dimension(25, 25));
        s6.setPreferredSize(new Dimension(20, 20));
        setLayout(new FlowLayout());
        button.setFocusable(false);
        
        add(label1);
        add(i1);
        add(s1);
        add(label2);
        add(i2);
        add(s2);
        add(i3);
        add(s3);
        add(label3);
        add(i4);
        add(s4);
        add(i5);
        add(s5);
        add(label5);
        add(i6);
        add(s6);
        add(button);
        add(label4);
        
        setSize(new Dimension(700, 120));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setPreferredSize(new Dimension(300, 600));
        getContentPane().doLayout();
        setResizable(false);
        setLocation(point);
        
        this.setTitle("Single Displacement Calculator");
        this.setVisible(true);
    }


    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if (source == button) {
        	if(i1.getText().equals("")||i2.getText().equals("")||i3.getText().equals("")||i4.getText().equals("")) {
        		label4.setText("Missing Element Field");
        		ResourceManager.playError();
        	}else {
            	label4.setText(Solver.sdiseq(i1.getText(), i2.getText(), i3.getText(), s1.getText(), s2.getText(), s3.getText(), i4.getText(), s4.getText(), i5.getText(), s5.getText(), i6.getText(), s6.getText()));
        	}
        }
    }
    }