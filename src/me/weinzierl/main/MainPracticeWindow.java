package me.weinzierl.main;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import me.weinzierl.main.resources.ResourceManager;

//Imports

//End Imports

public class MainPracticeWindow extends JFrame implements ActionListener {
	
	
    
	private static final long serialVersionUID = 1L;

	public static String name;

    private final JLabel label1;
    
    private final JButton button1;
    private final JButton button2;
    private final JButton button3;
    private final JButton button4;
    private final JButton button5;
    private final JButton button6;
    private final JButton button7;
    private final JButton button8;

    public MainPracticeWindow(Point point) {
        this.setIconImage(ResourceManager.icon.getImage());

        //Initialize
        label1 = new JLabel("            © Max Weinzierl, 2012");
        button1 = new JButton("Synthesis");
        button1.setPreferredSize(new Dimension(200, 200));
        button1.addActionListener(this);
        button2 = new JButton("Decomposition");
        button2.setPreferredSize(new Dimension(200, 200));
        button2.addActionListener(this);
        button3 = new JButton("Single displacement");
        button3.setPreferredSize(new Dimension(200, 200));
        button3.addActionListener(this);
        button4 = new JButton("Double displacement");
        button4.setPreferredSize(new Dimension(200, 200));
        button4.addActionListener(this);
        button5 = new JButton("Ionic Formulas");
        button5.setPreferredSize(new Dimension(405, 50));
        button5.addActionListener(this);
        button6 = new JButton("");
        button6.setPreferredSize(new Dimension(80, 50));
        button6.addActionListener(this);
        button7 = new JButton("Help");
        button7.setPreferredSize(new Dimension(80, 50));
        button7.addActionListener(this);
        button8 = new JButton("Calculate");
        button8.setPreferredSize(new Dimension(405, 50));
        button8.addActionListener(this);
        //Arrange

        label1.setPreferredSize(new Dimension(180, 40));
        
        
        setLayout(new FlowLayout());
        //add(label1);
        button1.setFocusable(false);
        button2.setFocusable(false);
        button3.setFocusable(false);
        button4.setFocusable(false);
        button5.setFocusable(false);
        button6.setFocusable(false);
        button7.setFocusable(false);
        button8.setFocusable(false);
        
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button8);
        add(button6);  
        add(label1);
        add(button7);
        setSize(new Dimension(450, 610));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().doLayout();
        setResizable(false);
        if(point==null) {
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            int w = getSize().width;
            int h = getSize().height;
            int x = (dim.width - w) / 2;
            int y = (dim.height - h) / 2;
            setLocation(x, y);
        }else {
        	setLocation(point);
        }
        this.setTitle("Equation Practice");
        this.setVisible(true);
        
        if(ResourceManager.mutetoggle) {
        	button6.setText("UnMute");
        }else {
        	button6.setText("Mute");
        }
    }


    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if (source == button1) {
        	new PracticeSynthWindow(this.getLocation());
        	ResourceManager.playSelect();
        }else if(source == button2) {
        	new PracticeDecompWindow(this.getLocation());
        	ResourceManager.playSelect();
        }else if(source == button3) {
        	new PracticeSingleDispWindow(this.getLocation());
        	ResourceManager.playSelect();
        }else if(source == button4) {
        	new PracticeDoubleDispWindow(this.getLocation());
        	ResourceManager.playSelect();
        }else if(source == button5) {
        	new IonicFormulasWindow(this.getLocation());
        	ResourceManager.playSelect();
        }else if(source == button6) {
        	if(ResourceManager.tmute()) {
                button6.setText("UnMute");
        	}else {
                button6.setText("Mute");
        	}
        	ResourceManager.playSelect();
        }else if(source == button7) {
        	new HelpWindow(this.getLocation());
        	ResourceManager.playSelect();
        }else if(source == button8) {
        	new MainWindow(this.getLocation());
        	this.dispose();
        	ResourceManager.playSelect();
        }
    }
    }