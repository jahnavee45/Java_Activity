import java.io.*;
import java.util.*;

import java.lang.*;
import java.lang.String;

class Main
{
  public static void main(String args[])
 {
    Details d = new Details();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the team name:");
    d.setName(sc.nextLine());
    System.out.println("Enter session:");
    d.setInning(sc.nextLine());
    System.out.println("Enter runs:");
    d.setRuns(sc.nextInt());
 
    if((d.getInning()).equals("First"))
   {
     System.out.println("Name:"+d.getName()+"\n"+"Scored:"+d.getRuns()+"\n"+"Need"+((d.getRuns())+1)+"to win");
   }
   else if((d.getInning()).equals("Second"))
  {
    System.out.println("Name:"+d.getName()+"\n"+"Scored:"+d.getRuns()+"\n"+"Match Ended");
  }
  else
  {
    System.out.println("Invalid Input");
  }
      
 }
}
