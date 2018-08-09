public class Bullet extends FLyingObject {
    private int speed = 3;//子弹移动速度

    public Bullet(int x,int y){
        this.x = x;
        this.y = y;
        this.image = ShootGame.bullet;
    }
    @Override
    public void step(){
        y-=speed;
    }
    @Override
    public boolean outOfBounds(){
        return y< -height;
    }
}