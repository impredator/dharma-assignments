package ThreadGrocei;

import java.util.Scanner;

public class GroceriesThread implements Runnable {
    private static int sum = 0;
    private static int count = 0;
    @Override
    public void run() {
        Commoditys commoditys = new Commoditys();
        int index = (int)(1+Math.random()*9);
        Commodity commodity = commoditys.commodities.get(index);
        sum += commodity.getPrice();
        count ++;
        System.out.println(commodity.getName() + "  " + commodity.getPrice());
    }

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("���������Ĺ����ǳƣ�");
        String name = scanner.nextLine();
        System.out.println("���������������������");
        int num = scanner.nextInt();
        GroceriesThread.thread(name,num);
        System.out.println("���칲������" + count+ "����Ʒ�� " + "��" + sum + "Ԫ");


    }
    public static void thread(String name,int num) throws InterruptedException {
        System.out.println("�������ˣ�");
        for (int i = 0;i < num;i++){
            Thread thread = new Thread(new GroceriesThread(),name);
            thread.start();
            thread.join();
        }
        System.out.println(name + " ������"+count+"����Ʒ,"+"�����ѣ�" + sum + "Ԫ") ;
    }
}
