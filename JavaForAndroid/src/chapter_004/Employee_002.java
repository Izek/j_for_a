package chapter_004;

class Date
{
   int year, month, day;
 
   Date(int year, int month, int day)
   {
      this.year = year;
      this.month = month;
      this.day = day;
   }
}
 
public class Employee_002 implements Cloneable
{
   String name;
   int age;
   Date hireDate;
 

   Employee_002(String name, int age, Date hireDate)
   {
      this.name = name;
      this.age = age;
      this.hireDate = hireDate;
   }
 
   @Override
   protected Object clone() throws CloneNotSupportedException
   {
      Employee_002 emp = (Employee_002) super.clone();
      if (hireDate != null) // no point cloning a null object (one that doesn't exist)
         emp.hireDate = new Date(hireDate.year, hireDate.month, hireDate.day);
      return emp;
   }
 
   public static void main(String[] args) throws CloneNotSupportedException
   {
      Employee_002 e1 = new Employee_002("John Doe", 46, new Date(2000, 1, 20));
      Employee_002 e2 = (Employee_002) e1.clone();
      System.out.println(e1 == e2); // Output: false
      System.out.println(e1.name == e2.name); // Output: true
      System.out.println(e1.hireDate == e2.hireDate); // Output: false
      System.out.println(e2.hireDate.year + " " + e2.hireDate.month + " " +
                         e2.hireDate.day); // Output: 2000 1 20
   }
}