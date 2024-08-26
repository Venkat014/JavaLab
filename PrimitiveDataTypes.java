import java.util.Scanner;
class PrimitiveDataTypes
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Byte value: ");
byte b=sc.nextByte();
System.out.print("Short value: ");
short s=sc.nextShort();
System.out.print("Int value: ");
int i=sc.nextInt();
System.out.print("long value: ");
long l=sc.nextLong();
System.out.print("flaot value: ");
float f=sc.nextFloat();
System.out.print("double value: ");
double d=sc.nextDouble();
System.out.print("char value: ");
char c=sc.next().charAt(0);
System.out.print("boolean values (true/flase): ");
boolean bo=sc.nextBoolean();
System.out.println("byteVar: "+b);
System.out.println("shortVar: "+s);
System.out.println("intVar: "+i);
System.out.println("longVar: "+l);
System.out.println("floatVar: "+f);
System.out.println("doubleVar: "+d);
System.out.println("cahrVar: "+c);
System.out.println("booleanVar: "+bo);
}
}