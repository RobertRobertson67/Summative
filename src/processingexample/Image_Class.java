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
public class Image_Class {
    public int x, y;
    public PApplet app;
    public PImage image;
    
    public Image_Class(PApplet p, int x, int y, String imagePath){
        this.app = p;
        this.x = x;
        this.y = y;
        this.image = app.loadImage( imagePath );
    }

    public void draw(){
        app.image(image, x, y);
    }
}
