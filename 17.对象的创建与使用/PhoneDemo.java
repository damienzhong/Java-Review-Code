class Phone{
	//Ʒ��
	String brand;
	//�۸�
	int price;
	//��ɫ
	String color;
	
	//��绰
	public void call(String name){
		System.out.println("��"+name+"��绰");
	}
	
	//������
	public void sendMessage(){
		System.out.println("�����š�����");
	}
	
	//����Ϸ
	public void playGame(){
		System.out.println("������ҫcarry�С�����");
	}
}

class PhoneDemo{
	public static void main(String[] args){
		//ʹ��ǰ��Ҫ��������
		//���� ������ = new ����();
		Phone p = new Phone();
		
		System.out.println(p.brand+"==="+p.price+"==="+p.color);
		
		//����Ա��ֵ
		p.brand = "iPhone X";
		p.price = 6888;
		p.color = "��ɫ";
		System.out.println(p.brand+"==="+p.price+"==="+p.color);
		
		//���÷���
		p.call("������");
		p.sendMessage();
		p.playGame();
		
		System.out.println("------------------------");
		
		Phone p2 = new Phone();
		
		System.out.println(p2.brand+"==="+p2.price+"==="+p2.color);
		
		//����Ա��ֵ
		p2.brand = "����";
		p2.price = 2299;
		p2.color = "��ɫ";
		System.out.println(p2.brand+"==="+p2.price+"==="+p2.color);
		
		//���÷���
		p2.call("�����Ȱ�");
		p2.sendMessage();
		p2.playGame();
		System.out.println("------------------------");
		Phone p3 = p;
		System.out.println(p3.brand+"==="+p3.price+"==="+p3.color);
		
		//����Ա��ֵ
		p3.brand = "��Ϊ";
		p3.price = 1999;
		p3.color = "��ɫ";
		System.out.println(p3.brand+"==="+p3.price+"==="+p3.color);
		System.out.println(p.brand+"==="+p.price+"==="+p.color);
		
	}
}