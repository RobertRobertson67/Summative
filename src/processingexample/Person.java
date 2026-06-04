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
public class Person {
    public String name;
    public int health;
    public int speed;
    public int x, y;
    public PApplet app;
    public PImage image;
    public int width, height;
    
    
    
    public Person (PApplet p, int x, int y, String name, int health, int speed, String imagePath){
        this.name = name;
        this.health = health;
        this.app = p;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.image = app.loadImage( imagePath );
        this.width = image.width;
        this.height = image.height;
    }
    
    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }
    
    public boolean isCollidingWith(Person other) {
    // Check if the bounding boxes of the two persons intersect
    boolean isLeftOfOtherRight = x < other.x + other.width;
    boolean isRightOfOtherLeft = x + width > other.x;
    boolean isAboveOtherBottom = y < other.y + other.height;
    boolean isBelowOtherTop = y + height > other.y;

    return isLeftOfOtherRight && isRightOfOtherLeft 
      && isAboveOtherBottom && isBelowOtherTop;
  }
    
    public boolean isClicked(int mouseX, int mouseY) {
    /*calculates distance from mouse click at mouseX and mouseY to center 
    * of image since (x,y) of image is postioned at the top left corner  
    * we use x+(image.pixelWidth/2), y+(image.pixelHeight/2)) to get center*/
    int centerX = x+(image.pixelWidth/2);
    int centerY = y+(image.pixelHeight/2);        
    float d = PApplet.dist(mouseX, mouseY, centerX ,centerY );
    
    // returns true if  mouse clicked is within 16px from the center of image
    // we use 16px because the image is 32px by 32px
    return d < 16; 
    }

    public void draw(){
        app.image(image, x, y);
    }
}