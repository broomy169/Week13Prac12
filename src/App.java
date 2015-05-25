import model.Circle;
import view.MainFrame;
import view.ShapeWorldPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by jc258876 on 25/05/15.
 */
public class App {
    private static MainFrame frame;
    private static ShapeWorldPanel panel;
    static {
        panel = new ShapeWorldPanel();
        frame = new MainFrame("Shapeworld", panel);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame.setVisible(true);
                panel.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseReleased(MouseEvent e) {
                        System.out.println("" + e.getX() + " " + e.getY());
                        Circle shape = new Circle(10);
                        shape.setColor((Color.green.darker().darker()));
                        shape.setPosition(e.getX(), e.getY());
                        shape.setOffsets(1,1);
                        panel.addShape(shape);
                    }
                });

                Timer timer = new Timer(1, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        panel.repaint();
                    }
                });
                timer.start();
            }
        });
    }
}
