import java.util.*;

public class PracticeProblem2{
     public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       System.out.println("enter a digit from 0 to 9");
       int digit = scanner.nextInt();

       if(digit < 0 || digit > 9){
       System.out.println("Pls provide the no from 0 to 9");

       }

         else{
             String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
             System.out.println("The digit in word is : " + words[digit]);

       }

       scanner.close();

      }
  }
