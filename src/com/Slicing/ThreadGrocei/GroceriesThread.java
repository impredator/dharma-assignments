package ThreadGrocei;

import java.util.Scanner;
import java.util.concurrent.locks.Lock;

public class GroceriesThread implements Runnable {
    private static int sum = 0;
    private static int onesum = 0;
    private static int count = 0;
    private final Object MUTEX = new Object();
    private static Commoditys commoditys = new Commoditys();
    @Override
    public void run() {
        synchronized (MUTEX){
            GroceriesThread.buy();
        }
    }
    public static void buy(){
        int index = (int)(1+Math.random()*9);
        Commodity commodity = commoditys.commodities.get(index);
        commoditys.remove(index);
        onesum += commodity.getPrice();
        sum += commodity.getPrice();
        count ++;
        System.out.println(commodity.getName() + "  " + commodity.getPrice());
    }

    public static void main(String[] args) throws InterruptedException {
        int time = 0;
        commoditys.commodities.forEach(System.out::println);
        Scanner scanner = new Scanner(System.in);
        while (time == 0){
            System.out.println("���������Ĺ����ǳƣ�");
            String name = scanner.nextLine();
            System.out.println("���������������������");
            int num = scanner.nextInt();
            GroceriesThread.thread(name,num);
            System.out.println("�Ƿ�������ˣ�");
            System.out.println(" 0 ����");
            System.out.println(" 1 ����");
            time = scanner.nextInt();
        }
        commoditys.commodities.forEach(System.out::println);

        System.out.println("���칲������" + count+ "����Ʒ�� " + "��" + sum + "Ԫ");



    }
    public static void thread(String name,int num) throws InterruptedException {
        System.out.println("�������ˣ�");
        onesum = 0;
        for (int i = 0;i < num;i++){
            Thread thread = new Thread(new GroceriesThread(),name);
            thread.start();
            thread.join();
        }
        System.out.println(name + " ������"+num+"����Ʒ,"+"�����ѣ�" + onesum + "Ԫ") ;
    }
}
