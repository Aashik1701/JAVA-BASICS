package sem1;

import java.lang.*;
class commandArgs {
    public static void main(String[]args) {
        int count, i=0;
        String s;
        count = args.length;
        System.out.println("The number of arguements you have passed is "+ count);
        while(i<count){
            s=args[i];
            i++;
            System.out.println(s);
        }
    }
}