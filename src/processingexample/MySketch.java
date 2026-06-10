/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package processingexample;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import processing.core.PApplet;
import processing.core.PImage;

public class MySketch extends PApplet {
    private Nian nian;
    private Villager villager;
    public int stage = 0;
    private boolean showInfo = false;
    String userInput = " ";
    //Images
    PImage menu_image;
    PImage Scene1_Back;
    PImage Storage_Room_Back;
    PImage Middle_Town;
    PImage Defeat_Villager;
    PImage Destroy_Back;
    PImage CutScene_Back;
    PImage Normal_Villager;
    private Image_Class Right_Arrow;
    private Image_Class Soy;
    private Image_Class Cabbage;
    private Image_Class Pepper;
    private Image_Class Hay;
    private Image_Class Bamboo;
    private Image_Class Wheat;
    private Image_Class Arrow;
    private Image_Class Arrow_Wheat;
    private Image_Class Arrow_Bamboo;
    private Image_Class Arrow_Pepper;
    private Image_Class Arrow_Hay;
    private Image_Class Arrow_Soy;
    private Image_Class Arrow_Cabbage;
    private Old_Man Old_man;
    
 
  public void settings() {
    size(600, 600);
  }

  public void setup() {
    background(255);
    textSize(20);
    //Images
    Storage_Room_Back = loadImage("images/Storage_Room_Back.png");
    menu_image = loadImage("images/Menu_Back.png");
    Scene1_Back = loadImage("images/Scene1_Back.png");
    Arrow = new Image_Class(this, 440, 170, "images/Arrow.png");
    Middle_Town = loadImage("images/Middle_Town.png");
    Defeat_Villager = loadImage("images/Defeat_Villager.png");
    Normal_Villager = loadImage("images/Villager.png");
    Destroy_Back = loadImage("images/Destroy_Back.png");
    Right_Arrow = new Image_Class(this, 460, 530, "images/Right_Arrow.png");
    CutScene_Back = loadImage("images/CutScene_Back.jpg");
    
    
    Arrow_Wheat = new Image_Class(this, 110, 275, "images/Arrow.png");
    Arrow_Bamboo = new Image_Class(this, 450, 380, "images/Arrow.png");
    Arrow_Pepper = new Image_Class(this, 455, 170, "images/Arrow.png");
    Arrow_Hay = new Image_Class(this, 110, 80, "images/Arrow.png");
    Arrow_Soy = new Image_Class(this, 380, 135, "images/Arrow.png");
    Arrow_Cabbage = new Image_Class(this, 275, 150, "images/Arrow.png");
    
    Soy = new Image_Class(this, 190, 420, "images/Soy.png");
    Cabbage = new Image_Class(this, 170, 300, "images/Cabbage.png");
    Pepper = new Image_Class(this, 250, 300, "images/Pepper.png");
    Hay = new Image_Class(this, 100, 400, "images/Hay.png");
    Bamboo = new Image_Class(this, 200, 470, "images/Bamboo.png");
    Wheat = new Image_Class(this, 315, 350, "images/Wheat.png");
    
    nian = new Nian(this, 20, 30, "Nian", 10000, 10, "images/Nian.png", 10);
    Old_man = new Old_Man(this, 0, 300, "Wise Man", 1000, 5, "images/Old_Man.png", 10);
  }
  
