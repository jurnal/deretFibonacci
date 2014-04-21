import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("input :");
        Scanner inputFibonacci = new Scanner(System.in);
        
        int fibonacciCount = inputFibonacci.nextInt();
        
        for (int ii=1; ii <= fibonacciCount; ii++)
        {
            System.out.println(" " + methodFibonacci(ii));
        }
    }
    
    public static int methodFibonacci(int fibonacciInput)
    {   
        int x;
        int n = fibonacciInput;
        if(n <=0 || n<=1)
        {
           return n;
        }
       
        else
        {
            return methodFibonacci(n-2) + methodFibonacci(n-1) ;
        }
            
    }
    }
