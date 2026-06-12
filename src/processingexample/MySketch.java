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
import java.io.PrintWriter;
import java.io.FileWriter;

public class MySketch extends PApplet {
    private Nian nian;
    private Villager villager;
    public int stage = 0;
    private boolean showInfo = false;
    public static int Dialogue_Counter = 0;
    public static String userInput = " ";
    public boolean villager_defeat = false;
    //Images
    PImage menu_image;
    PImage Scene1_Back;
    PImage Storage_Room_Back;
    PImage Middle_Town;
    PImage Defeat_Villager;
    PImage Destroy_Back;
    PImage Normal_Villager;
    PImage Villager_Flipped;
    PImage Jungle;
    PImage Attacked_Village;
    PImage Attacked_Village2;
    PImage Pre_Attack_Village;
    PImage Jaguar_right;
    PImage Jaguar_left;
    PImage Nian_Flipped;
    PImage nian_normal;
    PImage Village2;
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
    private Jaguar Jaguar;
    private Jaguar Jaguar1;
    private Jaguar Jaguar2;
    private Jaguar Jaguar3;
    private Jaguar Jaguar4;

    String[][] dialogue = new String[7][2];

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
    Villager_Flipped = loadImage("images/Villager_Flipped.png");
    Jungle = loadImage("images/Jungle.png");
    Attacked_Village = loadImage("images/Attacked_Village.png");
    Attacked_Village2 = loadImage("images/Attacked_Village2.jpeg");
    Pre_Attack_Village = loadImage("images/Pre-Attack_Village.png");
    Nian_Flipped = loadImage("images/Nian_Flip.png");
    nian_normal = loadImage("images/Nian.png");
    Village2 = loadImage("images/Village2.png");
    
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
    
    Jaguar_right = loadImage("images/Jaguar.png");
    Jaguar_left = loadImage("images/Jaguar_Flipped.png");
    
    Jaguar  = new Jaguar(this, -5, 75,  Jaguar_left, Jaguar_right, 3, false);
    Jaguar1 = new Jaguar(this, 600, 110, Jaguar_left, Jaguar_right, 2, true);
    Jaguar2 = new Jaguar(this, -5, 200, Jaguar_left, Jaguar_right, 6, false);
    Jaguar3 = new Jaguar(this, 600, 290, Jaguar_left, Jaguar_right, 5, true);
    Jaguar4 = new Jaguar(this, -5, 380, Jaguar_left, Jaguar_right, 4, false);
    
