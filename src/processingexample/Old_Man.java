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
public class Old_Man extends Person{
    private boolean Wisdom = false;
    private int Stamina;
    private String message;
    
    
    public Old_Man(PApplet p, int x, int y, String name, int health, int speed, String imagePath, int Stamina){
        super(p, x, y, name, health, speed, imagePath);
        this.Stamina = Stamina;
    }
    
    public void warn(Villager receiver) {
        Wisdom = true;
    }
    
    public void draw(){
        if (Wisdom = true){
            this.message = "Nian fears the color red,\nloud firecrackers, and bright lights";
        }
    }
    
    
}
