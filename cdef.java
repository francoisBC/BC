class  cdef
{
	public static void main(String[] args) 
	{
		/*元素类型[] 数组名=new元素类型[元素个数或数组长度]；
		需求：定义一个可以存储三个整数的容器。*/
		/*栈内存中的数据使用完毕会自动释放
		而堆不是*/
		/*int[] arr=new int[2];  好
		或int arr[]=new int[2];
		*/
		int[] z=new int[3];//new出来的东西都在堆里
		int[] y=z;
		y[1]=89;
		z[0]=59;
		z[1]=77;
/*

		int[] arr=new int[]{4,1,6,5,3};//以这种方式写,等号右边[]不要指定长度
		System.out.println(arr[2]);
		//若出现ArrayIndexOutOfBoundsExpection: 3:操作数组时，访问到了数组中不存在的角标
		//NullPointerException:空指针异常：当引用没有任何指向值为null的情况，该引用还在用于操作实体
		*/
			//打印数组中角标为0的数据，数组堆中默认值都为0
		System.out.println(z[0]+","+z[1]+","+z[2]);
		//数组的操作，获取数组中的元素。通常会用到遍历
		//int[] arr=new int[3];
		int[] arr={3,6,4,2,1,7};
		/*length属性可以直接获取到数组元素个数。
		使用方式：数组名称.length=
		*/
		System.out.println("length:"+arr.length);
		int sum=0;


		for(int x=0;x<arr.length;x++)
		{
			sum+=arr[x];
			System.out.println(sum);
			System.out.println("arr["+x+"]="+arr[x]+";");
			//System.out.println(arr);//[I@71f2a7d5  这串东西@前面的I指Int  @后面的是数组在电脑里的存放地址（16进制）
			printarray(arr);
		}
	}
	//定义功能，用于打印数组中的元素。元素间用逗号隔开。
	
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
