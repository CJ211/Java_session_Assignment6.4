import java.util.*;

class find
{
	public static void main(String args[])
	{
		int n,i,find,x;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of elements");
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			System.out.print("Enter no: ");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter no to be searched");
		x=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			if(x==a[i])
			{
				break;
			}
		}
		
		if(i==n)
		{
			System.out.println("not found");
		}
		
		else
		{
			System.out.println("No found at position = "+i);
		}
	}
}
