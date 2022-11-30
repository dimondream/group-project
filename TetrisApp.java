import model.TetrisModel;
import views.Font;
import views.Speed;
import views.TetrisView;
import views.Mode;

import javafx.application.Application;
import javafx.stage.Stage;

/** 
 * A Tetris Application, in JavaFX
 * 
 * Based on the Tetris assignment in the Nifty Assignments Database, authored by Nick Parlante
 */
public class TetrisApp extends Application {
    TetrisModel model;
    TetrisView view;

    /** 
     * Main method
     * 
     * @param args agument, if any
     */
    public static void main(String[] args) {
        launch(args);
    }

    /** 
     * Start method.  Control of application flow is dictated by JavaFX framework
     * 
     * @param primaryStage stage upon which to load GUI elements
     */
    @Override
    public void start(Stage primaryStage) {
        this.model = new TetrisModel(); // create a model
        this.view = new TetrisView(model, primaryStage); //tie the model to the view
        Mode mod = new Mode(view);
        //Speed spd = new Speed();

        //Font ft = new Font();
        //mod.accept(spd, view);
        //mod.accept(ft, view);
        this.model.startGame(); //begin
    }

}

