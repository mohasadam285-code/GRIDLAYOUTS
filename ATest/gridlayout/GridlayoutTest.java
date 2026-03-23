package gridlayout;

import gridlayout.Gridlayout;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.awt.*;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class GridlayoutTest {

    private Gridlayout app;
    @BeforeEach
    void setUp() {

            app = new Gridlayout();

    }

    @AfterEach
    void tearDown()  {

            if (app.frame != null) {
                app.frame.dispose();
            }
            app = null;
    }

    @Test
    void createJFrame() {
        assertNotNull(app.frame);

        LayoutManager layout = app.frame.getContentPane().getLayout();
        assertInstanceOf(GridLayout.class, layout);

        GridLayout grid = (GridLayout) layout;
        assertEquals(1, grid.getRows());
        assertEquals(3, grid.getColumns());


        assertEquals(3, app.frame.getContentPane().getComponentCount());

        assertEquals(Frame.MAXIMIZED_BOTH, app.frame.getExtendedState());

        assertEquals(WindowConstants.EXIT_ON_CLOSE, app.frame.getDefaultCloseOperation());

        assertTrue(app.frame.isVisible());
    }

    @Test
    void createJPanelOne() {
        assertNotNull(app.panelOne);
        assertEquals(Color.BLUE, app.panelOne.getBackground());
    }

    @Test
    void createJPanelTwo() {
        assertNotNull(app.panelTwo);
        assertEquals(Color.magenta, app.panelTwo.getBackground());
    }

    @Test
    void createJPanelTree() {
        assertNotNull(app.panelTree);
        assertEquals(Color.green, app.panelTree.getBackground());
    }

    @Test
    public void testIntegration(){

        /* this code Checks all panels are added to frame*/
        Component[] components = app.frame.getContentPane().getComponents();
        assertEquals(3, components.length);


        assertTrue(components[0] instanceof JPanel);
        assertInstanceOf(JPanel.class, components[1]);
        assertTrue(components[2] instanceof JPanel);


        assertEquals(app.panelOne, components[0]);
        assertEquals(app.panelTwo, components[1]);
        assertEquals(app.panelTree, components[2]);

        // 6.this also Check panel colors (integration check)
        assertEquals(Color.BLUE, app.panelOne.getBackground());
        assertEquals(Color.magenta, app.panelTwo.getBackground());
        assertEquals(Color.green, app.panelTree.getBackground());

    }
}