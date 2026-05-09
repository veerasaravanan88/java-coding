import java.util.Scanner;
class alpha3
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
        {
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==40)
			{
				count++;
			}
			
		}
		System.out.println(count);
	}
}