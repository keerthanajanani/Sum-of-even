# Sum-of-even
import java.io.*;
import java.util.*;
public class Sum of even
{
public static void main(String args[])throws IOException
{
int i,j,n,sum=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Number:");
n=Integer.parseInt(br.readLine());
for(i=1;i<=15;i++)
{
for(j=1;j<=i;j++)
{
sum=sum+j;
}
System.out.println("sum of numbers : "+sum);
}
for(i=1;i<=n;i++)
{
if(i%2==0)
{
sum=sum+i
}
System.out.println("sum of all even numbers : "+sum);
}
}
}
