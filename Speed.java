package views;

public class Speed implements Visitable{
    private double speed;
    TetrisView view;
    public Speed(TetrisView vw){
        view = vw;
    }
    @Override
    public void Accept(Visitor visitor){visitor.visit(this);}
    public double getSpeed(){return this.speed;}
    public void setSpeed(double speed){
        this.speed =speed;
        view.timeline.setRate(speed);
        System.out.println("the speed is now " + speed);
    }
}