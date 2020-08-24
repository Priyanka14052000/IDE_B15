import java.io.*; 
  
class operations { 
    public static void main(String[] args) 
    {  
        int num1 = 10, num2 = 20, sum,sub,mult,div,mod; 
        System.out.println("num1 = " + num1); 
        System.out.println("num2 = " + num2); 
        sum = num1 + num2; 
        sub = num1 - num2; 
        mult = num1 * num2;
        div = num1 / num2; 
        mod = num1 % num2; 
        System.out.println("Remainder = " + mod); 
        System.out.println("Division = " + div); 
        System.out.println("Multiplication = " + mult);
        System.out.println("Subtraction = " + sub); 
        System.out.println("The sum = " + sum); 
    }}