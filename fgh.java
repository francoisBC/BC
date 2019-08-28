/*
构造函数:对象一建立就会调用与之对应的构造函数
作用：可以用于给对象进行初始化
细节：当一个类中没有定义构造函数时，那么系统会默认给该类加入一个空参数的构造函数。
当在类中自定义了构造函数后，默认的构造函数就没了
构造函数和一般函数在写法上有不同

在运行上也不同
构造函数是在对象一建立就执行。给对象初始化
而一般方法是对象调用才执行，给是对象添加具备的功能
一个函数建立，构造函数只执行一次
而一般方法对象能执行多次

定义构造函数：当分析事物时，该事物存在具备一些特性或者行为，那么将这些内容定义在构造函数中



1函数名与类名相同
2不用定义返回值类型
3不可以写return语句
作用：给对象进行初始化


*/
class p
{
	private String name;
	private int age;

		/*构造代码块
		作用：给对象进行初始化
		对象一建立就运行，而且优先于构造函数执行
		和构造函数的区别：
		构造代码块是给所有对象进行统一初始化
		而构造函数是给对应的函数初始化

		构造代码块中定义的是不同对象共性的初始化内容
		*/
	
	{
		System.out.println("person code run");
	}
	p()
	{
		System.out.println("A:name="+name+",,age="+age);
	}
	p(String n)
	{
		name=n;
		System.out.println("B:name="+name+",,age="+age);
	}
		p(String n,int a)
	{
		name=n;
		age=a;
		System.out.println("V:name="+name+",,age="+age);
		cry();
	}
	public void speak()
	{
		System.out.println("name="+name+"...age="+age);
	}


	public void setname(String n)
	{
		name=n;
	}
	public String getname()
	{
		return name;
	}


	public void cry()
	{
		System.out.println("cry......");
	}
	/*
	p()
	{
		System.out.println("pr");
	}
	*/
}

class fgh 
{
	public static void main(String[] args) 
	{
		//p p1=new p();
		//new p();
		
		//p p3=new p("miaom");
		p p4=new p("小gt",19);
		p4.cry();
		p4.setname("傻小gt");
		System.out.println(p4.getname());
	}
}
