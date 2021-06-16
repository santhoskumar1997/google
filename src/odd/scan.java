package odd;
public class scan {
public static void main(String[] args) {
	
	
	for (int i = 0; i <1000; i++) {
		int a=i;
		int j=0;
		int k=0;	
	while(a>0)
	{
		k=a%10;
		j=(j*10)+k;
		a=a/10;
	}
	
	if(j==i)
	{
		System.out.println(j);
	}
	}	
}
}


