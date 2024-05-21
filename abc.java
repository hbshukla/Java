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
    
    int a=4;
    int b=2;

    b +=a; //b=b+a so b = 2+4 = 6
    int b1 = a++;
System.out.println("Value of b is " + b );
System.out.println("Value of b1 is " + b1 );

}

}