package multiply3;

import java.util.*;

public class Multiply3Test {
    
    static int numbers1;
    static int numbers2;
    static int answer;
    static int input;
    static int guess;
    static String response; 
    static Random randomNumber = new Random();
       
     public static void main(String[] args) {
        
         quiz();
    }
     
     public static void quiz(){
         createQuestion();
         checkResponse();
         
         
     }
     
     public static void createQuestion(){
         Scanner input = new Scanner(System.in);
         numbers1 = randomNumber.nextInt(10);// genrate random numbers between 0-9
         numbers2 = randomNumber.nextInt(10);// genrate random numbers between 0-9
         answer = numbers1 * numbers2;//calculates answer
         
         System.out.println("How much is "+numbers1+" times "
                +numbers2+"?");
         
         guess = input.nextInt();
         
     }
     
     public static String createResponse(boolean correct){
      
      if (correct) { 
      
        switch (randomNumber.nextInt(4)+1) {
             case 1: return response = ("Very good!");
                               
             case 2: return response = ("Excellent!");
                 
             case 3: return response = ("Nice work!");
                 
             case 4: return response = ("Keep up the good work!");
                
          }
    }       
   
              switch (randomNumber.nextInt(4)+1){
             case 1: return response = ("No. Please try again.");
                 
             case 2: return response = ("Wrong. Try once more.");
                 
             case 3: return response = ("Don't give up!");
                 
             case 4: return response = (" No. Keep trying.");
             
         }
     
        return response;
 }
     
     public static void checkResponse(){
         
         if (answer == guess){
             
            System.out.println(createResponse(true));
             
         }else{
             
             System.out.println(createResponse(false));
         }
         
     }
     
     public void printQuestionResult(){
         
     }
}

