package ThreadGrocei;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Commoditys implements Iterable{
    public List<Commodity> commodities = new ArrayList<>();

    public Commoditys() {
        commodities.add(new Commodity("������˹",1,30,40));
        commodities.add(new Commodity("�ϱ���",2,3,20));
        commodities.add(new Commodity("������",3,10,30));
        commodities.add(new Commodity("Ŵ������",4,1,14));
        commodities.add(new Commodity("������",5,5,60));
        commodities.add(new Commodity("������",6,17,30));
        commodities.add(new Commodity("�޻���",7,6,10));
        commodities.add(new Commodity("����",8,4,20));
        commodities.add(new Commodity("�ɿ���",9,100,100));
        commodities.add(new Commodity("����",10,2,100));
    }

    public void remove(int index) {
        if(commodities.get(index).getNumber() == 0){
            System.out.println("����Ʒ���ۿ�");
        }else {
            int num = commodities.get(index).getNumber()-1;
            commodities.get(index).setNumber(num);
            System.out.println(commodities.get(index));
        }

    }


    @Override
    public Iterator iterator() {
        return commodities.iterator();
    }
}
