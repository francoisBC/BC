class  cd
{
	public static void main(String[] args) 
	{
		/*int x=1;
		while(x<8)
		{
			System.out.println("x="+x);
			x++;
		}*/
		int a=2;
		do
		{
			System.out.println("do:a="+a);
			a++;
		}
		while (a<5);
		/*while:先判断条件
		do while:先执行循环体
		do while:无论是否满足，至少执行一次*/
		for(int x=0;x<3;x++)/*for在循环中定义变量，那么该变量旨在循环内有效，变量有自己的作用域
			当for语句执行完毕，该变量在内存中被释放。
			for和while可以互换。若要定义循环增量，用for
			当要对某些语句执行多次，用循环
			for(初始表达式；循环条件表达式；循环后的操作表达式)*/

		{
			System.out.println("x="+x);

		}
		int b=1;
		for(System.out.println("a");b < 3;System.out.println("c"))
		{
			System.out.println("d");
			b++;
		}
		/*无限循环的最简表现形式。
		for(;;){}
		while(true){}
		*/


		/*获取1-10的和并打印
		1-100之间 7的倍数的个数。并打印*/
		int sum=0;
		int c=1;
		while(c<=10)
		{
			sum=sum+c;
			c++;
		}
		System.out.println("sum="+sum);
		//用for写
		int he=0;
		for(int d=0;d<=10;d++)
		{
			he+=d;
		}
		System.out.println("he="+he);

		int count=0;
		for(int d=1;d<=100;d++)
		{
			if(d%7==0)
				count++;
			if(d%7==0)
				System.out.println("d="+d);
				
		}
		System.out.println(count);
		//语句嵌套形式,循环嵌套
		for(int d=0;d<3;d++)//控制行
		{
			for (int f=0;f<4;f++)//控制列
			{
				System.out.print("*");
			}
		
		System.out.println();//作用是换行
		}
		System.out.println("---------------");
		for (int d=0;d<5;d++)
		{
	
			for (int f=d;f<5;f++)
			{
				System.out.print("*");
		
			}
			System.out.println();
		}

		//九九乘法表
		for (int d=1;d<=9;d++)
		{
			for (int f=1;f<=d;f++)
			{
				System.out.print(f+"*"+d+"="+d*f+"\t");
			}
			System.out.println();

		}
		/*其他流程控制语句
		break跳出：应用于选择和循环
		continue继续：应用于循环
		*/
		w:for (int d=0;d<3 ;d++ )//只有for循环可以起名字

		{
			q:for (int f=0;f<4 ;f++ )
			{
			
				System.out.println("d="+d);
			break w;//只写break,跳出的是当前循环
			}
		}
		for (int d=0;d<3 ;d++ )

		{
			if(d%2==0)
				continue;
			System.out.println("d="+d);
			continue;//结束本次循环，继续下一次循环
			
		}
		for (int d=0;d<5 ;d++ )

		{
			for (int f=d;f<5 ;f++ )
			{
				System.out.print("-");
			}
			for (int e=0;e<=d;e++ )
			{
				System.out.print("* ");
			}
			System.out.println();

		}
		//java中对功能的定义是通过函数来实现的
		/*修饰符 返回值类型 函数名(参数类型 形式参数1 参数类型 形式参数2)
		{
			执行语句；
			return 返回值；
		}
		当函数运算后，没有具体的返回值，这时返回值用void来标识
		当函数返回值类型是void时，函数中的return语句可以省略不写
		*/
		
		
		{
			int o=getResult(4);
			System.out.println("o="+o);
		}
		
	}
	
	    public static int getResult(int numb)
		
		{
			 return numb*3+5;
		}
}
