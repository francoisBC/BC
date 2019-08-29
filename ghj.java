/*
静态：static
用法：是一个修饰符，用于修饰成员（成员变量，成员函数）
当成员被静态修饰后，就多了一个调用方式，除了可以被调用外，
还可以直接被类名调用
类名。静态成员

static的特点：
1随着类的加载而加载
也就是说：静态会随着内的消失而消失。说明它的生命周期最长
2优先于对象存在
明确：静态是先存在。对象是后存在的
3被所有对象所共享
4可以直接被类名所调用

实例变量和类比那年的区别
1存放位置
	类变量随着内的加载而存在于方法区中。随着内的消失而消失
	实例变量随着对象的建立而存在于堆内存中。
2生命周期：
	类变量生命周期最长，随着类的消失而消失。
	实例变量生命周期随着对象的消失而消失

静态使用注意事项：
1静态方法只能访问静态成员。
	非静态方法可以访问静态成员
2静态方法中不可与定义this,super关键字
	因为静态优先于对象存在。所以静态方法中不可以出现this
3主函数是静态的

静态有利有弊
利：对对象的共享数据进行单独空间的存储，节省内存，没有必要每个对象中都存储
	可以直接被类名调用。
弊：生命周期过长。
	访问出现局限性（静态只能访问静态）

*/

class person
{
	static String name;//成员变量，实例变量。
	static String country="CN";//静态的成员变量，类变量
	public static void show()
	{
		System.out.println(name+"::::"+country);	
	}
}


class gh 
{
	public static void main(String[] args) 
	{
		/*
		person p=new person();
		p.name="xiaoggeteng";
		p.show();
		
		System.out.println(p.country);*/
		//System.out.println(person.country);
		person.show();
	}
}

