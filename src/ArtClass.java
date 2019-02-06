/*
* File: ArtClass.java
* Date: 8/29/2018
* Author: Dillan Cobb
* Purpose: Create, draw and color all of the objects and shapes for a scene
* created from primitive objects in Java.
*/

// Java class imports
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class ArtClass extends JPanel{
    
    // Paints all the components by running their methods
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBackground(g);
        drawSun(g);
        drawField(g);
        drawCastle(g);
        drawClouds(g);
    }
    
    // drawBackground method draws a blue sky background
    private void drawBackground(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D backGround = new Rectangle2D.Double(0,0,500,500);
        
        g2d.setPaint(Color.blue);
        g2d.fill(backGround);
        
    }
    
    // drawSun method drawas a yellow sun onto the scene
    private void drawSun(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D sunCircle = new Ellipse2D.Double(25,25,75,75);
        Ellipse2D sunCirlceOutline = new Ellipse2D.Double(25,25,75,75);
                
        g2d.setPaint(Color.yellow);
        g2d.fill(sunCircle);
        
        g2d.setColor(Color.black);
        g2d.draw(sunCirlceOutline);
    }
    
    // drawField method lays out the grass on the scene
    private void drawField(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D grassOne = new Ellipse2D.Double(-100,300,500,200);
        Ellipse2D grassOneOutline = new Ellipse2D.Double(-100,300,500,200);
        Ellipse2D grassTwo = new Ellipse2D.Double(200,250,500,500);
        Ellipse2D grassTwoOutline = new Ellipse2D.Double(200,250,500,500);
                
        g2d.setColor(Color.black);
        g2d.draw(grassOneOutline);
        g2d.draw(grassTwoOutline);
        
        g2d.setPaint(Color.green);
        g2d.fill(grassOne);
        g2d.fill(grassTwo);
    }
    
    // drawClouds places all the clouds into the sky
    private void drawClouds(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D cloudOne = new Ellipse2D.Double(250,100,150,50);
        Ellipse2D cloudTwo = new Ellipse2D.Double(150,50,150,50);
        Ellipse2D cloudThree = new Ellipse2D.Double(-100,60,150,50);
        
        g2d.setPaint(Color.white);
        g2d.fill(cloudOne);
        g2d.fill(cloudTwo);
        g2d.fill(cloudThree);
    }
    
    // drawCastle method creates and outlines the entire castle and the flags
    private void drawCastle(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Rectangle2D rightTowerOutline = new Rectangle2D.Double(400,250,50,100);
        Rectangle2D centralCastle = new Rectangle2D.Double(300,275,100,75);
        Rectangle2D leftTower = new Rectangle2D.Double(250,250,50,100);
        Rectangle2D leftTowerOutline = new Rectangle2D.Double(250,250,50,100);
        Rectangle2D rightTower = new Rectangle2D.Double(400,250,50,100);
        Rectangle2D drawDoor = new Rectangle2D.Double(340,310,20,40);
        Rectangle2D protrudingOne = new Rectangle2D.Double(310,265,10,10);
        Rectangle2D protrudingTwo = new Rectangle2D.Double(330,265,10,10);
        Rectangle2D protrudingThree = new Rectangle2D.Double(350,265,10,10);
        Rectangle2D protrudingFour = new Rectangle2D.Double(370,265,10,10);
        Rectangle2D protrudingFive = new Rectangle2D.Double(390,265,10,10);
        Rectangle2D flagPoleOne = new Rectangle2D.Double(270,210,5,40);
        Rectangle2D flagPoleTwo = new Rectangle2D.Double(420,210,5,40);
        Rectangle2D flagOne = new Rectangle2D.Double(250,210,20,10);
        Rectangle2D flagTwo = new Rectangle2D.Double(400,210,20,10);
        
        g2d.setPaint(Color.gray);
        g2d.fill(leftTower);
        g2d.fill(centralCastle);
        g2d.fill(rightTower);
        g2d.fill(protrudingOne);
        g2d.fill(protrudingTwo);
        g2d.fill(protrudingThree);
        g2d.fill(protrudingFour);
        g2d.fill(protrudingFive);
        
        g2d.setPaint(Color.black);
        g2d.fill(flagPoleOne);
        g2d.fill(flagPoleTwo);
        
        g2d.setPaint(Color.RED);
        g2d.fill(flagOne);
        g2d.fill(flagTwo);
        
        Color brown = new Color(165,42,42);
        
        g2d.setPaint(brown);
        g2d.fill(drawDoor);
        
        g2d.setColor(Color.black);
        g2d.draw(leftTowerOutline);
        g2d.draw(rightTowerOutline);
    }
}
