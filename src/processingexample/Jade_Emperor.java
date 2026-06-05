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
public class Jade_Emperor extends Person {
    private int State = 0;
    private int Power;
    
    public Jade_Emperor(PApplet p, int x, int y, String name, int health, int speed, String imagePath, int Power){
        super(p, x, y, name, health, speed, imagePath);
        this.Power = Power;
    }
    
    public void CastLockingSpell(Nian monster){
        if (State == 0 && monster != null) {
            State = 1;
        }
    }
    
    public void draw() {
        if (State == 0) {
            app.image(image, x, y);
        } else if (State == 1) {
            app.image(image, x, y);
        }
    }
}
