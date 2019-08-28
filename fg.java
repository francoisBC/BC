/*
面向对象：三个特征：封装，集成，多态。
开发就是找对象使用。没有对象就创建一个对象。
找对象，建立对象，使用对象，维护对象的关系。

类和对象的关系：

现实生活中的对象：张三，李四
描述：提取对象中的共性内容，对具体的抽象
描述时：这些对象的共性有：。。。。。。

映射到java中，描述就是class定义的类
具体对象就是对应java在堆内存中用new建立的实体。

类就是对现实生活中的事物的描述
对象：就是事物，实实在在存在的个体。

*/

/*描述一个汽车
描述事物就是在描述事物的属性和行为。
其实定义类就是在描述事物，就是在定义属性和行为。属性和行为共同称成为类中的成员（成员变量和成员函数）
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
/*匿名对象
*/
class car
{
	
	//描述颜色
	String color="red";
	//描述轮胎数
	int num=4;
	//运行行为




	void run()
		{
			System.out.println(color+".."+num);
		}
	/*public static void main(String[] args)
		{
			run();
		}
	*/
}


/*
private:私有、权限修饰符：用于修饰类中的成员（成员变量，成员函数）。
私只在本类中有效
将age私有化以后，类以外即使建立了对象也不能直接访问
所以要在person中提供对应访问age的方式。
私有只是封装的一种表现形式

对外提供访问方式，因为可以在访问方式中加入逻辑判断等语句
对访问的数据进行操作，提高代码健壮性
*/
class person
{
	private int age;//使其私有化
	public void setage(int a)
	{
		if(a>0&&a<200)
			age=a;
		else
			System.out.println("非法");

	}
	public int getage()
	{
		return age;
	}
	void speak()
	{
		System.out.println("age="+age);
	}
}

class fg
{

	

	public static void main(String[] args) 
	{
		//生产汽车。在java中通过new来完成，就是在堆内存中产生一个实体
		car c=new car();//c就是一个类类型变量
		//将已有的车的颜色改成蓝色。指挥该对象做使用。在java中的指挥方式是：对象。对象成员
		c.color="blue";
		c.run();
		
		car c1=new car();
		c1.num=5;
		c1.run();
		//new car();//匿名对象
		//new car().num=5;
		/*匿名对象使用方向一：当对对象的方法只调用一次时，可以用匿名对象，比较简化
		如果对一个对象进行多个成员调用，必须给这个对象起个名字。
		匿名对象使用方式二：可以将匿名对象作为实际函数进行传递。
*/
	person p=new person();
	p.setage(19);
	p.speak();
}
/*
需求：汽车修配厂。对汽车进行改装，将来的车够改成黑车，三个轮胎

*/
/*main()
	{

	//car c=new car();
	//show(c);//上下相同，匿名对象可以作为实际参数
	show(new car());

	}//栈

	 public static void show(car c)

	{
		c.num=3;
		c.color="black";
		c.run();
	}//堆
*/

		

				
	
}

/*人开门：名词提炼法
人
{
	开门（门）
	{
		门.开（）；
	}
}

门
{
	开（）{操作门轴等}
}
*/
