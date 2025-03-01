import java.util.Scanner;
class SBuffer
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string: ");
    String line= sc.nextLine();
    StringBuffer sb= new StringBuffer(line);
    System.out.println("Original string: "+sb);
    System.out.println("choose an operation: ");
    System.out.println("1.Delete the substring.");
    System.out.println("1.Delete the character.");
    int choice=sc.nextInt();
    switch(choice)
    {
	case 1:
	 System.out.println("Enter start and end values to delete : ");
	 int start=sc.nextInt();
                    int end=sc.nextInt();
	 if(start>=0 && end<sb.length() && start<end)
	 {
                        sb.delete(start,end);
	    System.out.println("After deletion of substring: "+sb);
	 }
	 else
	 {
	   System.out.println("Invalid range of index.");
 	 }
                     break;
	case 2:
	 System.out.println("Enter index value to delete : ");
	 int index=sc.nextInt();
                    if(index>=0 && index<sb.length())
	 {
                        sb.deleteCharAt(index);
	    System.out.println("After deletion of character: "+sb);
	 }
	 else
	 {
	   System.out.println("Invalid index.");
 	 } 
	 default:
	  System.out.println("Invalid choice.");
    }
      sc.close();
  }
} 


OUTPUT:
Enter a string: 
I am from anantapur
Original string: I am from anantapur
choose an operation: 
1.Delete the substring.
1.Delete the character.
1
Enter start and end values to delete : 
0
9
After deletion of substring:  anantapur