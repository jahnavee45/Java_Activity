import java.util.*;
import java.lang.String;

class SameName
{
  public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   String P1 = sc.nextLine();
   String P2 = sc.nextLine();
  
   String[] s1 = P1.split(" ");
   String[] s2 = P2.split(" ");
   if(s1[1].equals(s2[1])== true)
  {
    System.out.println("Yes");
  }
   else 
  {
    System.out.println("No");
  }
 }
}