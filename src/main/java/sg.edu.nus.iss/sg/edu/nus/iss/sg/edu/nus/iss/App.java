package sg.edu.nus.iss;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App {
    /**
     * @param args
     * @param format
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Console con = System.console();
        String name = con.readLine("What is your name?");

        if (name.length() > 0) {
        

        // different ways to print the same content to console
        System.out.printf("\nNice to meet you, %s", name);

    } else

    {
        System.err.println("You have not told me your name");
    }
    Integer age = 80;System.out.printf("\n%s is %d years old",name,age);System.out.println(name+" is "+age+" years old");

    //slide 17
    String input = con.readLine("What is your hobby?");
    input = input.trim(); // "         swim      "  ----> "swim"

    if (input.equals("swim")) {
        System.out.println("The nearest swimming pool is Clementi");
    } else if (input.equals("jog")) {
        System.out.println("The nearest park is West Coast Park");
    } else if (input.equals("cycle")) {
    System.out.println("You could cycle along the PCN");
    } else { 
    System.out.println("Seems like you are a boring person without hobbies.");
    }

    switch () {
      case "swim":
        System.out.println("The largest swimming pool is Clementi");
        break;
      case "jog":
        System.out.println("The largest park is West Coast Park");
        break;
      case "cycle":    
        System.out.println("You could cycle along the PCN");
        break;
      default:
        System.out.println("Seems like you are a boring person without hobbies");
        break;  
    }
  }
}
