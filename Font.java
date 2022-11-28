package views;

public class Font implements Visitable{
    private int size;
    public void accept(Visitor visitor){visitor.visit(this);}
    public int getSize(){return size;}
    public void setSize(int size){this.size =size;}
}
