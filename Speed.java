package views;

public class Speed implements Visitable{
    private int speed;
    TetrisView view;
    public Speed(TetrisView vw){
        view = vw;
    }
    @Override
    public void Accept(Visitor visitor){visitor.visit(this);}
    public int getSpeed(){return this.speed;}
    public void setSpeed(int speed){
        this.speed =speed;
        view.timeline.setRate(speed);
    }
}