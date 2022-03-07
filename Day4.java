import java.io.*;
import java.util.*;
import java.lang.String;

class IPLResults
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> list= new ArrayList<String>();
    list.add("Delhi Capitals");
    list.add("Kolkata Riders");
    list.add("Mumbai Indians");
    list.add("Royal Challengers");
    list.add("Chennai SuperKings");

    System.out.println("Enter the swap position");
    int n = sc.nextInt();
    System.out.println("Enter the position of element");
    int m = sc.nextInt();
 
    Collections.swap(list,m,n);
    System.out.println(list);      
  }
}