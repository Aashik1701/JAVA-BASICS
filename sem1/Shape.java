package sem1;

import java.lang.*;
import java.util.Scanner;
class shape {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        float a =sc.nextFloat(); 
        float b =sc.nextFloat();
        float area = a * b;
        System.out.println("Area of your Rectangle is "+area);
        sc.close();
    }
}