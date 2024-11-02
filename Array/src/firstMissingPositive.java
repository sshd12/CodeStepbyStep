import java.util.Arrays;

public class firstMissingPositive {
	public static int firstMissingPositive(int []a)
	{
		Arrays.sort(a);
		
		int n=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n) n++;
		}
		return n;
	}
	public static void main(String[] args) {
		int []a= {1,5,6,9,2,3,4,-6,-4,-5,-3,-1};
		System.out.println(firstMissingPositive(a));
	}

}
