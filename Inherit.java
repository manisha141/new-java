class A{
    public void car()
     {
        System.out.println("Audi car");   
        
     }
}
class B extends A
{
    public void bike()
    {
System.out.println("Duke bike");
    }

    public class Inheritance
    {
        public static void main(string[]args)
         {
            B ob=new B();
            ob.car();
            ob.bike();
         }
    }
}