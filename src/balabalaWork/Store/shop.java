package balabalaWork.Store;

import balabalaWork.Jiekou.Goods;

public class shop {
    private shop[] huowu;//货物
    private int member;
    public shop(int len) {
        if (len > 0) {
            this.huowu = new shop[len];
        } else {
            System.out.println("没有商品");
        }
        shop sh=new shop(5);
        sh.add(new PlayStation("Switch",100,20));
        sh.add(new PlayStation("PS4",100,20));
        sh.add(new PlayStation("PS3",50,10));
        sh.add(new PlayStation("PSP",30,10));
        sh.add(new PlayStation("手办",30,10));
    }
    public static void print(Goods goods[]){
        for (int i=0;i<goods.length;i++){
            if (goods[i]!=null){
                System.out.println("物品名："+goods[i].getName()+",所需积分为 "+goods[i].getPrice()+",数量有"+goods[i].getNumber());
            }
        }
    }

    public boolean add(Goods goods) {
        if (this.member < this.huowu.length) {
            this.huowu[this.member] = (shop) goods;
            this.member++;
            return true;
        }else {
            return false;
        }
    }


}

