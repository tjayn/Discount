import java.util.Scanner;
public class discount {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double salary = 0;
        double discount = 0;
    
        System.out.print("What Is Your Salary? ");
        salary = scanner.nextInt();
        
        if(salary > 5000){
            discount = salary * 0.1;
        }
        else if(salary > 1000){
            discount = salary * 0.05;
        }
        else{
            discount = 0;
        }
        
        System.out.printf("The Discount Of Salary Ksh %.2f is Ksh %.2f \n", salary,discount);
        System.out.print("    **Welcome**    ");
        scanner.close();
    
    }
    
 
}
