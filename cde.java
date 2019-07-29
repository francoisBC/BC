/*使用重载的时候
当定义的功能相同，但参与运算的未知内容不同。
那么，这时就定义一个函数名称以表示其功能，方便阅读，而而通过参数列表的不同来区分多个同名函数
*/

class  cde
{
	public static void main(String[] args) 
	{
		int add=add(4,5);
		int add1=add1(4,5,6);
		System.out.println("Hello World!");
		System.out.println(add+"and"+add1);
		print99(4);
	}
	//定义一个加法运算，获取两个整数的和。
	public static int add(int x,int y)
	{
		return x+y;
	}
	//定义一个加法，获取三个整数的和
	public static int add1(int x,int y, int z)
	{
		return x+y+z;
	}
	/*
	乘法表
	*/
	public static void print99(int num)
	{
		for (int g=1;g<=num ;g++ )
		{
			for (int h=1;h<=g ;h++ )
			{
				System.out.print(h+"*"+g+"="+h*g+"\t");
			}
			System.out.println();
		}
	}
	/*
	问是否重载
	void show(int a,char b,double c){}//没有，因为和原函数一样
	a.
	int show(int a,double c,char b){}//重载了，因为参数类型不同
	b.
	void show(int a,double c,char b){}//重载了，因为参数类型不同
	c.
	boolean show(int c,char b){}//重载了，因为参数个数不同
	d.
	void show(double c){}//重载了，因为参数个数不同
	e.
	double show(int x,char y,double z){}//没有，但这个函数不可以和给定函数在一个类中
	*/

}
