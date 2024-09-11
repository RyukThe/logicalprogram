package multiply_two_no_witout_mul_operator;

public class example3_Multiply_2_Num_Without_Multi_Operator
{
public static void main(String[] args) 
{
	int num1=3;
	int num2=4;
		
	int sum=0;     //12
	
		//             5<=4
	for(int i=1; i<=num1; i++)
	{
		sum=sum+num2;    // 9 + 3 = 12
	}
	
	
	System.out.println(sum);
	
}
}