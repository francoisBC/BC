class ecbn 
{
	/*
	int[] arr=new int[3];//一维数组
	int[][] arr=new int[3][4];//二维数组
								是名称为arr的二维数组。有三个一位数组
								每一个一维数组中有四个元素。

		*/


	public static void main(String[] args) 
	{
		tobin(8);
			System.out.println();
		tohex(34);
			System.out.println();
		toeight(34);
			System.out.println();
		int[][] arr=new int[3][];
		arr[0]=new int[3];
		arr[1]=new int[1];
		arr[2]=new int[2];

		System.out.println(arr.length);//打印二维数组的长度；
		System.out.println(arr.length);//打印二维数组中第一个一维数组长度
		
		System.out.println(arr[0]);
		
		int[][] arr1={{3,5,1,7},{2,8,5,4},{3,5,8,6}};
		int sum=0;
		for (int x=0;x<arr1.length ;x++ )
		{
			for (int y=0;y<arr1[x].length ;y++ )
			{
				sum=sum+arr1[x][y];
			}
		}
		System.out.println("sum="+sum);

		
	}
	public static void tobin(int num)
	{
		trans(num,1,1);
	}
	public static void tohex(int num)
	{
		trans(num,15,4);
	}
	public static void toeight(int num)
	{
		trans(num,7,3);
	}
	public static void trans(int num,int base,int offset)
	{
		if(num==0)
		{
			System.out.println(0);
			return ;
		}
		char[] chs={'0','1','2','3',
					'4','5','6','7',
					'8','9','A','B',
					'C','D','E','F'};
		char[] arr=new char[32];

		int pos=arr.length;

		while(num!=0)
		{
			int temp=num&base;
			arr[--pos]=chs[temp];
			num=num>>>offset;
		}
		for (int x=pos;x<arr.length ;x++ )
		{
			System.out.print(arr[x]);
		}
	}
}
/*
int[] x;int x[];
int[][] y;int y[][];int[] y[];


int[] x,y[];//x一维，y二维
a.
x[0]=y;//error
b.
y[0]=x;//yes
c.
y[0][0]=x;//error
d.
x[0][0]=y;//error
e.
y[0][0]=x[0];//yes
f.
x=y;//error





*/
