interface Parent1
{
    default void car()
     {
        System.out.println("Audi car");   
        
     }
}
interface Parent2 {
    default void bike()
    {
System.out.println("Bmw car");
    }}

public class Multi implements Parent1,Parent2{
    public void car(){
        Parent1.super.car();
    }

        public static void main(String[] args)
         {
            
            Multi d=new Multi();
            d.car();
            

         }
        }