package balabalaWork;

import balabalaWork.*;
import balabalaWork.Jiekou.Goods;
import balabalaWork.people.trainee;
import balabalaWork.people.trainer;

public class workDemo {
    public static void main(String[] args) {
        Goods gs[]=new Goods[5];
        trainee tra=new trainee();
        tra.update(100);
        trainer tr=new trainer();
        tr.addScore(20);
        tra.addScore(30);
        tra.isGetGoods(gs);    //这里不知道怎么错了

    }

}
