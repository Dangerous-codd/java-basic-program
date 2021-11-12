class array
{
	public static void main(String args[])
	{
		//int arr[] = new int[5];
		int sum=0;
		//int arr[] ={11,13,15,16,19};
		int arr[] ={11,13,15,16,19,18,35,76,49};
		 
		System.out.println("-----arrays elements-------");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			sum+=arr[i];
		}
		System.out.println("no of elements :" + arr.length);
		System.out.println("the sum is :" + sum);
	}
}