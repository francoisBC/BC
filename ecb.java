class ecb 
{
	public static void main(String[] args) 
	{
		tohex(454656);
		tobin(2454);

	}
	/*查表法：将所以元素临时存储起来。建立对应关系。
	每一次&15后的值作为索引去查建立好的表。就可以找到对应的元素
	可以通过数组的形式来定义。

	通过StringBuffer 的 reverse功能来将反着的正过来
	*/
	public static void tohex(int num)
	{
	char[] chs={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	//定义一个临时容器。
	char[] arr=new char[8];//'\u0000'国际标准码 空格
	int pos=arr.length-1;
		while(num!=0)

		
		{
			int temp=num&15;
			arr[pos--]=chs[temp];

			//System.out.println(chs[temp]);

			num=num>>>4;
		}
		System.out.println("pos="+pos);
		for (int x=pos+1;x<arr.length ;x++ )
		{
			
			System.out.print(arr[x]);
	
		}
	}
	public static void tobin(int num)
	{
		//定义一个二进制的表
		char[] chs={'0','1'};
		//定义一个临时存储器
		char[] arr=new char[32];
		//定义一个操作数组的指针
		int pos=arr.length;
		while(num!=0)
		{
			int temp=num&1;

			arr[--pos]=chs[temp];

			num=num>>>1;

		}
		System.out.println();
		for (int x=pos;x<arr.length ; x++)
	
		{

				System.out.print(arr[x]);
		}
	}
}
