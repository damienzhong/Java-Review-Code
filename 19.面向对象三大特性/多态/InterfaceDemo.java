/*
	�ӿڵ��ص㣺
		A���ӿ��ùؼ���interface��ʾ
			interface �ӿ���{}
		B����ʵ�ֽӿ���implements��ʾ
			class ���� implements �ӿ���{}
		C���ӿڲ���ʵ����
				��ô���ӿ����ʵ������
				���ն�̬�ķ�ʽ��ʵ������
		D���ӿڵ�����
			a.�����ǳ���ģ�����ûʲô���塣
			b.���Ǿ����ࡣҪ��д�ӿ��е����г��󷽷������Ƽ�������
		
		�ɴ˿ɼ���
			A���������̬������û�У�
			B���������̬�����ã�
			C���ӿڶ�̬����ã�
*/
//���嶯����ѵ�ӿ�
interface AnimalTrain{
	public abstract void jump();
}
//������ʵ�ֽӿ�
abstract class Dog implements AnimalTrain{
	
}
//������ʵ�ֽӿ�
class Cat implements AnimalTrain{
	public void jump(){
		System.out.println("Cat jump");
	}
}
public class InterfaceDemo{
	public static void main(String[] args){
		//AnimalTrain�ǳ����; �޷�ʵ����
		//AnimalTrain at = new AnimalTrain();
		AnimalTrain at = new Cat();
		at.jump();
	}
}