package com.first.ele11;

public class While {

	public static void main(String[] args) {
		//���³� ��ʮһ�µ�
		//c#+            ��ҵ��չ   �����		
		//j2se+sql+GUI  ������		
		//webһ����		
		//j2eeһ���£�ˮ��
		
		
		//sql+j2se  �����
		//��ѵ��Ŀ+web   �����
		//��Ŀ    �����
		//����֪ʶ    �����
		
		
		
		
		//�˽�GUI
		
		//����     ����     ����      

		
		
		foreach();
	}
	
	

	
	public static  String foreach(){
		for (int i = 0; i < 6; i++) {
			System.out.println("****************************i:"+i);
			for (int j = 0; j < 6; j++) {
				if(j==3) {
//				System.out.println("������������ѭ����ִ����һ��");
//				continue;
				
//				System.out.println("���������ѭ��");
//				break;
					
				System.out.println("����ȫ��");	
				return null;
			  }
				System.out.println("i:"+i+"; j:"+j);
			}
		}
		
		return null;
	}

}
