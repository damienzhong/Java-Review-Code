/*
	������
	
	������
		��ʽ��import ����;
			���ַ�ʽ�����ǵ��������
		ע�⣺������˭�͵�˭
	�����⣺
		package,import,class��û��˳���ϵ��
		�У�
		package>import>class
		
		package:ֻ����һ��
		import:�����ж��
		class:�����ж�����Ժ����ǽ�����һ��
*/
package cn.damien;

import com.damien.Demo;

class Test{
	public static void main(String[] args){
		Demo d = new Demo();
		System.out.println(d.sum(10,20));
		/*com.damien.Demo d = new com.damien.Demo();
		System.out.println(d.sum(10,20));
		
		com.damien.Demo d2 = new com.damien.Demo();
		System.out.println(d2.sum(10,20));
		
		com.damien.Demo d3 = new com.damien.Demo();
		System.out.println(d3.sum(10,20));
		
		com.damien.Demo d4 = new com.damien.Demo();
		System.out.println(d4.sum(10,20));
		*/
	}
}

/*
	��һ�����⣺�Ҳ���Demo
	�ڶ������⣺�����com.damien������
	���������⣺Demo��com.damien�в��ǹ�����; �޷����ⲿ������ж�����з���
*/