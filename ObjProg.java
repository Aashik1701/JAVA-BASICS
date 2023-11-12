import java.util.Scanner;

class Add {
    public Add() {
    }
    int a;
    public int add(int num1, int num2) {
        System.out.print("Addition of two numbers is :");
        int r = num1 + num2;
        return r;
    }
}

class Sub {
    public Sub() {
    }
    int b;
    public int add(int num1, int num2) {
        System.out.print("Subraction of two numbers is :");
        int r = num1 - num2;
        return r;
    }
}

class Mul {
    public Mul() {
    }
    int c;
    public int add(int num1, int num2) {
        System.out.print("Multiplication of two numbers is :");
        int r = num1 * num2;
        return r;
    }
}

class Div 
{
    public Div() {
    }
        int d;
        public int add(int num1,int num2) {
            System.out.print("Division of two numbers is :");
        int r = num1 / num2;
        return r;
    }
}

 public class ObjProg {
    public static void main(String[]args) {
        System.out.print("Enter the two numbers to add:");
        Scanner sc = new Scanner(System.in);

        int n1=sc.nextInt();
        int n2=sc.nextInt();


        Add cal = new Add();
        int result1 = cal.add(n1,n2);
        System.out.println(result1);


        Sub sbr = new Sub();
        int result2 = sbr.add(n1,n2);
        System.out.println(result2);


        Mul multi = new Mul();
        int result3 = multi.add(n1,n2);
        System.out.println(result3);

        Div divi = new Div();
        int result4 = divi.add(n1,n2);
        System.out.println(result4);
    }
}