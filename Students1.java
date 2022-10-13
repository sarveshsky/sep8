import java.util.*;
public class Students1 
{

	public static void main(String[] args)
 {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
                int m=sc.nextInt();
		int arr[][]=new int[n][m];

             int Result[][]=new int[n][2];
		
		for(int i=0;i<n;i++)
 {
			int Sum=0;
			for(int j=0;j<m;j++)
 {
				arr[i][j]=sc.nextInt();
				Sum+=arr[i][j];
			}

                       Result[i][0]=Sum;
			Result[i][1]=Sum/4;
		}
       for(int i=0;i<n;i++)
{
System.out.println(Result[i][0]);


System.out.println(Result[i][1]);
}
}
}