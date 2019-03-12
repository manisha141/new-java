class A{
    public void car()
     {
        System.out.println("Audi car");   
        
     }
}
class B 
{
    public void bike()
    {
System.out.println("Duke bike");
    }}
class C extends A
{
    public void cycle()
    {
        System.out.println("lady bird");
    }

}

public class Multipleinherit
    {
        public static void main(String[] args)
         {
            
            C ob=new C();
            ob.car();
            

    }
}