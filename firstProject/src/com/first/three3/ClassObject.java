package com.first.three3;   //����һ����com.first.three3�İ�

public class ClassObject {   //����һ����ClassObject����
	
	byte a;
	short b;
    int c;       //��Ҫ   ����                             //  8�ֻ�����������       �������Ϊ��������������  ��   Ӧ����������
	long d;      
	float e;
	double f;    //
	char g;
	boolean o;   //��Ҫ  �Դ�
	
	//��Ա����    �����У����ڷ����У�
	//�ֲ�����    �ڷ�����
	//��̬����
	static int jj=8;
	
	//byte short int�ȵ��ǻ�������
	
	// abcdefgoy�����Ǳ���
	
	final static char y=5;    //����ǰ��final�ؼ��ֱ䳣������˼�����޸ģ�
	      //static ���ڶ��徲̬����
	

	public static void main(String[] args) {   //����һ��main������̬����
		//y=6;
		
		
		//�˷�   
		System.out.println(5*6);
		//����
		System.out.println(6/5);
		//ȡģ
		System.out.println(6%5);
		//�ӷ�  ����  +   -
		//�Ƚ�  > <  >=  <=
		
		
		//����   &   |    &&    ||
		
		//&��&&���Ǻ͵���˼     ���ߵ�ʽ���ǶԵĲ���true
		//|��||�ǻ��ߵ���˼     ���ߵ�ʽֻҪһ���ǶԵľͿ�����
		//����
		// �����
		int num=5;
		int doub=6;
		//tab����    
		//shift + tab�Ƿ�����
		if(num>5 & doub>6){
			//false
		}
        if(num>5 && doub>4){
        	//�;������߶��ǶԲ���ture
			//�ж���Ϊ    ǰ����   ����Ͳ�ȥ�ж�   ���Ϊ��
		}
        //��һ��&      ��������ǲ��ǶԵ�   �������ж��ұ�
        //�ڶ���&&     �������Ǵ��   ���Ͳ����ж��ұ���   ֱ�ӷ��ش�
        //һ��&&��||�õĶ�
        
	
        if(num>5 | doub>6){
			//false
		}
        if(num>5 || doub>4){
        	//�����һ���ǶԵĽ������ture
			//�ж���Ϊ    ǰ����   ����Ͳ�ȥ�ж�   ���Ϊ��
		}
            
		num++;
		++num;
		
		
	}

}
