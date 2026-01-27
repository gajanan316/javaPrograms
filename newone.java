import java.util.*;
public class newone
{  static int queue[]=new int[5];
   static int front=0,rear=-1;
   public static void main(String x[])
   {  Scanner xyz = new Scanner(System.in);
      do{
	     System.out.println("1:INSERT");
		 System.out.println("2:DELETE");
		 System.out.println("3:DISPLAY");
		 System.out.println("Enter your choice");
		 int choice=xyz.nextInt();
		 switch(choice)
		 { case 1:
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
      if((rear==(queue.length-1))){
	   System.out.println("Queue is full/overflow");
	  }
	  else{
	    rear=rear+1;
		queue[rear]=val;
		System.out.println("Value stored in queue");
	  }
   }
   public static void del()
   {
      if((front==0 && rear==-1) ||(front==(rear+1)))
	  { System.out.println("Queue is empty");
        front=0;
		rear=-1;
	  }
	  else{
	   
		int value=queue[front];
		 front=front+1;
		System.out.println("deleted value is "+value);
	  }
   }
   public static void display()
   {
      
      if((front==0 && rear==-1) ||(front==(rear+1)))
	  { System.out.println("Queue is empty");
         front=0;
		rear=-1;
	  }
	  else{
		    
	     for(int i=front;i<=rear;i++)
		 { System.out.printf("%d\t",queue[i]);
		 }
	  }
   }
}
