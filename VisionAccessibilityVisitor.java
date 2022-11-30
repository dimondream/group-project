package views;

public class VisionAccessibilityVisitor implements Visitor{
    private int font;
    private double dropSpeed;

    public void visit(Font font){
        font.setSize(30);
        this.font = font.getSize();
    }
    public void visit(Speed speed){
        speed.setSpeed(0.5);
        this.dropSpeed=speed.getSpeed();
    }
    /*
    public void display(){
        System.out.println("The speed is " + dropSpeed);
        System.out.println("The font size is " + font);
    }

     */
}
