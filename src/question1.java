import uulib.*;
import java.util.*;
public class question1 {
    public static void main(String[] args){
        //Initialise scanner
        Scanner sc = new Scanner(System.in);

        //Initialise variables
        String initial;
        String surname;
        int age;
        String isEmployed;
        int salary;

        //Prompts user to input variables one by one
        System.out.println("Enter initial: ");
        initial = sc.nextLine();

        System.out.println("Enter surname: ");
        surname = sc.nextLine();

        System.out.println("Enter if employed: ");
        isEmployed = sc.nextLine();

        System.out.println("Enter age: ");
        age = sc.nextInt();

        System.out.println("Enter salary: ");
        salary = sc.nextInt();

        //Print out variables to console
        System.out.println(initial + " " + surname + " is " + age + " years old and is currently " + isEmployed +
                " and has a salary of £" + salary + " per year");
    }
}
