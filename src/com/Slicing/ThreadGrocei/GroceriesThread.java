package ThreadGrocei;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GroceriesThread implements Runnable {
    private static int sum = 0;
    @Override
    public void run() {
        Commoditys commoditys = new Commoditys();
        int index = (int)(1+Math.random()*9);
        Commodity commodity = commoditys.commodities.get(index);
        sum += commodity.getPrice();
        System.out.println(Thread.currentThread().getName() + "   ������  " +  commodity.getName() + "  " + commodity.getPrice() + "   " + sum);
        //System.out.println(sum);
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0;i<5;i++){
            Thread thread = new Thread(new GroceriesThread(),"С��");
            executorService.execute(thread);
        }
        //System.out.println(sum);
        executorService.shutdown();

        /*Thread thread = new Thread(new GroceriesThread(),"С�� ");
        Thread thread1 = new Thread(new GroceriesThread(),"С�� ");
        thread.start();
        thread1.start();*/
        //System.out.println(Thread.currentThread().getName());


    }
}
