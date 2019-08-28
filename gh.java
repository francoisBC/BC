/*
this:用于区分局部变量和成员变量同名的情况
this:代表本类的对象，
	代表它所在函数所属对象的引用
	哪个对象在调用this所在的函数，this就代表哪个对象

this的应用：当定义类中的功能时，该函数内部要用到调用该函数的对象时，这时用this来表示这个对象
		但凡本类功能内部使用了本类对象

*/
class Person
{
	private String name;
	private int age;
	Person(int age)
	{
		this.age=age;
	}
	
	Person (String name)
	{
		
		this.name=name;	
	}
	Person(String name,int age)
	{
		this(name);//this.name=name;   p(name);
			//this语句用于构造函数之间进行互相调用,this语句只能放在构造函数第一行
			//因为构造函数要先执行
		//this.name=name;
		this.age=age;
	}

	public void speak()
	{
		System.out.println("name="+this.name+"...age="+this.age);
		this.show();//同一类中this可以省略
	}
	public void show()
	{
		System.out.println(this.name);
	}
	public boolean compare(Person p)
	{
			
			
			return this.age==p.age;			
	}


}
/*
给人定义一个用于比较年龄是否相同的功能
*/
	

class fghi

{
	public static void main(String[] args) 
	{
		/*Person p3=new Person(33);
		Person p4=new Person(34);
		boolean b=p3.compare(p4);
		System.out.println(b);*/
		Person p=new Person("小gt",3);
		Person p1=new Person("大gt",8);
		p.speak();
		p1.speak();
	}
}
