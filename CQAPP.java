import java.util.*;
public class CQAPP
{  static int s=0,front=0,rear=-1;
    static  int q[]=new int[5];
    static int capacity=q.length;
  public static void main(String x[])
  {  Scanner xyz = new Scanner(System.in);
     int choice;
	 do{
	  System.out.println("1:INSERT");
	  System.out.println("2:DELETE");
	  System.out.println("3:DISPLAY");
	  System.out.println("4:EXIT");
	  System.out.println("Enter your choice");
	  choice=xyz.nextInt();
	  switch(choice)
	  {
	    case 1:
		System.out.println("Enter value in queue");
		int value=xyz.nextInt();
		insert(value);
		break;
		case 2:
		del();
		break;
		case 3:
		display();
		break;
		case 4:
		System.exit(0);
		break;
		default:
		 System.out.println("Wrong choice");
	  }
	 }while(true);
  }
  public static void insert(int val)
  {
     if(s==capacity)
	 { System.out.println("Queue is full or overflow");
	 }
	 else{
	    rear=(front+s)%capacity;
	  q[rear]=val;
	  System.out.println("Data save successfully...");
	  s++;
	 }
  }
  public static void del()
  {if(s==0)
	 { System.out.println("Queue is empty or underflow");
	 }
	 else{
	   int value=q[front];
	   front=(front+1)%capacity;
	   System.out.println("deleted value is "+value);
	   s--;
	 }
  }
  public static void display()
  {  if(s==0)
	 { System.out.println("Queue is empty or underflow");
	 }
	 else{
	    int i;
	 
		for(i=front;i!=rear; i=(  (i+1)%capacity) )
		{ System.out.printf("q[%d] --->%d\n",i,q[i]);
	      
		}
	 
		 System.out.printf("q[%d] --->%d\n",i,q[i]);
	 }
  }
  
}
