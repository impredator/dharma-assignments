package com.Tyy.ShootGame.cast;
/*
�����۷���
������1.�̳�FlyingObject
        ���⣬�����۷�ķ���·���ǲ��̶��ģ�����Ҫ���x��y������ٶ�����
      2.ʵ��Award�ӿ�  -->�����۷��ȡ����
      3.ΪBee����ӹ��캯������ʼ������
*/

import java.util.Random;

public class Bee extends FlyingObject implements Award{
    private int xSpeed = 1;
    private int ySpeed = 2;
    private  int AwardType;
    public int GetType(){
        return AwardType;
    }
    //ΪBee����ӹ��캯������ʼ������
    public void Bee(){
        this.image = ShootGame.bee;
        width = image.getWidth();
        height = image.getHeight();
        y = -height;
        Random rand = new Random();
        //x��ȡֵ��ΧΪ0~����Ļ���-Bee�����ȣ�
        x = rand.nextInt(ShootGame.WIDTH - width);
        //x = 100;
        //y = 200;
        AwardType = rand.nextInt(2);
    }
    public int getType(){
        return  0;
    }
    @Override
    public void  step(){
        x+=xSpeed;
        y+=ySpeed;
        if(x > ShootGame.WIDTH - width){
            xSpeed = -1;
        }
        if(x<0){
            xSpeed = 1;
        }
    }

    @Override
    public boolean outOfRounds() {
        return y>ShootGame.HEIGHT;
    }
}
