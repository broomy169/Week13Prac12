package model;

import java.awt.*;

/**
 * Created by jc258876 on 25/05/15.
 */
public class Circle extends Shape {
    protected int radius;
    public Circle(int radius){ this.radius = radius; }
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setOffsets(int xOffset, int yOffset){
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }
    public void bounce(int width, int height){
        if (this.x - radius < 0) {
            this.xOffset = Math.abs(this.xOffset);
        }
        if (this.y - radius < 0) {
            this.yOffset = Math.abs(this.yOffset);
        }
        if (this.x + radius > width) {
            this.xOffset = Math.abs(this.xOffset) - 1;
        }
        if (this.y + radius > height) {
            this.yOffset = Math.abs(this.yOffset) - 1;
        }

    }
    public void draw(Graphics g){
        g.setColor(color);
        int diameter = 2 * radius;
        g.fillOval(x - radius, y - radius, diameter, diameter);
    }
}
