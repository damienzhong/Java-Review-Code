/*
	++,--�������ʹ�ã�
		����ʹ�ã����ڲ�������ǰ��ͺ���Ч����һ���ġ��������÷������ǱȽϳ����ģ�
		��������ʹ�ã�
			���ڲ�������ǰ�棬���������Լ���Ȼ���ٲ�������
			���ڲ������ĺ��棬�Ȳ������㣬�����������Լ���
	
*/
public class OperatorDemo2{
	public static void main(String[] args){
		int x = 3;
		int y = 4;
		
		//�ַ�����ƴ��
		//System.out.println("x:" + x);
		//System.out.println("y:" + y);
		
		System.out.println("x:" + x + ",y:" + y);
		
		//����ʹ��
		//x++;
		//y--;
		++x;
		--y;
		//System.out.println(x);
		System.out.println("x:" + x + ",y:" + y);
		//��������ͣ������Ĳ�������������
		//System.out.println(10++);
		
		System.out.println("==========================");
		//��������ʹ��
		int a = 3;
		int b = 4;
		
		//int c = a++;
		//int d = b--;
		
		int c = ++a;
		int d = --b;
		
		System.out.println("a:" + a);//4	4
		System.out.println("b:" + b);//3	3
		System.out.println("c:" + c);//3	4
		System.out.println("d:" + d);//4	3
	}
}