import java.util.Random;
import java.util.Scanner;
import javax.swing.*;  
class OptionPaneExample
 {  
public static void main(String args[])  
   {   
    Random Random_no= new Random();
    int rand=Random_no.nextInt(100);
    int turns=0;
    System.out.println("Enter your guessing number between 1 to 100, You will have only 10 turns!!!");  
    System.out.println("Best of luck!");

    int i=0;
    boolean win=false;
    while(win==false) 
   {
    int guess=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your guessing number:"));  
    System.out.println("Your guess number is "+guess);
    turns++;
    if(guess==rand) {
      win=true;
    }
    else if(i>8){
      System.out.println("You loose!! The right answer was: "+rand);
      return;
    }
    else if(guess<rand){
      i++;
      System.out.println("GO HIGHER!!! Turns left: "+(10-i));
      
      
      
    }
    else if(guess>rand) {
      i++;
      System.out.println("GO LOWER!!! Turns left: "+(10-i));
      
     }
    }    
    JOptionPane.showMessageDialog(null, "Congratulation!!!You had WIN!!");
    System.out.println("Number was "+rand);
    System.out.println("You used "+turns+" turns to guess the right number!!");
    System.out.println("Your score is "+((11-turns)*10)+" out of 100");
 
   }  
    
}
    
  