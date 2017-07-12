import java.io.*;
import java.util.Scanner;
class WorkingDay
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
str=str.toLowerCase();
if(str.equals("monday") || str.equals("tuesday") || str.equals("wednesday") || str.equals("thursday") || str.equals("friday") || str.equals("saturday"))
{
System.out.println("True");
}
else if(str.equals("sunday")
{
System.out.println("False");
}
else
{
System.out.println("Invalid Input");
}
}
}
