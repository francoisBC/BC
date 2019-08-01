/*获取数组的最大值
思路：获取最值需要进行比较。每一次比较都会有一个较大的值，通过一个变量进行临时存储
让数组的每一个元素都和这个变量的值进行比较
如果大于了变量的值，就用该变量记录较大值
当所有的元素都比较完成，那么该变量中存储的就是数组就是数组中的最大值了
步骤：
定义变量，初始化为数组中任意一个元素即可
通过循环语句对数组进行遍历
在变量过程中定义判断条件，如果遍历到的元素比变量大，就赋值给该变量
*/
/*
成员变量和局部变量
作用范围
成员变量作用于整个类中
局部变量作用于函数中，或者语句中
在内存中的位置：
成员变量：在堆内存中，因为对象的存在，才在内存中存在
局部变量：在栈内存中

*/

class  ef
{
	public static void main(String[] args) 
	{
		int[] arr={5,1,6,4,2,8,9};
		int max=getmax_2(arr);
		int min=getmin(arr);
			System.out.println("max="+max);
			System.out.println("min="+min);
		boolean[] ar=new boolean[3];
			System.out.println(ar[1]);
	}
	//获取最大值1
	public static int getmax(int[] arr)
	{
		int max=arr[0];
		for (int x=1;x<arr.length ;x++ )

		{
			if (arr[x]>max)
			
			max=arr[x];
		}
		return max;
	
	/*获取最大值的另一种方式
	能将临时变量初始化为0
	这种方式，其实是在初始化为数组中的任意一个角标*/
	}
	//public static double getmax(int[] arr)   功能一致会重载

	public static int getmax_2(int[] arr)
	{
		int max=0;
		for (int x=1;x<arr.length ;x++ )
		{

			if(arr[x]>arr[max])
				max=x;
		}
		return arr[max];
	}
	//获取最小值
	public static int getmin(int[] arr)
	{
		int min=0;
		for (int x=1;x<arr.length ;x++ )
		{
			if (arr[x]<arr[min])
				min=x;
			 

		}
		return arr[min];
	
	}
	/*
	public static void show(String s)
	{
		System.out.println(s);
	}
	这是封装
	public static void tobin()
	{
		trans();
	}
	public static void tohex()
	{
		trans();
	}
	这些也是封装
	*/
}
