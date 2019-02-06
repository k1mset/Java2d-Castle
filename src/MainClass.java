/**
 * File: MainClass.java
 * Date: 8/29/2018
 * Author: Dillan Cobb
 * Purpose: Create the frame and display the 2d graphics scene 
 */

import javax.swing.JFrame;

public class MainClass extends JFrame {
    
    public MainClass() {
        ArtClass displayImage = new ArtClass();
        add(displayImage);
        setSize(500, 500);
        setTitle("CMSC 325 Homework 1 - Castle");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        MainClass main = new MainClass();
        main.setVisible(true);
    }
    
}
