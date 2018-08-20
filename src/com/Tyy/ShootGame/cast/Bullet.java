package com.Tyy.ShootGame.cast;
/*
�����ӵ���
������1.�̳�FlyingObject��
      2.�ӵ������ƶ���������һ�������ƶ����ٶ�
      3.��ӹ��췽��
*/

public class Bullet extends  FlyingObject{
    private  int speed = 3;
    public Bullet(int x ,int y){
        this.image = ShootGame.bullet;
        this.x = x;
        this.y = y;
    }
    @Override
    public void step(){
        y-=speed;
    }

    @Override
    public boolean outOfRounds() {
        return y<-height;
    }
}
