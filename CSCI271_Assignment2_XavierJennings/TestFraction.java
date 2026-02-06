public class TestFraction {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,3);
        Fraction f2 = new Fraction(3,4);
        Fraction f3 = new Fraction(10,4);
        Fraction f4 = new Fraction(11,3);
        Fraction f5 = new Fraction(7,7);
        Fraction f6 = new Fraction(6,1);
        Fraction f7 = new Fraction(0);
        Fraction f8 = new Fraction(6,0);//test infin
        Fraction f9 = new Fraction(-1,0);//test -infin
        Fraction f10 = new Fraction(0,0);//test nan
       
       

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);
        System.out.println("f5 = " + f5);
        System.out.println("f6 = " + f6);
        System.out.println("f7 = " + f7);
        System.out.println("f8 = " + f8);
        System.out.println("f9 = " + f9);
        System.out.println("f10 = " + f10);
        
        
        System.out.println(f1 + " + " + f2 + " = " + f1.add(f2));
        System.out.println(f3 + " + " + f4 + " = " + f3.add(f4));
        System.out.println(f5 + " + " + f6 + " = " + f5.add(f6));

        System.out.println(f1 + " - " + f2 + " = " + f1.subtract(f2));
        System.out.println(f3 + " - " + f4 + " = " + f3.subtract(f4));
        System.out.println(f5 + " - " + f6 + " = " + f5.subtract(f6));

        System.out.println(f1 + " * " + f2 + " = " + f1.multiply(f2));
        System.out.println(f3 + " * " + f4 + " = " + f3.multiply(f4));
        System.out.println(f5 + " * " + f6 + " = " + f5.multiply(f6));
        System.out.println(f7 + " * " + f8 + " = " + f7.multiply(f8));
        System.out.println(f9 + " * " + f10 + " = " + f9.multiply(f10));


        System.out.println(f1 + " / " + f2 + " = " + f1.divide(f2));
        System.out.println(f3 + " / " + f4 + " = " + f3.divide(f4));
        System.out.println(f5 + " / " + f6 + " = " + f5.divide(f6));
        System.out.println(f7 + " / " + f8 + " = " + f7.divide(f8));
        System.out.println(f9 + " / " + f10 + " = " + f9.divide(f10));
        
      
      



    }
}
