/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package processingexample;
import processing.core.PApplet;

/**
 *
 * @author andrewchow
 */
public class Villager extends Person{
    private int Stamina;
    
    public Villager(PApplet p, int x, int y, String name, int health, int speed, String imagePath, int Stamina){
        super(p, x, y, name, health, speed, imagePath);
        this.Stamina = Stamina;
    }
    
    public void displayInfo(PApplet p){
       app.fill(0);
       app.text("Name: " + name, x, y - 50);
       app.text("HP: " + health, x, y - 30);
       app.text("Speed: " + speed, x, y - 10);
       app.text("Stamina: " + Stamina, x, y - 70);
   }
    
}
