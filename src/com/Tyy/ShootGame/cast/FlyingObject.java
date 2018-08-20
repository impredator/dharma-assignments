package com.Tyy.ShootGame.cast;
/*
����FlyingObject������������ĸ��࣬���а����������๲�е����ԡ�������
      �������ࣺӢ�ۻ����л����۷䡢�ӵ���
      ���е����ԣ�ͼƬ���ԡ�����x������y����width����height��
      ���еķ���������������Ե�get/set������
ע�⣺���ϸ����е����ԣ������Ĵ����л�����̳й�ϵ�����������ùؼ���protected���Ρ�
*/

import java.awt.image.BufferedImage;

public abstract class FlyingObject {
    //���е����ԣ�ͼƬ���ԡ�����x������y����width����height
    protected  int x;
    protected  int y;
    protected  int width;
    protected  int height;
    protected BufferedImage image;   //BufferedImage��Ҫ����

    //����������Ե�get/set����
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public abstract void step();

    public boolean shootBy(Bullet bullet){
        int x = bullet.x;
        int y = bullet.y;
        return (this.x < x) && (x<this.x + width) && (this.y < y) && (y<this.y + height);
    }

    public abstract boolean outOfRounds();
}
