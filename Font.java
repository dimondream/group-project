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
        view.scoreLabel.setFont(new javafx.scene.text.Font(size));
        view.startButton.setFont(new javafx.scene.text.Font(0.6*size));
        view.stopButton.setFont(new javafx.scene.text.Font(0.6*size));
        view.saveButton.setFont(new javafx.scene.text.Font(0.6*size));
        view.loadButton.setFont(new javafx.scene.text.Font(0.6*size));
        view.newButton.setFont(new javafx.scene.text.Font(0.6*size));
        this.size=size;
        System.out.println("the font size is now " + size);
    }
}
