/**
	����һ������
	
	���������䶼�Ǳ仯�ģ���������ܽ��ܣ���Ϊÿ���˵��Ա�����䶼�ǲ�ͬ�ġ�
	���ǣ���������ѡȡ�ļ����˶����й��ˣ����ǵĹ�������һ���ġ�
	һ���Ĺ�������ÿ�δ��������ڶ��ڴ��ж�Ҫ���������Ŀռ䡣
	�˷��˿ռ䡣
	��ô�죿
	��Զ�������й�ͬ�ĳ�Ա����ֵ��ʱ��
	java���ṩ��һ���ؼ��������Σ�static
*/
class Person{
	//����
	String name;
	//����
	int age;
	//����
	//String country; 
	static String country; 
	
	public Person(){}
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Person(String name,int age,String country){
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	public void show(){
		System.out.println("������"+this.name+",���䣺"+this.age+",������"+country);
	}
}

public class PersonDemo{
	public static void main(String[] args){
		//��������1
		Person p1 = new Person("������",23,"�й�");
		p1.show();
		//��������2
		//Person p2 = new Person("գ�ۼ�",24,"�й�");
		//p2.show();
		Person p2 = new Person("գ�ۼ�",24);
		p2.show();
		
		//��������2
		//Person p3 = new Person("���",31,"�й�");
		//p3.show();
		Person p3 = new Person("���",31);
		p3.show();
		System.out.println("---------------------");
		p3.country = "����";
		p3.show();
		
		p1.show();
		p2.show();
	}
}
	
	