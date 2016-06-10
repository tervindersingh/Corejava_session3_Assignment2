import java.util.Scanner;
public class PrimeNumber
{	int n;
	public void IsPrime(int a)
	{
		n=a;
		int i,r,f=0;
		for(i=2;i<=n-1;i++)
		{
			r=n%i;
			if (r==0)
			{
				f=1;
				System.out.println(n+" is not a Prime Number");
				break;
			}
		}
		if (f==0)
		{
			System.out.println(n+" is a Prime Number");
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n=sc.nextInt();
		PrimeNumber N1=new PrimeNumber();
		N1.IsPrime(n);
	}
}