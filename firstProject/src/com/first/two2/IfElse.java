package com.first.two2;    //����һ����com.first.two2�İ�

public class IfElse {     //����һ����IfElse����
	
	public static void main(String[] args){   //����һ��main��������
//	    if(��||��){
//	    	��
//	    }else{
//	    	��
//	    }
		
		//int�������ֵ���˼      ��������
		
		//num�б���
		
		
		
		int num=5;   //����һ�����ͱ��������Ҹ�ֵ
		System.out.println("***********************************");  //��ӡ***********************************
		if(num>6){
			System.out.println("����6");
		}else{
			System.out.println("С�ڵ���6");
		}
		
		System.out.println("***********************************");
		num=8;
		//ֻ��һ��
		if(num>6){
			System.out.println("����6");
		}else if(num>7){
			System.out.println("����7");
		}else if(num>=8){
			System.out.println("����8");
		}else{
			System.out.println("С�ڵ���6");
		}
		System.out.println("***********************************");
		//�����
		
		if(num>6){
			System.out.println("����6");
		}
		
		if(num>7){
			System.out.println("����7");
		}
		
		if(num>=8){
			System.out.println("����8");
		}
		
		
		System.out.println("***********************************");
		
		//��Ŀ����
		
		//(boolean���ʽ)?(���ʽ1):(���ʽ2)
	     int numZi=8;
	     String jieguo=(numZi > 8 ? "true":"false");
	     //���ʽ����ȷ��    ����Ǳ��ʽ1    ������Ǳ��ʽ2
	     System.out.println(jieguo);
	     System.out.println("***********************************");	 
		
		//switch  ���
		String str="��51";
		
		switch(str){
	    case "��":
	    	System.out.println("����");
	        break;
	    case "��":
	    	System.out.println("����");
	        break;
	    default:
	    	System.out.println("����");
	    }
		
		
	}
	
	
}
