/*
数组的查找

有一个有序的数组，将一个元素插入到该数组中，并保证数组依旧有序，如何获取该数据在数组的位置
*/
class efgh 
{
	public static void main(String[] args) 
	{
	/*
		int[] arr={3,1,5,4,2,9};
		int index=getindex(arr,2);
		int index_1=halfsearch(arr,9);
		int index_2=halfsearch_2(arr,1);
		
		System.out.println("index="+index);
		
		System.out.println("index_1="+index_1);
		
		System.out.println("index_2="+index_2);
		*/
		int[] arr={2,4,5,6,8,19,77,89};
		int index=getindex_2(arr,8);
		System.out.println("index="+index);
	}
	/*
	折半查找。能够提高效率，但必须是已排序的数组 
	*/
	//定义功能，获取key第一次出现在数组中的位置，如果返回是-1，表示key不存在
	public static int getindex(int[] arr,int key)
	{
		for (int x=0;x<arr.length ;x++ )
		{
			if(arr[x]==key)
				return x;
		}
		return -1;//表示没有数被找到
	}
	public static int getindex_2(int[] arr,int key)
	{
		int min=0,max=arr.length-1,mid;

		while(min<=max)
		{
			mid=(max+min)>>1;

			if(key>arr[mid])
				min=mid+1;
			else if(key<arr[mid])
				max=mid-1;
			else
				return mid;
		}
		return min;
	}
		
	

	public static int halfsearch(int[] arr,int key)
	{
		int min,max,mid;
		min=0;
		max=arr.length-1;
		mid=(max+min)/2;

		while(arr[mid]!=key)
		{
			if (key>arr[mid])
				min=mid+1;
			else if(key<arr[mid])
				max=mid-1;
			if (min>max)
				return -1;

			mid=(max+min)/2;
			
		}
		return mid;
	}
	public static int halfsearch_2(int[] arr,int key)
	{
		int min=0,max=arr.length-1,mid;

		while(min<=max)
		{
			mid=(max+min)>>1;

			if(key>arr[mid])
				max=mid-1;
			else
				return mid;
		}
		return -1;
	}
}
