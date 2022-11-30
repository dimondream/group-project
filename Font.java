package views;


public class Font implements Visitable{
    private int size;
    TetrisView view;
    public Font(TetrisView vw){
        view = vw;
    }
    @Override
    public void Accept(Visitor visitor){visitor.visit(this); }
    public int getSize(){return size;}
    public void setSize(int size){
        view.gameModeLabel.setFont(new javafx.scene.text.Font(size));
        this.size=size;
    }
}
