import java.util.Scanner;

public class RecursionQ5 {
    public static String reverseit(String s){
        if(s.length() == 0){
            return"";
        
        }
        return reverseit(s.substring(1)) + s.charAt(0);




    }
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     System.out.print("Enter a word");

     String s = input.nextLine();

     System.out.println("Your word reversed: " + reverseit(s));

    }

    
}
