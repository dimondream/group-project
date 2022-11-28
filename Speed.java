package views;

public class Speed implements Visitable{
    private int speed;
    public void accept(Visitor visitor){visitor.visit(this);}
    public int getSpeed(){return this.speed;}
    public void setSpeed(int speed){this.speed =speed;}
}