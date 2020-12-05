package project_agecalculator;
import java.util.Scanner;
public class Age_Calc
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your date of birth dd/mm/yyyy : ");
String DateOfBirth = sc.next();
int index1 = DateOfBirth.indexOf("/");
int index2 = DateOfBirth.indexOf("/",index1+1);
String Dates = DateOfBirth.substring(0,index1);
String Months = DateOfBirth.substring(index1+1,index2);
String Years = DateOfBirth.substring(index2+1);
System.out.println("Enter today Date dd/mm/yyyy : ");
String TodayDate = sc.next();
String[] td = TodayDate.split("/");
String tDates = td[0];
String tMonths = td[1];
String tYears = td[2];
int Date = Integer.parseInt(Dates);
int Month = Integer.parseInt(Months);
int Year = Integer.parseInt(Years);
int tDate = Integer.parseInt(tDates);
int tMonth = Integer.parseInt(tMonths);
int tYear = Integer.parseInt(tYears);
int bDate = Date - tDate;
int bMonth = Month - tMonth;
int bYear = Year - tYear;
System.out.println("The Age of a person in : "+bYear+" years "+bMonth+" Month "+bDate+" Days");
}
}

