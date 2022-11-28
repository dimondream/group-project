package views;

import jdk.jshell.spi.ExecutionControl;

/*
 * Visitor interface
 */
public interface Visitor {
    public void visit(Font font)throws UnsupportedOperationException;
    public void visit(Speed speed)throws UnsupportedOperationException;
}
