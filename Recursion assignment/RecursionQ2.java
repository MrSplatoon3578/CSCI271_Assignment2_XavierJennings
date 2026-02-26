import java.util.Scanner;

public class RecursionQ2 {
    public static int countchar(String s , char c){
        //Base case
        if(s.length() == 0){
            return 0;
        }

        if(s.charAt(0) == c){
            return 1 + countchar(s.substring(1), c);

         }else{
            return countchar(s.substring(1), c);
         }




    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Word:");

        String s = input.nextLine();

         System.out.print("Enter Letter:");

         char c = input.nextLine().charAt(0);

         int result = countchar(s,c);

        System.out.println("their are " + result + " Letters of " + c + " in the word " + s);



    }
    
}
