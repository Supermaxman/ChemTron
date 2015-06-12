package me.weinzierl.main.resources;

import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

public class ResourceManager {
    public static Clip startup;
    public static AudioInputStream gAudio;
    public static ResourceManager resourceManager;
    public static ImageIcon icon;
    public static boolean mutetoggle;
    public ResourceManager() {
    	resourceManager = this;
    	mutetoggle = false;
    	icon = new ImageIcon(resourceManager.getClass().getResource("ChemBot.png"));
    }
    
    
    
    public static void playStartup() {
    	if(mutetoggle)return;
        try {
        	URL url = resourceManager.getClass().getResource("Activate.wav");
        		
        	
            AudioInputStream ga = AudioSystem.getAudioInputStream(url);
            Clip gs = AudioSystem.getClip();
            gs.open(ga);
            gs.start();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
        

    }
    public static void playSelect() {
    	if(mutetoggle)return;
        try {
        	URL url = resourceManager.getClass().getResource("Click.wav");

            AudioInputStream ga = AudioSystem.getAudioInputStream(url);
            Clip gs = AudioSystem.getClip();
            gs.open(ga);
            gs.start();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }


    }
    public static void playError() {
    	if(mutetoggle)return;
        try {
        	URL url = resourceManager.getClass().getResource("Error2.wav");
        	
            AudioInputStream ga = AudioSystem.getAudioInputStream(url);
            Clip gs = AudioSystem.getClip();
            gs.open(ga);
            gs.start();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }


    }


    public static void playShutdown() {
    	if(mutetoggle)return;
        try {
        	URL url = resourceManager.getClass().getResource("Shutdown.wav");
        	
            AudioInputStream ga = AudioSystem.getAudioInputStream(url);
            Clip gs = AudioSystem.getClip();
            gs.open(ga);
            gs.start();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }


    }


    public static void playSucess() {
    	if(mutetoggle)return;
        try {
        	URL url = resourceManager.getClass().getResource("Correct.wav");
        	
            AudioInputStream ga = AudioSystem.getAudioInputStream(url);
            Clip gs = AudioSystem.getClip();
            gs.open(ga);
            gs.start();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }


    }



    public static boolean tmute() {
    	if(mutetoggle==false) {
    		mutetoggle = true;
    	}else if(mutetoggle==true) {
    		mutetoggle = false;
    	}
		return mutetoggle;
    }


    



}
