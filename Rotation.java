package model;

public class Rotation {

    private IRotation rotationStrategy;

    public Rotation(IRotation rotationStrategy){
        this.rotationStrategy = rotationStrategy;
    }

    public TetrisPiece computeNextRotation(TetrisPiece piece){
        return rotationStrategy.computeNextRotation(piece);
    }
}
