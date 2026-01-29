 /*7. Count Digits

Problem: Write a function that counts the number of digits in a given number.

Input:
n = 98765
Output:
5
*/
     import java.util.Scanner;
  public class countDigitfunction
  {
   
	  
       public static int Digitcount(int n)
	     
        {
		int count = 0 ;
		   while (n != 0)
		   {
		      count++;
			  n = n / 10;
		   }
		   return count ;
		}
        public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();           // input number
        int result = Digitcount(n);     // function call

        System.out.println(result);   		
	}
  }

