package gridlayout;

import javax.swing.*;
import java.awt.*;

public class Gridlayout {
    JFrame frame;
    JPanel panelOne;
    JPanel panelTwo;
    JPanel panelTree;

    public Gridlayout() {
        this.createJFrame();
    }

    public JFrame createJFrame() {
        frame = new JFrame();
        frame.setLayout(new GridLayout(1, 3));
        frame.add(this.createJPanelOne());
        frame.add(this.createJPanelTwo());
        frame.add(this.createJPanelTree());
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        return frame;
    }

    public JPanel createJPanelOne() {
        panelOne = new JPanel();
        panelOne.setBackground(Color.BLUE);
        return panelOne;
    }

    public JPanel createJPanelTwo() {
        panelTwo = new JPanel();
        panelTwo.setBackground(Color.magenta);
        return panelTwo;
    }

    public JPanel createJPanelTree() {
        panelTree = new JPanel();
        panelTree.setBackground(Color.green);
        return panelTree;
    }
}
