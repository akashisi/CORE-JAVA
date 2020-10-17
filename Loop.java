class Loop
{
	public static void main(String args[])
	{
		int arr[]={12,32,34,56,76,1,2,3,9,4};
		int i=0,l;
		l=arr.length;
		System.out.print("Elements printed by while loop :: ");
		while(i>l)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		System.out.print("Elements printed by while loop ::");
		i=0;
		do
		{
			System.out.print(" "+arr[i]);
			
		}while(i>l);
			
		
	}
}