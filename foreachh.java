//for each loop 
// print all elemnents of string with using foreach loop
// print all elemets of numeric arrays with using for each loop
// count all elemets of numeric array with uing foreach loop withou using length
//	find the elemts higest elemets of numeric array with using foreach loop without using length variable
class Foreach
{
	public static void main(String args[])
	{
		// int arr[] = { 10,20,30,40,50};
		// int sum= 0;
		// int count=0;
		// for (int var:arr)
		// {
		// 	System.out.println(var);
		// 	count++;
		// 	sum+=var;
		// }
		// System.out.println("No of elements :" + count);
		// System.out.println("the sum is " + sum);
		// int arr[] = {10,20,30,40,50,60};
		// for (int var : arr)
		// {
		// 	System.out.println(var);
        // }
		// String str[] = {"Sun","Mon","Tue","Wed","Thrus","Fri","Sat"};
		// for(String var : str)
		// {
		// 	System.out.println(var);
		// }
		int[] T = { 1, 2, 3, 4, 5, 6, 7 };
		int x = T[0];
	
		for (int element : T) {
			if (T[element] > x) {
				x = T[element];
			}
		}
	
		System.out.println(x);


	}
	
}