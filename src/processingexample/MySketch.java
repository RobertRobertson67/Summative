/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package processingexample;
import processing.core.PApplet;
import processing.core.PImage;

public class MySketch extends PApplet {
    private Nian nian;
    private Villager villager;
    public int stage = 0;
    PImage menu_image;
    PImage Scene1_Back;
    private boolean showInfo = false;
    String userInput = " ";
    private Image_Class Soy;
    private Image_Class Cabbage;
    private Image_Class Pepper;
    private Image_Class Hay;
    private Image_Class Bamboo;
    private Image_Class Wheat;
 
  public void settings() {
    size(600, 600);
  }

  public void setup() {
    background(255);
    textSize(20);
    //Images
    menu_image = loadImage("images/Menu_Back.png");
    Scene1_Back = loadImage("images/Scene1_Back.png");
    Soy = new Image_Class(this, 180, 400, "images/Soy.png");
    
    
    nian = new Nian(this, 20, 30, "Nian", 1000, 10, "images/Nian.png", 10);
  }
  
  public void keyPressed(){
      if (stage == 0){
          if (keyCode == ENTER){
              stage = 1;
              String name = userInput;
              villager = new Villager(this, 280, 500, name, 50, 10, "images/Villager.png", 100);
          } else if (key != CODED){
              userInput += key;
          }
      }
  }
  
  public void draw() {  
    if (stage == 0){
        background(menu_image);
        fill(0);
        textSize(30);
        text("Click Enter to start", 180, 500);
        textSize(40);
        text("Nian The Monster", 150, 70);
        textSize(30);
        text("Enter Name: ", 180, 460);
        text(userInput, 340, 460);
//        if (keyCode == ENTER){
//            stage = 1;
//        }
    } else if (stage == 1){
        background(Scene1_Back);
        //nian.draw();
        villager.draw();
        Soy.draw();
        
        if (showInfo){
            textSize(15);
            nian.displayInfo(this);
            
        }
    }
   
    if (keyPressed) {
        if (keyCode == LEFT) {
          villager.move(-5, 0);
        } else if (keyCode == RIGHT) {
          villager.move(5, 0);
        } else if (keyCode == UP) {
          villager.move(0, -5);
        } else if (keyCode == DOWN) {
          villager.move(0, 5);
        }
    }
  }
  
  public void mousePressed(){
      if (villager.isClicked(mouseX, mouseY)){
          showInfo = !showInfo;
      } else {
          showInfo = false;
      }
  }
}//end class


