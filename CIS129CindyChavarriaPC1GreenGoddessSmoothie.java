/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;

public class CIS129CindyChavarriaPC1GreenGoddessSmoothie {
  
  public static void main(String[] args) { 
    
    // I am creating a scanner.
Scanner in = new Scanner(System.in);

// Asking if you would like to make a Green Goddess Smoothie?
  System.out.println("Today we are making a Green Goddess Smoothie. Do you have a blender? Please answer either,Yes or No?");
  String makeASmoothieQuestion;
 {
    makeASmoothieQuestion=in.nextLine();
    if(makeASmoothieQuestion.equalsIgnoreCase("yes")){
      System.out.println("Wonderful, go get your blender.");}
      
  else{

         System.out.println("I suggest a vitamix, come back when you have one. Nonetheless, let us move on to the next question! :P");
          
       }}

   
// I am declaring the variables that I am going to use
int apple = 1;
int spinachHandfull = 1;
int kiwi = 1;
int banana = 1;
int grapesHandfull =1;
double coldWaterGlass=0.5;
double userNumberOfPeople;

Double expectedApple;
Double expectedSpinachHandfull;
Double expectedKiwi ;
Double expectedBanana ;
Double expectedGrapesHandfull ;
Double expectedColdWaterGlass;


// I am making a new scanner. I read on line that I did not need a new one but for some reason I felt that I did need a new one. 
{Scanner in2 = new Scanner(System.in);
  // I am asking how many people this will serve to make the smoothie. 
  System.out.println("Please enter the number of people whom you are serving today.");
userNumberOfPeople=in2.nextDouble();

expectedApple= userNumberOfPeople*apple;
expectedSpinachHandfull= userNumberOfPeople*spinachHandfull;
expectedKiwi= userNumberOfPeople*kiwi;
expectedBanana= userNumberOfPeople*banana;
expectedGrapesHandfull= userNumberOfPeople*grapesHandfull;
expectedColdWaterGlass=userNumberOfPeople*coldWaterGlass;

    //Display Information and what to do with the fruit. 
{{System.out.println(" In order to make the green goddess smoothie for " +userNumberOfPeople+" people"+" you will need "+expectedApple+ " apples, "+expectedSpinachHandfull+" handfuls of spinach, "+expectedKiwi+" Kiwis, "
                       +expectedBanana+" bananas, "+ expectedGrapesHandfull+"  handfulls of grapes, and "+expectedColdWaterGlass+ " glasses of cold water.");
  
  System.out.println("Throw the fruit in the blender and blend untill silky smooth");
  
    System.out.println("Pour liquird contients that came from the blender into "+ userNumberOfPeople+" drinking glasses and enjoy :)");
 
  // A note for the instructor: I would really appreciate feedback in how I can improve for the next assignment. This project took me a bit to do; however, I feel that
 // it is simple but I was not sure if you were looking for simple and everything was met or if you where looking for something complicated. 
}
}
    
}}}

  

