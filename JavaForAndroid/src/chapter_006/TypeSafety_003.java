package chapter_006;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

 
class Employee_003
{
   private String name;

   Employee_003(String name)
   {
      this.name = name;
   }
 
   String getName()
   {
      return name;
   }
}
 
public class TypeSafety_003
{
   public static void main(String[] args)
   {
      List<Employee_003> employees = new ArrayList<Employee_003>();
      employees.add(new Employee_003("John Doe"));
      employees.add(new Employee_003("Jane Smith"));
//      employees.add("Jack Frost");
      Iterator<Employee_003> iter = employees.iterator();
      while (iter.hasNext())
      {
         Employee_003 emp = iter.next();
         System.out.println(emp.getName());
      }
   }
}