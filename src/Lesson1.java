import java.util.Random;

public class Lesson1
{
    //TODO: Do not modify
    public  static void main(String... args)
    {}

//<<<<<<< HEAD no


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


        //TODO: MOVE TO
        //To check if string contain the same text in java, one must use
        //a special syntax used for non-primitives.

        //This syntax is as follows:
        // value1.equals(value2)

        //For example, the following will print "true"
        String wow = "wow";
        String wow2 = "wo" + "w";
        System.out.print(wow.equals("wo" + "w"));

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
    }
//>>>>>>> main
}