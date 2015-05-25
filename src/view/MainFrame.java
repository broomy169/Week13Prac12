package view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by jc258876 on 25/05/15.
 */
public class MainFrame extends JFrame{
    @SuppressWarnings("serial")
    public MainFrame(String title, JPanel panel) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel, BorderLayout.CENTER);
        pack();
    }
}
