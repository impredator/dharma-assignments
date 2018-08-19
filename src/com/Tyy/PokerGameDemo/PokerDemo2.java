package PokerGameDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*����������ƣ���ʹ���ƵĽ����������
 *����������ƵĽ��Ҫ��TreeSet���洢
 *	1.����HashMap�������洢��źͶ�Ӧ�Ƶ�����
 *	2.����ArrayList���洢���У����ڷ���
 *	3.���������еķ���
*/
public class PokerDemo2 {
	public static void main(String[] args) {
		//1.����HashMap�洢����
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		//2.����ArrayList�洢���
		ArrayList<Integer> array = new ArrayList<Integer>();
		//3.����
		//����Ҫ��color��number����
		String[] color = {"����","����","��Ƭ","÷��"};
		String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A","2"};
		int index = 0;
		//��3��Ϊ��Сֵ��ʼƴ���ַ�����������
		for(String n : number){
			for(String c : color){
				String s = c.concat(n);
				array.add(index);
				hm.put(index, s);
				index++;
			}
		}
		//��С�������ƺ�
		hm.put(index,"С��");
		array.add(index);
		index++;
		hm.put(index,"����");
		array.add(index);
		
		/*System.out.println(hm);
		System.out.println(array);*/
		
		//4.ϴ��
		Collections.shuffle(array);
		//5.����
		TreeSet<Integer> p1 = new TreeSet<Integer>();
		TreeSet<Integer> p2 = new TreeSet<Integer>();
		TreeSet<Integer> p3 = new TreeSet<Integer>();
		TreeSet<Integer> dp = new TreeSet<Integer>();
		
		for(int i  = 0;i<array.size();i++){
			if(i>= array.size()-3){
				dp.add(array.get(i));
			}else if(i%3==0){
				p1.add(array.get(i));
			}else if(i%3==1){
				p2.add(array.get(i));
			}else if(i%3==2){
				p3.add(array.get(i));
			}
		}
		//6.����
		LookPoker("��",p1,hm);
		LookPoker("��",p2,hm);
		LookPoker("��",p3,hm);
		LookPoker("����",dp,hm);
	}
	//Ҫд�����Ʒ���
	public static  void LookPoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
		System.out.println(name+"�����ǣ�");
		for(Integer key: ts){
			String value = hm.get(key);
			System.out.print(value+" ");
		}
		System.out.println();
	}
}