  public void keyPressed(){
    if (stage == 0){
        if (keyCode == ENTER){
            stage = 1;
            String name = userInput;
            villager = new Villager(this, 280, 500, name, 2000, 10, "images/Villager.png", 100);
        } else if (key != CODED){
            userInput += key;
        }
    } else if (stage == 1 && keyCode == ENTER){
        stage = 2;
    } else if (stage == 2 && keyCode == ENTER){
        stage = 3;
    } else if (stage == 3 && keyCode == ENTER){
        stage = 4;
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
        
    } else if (stage == 1){
        background(menu_image);
        textSize(30);
        text("Click Enter to continue", 150, 490);
        
        int count = 0;
        //Try-catch block to catch ioException error
        try {
        //Use scanner to read input from file
        Scanner fileInput = new Scanner( new File("Dialogue.txt") );
        //while loop so that loop will occur if there is another line to read
        while (fileInput.hasNext()){
            String output = fileInput.nextLine();
            if (count == 0){
                textSize(30);
                text(output, 110, 200, 400, 300);
            }
            count++;
        }
        //Close file
        fileInput.close();
        //Error message if exception caught
        } catch ( IOException ioException ) {
            System.err.println( "Java Exception: " + ioException);
        } 
    }else if (stage == 2){
        background(menu_image);
        textSize(30);
        text("Click Enter to continue", 150, 490);
        
        int count = 0;
        //Try-catch block to catch ioException error
        try {
        //Use scanner to read input from file
        Scanner fileInput = new Scanner( new File("Dialogue.txt") );
        //while loop so that loop will occur if there is another line to read
        while (fileInput.hasNext()){
            String output = fileInput.nextLine();
            if (count == 1){
                textSize(30);
                text(output, 110, 200, 400, 300);
            }
            count++;
        }
        //Close file
        fileInput.close();
        //Error message if exception caught
        } catch ( IOException ioException ) {
            System.err.println( "Java Exception: " + ioException);
        }
    } else if (stage == 3){
        background(menu_image);
        textSize(30);
        text("Click Enter to continue", 150, 490);
        
        int count = 0;
        //Try-catch block to catch ioException error
        try {
        //Use scanner to read input from file
        Scanner fileInput = new Scanner( new File("Dialogue.txt") );
        //while loop so that loop will occur if there is another line to read
        while (fileInput.hasNext()){
            String output = fileInput.nextLine();
            if (count == 2){
                textSize(30);
                text(output, 110, 200, 400, 300);
            }
            count++;
        }
        //Close file
        fileInput.close();
        //Error message if exception caught
        } catch ( IOException ioException ) {
            System.err.println( "Java Exception: " + ioException);
        }

    } else if (stage == 4){
        background(Scene1_Back);
        villager.draw();
        Soy.draw();
        Cabbage.draw();
        Pepper.draw();
        Hay.draw();
        Bamboo.draw();
        Wheat.draw();
        
        if (showInfo){
            textSize(15);
            fill(255, 255, 255);
            villager.displayInfo(this);
        }
        
        if (villager.isCollidingWith(Soy)){
            Soy.move(700, 700);
        } else if (villager.isCollidingWith(Wheat)){
            Wheat.move(700, 700);
        } else if (villager.isCollidingWith(Cabbage)){
            Cabbage.move(700, 700);
        } else if (villager.isCollidingWith(Pepper)){
            Pepper.move(700, 700);
        } else if (villager.isCollidingWith(Hay)){
            Hay.move(700, 700);
        } else if (villager.isCollidingWith(Bamboo)){
            Bamboo.move(700, 700);
        }
        
        if ((Soy.x == 890 && Soy.y == 1120) && (Wheat.x == 1015 && Wheat.y == 1050) && (Cabbage.x == 870 && Cabbage.y == 1000)
         && (Pepper.x == 950 && Pepper.y == 1000) && (Hay.x == 800 && Hay.y == 1100) && (Bamboo.x == 900 && Bamboo.y == 1170)){
            Arrow.draw();
            if (villager.isCollidingWith(Arrow)){
                villager.x = 270;
                villager.y = 500;
                stage = 5;
            }
        }
    } else if (stage == 5){
        background(Storage_Room_Back);
        villager.draw();
        Arrow_Cabbage.draw();
        Arrow_Pepper.draw();
        Arrow_Soy.draw();
        Arrow_Bamboo.draw();
        Arrow_Wheat.draw();
        Arrow_Hay.draw();
        Hay.draw();
        Cabbage.draw();
        Pepper.draw();
        Soy.draw();
        Bamboo.draw();
        Wheat.draw();
        if (villager.isCollidingWith(Arrow_Hay)){
            Hay.x = 140;
            Hay.y = 145;
            Arrow_Hay.x = 1000;
            Arrow_Hay.y = 1000;
        } else if (villager.isCollidingWith(Arrow_Cabbage)){
            Cabbage.x = 305;
            Cabbage.y = 300;
            Arrow_Cabbage.x = 1000;
            Arrow_Cabbage.y = 1000;
        } else if (villager.isCollidingWith(Arrow_Pepper)){
            Pepper.x = 490;
            Pepper.y = 265;
            Arrow_Pepper.x = 1000;
            Arrow_Pepper.y = 1000;
        } else if (villager.isCollidingWith(Arrow_Soy)){
            Soy.x = 410;
            Soy.y = 220;
            Arrow_Soy.x = 1000;
            Arrow_Soy.y = 1000;
        } else if (villager.isCollidingWith(Arrow_Bamboo)){
            Bamboo.x = 490;
            Bamboo.y = 500;
            Arrow_Bamboo.x = 1000;
            Arrow_Bamboo.y = 1000;
        } else if (villager.isCollidingWith(Arrow_Wheat)){
            Wheat.x = 125;
            Wheat.y = 360;
            Arrow_Wheat.x = 1000;
            Arrow_Wheat.y = 1000;
        }
        
        if ((Soy.x == 410 && Soy.y == 220) && (Wheat.x == 125 && Wheat.y == 360) && (Cabbage.x == 305 && Cabbage.y == 300)
         && (Pepper.x == 490 && Pepper.y == 265) && (Hay.x == 140 && Hay.y == 145) && (Bamboo.x == 490 && Bamboo.y == 500)){
            Arrow.x = 260;
            Arrow.y = 500;
            Arrow.draw();
            if (villager.isCollidingWith(Arrow)){
                villager.x = 440;
                villager.y = 170;
                stage = 6;
            }
        }
        
    } else if (stage == 6){
        background(Scene1_Back);
        villager.draw();
        Arrow.x = 20;
        Arrow.y = 20;
        Arrow.draw();
        if (villager.isCollidingWith(Arrow)){
                villager.x = 270;
                villager.y = 500;
                nian.x = 230;
                nian.y = 700;
                stage = 7;
            }
        
    } else if (stage == 7){
        background(Middle_Town);
        nian.draw();
        nian.move(0, -3);
        if (nian.x == 230 && nian.y <= 100){
            nian.x = 230;
            nian.y = 100;
            villager.x = 270;
            villager.y = 500;
            stage = 8;
        }
    } else if (stage == 8){
        background(Middle_Town);
        nian.draw();
        villager.draw();
        int chaseSpeed = 2;
        int NianX = 3;
        int NianY = 3;
        fill(255, 255, 255);
        textSize(50);
        text("Villager HP: " + villager.health, 100, 50);
    
        if (nian.x < villager.x) {
            NianX = chaseSpeed;
        } else if (nian.x > villager.x) {
            NianX = -chaseSpeed;
        }

        if (nian.y < villager.y) {
            NianY = chaseSpeed;
        } else if (nian.y > villager.y) {
            NianY = -chaseSpeed;
        }
        
        nian.move(NianX, NianY);
        
        if (villager.isCollidingWith(nian)){
            villager.health -= 10;
        } 
        
        if (villager.health <= 0){
            villager.image = Defeat_Villager;
            chaseSpeed = 0;
            nian.move(0, 5);
        }
        
        if (nian.y > 700){
            stage = 9;
            nian.y = 170;
            nian.x = 0;
        }
    } else if (stage == 9){
        background(Scene1_Back);
        nian.draw();
        nian.move(5, 0);
        if (nian.x >= 440){
            stage = 10;
            
        }
    } else if (stage == 10){
        background(Destroy_Back);
        Right_Arrow.draw();
        if (Right_Arrow.isClicked(mouseX, mouseY)){
            stage = 11;
            Right_Arrow.y = 450;
        }
    } else if (stage == 11){
        background(CutScene_Back);
        fill(255, 255, 255);
        textSize(25);
        text("Once again, the Nian have terrorized the town and \nstolen the crops. It seemed all hope was loss until...", 25, 250);
        Right_Arrow.draw();
        if (Right_Arrow.isClicked(mouseX, mouseY)){
            stage = 12;
            villager.x = 200;
            villager.y = 300;
            //Old_man.x = 0;
            //Old_man.y = 300;
        }
    } else if (stage == 12){
        background(Middle_Town);
        villager.draw();
        Old_man.draw();
        //System.out.println(Old_man.x + ", " + Old_man.y);
        
        Old_man.move(2, 0);
        //Old_man.x >= 200
        if (Old_man.isCollidingWith(villager)){
            System.out.println("Yes");
            Old_man.move(0, 0);
            villager.image = Normal_Villager;
            fill(255, 255, 255);
            textSize(30);
            text("Wise Man: I know how to defeat the Nian!", 50, 500);
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