    nian = new Nian(this, 20, 30, "Nian", 10000, 10, "images/Nian.png", 10);
    Old_man = new Old_Man(this, 0, 300, "Wise Man", 1000, 5, "images/Old_Man.png", 10);
  }
  
  public void keyPressed(){
    if (stage == 0){
        if (keyCode == ENTER){
            stage = 1;
            String name = userInput;
            villager = new Villager(this, 280, 500, name, 2000, 10, "images/Villager.png", 100);
            dialogue[0] = new String[]{"Old Man: ", "I know how to defeat the Nian!"};
            dialogue[1] = new String[]{villager.name + ": ", "How?"};
            dialogue[2] = new String[]{"Old Man: ", "I heard that loud sounds and bright red colours scare it."};
            dialogue[3] = new String[]{villager.name + ": ", "Really?"};
            dialogue[4] = new String[]{"Old Man: ", "Yes!"};
            dialogue[5] = new String[]{villager.name + ": ", "But how?"};
            dialogue[6] = new String[]{"Old Man: ", "Use red paint, fire crackers and red lanterns. "
                    + "You can find some in the nearby village across the forest. Hurry!"};
        } else if (key != CODED){
            userInput += key;
        }
    } else if (stage == 1 && keyCode == ENTER){
        stage = 2;
    } else if (stage == 2 && keyCode == ENTER){
        stage = 3;
    } else if (stage == 3 && keyCode == ENTER){
        stage = 4;
    } else if (stage == 10 && keyCode == ENTER){
        stage = 11;
    } else if (stage == 11 && keyCode == ENTER){
        stage = 12;
    } else if (stage == 12 && Dialogue_Counter == 0 && keyCode == ENTER){
        Dialogue_Counter++;
    } else if (stage == 12 && Dialogue_Counter == 1 && keyCode == ENTER){
        Dialogue_Counter++;
    } else if (stage == 12 && Dialogue_Counter == 2 && keyCode == ENTER){
        Dialogue_Counter++;
    }  else if (stage == 12 && Dialogue_Counter == 3 && keyCode == ENTER){
        Dialogue_Counter++;
    } else if (stage == 12 && Dialogue_Counter == 4 && keyCode == ENTER){
        Dialogue_Counter++;
    } else if (stage == 12 && Dialogue_Counter == 5 && keyCode == ENTER){
        Dialogue_Counter++;
    } else if (stage == 12 && Dialogue_Counter == 6 && keyCode == ENTER){
        stage = 13;
        Dialogue_Counter = 0;
    } else if (stage == 13 && keyCode == ENTER){
        stage = 14;
        villager.x = 270;
        villager.y = 500;
        Arrow.x = 250;
        Arrow.y = 40;
    }
  }
  
  public void Record() {
    try {
        PrintWriter output = new PrintWriter(new FileWriter("Results.txt", true));
        output.println("MC Name:" + userInput + ".  Stage reached: " + stage);
        output.close();
    } catch (IOException e) {
        System.err.println("Error: " + e);
    }
    }
  
  public void exit() {
    Record();
    super.exit();
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
        background(Attacked_Village);
        fill(255, 255, 255);
        textSize(30);
        text("Click Enter to continue", 150, 50);
        
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
                text(output, 60, 500, 500, 300);
            }
            count++;
        }
        //Close file
        fileInput.close();
        //Error message if exception caught
        } catch ( IOException ioException ) {
            System.err.println( "Java Exception: " + ioException);
        } 
    } else if (stage == 2){
        background(Attacked_Village2);
        fill(255, 255, 255);
        textSize(30);
        text("Click Enter to continue", 150, 50);
        
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
                text(output, 60, 500, 500, 300);
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
        background(Pre_Attack_Village);
        textSize(30);
        text("Click Enter to continue", 150, 50);
        
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
                text(output, 110, 500, 400, 300);
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
        if (showInfo){
            textSize(15);
            fill(255, 255, 255);
            villager.displayInfo(this);
        }
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
        if (showInfo){
            textSize(15);
            fill(255, 255, 255);
            villager.displayInfo(this);
        }
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
        if (showInfo){
            textSize(15);
            fill(255, 255, 255);
            villager.displayInfo(this);
        }
        if (nian.x < villager.x) {
            NianX = chaseSpeed;
            nian.image = nian_normal;
        } else if (nian.x > villager.x) {
            NianX = -chaseSpeed;
            nian.image = Nian_Flipped;
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
        if (villager.health <= 450){
            villager_defeat = true;
            villager.image = Defeat_Villager;
            villager.move(0, 0);
            nian.image = nian_normal;
            nian.move(0, 5);
        }
        if (nian.y > 700){
            stage = 9;
            nian.y = 170;
            nian.x = 0;
            villager_defeat = false;
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
        textSize(30);
        text("Click Enter to continue", 150, 490);
    } else if (stage == 11){
        background(menu_image);
        fill(0);
        int count = 0;
        //Try-catch block to catch ioException error
        try {
        //Use scanner to read input from file
        Scanner fileInput = new Scanner( new File("Dialogue.txt") );
        //while loop so that loop will occur if there is another line to read
        while (fileInput.hasNext()){
            String output = fileInput.nextLine();
            if (count == 3){
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
        textSize(30);
        text("Click Enter to continue", 150, 490);
        villager.x = 200;
            villager.y = 300;
            Old_man.x = 0;
            Old_man.y = 300;
    } else if (stage == 12){
        background(Middle_Town);
        villager.draw();
        Old_man.draw();
        Old_man.move(2, 0);
        textSize(30);
        text("Click Enter to continue", 150, 50);
        if (showInfo){
            textSize(15);
            fill(255, 255, 255);
            villager.displayInfo(this);
        }
        if (Old_man.x >= 170){
            Old_man.x = 170;
            Old_man.y = 300;
            villager.image = Villager_Flipped;;
            if (Dialogue_Counter == 0){
                fill(255, 255, 255);
                textSize(30);
                text(dialogue[0][0] + dialogue[0][1], 50, 500, 500, 300);
            } else if (Dialogue_Counter == 1){
                text(dialogue[1][0] + dialogue[1][1], 50, 500, 500, 300);
            } else if (Dialogue_Counter == 2){
                text(dialogue[2][0] + dialogue[2][1], 50, 500, 500, 300);
            } else if (Dialogue_Counter == 3){
                text(dialogue[3][0] + dialogue[3][1], 50, 500, 500, 300);
            }  else if (Dialogue_Counter == 4){
                text(dialogue[4][0] + dialogue[4][1], 50, 500, 500, 300);
            } else if (Dialogue_Counter == 5){
                text(dialogue[5][0] + dialogue[5][1], 50, 500, 500, 300);
            } else if (Dialogue_Counter == 6){
                text(dialogue[6][0] + dialogue[6][1], 50, 500, 500, 300);
            }
        }   
    } else if (stage == 13){
        background(Jungle);
        textSize(30);
        text("Click Enter to continue", 150, 50);
        int count = 0;
        //Try-catch block to catch ioException error
        try {
        //Use scanner to read input from file
        Scanner fileInput = new Scanner( new File("Dialogue.txt") );
        //while loop so that loop will occur if there is another line to read
        while (fileInput.hasNext()){
            String output = fileInput.nextLine();
            if (count == 4){
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
    } else if (stage == 14){
        background(Jungle);
        villager.draw();
        Arrow.draw();
        
        Person[] Jaguars = {Jaguar, Jaguar1, Jaguar2, Jaguar3, Jaguar4};
        for (Person j : Jaguars){
            j.draw();
            j.move(0, 0);
        }
        
        if (villager.isCollidingWith(Jaguar) || villager.isCollidingWith(Jaguar1) || villager.isCollidingWith(Jaguar2)
        || villager.isCollidingWith(Jaguar3) || villager.isCollidingWith(Jaguar4)){
            villager.x = 270;
            villager.y = 500;
        }
        
        if (villager.isCollidingWith(Arrow)){
            stage = 15;
            villager.x = 270;
            villager.y = 500;
            Arrow.x = 250;
            Arrow.y = 240;
        }
        
        if (showInfo){
            textSize(15);
            fill(255, 255, 255);
            villager.displayInfo(this);
        }
    } else if (stage == 15){
        background(Village2);
        villager.draw();
        Arrow.draw();
    }

    if (keyPressed && villager_defeat == false) {
        if (keyCode == LEFT) {
          villager.move(-5, 0);
          villager.image = Villager_Flipped;
        } else if (keyCode == RIGHT) {
          villager.move(5, 0);
          villager.image = Normal_Villager;
        } else if (keyCode == UP) {
          villager.move(0, -5);
        } else if (keyCode == DOWN) {
          villager.move(0, 5);
        }
    }
  }
  
  public void mousePressed(){
      if (villager.isClicked(mouseX, mouseY) && (stage >= 0)){
          showInfo = !showInfo;
      } else {
          showInfo = false;
      }
  }
}//end class


