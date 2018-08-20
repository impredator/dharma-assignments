package java8;

import java.util.*;

public class Commoditys implements Iterable{
    public static List<Commodity> goods;
    public static List<Commodity> create(){
        Commodity g1 = new Commodity("������˹",1,30,40);
        Commodity g2 = new Commodity("�ϱ���",2,3,20);
        Commodity g3 = new Commodity("������",3,10,30);
        Commodity g4 = new Commodity("Ŵ������",4,1,14);
        Commodity g5 = new Commodity("������",5,5,60);
        Commodity g6 = new Commodity("������",6,17,30);
        Commodity g7 = new Commodity("�޻���",7,6,10);
        Commodity g8 = new Commodity("����",8,4,20);
        Commodity g9 = new Commodity("�ɿ���",9,100,100);
        Commodity g10 = new Commodity("����",10,2,100);
        goods = Arrays.asList(g1,g2,g3,g4,g5,g6,g7,g8,g9,g10);
        return goods;
    }

    public static void _(Object o){
        System.out.println(o);
    }
    public static double sum(List<Commodity> commodities){
        double totalPrice = commodities.stream()
                .mapToDouble(Commodity::getNumber)
                .sum();
        return totalPrice;
    }
    public static Optional<Commodity> maxPrice(List<Commodity> commodities){
        Optional<Commodity> max = commodities.stream()
                .max(Comparator.comparingDouble(Commodity::getPrice));
        return max;

    }

    @Override
    public Iterator iterator() {
        return goods.iterator();
    }
}
