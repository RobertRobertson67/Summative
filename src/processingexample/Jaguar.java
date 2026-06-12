/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package processingexample;
import processing.core.PApplet;
import processing.core.PImage;

/**
 *
 * @author andrewchow
 */
public class Jaguar extends Person{
    private boolean MovingLeft;
    private PImage Jaguar_left;
    private PImage Jaguar_right;
    
    public Jaguar(PApplet p, int x, int y, PImage Jaguar_left, PImage Jaguar_right, int speed, boolean MovingLeft){
        super(p, x, y, "Jaguar", 1000, speed, "images/Jaguar.png");
        this.Jaguar_left = Jaguar_left;
        this.Jaguar_right = Jaguar_right;
        this.MovingLeft = MovingLeft;
    }
    
    @Override
    public void move(int dx, int dy){
        if (x >= 605) { 
            MovingLeft = true; 
        } else if (x <= -5){
            MovingLeft = false;
        }
        
        if (MovingLeft){
            x -= speed;
            image = Jaguar_left;
        } else {
            x += speed;
            image = Jaguar_right;
        }
    }
}

