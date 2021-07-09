
public class fibonacci2 {
	public static int fibonacci(int number) {
		int one = 1;
		int two = 1;
		int result =-1;
		if(number==1)
		{
			return 1;
		}
		else if(number==2)
		{
			return 1;
		}
		else
		{
			return fibonacci(number-1)+fibonacci(number-2);
		}
		
	}

	public static void main(String[] args) {
		System.out.print("피보나치 수열의 10번쨰 항은 : "+ fibonacci(10));
	
	}

}
