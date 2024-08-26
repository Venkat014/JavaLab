import java.util.Scanner;
class QuadraticEquation
{
public static void main(String argsp[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Coefficeint a: ");
double a=sc.nextDouble();
System.out.print("Coefficeint b: ");
double b=sc.nextDouble();
System.out.print("Coefficeint c: ");
double c=sc.nextDouble();
sc.close();
double r1,r2;
double d=Math.sqrt((b*b)-(4*a*c));
if(d==0)
{
System.out.println("Roots are real and equal");
r1=((-b)+d)/(2*a);
System.out.println("Root : "+r1);
}
else if(d>0)
{
System.out.println("Roots are real and distinct");
r1=((-b)+d)/(2*a*c);
r2=((-b)-d)/(2*a);
System.out.print("Root1: "+r1);
System.out.println(" Root2: "+r2);
}
else
{
System.out.println("Roots are imaginary");
}
}
}