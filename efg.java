/*给定数组进行排序
选择排序：内循环结束一次，最值出现在头角标位置上
冒泡排序：相邻的两个元素进行比较，如果符合条件就换位
*/
import java.util.*;
class efg 
//选择排序
{
	public static void selectsort(int[] arr)
	{
		for (int x=0;x<arr.length-1 ; x++)
		{
			for (int y=x+1;y<arr.length ;y++ )
			{
				if(arr[x]>arr[y])
					{
						int temp=arr[x];
						arr[x]=arr[y];
						arr[y]=temp;
					}
			}
		}
	
	}
//冒泡排序
	public static  void bubblesort(int[] arr)
		{
			for (int x=0;x<arr.length-1 ;x++ )//for(int x=arr.length-1;x>0;x--)
												//for(int y-0;y<x;y++)
			{
				for (int y=0;y<arr.length-x-1 ;y++)//-x让每一次比较的元素减少；-1避免角标越界，角标是从0开始的
				{
					if(arr[y]>arr[y+1])
					{
						/*int temp=arr[y];
						arr[y]=arr[y+1];
						arr[y+1]=temp;*/
						swap(arr,x,y);
					}
				}
			}
		}
	/*
	无论什么排序，都需要对满足条件的元素进行位置置换
	所以可以把这部分相同的代码提取出来，单独封装成一个函数
	*/
	public static void swap(int[] arr,int a,int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
//主函数
	public static void main(String[] args) 
	{
		int[] arr={5,1,6,4,2,8,9};
		
		//在排序前打印
		printarray(arr);
		/*
		//排序
		selectsort(arr);
		//排序后
		printarray(arr);
		
		bubblesort(arr);
		*/
		Arrays.sort(arr);//java中已经定义好的排序方式
		printarray(arr);
		


	}
//打印字符操作，以[a,b,c,d……z]形式打印
	public static void printarray(int[] arr)
	{
		System.out.print("[");
		for (int x=0;x<arr.length ;x++ )
		{
			
			if(x!=arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"]");
		}
	}
}
