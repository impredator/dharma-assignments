package com.Tyy.ShootGame.cast;
/*
���󣺵зɻ��̳��Ը���FlyingObject��ӵ�и����������ԣ�
      �������б����л��Ӣ�ۻ��ӷֵĹ��ܣ�����Ҫʵ��Enemy�ӿ�
*/

public class Airplane extends FlyingObject implements Enemy{
    //���˼̳��˸����������Ժ�get/set����֮��
    // �л�����Ҫʵ��Enemy�ӿڡ����ƶ��ٶȵ����ԣ�����ڵл��ƶ��¼���
    private int speed = 2;
    //ʵ��Enemy�ӿ�
    public int getScore(){
        return 5;
    }             //�������������÷����ǻ��ел���Ӣ�ۻ���õķ���������ײ���л�����Ӣ�ۻ��������㣿
    //��ӹ��췽��
    public Airplane(){
        this.image = ShootGame.airplane;
        width = image.getWidth();
        height = image.getHeight();
        //��ʼ���л��ĳ�ʼλ��
        y  = -height;
        x = (int)(Math.random()*(ShootGame.WIDTH - width));
        //x = 100;
       // y = 100;
    }
     @Override
    public void  step(){
        y+=speed;
     }

    @Override
    public boolean outOfRounds() {
        return y>ShootGame.HEIGHT;
    }
}
