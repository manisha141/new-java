import java.util.Scanner;
public class reverse{
    public static void main(String[]args) {
        int x,rem,rev=0;
        Scanner myinput=new Scanner(System.in);
    System.out.println("Enter the no:");
        while(x>0)
        {
        x=myinput.nextInt();
        rem=x%10;
        rev=rev*10+rem;
        x=x/10;
    
        }
        System.out.println(rev);
        
    }
}
