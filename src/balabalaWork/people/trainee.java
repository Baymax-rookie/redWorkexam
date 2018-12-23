package balabalaWork.people;

import balabalaWork.Jiekou.Displayment;
import balabalaWork.Jiekou.Goods;
import balabalaWork.Jiekou.Subject;

public class trainee implements Displayment, Subject {
    public static int jifen;

    public void update(int jifen){
        this.jifen=jifen;
        this.display();
    }
    public boolean isGetGoods(Goods goods[]){
        for (int i=0;i<goods.length;i++){
            if(this.jifen>goods[i].getPrice()){
                System.out.println("该学员能够换取"+goods[i].getName());
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
    @Override
    public void display() {
        System.out.println("学员目前积分为"+jifen);
    }

    @Override
    public void addScore(int jifen) {
        System.out.println("违规操作，学员无法自己增加积分");
        update(this.jifen);

    }

    @Override
    public void decreaseScore(int jifen) {

    }

    @Override
    public void screenScore() {
        System.out.println("学员查看自己的积分");
        update(this.jifen);
    }

}
