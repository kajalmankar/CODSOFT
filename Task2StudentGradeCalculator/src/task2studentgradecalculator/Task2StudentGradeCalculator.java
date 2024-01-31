
package task2studentgradecalculator;

import java.util.*;
public class Task2StudentGradeCalculator {

    
    public static void main(String[] args) {
       double phy,chem,math,total,avg;
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Subject");
        phy=sc.nextInt();
        chem=sc.nextInt();
        math=sc.nextInt();
        
        total=phy+chem+math;
        System.out.println("Total="+total);
        avg=total/3;
        System.out.println("Average="+avg);
        if(avg>=85)
        {
            System.out.println("Grade=A");
        }
        else if(avg>=75)
        {
            System.out.println("Grade=B");
        }
        else if(avg>=65)
        {
            System.out.println("Grade=C");
        }
        else if(avg>=45)
        {
            System.out.println("Grade=D");
        }
        else
        {
            System.out.println("Fail");
        }
    }
    
}
