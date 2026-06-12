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
public class Nian extends Person {
    private int power;
    PImage Defeat_Villager;
    private Nian nian;
    private Villager villager;
    
    public Nian (PApplet p, int x, int y, String name, int health, int speed, String imagePath, int power){
        super(p, x, y, name, health, speed, imagePath);
        this.power = power;
    }
    
    public void displayInfo(PApplet p){
       app.fill(0);
       app.text("Name: " + name, x, y - 40);
       app.text("HP: " + health, x, y - 20);
       app.text("Speed: " + speed, x, y);
       app.text("Power: " + power, x, y - 60);
   }
}
