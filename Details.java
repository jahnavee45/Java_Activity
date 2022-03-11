import java.lang.*;
import java.lang.String;

public class Details
{
  private int run;
  private String name;
  private String inning;

  /*public Details(String name, String inning, int run)
 {
   this.name = name;
   this.inning = inning;
   this.run = run;
 }*/

  public String getName()
  {
    return name; 
  }
  public String getInning()
  {
    return inning;
  }
  public int getRuns()
  {
    return run;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setInning(String inning)
  {
    this.inning = inning;
  }

  public void setRuns(int run)
  {
    this.run = run;
  }

}
  
