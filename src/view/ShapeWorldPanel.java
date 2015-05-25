package view;

import model.*;
import model.Shape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 * Created by jc258876 on 25/05/15.
 */
public class ShapeWorldPanel extends JPanel {
    private Circle shape;
    private ArrayList<Shape> shapes;
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public ShapeWorldPanel(){
        shapes = new ArrayList<Shape>();
        setPreferredSize(new Dimension(640, 480));
        setFocusable(true);
    }
    public void addMouseListener(MouseListener listener) {
        super.addMouseListener(listener);
    }
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);

        for (Shape shape: shapes) {
            shape.draw(g);
            shape.move();
            shape.bounce(this.getWidth(), this.getHeight());
        }

    }
}
