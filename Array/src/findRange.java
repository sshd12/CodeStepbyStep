import java.util.Arrays;

public class findRange
{
	public static int findRange(int []a)
	{
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			max=Math.max(max,a[i]);
			min=Math.min(min,a[i]);
		}
		return max-min+1;
	}
	public static void main(String[] args)
	{
		int [] a= {1,4,7,2,13,9,-7,8,0,-39,7};
		int ans=findRange(a);
		System.out.println(ans);
	}

}
