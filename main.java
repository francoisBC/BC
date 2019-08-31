/*

public static void main(String[] args)

主函数是一个特殊的函数。作为程序的入口，可以被jvm调用

主函数的定义：
public:代表着该函数访问权限是最大的。
static；代表主函数随着类的加载就已经存在了。
void:对主函数没有具体的返回值。
main：不是关键字，但是是一个特殊的单词，可以被jvm识别。
函数的参数：（String[] arr参数类型是一个数组，该数组中的元素是字符串字符串类型的数组

主函数是固定格式的：jvm识别。

jvm在调用主函数时，传入的时new String[0];

什么时候使用静态

两方面：
静态修饰的内容有成员变量和函数
什么时候定义静态变量
当对象中的出现而来共享数据时，该数据被静态所修饰
对象中的特有数据要定义成非静态存在于堆内存中

什么时候定义静态函数
当功能内部没有访问到非静态数据（对象的特有数据）
那么该功能可以定义成静态的。

静态的应用。
每一个应用中都有共性的功能
可以将这些功能进行抽取，独立封装
以便复用

虽然可以通过建立ArrayTool的对象使用这些工具方法，对数组进行操作。
发现了问题
1对象是用于封装数据的，可是ArrayTool对象并未封装特有数据
2操作数组的每一个方法都没有用到ArrayTool对象中的特有数据。

这时就考虑，让程序更严谨，是不需要对象的
可以将ArrayTool中的方法都定义成static的。直接通过类名调用即可

将方法都静态后，可以方便使用，但是该类还是可以被其他程序建立对象的
为了更为严谨，强制让该类不能建立对象
可以通过将构造函数私有化完成。

java的说明书通过文档注释完成

*/
/**
这是一个可以对数组进行操作的工具类，该类中提供了，获取最值，排序等功能。
@author xiaomiao
@version v0.1

*/
//要生成文档，类必须是pubilc修饰，且此代码中只能有一个class被public，被public的那个class必须与文件名同名
//写法：javadoc -d -java- -author -version main.java

class tool
{
	/**
	空参数构造函数
	*/
	private tool(){}
	/**
	获取一个整形数组中的最大值。
	@param arr接收一个int类型的数组
	@return 会返回一个该数组中的最大值。
	*/
	public static int getmax(int[] arr)
	{
		int max=0;
		for (int x=1;x<arr.length ;x++ )
		{
			if(arr[x]>arr[max])
				max=x;
		}
		return arr[max];
	}
	/**
	获取一个整形数组中的最小值。
	@param arr接收一个int类型的数组
	@return 会返回一个该数组中的最小值。
	*/
	public static int getmin(int[] arr)
	{
		int min=0;
		for (int x=1;x<arr.length ;x++ )
		{
			if(arr[x]<arr[min])
				min=x;
		}
		return arr[min];
	}
	/**
	给int数组进行选择排序
	@param arr接收一个int类型的数组
	*/
	public static void selectsort(int[] arr)
	{
		for (int x=0;x<arr.length-1 ;x++)
		{
			for (int y=x+1;y<arr.length ;y++ )
			{
				if(arr[x]>arr[y])
				{
					swap(arr,x,y);
				}
			}
		}
	}
	/**
	给int数组进行冒泡排序
	@param arr接收一个int类型的数组
	*/
	public static void bubblesort(int[] arr)
	{
		for (int x=0;x<arr.length-1;x++ )
		{
			for (int y=0;y<arr.length-x-1 ;y++ )
			{
				if(arr[y]<arr[y+1])
				{
					swap(arr,y,y+1);
				}
			}
		}
	}
	/**
	给int数组进行冒泡排序
	@param arr接收一个int类型的数组
	@param a 要置换的位置
	@param b 要置换的位置
	*/
	private static void swap(int[] arr,int a,int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	/**
	用于打印数组中的元素。打印形式时[element1,element2.....]
	*/
	public static void printarray(int[] arr)
	{
		System.out.println("[");
		for (int x=0;x<arr.length ;x++ )
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"]");
		}
	}
}
class p
{
	String name;

	public void show()
	{
		System.out.println(name+"miao");

	}
}

class main 
{
	public static void main(String[] args) 
	{
		int[] arr={3,4,1,87,8};
		int max=tool.getmax(arr);

		System.out.println("max="+max);
		System.out.println(args.length);
		
		//String[] arr={"aa","bb","cc"};
		

	}
	public static void getmax(int[] arr)
	{
		int max=0;
		for (int x=1;x<arr.length ;x++ )
		{
			if(arr[x]>arr[max])
				max=x;
		}
		//return arr[max];
	}
	
}
class mt
{
	public static void main(String[] args)
	{
		for (int x=0;x<args.length ;x++ )
				System.out.println(args[x]);

		
	}
}
/*

一个类中默认会有一个空参数的构造函数
这个默认的构造函数的权限和所属类一致
如果类被public修饰那么默认的构造函数也带public修饰符
如果类没有被public修饰，那么默认的构造函数也没有public修饰

默认构造函数的权限
*/
