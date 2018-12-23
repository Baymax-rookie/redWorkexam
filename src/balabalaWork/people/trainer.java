package balabalaWork.people;

import balabalaWork.Jiekou.Displayment;
import balabalaWork.Jiekou.Subject;

public class trainer implements Displayment, Subject {



    @Override
    public void display() {
        System.out.println("能够更改积分,学员积分为"+trainee.jifen);
    }

    @Override
    public void update(int jifen) {
        trainee.jifen=jifen;
        this.display();
    }

    @Override
    public void addScore(int jifen) {
        trainee.jifen=trainee.jifen+jifen;
    }

    @Override
    public void decreaseScore(int jifen) {
        trainee.jifen=trainee.jifen-jifen;
    }

    @Override
    public void screenScore() {
        update(trainee.jifen);
    }
}
