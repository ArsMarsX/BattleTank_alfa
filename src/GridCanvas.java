import javax.swing.*;
import java.awt.*;

public class GridCanvas extends JPanel {

    int width = 320;
    int height = 320;

    int rows = 20;

    int cols = 20;

    GridCanvas(int w, int h, int r, int c) {
        setSize(width = w, height = h);
        rows = r;
        cols = c;
    }


    public void paint(Graphics g) {

        int i;
//        width = getSize().width;
//        height = getSize().height;
//
//        // draw the rows
//        int rowHt = height / (rows);
//        for (i = 0; i < rows; i++)
//            g.drawLine(0, i * rowHt, width, i * rowHt);
//
//        // draw the columns
//        int rowWid = width / (cols);
//        for (i = 0; i < cols; i++)
//            g.drawLine(i * rowWid, 0, i * rowWid, height);
    }
}
