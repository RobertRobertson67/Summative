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
public class Image_Class extends Person{
    public PImage image;
    
    public Image_Class(PApplet p, int x, int y, String imagePath){
        super(p, x, y, "Crop", 1, 0, imagePath);
        this.image = app.loadImage( imagePath );
    }

    public void draw(){
        app.image(image, x, y);
    }
}
