import java.util.Random;

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

//<<<<<<< HEAD


    public static void IfStatements() {

        //don't worry about this for now, this just allows us to generate a random number from 0 and 1 for x
        Random r = new Random();
        int x = r.nextInt(2);

        //if statements are used to evaluate IF a statement is true or false, such as "is x equal to 1", or "is y equal to (x - z)"
        //to create an if statement, type if() {} with your condition inside the parentheses and action inside of the brackets
        //an example of an if statement is

        if(x == 1) {
          System.out.println(x);
      }

        // notice how there are two equals signs, this is because
      //when using if statements you must use == when saying "equals to"

        x = r.nextInt(2);

        /* put your code here to print "X is equal to one" if x is equal to one */

        // else statements run their code if the if statement above it has a condition that is false */
        //an else statement looks like this

        if (x == 1) {
            //action
        }
        else {
            //action
        }

        //you can also add an if after else to create an else if statement

        if (x == 1) {
            //action
        }
        else if (x == 0) {
            //action
        }

        x = r.nextInt(3);

        /* put your code here to print whether x equals 0, 1, or 2 using if and else statements */

    }



//=======
    public static void Strings()
    {
        //Java also has a (mostly) built-in type for text, called "String"
        //"Strings" can be declared as any other variable.
        String myText;

        //Unlike numbers however, text must be enclosed in double-quote symbols
        //To increase readability, most Java editors will change the color of this
        //enclosed text.
        myText = "wow";

        //Text can be "concatenated" in java using the + operation.
        //This means that the resulting text is the first text and then the second.
        //  E.G.: "wo" + "w" = "wow"
        myText = myText + ", you're so cool!";

        //All other primitive data types can be turned into a string during concatenation
        myText = "2 + 2 = " + 4;

        //This includes concatenation with empty strings
        myText = "" + 100.0;



        //Simple java applications usually print to the "console",
        //a basic text interface from which the program is run.

        //To print to the console, one must type System.out.print(some_text)
        System.out.print("Hello!");



        //Java strings can only span one line.
        //In order to add new lines into your string, you add \n in between the lines.
        //This special sequence of characters is known as an "escape sequence"
        //There are various escape sequences in java, including:
            // "\n" - create a new-line
            // "\t" - create a tab
            // "\0" - create a "null" character (rare)
            // "\\" - create a \ character
            // "\"" - create a " character
        String superString = "Wow!\n\tThese \"newlines\" are handy!";

        //To get a section of an existing string, one can use .substring:
        String longStr = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String shortStr = longStr.substring(0, 10);
                        //gets the section from the first to 9th character
                        //(the first character is considered number "0"


        //TODO: MOVE TO
        //To check if string contain the same text in java, one must use
        //a special syntax used for non-primitives.

        //This syntax is as follows:
            // value1.equals(value2)
        
        //For example, the following will print "true"
        String wow = "wow";
        String wow2 = "wo" + "w";
        System.out.print(wow.equals("wo" + "w"));
    }
//>>>>>>> main
}