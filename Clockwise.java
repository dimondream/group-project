package model;

import java.util.ArrayList;

public class Clockwise implements IRotation{

    @Override
    public TetrisPiece computeNextRotation(TetrisPiece piece) {
        int new_x;
        int new_y;
        int min = piece.getWidth();
        ArrayList<Integer> store = new ArrayList<>();
        for (TetrisPoint point : piece.getBody()){
            new_x = point.y;
            new_y = -point.x;

            store.add(new_x);
            store.add(new_y);
            if (new_y < min){
                min = new_y;
            }
        }
        String points = "";
        int s;
        for (int i = 0; i < store.size(); i++){
            if (i%2 == 0){
                points += store.get(i);
                points += " ";
            } else {
                s = store.get(i) - min;
                points += s;
                points += " ";
            }
        }
        TetrisPiece next_piece = new TetrisPiece(points);
        return next_piece;
    }
}