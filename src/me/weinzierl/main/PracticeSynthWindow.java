package me.weinzierl.main;

import javax.swing.*;

import me.weinzierl.main.resources.ResourceManager;
import me.weinzierl.objects.elements.RandomGenerator;
import me.weinzierl.objects.elements.SynthAnswer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Imports

//End Imports

public class PracticeSynthWindow extends JFrame implements ActionListener {
	
	
    
	private static final long serialVersionUID = 1L;

	public static String name;

    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;
    private final JLabel label4;
    private final JLabel label5;
    private final JLabel label6;
    private final JLabel label7;
    public JLabel score;

    private final JTextField i1;
    private final JTextField i2;
    private final JTextField i3;
    
    private final JButton button;
    private int a1;
    private int a2;
    private int a3;
    private SynthAnswer a;
    private boolean next;
    public PracticeSynthWindow(Point point) {
        //Initialize
        this.setIconImage(ResourceManager.icon.getImage());

        label1 = new JLabel("Balance Equation:");
        label2 = new JLabel("  +");
        label3 = new JLabel("     →");
        label4 = new JLabel("");
        label5 = new JLabel("");
        label6 = new JLabel("");
        label7 = new JLabel("");
        score = new JLabel(""+ChemTron.score.sc());

        i1 = new JTextField("");
        i2 = new JTextField("");
        i3 = new JTextField("");
        
        button = new JButton("Enter");
        button.setPreferredSize(new Dimension(100, 25));
        button.addActionListener(this);
        //Arrange
        
        label1.setPreferredSize(new Dimension(140, 40));
        label2.setPreferredSize(new Dimension(25, 40));
        label3.setPreferredSize(new Dimension(40, 40));
        label4.setPreferredSize(new Dimension(400, 20));
        label5.setPreferredSize(new Dimension(30, 25));
        label6.setPreferredSize(new Dimension(30, 25));
        label7.setPreferredSize(new Dimension(60, 25));

        i1.setPreferredSize(new Dimension(25, 25));
        i2.setPreferredSize(new Dimension(25, 25));
        i3.setPreferredSize(new Dimension(25, 25));
        
        setLayout(new FlowLayout());
        button.setFocusable(false);

        add(label1);
        add(i1);
        add(label5);
        add(label2);
        add(i2);
        add(label6);
        add(label3);
        add(i3);
        add(label7);
        add(button);
        add(label4);
        add(score);
        setSize(new Dimension(600, 120));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setPreferredSize(new Dimension(300, 600));
        getContentPane().doLayout();
        setResizable(false);
        setLocation(point);
        this.setTitle("Synthesis Practice");
        this.setVisible(true);
        next();
    }


    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if (source == button) {
        	if(next) {
        		next();
        	}else {
        	try {
        		a1 = Integer.parseInt(i1.getText());
        	}catch(NumberFormatException e){	
        		a1 = 1;
        	}
        	try {
        		a2 = Integer.parseInt(i2.getText());
        	}catch(NumberFormatException e){	
        		a2 = 1;
        	}
        	try {
        		a3 = Integer.parseInt(i3.getText());
        	}catch(NumberFormatException e){	
        		a3 = 1;
        	}
        	if(a1==a.b1&&a2==a.b2&&a3==a.b3) {
        		label4.setText("Correct!");
            	ChemTron.score.add(2);
        		next = true;
                button.setText("Next?");
                score.setText(""+ChemTron.score.sc());
        		ResourceManager.playSucess();

        	}else {
        		label4.setText("Wrong!");
            	ChemTron.score.sub(1);
                score.setText(""+ChemTron.score.sc());
        		ResourceManager.playError();

        	}
        	}
        }
    }
    
    public void next() {
    	
        a = RandomGenerator.rSynthEq();
        label5.setText(a.a1);
        label6.setText(a.a2);
        label7.setText(a.a3);
        button.setText("Enter");
		label4.setText("");
		i1.setText("");
		i2.setText("");
		i3.setText("");
        next = false;
    }
    }