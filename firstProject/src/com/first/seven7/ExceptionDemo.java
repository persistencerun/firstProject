package com.first.seven7;

import java.util.Date;

/**
 * �쳣��
 * @author Administrator
 *
 */
public class ExceptionDemo {
	
	private String studentName;
	
	/**
	 * �������
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//��̬��������Ķ��������Ǿ�̬
		//jiero();
		//���þ�̬����
		//�����ͷ���������Сд��ͷ���շ�
		heheda();
			
		//��̬������������ͨ������ͨ������������
		Date date = null;
		//Date date = new Date();
		//���÷����к��߱�ʾ��ʱ
		//date.getDay();
		//����   ��ָ��
		
		
		//�����쳣
//		try{
//			
//		}catch(Exception eddg){
//			
//		}
		
//		try {
//			System.out.println("����ǰ");
//			//����
//			date.getDay();
//			System.out.println("û����");
//		}catch(Exception e) {
//				System.out.println("�����ʱ��");
//		        System.out.println("�����һ���쳣���������ִ��");
//		}
		
		cuowu();
		
		System.out.println("�������");
	}
	
	
	/**
	 * ��̬����
	 */
	@Deprecated
	public static void heheda() {
		System.out.println("��������");
	}
	
	/**
	 * ��ͨ����
	 */
	public  void jiero() {
		System.out.println("����");
	}
	
	
	/**
	 * �Զ����׳�����
	 * @throws Exception 
	 */
	public static void cuowu() throws Exception{
		System.out.println("�׳�����");
		throw new Exception("��ƨ��ʹ");
		
	}
	
	
	/**
	 * �Զ����׳�����
	 * @throws Exception 
	 */
	public static void cuowu121() {
		System.out.println("�׳�����");
		try {
			throw new Exception("��ƨ��ʹ");
		} catch (Exception e) {
			//û�б�Ҫ
			e.printStackTrace();
		}
	}

}
