

public class Fraction{
    //variables, instead of int i used long 
    private long numerator;
    private long denominator; 

    //task 1
    public Fraction(long a, long b){
        // Assign the fields
        // Call your reduce
        if(a==0 && b == 0){
            numerator = 0;
            denominator = 0;
            return;
        }
        if(a == 0){
            numerator = 0;
            denominator = 1;
            return;
        }
        if(b == 0){
            numerator = a;
            denominator = 0;
            return;
        }
        if(b < 0){
            a = -a;
            b = -b;
        }
        //reduce fraction using gcd
        long gcd = gcd(Math.abs(a),Math.abs(b)); // fix
        numerator = a/gcd;
        denominator = b/gcd;

        
    }

    public Fraction(long a){
        numerator = a;
        denominator = 1;

    }
    

    public long getNumerator(){
        return numerator;
    }
    public long getDenominator(){
        return denominator;
    }

    @Override
    public String toString(){
        String returnString;


        if (numerator == 0 && denominator == 0){
            returnString = "NaN";
        }

        else if ( (denominator == 0) && (numerator > 0) ) {
            returnString = "Infinity";
        }

        else if ( (denominator == 0) && (numerator < 0) ) {
            returnString = "-Infinity";
        }

        else if (denominator == 1 ) {
            returnString = numerator + "";
        }

        // What if they are both negative?

        else {
            returnString = numerator + "/" + denominator;
        }

        return returnString;
    }
    //==============================================================
    //task 3

    public Fraction add(Fraction f){
        return new Fraction(this.numerator*f.denominator + f.numerator*this.denominator, this.denominator*f.denominator);

    }
    public Fraction subtract(Fraction f){
        return new Fraction(this.numerator*f.denominator - f.numerator*this.denominator, this.denominator*f.denominator);

    }
    public Fraction multiply(Fraction f){
        return new Fraction(this.numerator*f.numerator, this.denominator*f.denominator);

    }
    public Fraction divide(Fraction f){
        return new Fraction(this.numerator*f.denominator, this.denominator*f.numerator);

    }
    public Fraction negate(){
        if(numerator == 0 && denominator == 0)  // fix
            return new Fraction (0,0);
        return new Fraction(-this.numerator, this.denominator);
    }
    public Fraction pow(int n){
        if (n == 0){
            return new Fraction(1);
        }
      long numer = numerator;
        long denom = denominator;

        if (n < 0){
            long temp = numer;
            numer = denom;
            denom = temp;
            n = -n;


        }
        long newDenom = 1;
        long newNumer = 1;

        for (int i = 0; i < n; i++){
            newNumer *= numer;
            newDenom *= denom;
        }
        return new Fraction (newNumer, newDenom);





    }









    
    //==================================================
    private long gcd (long a, long b){
        // Make sure of which is bigger, etc  Check this alg.
        if(a < 0) a = -a;
        if(b < 0) b = -b;
        while (b != 0){
            long red = a % b;
            a = b;
            b = red;
        }
        if(a == 0)
            return 1;
        return a;
    }

}