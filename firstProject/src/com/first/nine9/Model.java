package com.first.nine9;


/**
 *     �˵������ࣨ���ࣩ
 * @author Administrator
 *
 */
public class Model {
	//��װ   �̳�   ��̬                                    
	
	//��װ���־�����ͷ���                 //�̳�   �������Ϻ��Ķ����㶼�У����������ԣ�             //��̬

	
	//�޷����ú͸�ֵ
	//private��˽�е�
	
	//get����ȡ��    set����ֵ������
	private String id;
	
	private String age;
	
	private String name;
	
	//��
	//public���е�
	public  String foot;

	
	//get�õ�ID
	public String getId() {
		//��������ֵ
		return id;
	}

	//set���Ǹ�ID��ֵ
	public void setId(String id) {
		//this��ǰ����
		this.id = id;
		//û�з���ֵ
	}

	

	
	//get   set     �Ҽ�ѡ��sourse��ѡ��getset   
	
	
	//toString
	@Override
	public String toString() {
		return "������˹���ü���ɽ��ҷ���Ʒ� [id=" + id + ", age=" + age + ", name=" + name + ", foot=" + foot + "]";
	}



}
