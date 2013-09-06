package chapter_004;

class SuperReturnType_002
{
   @Override
   public String toString()
   {
      return "Superclass_002 return type";
   }
}
 
class SubReturnType_002 extends SuperReturnType_002
{
   @Override
   public String toString()
   {
      return "Subclass_002 return type";
   }
}
 
class Superclass_002
{
   SuperReturnType_002 createReturnType()
   {
      return new SuperReturnType_002();
   }
}
 
class Subclass_002 extends Superclass_002
{
   @Override
   SuperReturnType_002 createReturnType()
   {
      return new SubReturnType_002();
   }
}
 
public class CovarDemo_002
{
   public static void main(String[] args)
   {
      SuperReturnType_002 suprt = new Superclass_002().createReturnType();
      System.out.println(suprt); // Output: Superclass_002 return type
      
		SubReturnType_002 subrt = (SubReturnType_002) new Subclass_002().createReturnType();
      System.out.println(subrt); // Output: subclass return type
   }
}