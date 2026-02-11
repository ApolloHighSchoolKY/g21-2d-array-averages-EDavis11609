import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
     //Track the total sum of each row
     Double sum = 0.0;
     //Track the average of each row
     Double rowAv = 0.0;
    for(int row=0; row<ray.length;row++)
    {
      for(int col=0; col<ray[0].length;col++)
  
          {
            //Collects the total value of each row
            sum += ray[row][col];
          }
      //Getting the average of each row *Placed in context of the first loop to only average each individual row. Not each individual value, or the overall total of all the rows    
      rowAv = sum/ray[0].length;
      System.out.println("Row "+ row + " average: " + rowAv);
      sum = 0.0;
    }
  }
  public void columnAverages(){
    //Column major order
    //   Take each column and go through all of the rows
    //   Top down and Left to Right
    //Track the total sum of each column
    Double sum = 0.0;
    //Track the average of each column
    Double colAv = 0.0;
    for(int col=0; col<ray[0].length;col++)
    {
      for(int row=0; row<ray.length;row++)
    
          {
            //Collects the total value of each column
            sum += ray[row][col];
          }
       //Getting the average of each column *Placed in context of the first loop to only average each individual column. Not each individual value, or the overall total of all the columns
      colAv = sum/ray.length;
      System.out.println("Column "+ col + " average: " + colAv);
      sum = 0.0;
    }
  }
  public void arrayAverage(){
    //Row major Order
    Double arrayAv = 0.0;
    for(int row=0; row<ray.length;row++)
    {
      for(int col=0; col<ray[0].length;col++)
          {
            //Collecting the total value of each row
            arrayAv += ray[row][col];
          }
    }
    //Take the total value of all the rows then divied it by how many rows their are
    arrayAv = arrayAv/ray.length;
    //Print out the array average
    System.out.println("The average of the entire 2D array is: " + arrayAv);

  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return "";
  }
}
