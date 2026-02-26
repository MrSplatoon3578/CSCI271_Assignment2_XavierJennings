import java.util.Scanner;



public class RecursionQ1 {
    public static int stringlength(String s){
        //Base case
        if(s.length() == 0){
            return 0;
        }
        return 1 + stringlength(s.substring(1));//fix

    }
    public static void main(String[]args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter");
            String s = input.nextLine();

            int length = stringlength(s);

            System.out.println("The length of this word is " + length +"letters");
        }




    }
   
    

}








