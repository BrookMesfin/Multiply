package multiply3;

import java.util.*;

public class Multiply3Test {
    
    static int answer;
    static int numbers1;
    static int numbers2;
    
     public static void main(String[] args) {
        
         quiz();
    }
     
     public static void quiz(){
         createQuestion();
         
     }
     
     public static void createQuestion(){
         Scanner input = new Scanner(System.in);
         Random multiplyNumber = new Random();
         numbers1 = multiplyNumber.nextInt(10);// genrate random numbers between 0-9
         numbers2 = multiplyNumber.nextInt(10);// genrate random numbers between 0-9
         answer = numbers1 * numbers2;//calculates answer
         
         System.out.println("How much is "+numbers1+" times "
                +numbers2+"?");
         
         input.nextInt();
         
     }
     
     public String createResponse(boolean answer){
         
       switch (answer) {
             case 1: return ("Very good!");
              
             case 2: return ("Excellent!");
             
             case 3:return ("Nice work!");
             
             case 4: return ("Keep up the good work!");
          }
         switch (answer){
             case 1: return ("No. Please try again.");
                 
             case 2: return ("Wrong. Try once more.");
                 
             case 3: return ("Don't give up!");
                 
             case 4: return (" No. Keep trying.");
         }
               
     }
     
     public void checkResponse(){
         
     }
     
     public void printQuestionResult(){
         
     }
}

