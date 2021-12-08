package GenericsAssignments;

import java.util.*;  
class Employee {  
int id;  
String name,Department;  
int Salary;  
public Employee(int id, String name, String Department, int Salary) {  
    this.id = id;  
    this.name = name;  
    this.Department = Department;  
    this.Salary = Salary;  
}  
}  
public class Gen1 {  
public static void main(String[] args) {  
    HashSet<Employee> set=new HashSet<Employee>();  
   
    Employee b1=new Employee(101,"Suresh","Maths",40000);  
    Employee b2=new Employee(102,"Naresh","Physics",30000);  
    Employee b3=new Employee(103,"Rajesh","Chemistry",60000);  
    
    set.add(b1);  
    set.add(b2);  
    set.add(b3);  
    
    for(Employee b:set){  
    System.out.println(b.id+" "+b.name+" "+b.Department+" "+b.Salary);  
    }  
}  
} 