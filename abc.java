package Java;
/**
    <<public>>    : is a access modifier & can be access out of the class. 
    <<Static>>    : Class does not need to create an object to access the static method.
    <<void>>      : Method will not return any value. 
    <<main>>      : is the name of main method
    <<String>>    : is a predefined class
    <<args[]>>    : It's a variable of type array.
    <<String args[]>> : called as command line argument
     */

//<<System>> : is a predefined class in java.lang package
//<<out>> : is a static variable defined in class "System"
//<<print>> is the function of "System" class


     class abc
{
   
    public static void main(String args[]) 

{
    System.out.println ("1st Program");
    
    int a=7;
    int b=18;

    //b +=a; //b=b+a so b = 2+4 = 6
    //int b1 = ++a;
    System.out.println("Value of a is " + a );
    System.out.println("Value of b is " + b );
   // System.out.println("Value of b1 is " + b1 );
    System.out.println("Value of a is " + a );
    System.out.println("b%a =" + b%a);
    System.out.println("b%a =" + a%b);
    //System.out.println("b%a =" + a^b);



/**In this loop, result *= base is equivalent to result = result * base. 
  It means that result is multiplied by base, and the result is stored back in result. 
  This operation is repeated for each iteration of the loop, effectively calculating 
 2^8*/
int base = 2;
int exponent = 8;
int result = 1;

for (int i = 0; i < exponent; i++) {
    result *= base;
}

System.out.println(result);

boolean x = true;
boolean y = false;

boolean result1 = x | y; // Logical OR operation

System.out.println(result1); // Output: true


}
}