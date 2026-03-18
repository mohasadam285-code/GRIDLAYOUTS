import javax.swing.*;
import java.awt.*;

public class Gridlayout {
    JFrame frame;
    JPanel PanelOne, PanelTwo, PanelTree;

    public Gridlayout() {
        this.CreateJFrame();
    }

    public JFrame CreateJFrame(){
        frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 3));
        frame.add(this.CreateJPanelOne());
        frame.add(this.CreateJPanelTwo());
        frame.add(this.CreateJPanelTree());
        frame.setVisible(true);
        return frame;
    }

    public JPanel CreateJPanelOne(){
        PanelOne = new JPanel();
        PanelOne.setBackground(Color.BLUE);
        return PanelOne;
    }

    public JPanel CreateJPanelTwo(){
        PanelTwo = new JPanel();
        PanelTwo.setBackground(Color.magenta);
        return PanelTwo;
    }

    public JPanel CreateJPanelTree(){
        PanelTree = new JPanel();
        PanelTree.setBackground(Color.green);
        return PanelTree;
    }
}
