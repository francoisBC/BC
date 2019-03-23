class  bc
{
	public static void main(String[] args) 
	{
		/*
		\n：换行
		\b：退格
		\r:按回车。window中回车由两个字符表示\r\n.
		\t:按tab
		=是赋值运算
		==是等于
		!=是不等于
		instanceof检查是否是类的对象
		&与 无论左边是真是假，右边都运算
		|或
		^异或
		！非
		&&与 当左边为false 右边不运算
		||或 当左边为true右边不运算
		~取反码
		<<左移X,乘以2^x
		>>右移x,除以2^x，并向下取整，第一位补成原最高位
		>>>无符号右移，其余与>>相同，第一位补0
		(
		n=n^m
		m=n^m
		n=n^m
		)
		实现n与m的交换
		*/
		System.out.println((6&3)+"，"+(6|5));
		char c='\111';
		System.out.println("\"hello\nworld\""+c);
		System.out.println(Integer.toBinaryString(60));
		System.out.println(60&15);
		
		int num=60;//获取60的最低4位，通过&15；
		num=num & 15;
		int temp=60>>4;//获取下一组4位，并对temp进行最低4位的获取
		temp=temp&15;
		System.out.println(num>9?(char)(num-10+'A'):num);//此处会发生强制转换
		System.out.println((char)(num-10+'A')+","+temp);
		System.out.println(2+'A');
		int x=3,y;
		y=(x>1)?100:200;//三元运算符
		System.out.println(y);


		int a=3;
		if(a>1)/*if只控制离它最近的语句，其中靠前有一个表达式成立就结束。
		if else结构 简写形式：变量+（条件表达式）？表达式1：表达式2；
		三元运算符：可以简化if else 代码。但因为是一个运算符，所以运算完必须要有一个结果
		*/
			{
				System.out.println("yes");
			}
		else
			{
				System.out.println("no");
			}
		System.out.println("over");
		//需求：根据用户定义的数值不同。打印对应的星期英文。
		int num1=2;

		if(num1==1)
			System.out.println("monday");
		else if(num1==2)
			System.out.println("tuesday");
		else 
			System.out.println("no");
		//需求：根据用于指定月份，打印该月份所属的季节。
		//3，4，5春6，7，8夏9，10，11秋12，1，2东
		int d=4;
		if(d==3||d==4||d==5)
			System.out.println(x+"月春");
		else if(d==6||d==7||d==8)
			System.out.println(x+"月夏");
		else if(d==9||d==10||d==11)
			System.out.println(x+"月秋");
		else if(d==12||d==1||d==2)
			System.out.println(x+"月冬");
		else
			System.out.println(x+"月份不存在");
		switch(d)
		{
			case 3:
			case 4:
			case 5:
				System.out.println(x+"月春");
				break;
			default:
				System.out.println("no");
		}

			
		/*switch选择结构
		{
		case 取值1；
		执行语句；
		break;
		case 取值2；
		执行语句；
		break;
		..
		default:
		执行语句;
		break;
		}
		*/

		int f=2;
		
		switch(f)
		{
			case 4:
				System.out.println("a");
			break;
			case 8:
				System.out.println("b");
			break;
			case 2:
				System.out.println("c");
			break;
			default:
				System.out.println("d");
			break;
		}
		int g=4,h=2;
		char ch='+';

		switch(ch)
		{
			case'-':
				System.out.println(g-h);
			break;
			case'+':
				System.out.println(g+h);
			break;
			default:
				System.out.println(g*h);
			break;
		}
		/*if和switch语句很像。
		具体什么场景下，应用哪个语句呢？
		如果判断的具体数值不多，符合byte short int char这四种类型。
		此时switch效率较高
		其他：对区间判断，对布尔型用if的范围更广。
		*/
		

	}

}
