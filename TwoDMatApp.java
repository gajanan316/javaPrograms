import java.util.*;
public class TwoDMatApp
{
   public static void main(String x[])
   {
      int a[][]=new int[3][3];
	   
	  Scanner xyz = new Scanner(System.in);
	  System.out.println("Enter values in first matrix");
	  for(int i=0; i<a.length; i++)
	  {
	      for(int j=0; j<a[i].length; j++)
		  {
		     a[i][j]=xyz.nextInt();
		  }
	  }
	  
	  System.out.println("Display  matrix  without column sorting ");
	   for(int i=0; i<a.length; i++)
	  {
	      for(int j=0; j<a[i].length; j++)
		  {
		     System.out.printf("%d\t",a[i][j]);
		  }
		  System.out.println("\n");
	  }
	  // apply column sorting logics 
	  for(int i=0; i<a.length; i++)
	  { int cols[]=new int[3];
        for(int j=0; j<a[i].length; j++)
	    {
			 cols[j]=a[j][i];
		}
		Arrays.sort(cols);
		for(int m=0; m<a[i].length;m++)
		{
			  a[m][i]=cols[m];
		}
	  }
	  System.out.println("Display  matrix after column sorting ");
	   for(int i=0; i<a.length; i++)
	  {
	      for(int j=0; j<a[i].length; j++)
		  {
		     System.out.printf("%d\t",a[i][j]);
		  }
		  System.out.println("\n");
	  }
   }
}
