package views;

public class VisionAccessibilityVisitor implements Visitor{
    private int font;
    private int dropSpeed;

    public void visit(Font font){
        font.setSize(40);
        this.font = font.getSize();
    }
    public void visit(Speed speed){
        speed.setSpeed(4);
        this.dropSpeed=speed.getSpeed();
    }

    public void display(){
        System.out.println("The speed is " + dropSpeed);
        System.out.println("The font size is " + font);
    }
}
