class Prime
{
public static void main(String[] arg)
{

	int m=0,flag=0;
	int i=3;
 	int n = 3;
 	if(n==0||n==1)
	{
    		System.out.println("is not prime number");
  	}

	else
	{
   		for(i=2;i<m;i++)
   		{
			if(n%i==0)
			{
      				System.out.println("is not prime number");
      				flag=1;
      				break;
  			}
		}
	}

	if(flag==0)
	{
		System.out.println("is prime number");
	}
}
}
