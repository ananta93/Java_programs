//find the maximum and minimum number
class MaxMin
{
	public static void main(String[] args) 
	{
		int arr[]={2,9,1,6,4,8,5,7,4,5};
		int large=arr[0];
		int i=1;
		int min=arr[0];
		while (large<arr[i])
		{
			large=arr[i];
			i++;
		}
		System.out.println("Maximum element is "+large);
		while (min>arr[i])
		{
			min=arr[i];
			i++;
		}
		System.out.print("Minimum element is "+min);
	}
}
