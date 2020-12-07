package classemployee;
public class Employee {
    private int emp_id ;
    private String name ;
    private String depart ;
    private double salary ;
    private double bonus ;
    private boolean resident ;
    
public Employee(){
emp_id = 100 ;
name = "mena" ;
depart = "programming" ;
salary = 4000.0 ;
bonus = 1000.0 ;
resident = true ;
}   
public Employee(int i ,String n){
    emp_id = i ;
    name = n ;
}
public Employee(int i ,String n ,boolean r){
    this(i ,n);
    resident = r ;
}
public Employee(int i ,String n ,String d ,double s ,double b ,boolean r){
    this(i ,n ,r);
    depart = d ;
    salary = s ;
    bonus = b ;
}
public void set_salary(double s){
    salary = s ;
}
 public void set_salary(double s , double b){
    salary = s ;
    bonus = b ;
}       
public void set_depart(String d){
    depart = d ;
}
public void set_emp_id(int i){
    emp_id = i ;
}
public void print_emp_data(){
    System.out.println("The id of employee = " + emp_id);
    System.out.println("The name of employee = " + name);
    System.out.println("The depart of employee = " + depart);
    System.out.println("The salary of employee = " + salary);
    System.out.println("The bonus of employee = " + bonus);
    System.out.println("The resident of employee = " + resident);
}
}
