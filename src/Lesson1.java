public class Lesson1
{
    //TODO: Do not modify
    public  static void main(String... args)
    {
        Numbers();
        System.out.println("Task #1: Averaging numbers.");
        AverageNumbers();
        System.out.println("Task #2: Averaging more numbers.");
        AverageMoreNumbers();
    }

    public static void Numbers()
    {
        //Java is a "typed" language.
        
        //This means that values must be associated with a certain
        //type of data when declared.
        
        //The most basic types are called "primitives", and express
        //simple arithmetic items and concepts.
        
        //For example, let's declare a number.
        int my_number = 0;
        
        //As you can see, the above statement is composed of many parts
            // The type: "int"
            // The name of the value being declared: "my_number"
            // An assignment to the value: "= 0"
            // A semicolon
        
        //All code statements must end in a semicolon in java.
        
        //Variables may be re-assigned to after being defined.
        my_number = 1;
        
        //Variables can be referenced by name in order to extract their value.
        int copy_of_my_number = my_number;
        
        //The assignment to the value during declaration may be omitted provided 
        //that the value is assigned to before use.
        
        int my_other_number;
        /*...some code here...*/
        my_other_number = 1;
        
        //The 'int' type is a specific subtype of numbers.
        //It represents an integer, or a number that has no decimal places.
        
        //The type for values that *do* have decimal places is called 'double'.
        double my_decimal = 0.5;
        
        //All numerical types support addition, subtraction, multiplication, 
        //division, and modulus.
        int a = 15;
        int b = 10;
        int c;
        
        c = a + b; //addition
        c = a - b; //subtraction
        c = a * b; //multiplication
        c = a / b; //division
        c = a % b; //modulus; special operation to be discussed later
        
        //Ignore this: to avoid a compiler error.
        System.out.println(c);
        
        //These operations follow the order of operations in standard math.
        c = a * a + b * b; //add a squared to b squared
        
        //Java also allows for parenthesis to change this order.
        c = a * (a + b) * b; //multiply a with a + b and then with b
        
        //Side note: division behaves differently when there is a 'double'
        //involved than when there is not.
        
        //Division that does not involve decimal places is known as 'integer division'.
        //This special form of division rounds to the nearest integer.
        
        //For example, d is set to 0 below and e is set to 0.5
        int    d = 1 / 2;
        double e = 1 / 2.0;
        
        //You cannot declare two variables of the same name in the same scope
        //(scope will be discussed later)
        
        int something = 0;
        //int something = 1;
        //ERROR! Variable 'something' already defined in the scope.
    }

    /**
     * Task #1:
     * Write code to take the average of two numbers, 
     * provided in the double variables 'input1' and 'input2',
     * and store it in the variable 'result'.
     */
    public static void AverageNumbers() 
    {
        //TODO: DO NOT MODIFY
        double result = 0;
        
        double input1 = 10;
        double input2 = 20;
        
        /*put your code here to store the average of input 1 and 2 into result*/

        //TODO: DO NOT MODIFY
        System.out.println(result);
    }
    
    /**
     * Task #2:
     * Perform Task #1 for more than two inputs.
     */
    public static void AverageMoreNumbers()
    {
        //TODO: DO NOT MODIFY
        double result = 0;
    
        /*declare your inputs here*/
    
        /*put your code here to store the average of input 1 and 2 into result*/
        
        //TODO: DO NOT MODIFY
        System.out.println(result);
    }
}