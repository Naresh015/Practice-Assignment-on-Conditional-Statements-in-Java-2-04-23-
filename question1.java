//leap year
import java.util.Scanner;
public class question1 {    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%400==0){
            System.out.println("This is leap year");
        }
        else if(n%100==0){
             System.out.println("This is not leap year");
        }
        else if(n%4==0){
             System.out.println("This is  leap year");
        }
        else{
             System.out.println("This is  not leap year");
        }

}
}