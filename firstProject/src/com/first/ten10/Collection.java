package com.first.ten10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection implements MakeLove{
	
	
	
	public static void main(String[] args) {
		
		//����
		//��̬������ָ�����࣬�ӿ�ָ��ʵ�ָýӿڵ��ࣩ
		//����
		List<String> list   =new ArrayList<String>();
		//�򼯺�������Ӷ���
		list.add("sdfs");
		list.add("ddddd");
		list.add("dsf");
	
		System.out.println("���ϣ�"+list);
		
		
		
		for (int i = 0; i < list.size(); i++) {
			//�Ӽ�����ȡ���ķ���
			String str=list.get(i); 
			System.out.println("�Ǳ꣺         "   +   i    +"    �����    "+str);
		}
		for (String str : list) {
			System.out.println("foreach:           "+str);
		}
		
		
		
		
		//map
		Map<String, Object> map=new HashMap<String, Object>();
		//putװ����
		
		//key��Ψһ�ģ�Կ�ף�      value�������Լ��Ķ�����ֵ��
		map.put("key", "value");
		map.put("jier", "heheda");
		//�ڶ��ε�key��ѵ�һ�ε�keyֵ����
		map.put("key", "����");
		
		System.out.println("map��ֵ��    "+map.get("key"));
		
		//ѭ��������
		
		
	}

	@Override
	public void makeLove() {
		System.out.println("���Ѿ�����");
	}

}
