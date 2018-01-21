import java.util.*;
import java.io.*;
import java.*;
import java.util.*;
import java.lang.*;
class robotopia
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int l1,l2,a1,a2,l3,a3,a,b,n,t,x,y;
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
		t=0;
		l1=sc.nextInt();
		a1=sc.nextInt();
		l2=sc.nextInt();
		a2=sc.nextInt();
		l3=sc.nextInt();
		a3=sc.nextInt();
		h:for(x=1;x<(l3-l1+l2);x++)
		{
			for(y=1;y<(a3-a1+a2);y++)
			{
				 a=((l1*x)+(l2*y));
				 b=((a1*x)+(a2*y));
				if(((a==l3)&&(b==a3)))
				{
					
					t=t+1;
					System.out.println(x);
			System.out.println(y);
					break h;
				}
			}
		}
		if(t!=1)
		{
			System.out.println("?");
		}}
	}
}	
				