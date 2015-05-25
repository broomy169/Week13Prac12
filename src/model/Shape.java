package model;

import java.awt.*;

/**
 * Created by jc258876 on 25/05/15.
 */
public abstract class Shape {
    protected int x, y;
    protected int xOffset, yOffset;
    protected Color color = Color.BLACK;
    public abstract void bounce(int width, int height);

    public abstract void draw(Graphics g);
    public void setColor(Color color) {
        this.color = color;
    }
    public void move(){
        x += xOffset; y += yOffset;
    }
}
