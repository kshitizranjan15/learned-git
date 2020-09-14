package ASSIGNMENT_3;

import java.util.Scanner;

public class A3Q7 {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		double x,y;
		System.out.println("Enter the value of x");
        x=sc.nextDouble();
        System.out.println("Enter the value of y");
        y=sc.nextDouble();
        if(x>0 && y>0)
        {
        	System.out.println("( "+x+", "+y+" )lies in 1st Quadrant");
        }
        else if(x<0 && y>0)
        {
        	System.out.println("( "+x+", "+y+" ) lies in 2nd Quadrant");
        }
        else if(x<0 && y<0)
        {
        	System.out.println("( "+x+", "+y+" ) lies in 3rd Quadrant");
        }
        else if (x>0 && y<0)
        {
        	System.out.println("( "+x+", "+y+" ) lies in 4th Quadrant");
        }
        else if (x==0 && y==0)
        {
        	System.out.println("( "+x+", "+y+" ) lies on origin");
        }
        else if (x==0)
        {
        	System.out.println("( "+x+", "+y+" ) lies on Y-axis");
        }
        else if (y==0)
        {
        	System.out.println("( "+x+", "+y+") lies on X-axis");
        }
               System.out.println("something new came");
	}

}
