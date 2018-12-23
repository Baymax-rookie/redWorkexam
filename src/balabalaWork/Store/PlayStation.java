package balabalaWork.Store;

import balabalaWork.Jiekou.Goods;

public class PlayStation implements Goods {
    private String name;
    private int price;
    private int number;
    public PlayStation(String name, int price, int number){
        this.setName(name);
        this.setPrice(price);
        this.setNumber(number);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int  getPrice() {
        return this.price;
    }

    @Override
    public int getNumber() {
        return this.number;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setNumber(int number){
        this.number=number;
    }
}