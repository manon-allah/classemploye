package classemployee;
import java.util.Scanner;
public class Classemployee {
    static Scanner input = new Scanner (System.in) ;
    public static void main(String[] args) {
    Employee e1 ;
        int id ;
        String name ;
        String depart ;
        double salary ;
        double bonus ;
        boolean resident ;
    System.out.println("Enter the id of employee");
    id = input.nextInt();
    System.out.println("Enter the name of employee");
    name = input.next();
    System.out.println("Enter the depart of employee");
    depart = input.next();
    System.out.println("Enter the salary of employee");
    salary = input.nextDouble();
    System.out.println("Enter the bonus of employee");
    bonus = input.nextDouble();
    System.out.println("Enter the resident of employee");
    resident = input.hasNextBoolean();    
    e1 = new Employee();
     e1.print_emp_data();
     System.out.println();
    e1 = new Employee(id , name);
     e1.print_emp_data();
     System.out.println();
    e1 = new Employee(id , name , resident);
     e1.print_emp_data();
     System.out.println();
    e1 = new Employee(id , name , depart , salary , bonus , resident);
     e1.print_emp_data();
    }
}
