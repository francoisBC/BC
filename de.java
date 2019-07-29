class  de
{/*如何定义函数
1.函数是一个独立的功能，先明确该功能的运算结构
2.再明确再定义该功能的过程中是否需要哦未知的内容参与运算。*/
	public static void main(String[] args) 
	{
		int sum=getsum(8,9);
		System.out.println("sum="+sum);
		int x=getsum(4,4);
		int y=getsum(7,8);
		int num=getmax(x,y);
		System.out.println("max="+num);
		draw(5,6);
		printhr();
		draw(9,4);
		printhr();
		print99();
	}
	/*
	乘法表
	*/
	public static void print99()
	{
		for (int g=1;g<=9 ;g++ )
		{
			for (int h=1;h<=g ;h++ )
			{
				System.out.print(h+"*"+g+"="+h*g+"\t");
			}
			System.out.println();
		}
	}
	/*功能内容是一个和。返回值类型是int
	有未知内容参与运算。有两个，且都为int*/
	public static int getsum(int x,int y)
	{
	return x+y;
	
	}
	/*定义功能，打印矩形
	思路：没有结果，返回值类型为void
	有未知内容，矩形的行和列不确定。
	*/
	public static void draw(int row,int col)
	{
		for (int c=0;c<row ;c++ )
		{
			for (int d=0;d<col ;d++ )

			{
				System.out.print('*');
			}
			System.out.println("");
		}
	}
	public static void printhr()
	{
	System.out.println("------------");
	}
	/*
	需求：判断两个数是否相同
	思路：
	明确功能结果，是boolean型
	功能有未知内容参与运算，有两个整数*/
	/*public static boolean compare(int a,int b)
	{ 
		/*if(a==b)
			return true;
		
			return false;
			//return (a==b)?true:false;
		return a==b;
	}*/
	/*需求：定义功能，对两个数进行比较，获取较大的数
	*/
	public static int getmax(int a,int b)
	{
		/*if(a>b)
			return a;
		else
			return b;*/
		return (a>b)?a:b;
	}
	
	/*public static void get(int a,int b)//void不能在输出语句输出
	{
		System.out.println(a+b);
		return;
	}*/
	//功能定义不要打印
 
}


