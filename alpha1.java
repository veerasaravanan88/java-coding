import java.util.Scanner;
class alpha1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size of the array: ");
	    int size=sc.nextInt();
	    int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the value");
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=arr[i]+sum; 
		}
		System.out.println("The sum is:"+sum);
	}
}