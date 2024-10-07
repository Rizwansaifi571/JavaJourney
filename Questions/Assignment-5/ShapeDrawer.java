import javax.swing.*;
import java.awt.*;

class Shape {
    // Constructor for Circle
    public Shape(Graphics g, int x, int y, int radius) {
        drawCircle(g, x, y, radius);
    }

    // Constructor for Rectangle
    public Shape(Graphics g, int x, int y, int width, int height) {
        drawRectangle(g, x, y, width, height);
    }

    // Constructor for Triangle
    public Shape(Graphics g, int[] xPoints, int[] yPoints) {
        drawTriangle(g, xPoints, yPoints);
    }

    // Method to draw a circle
    private void drawCircle(Graphics g, int x, int y, int radius) {
        g.drawOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    // Method to draw a rectangle
    private void drawRectangle(Graphics g, int x, int y, int width, int height) {
        g.drawRect(x, y, width, height);
    }

    // Method to draw a triangle
    private void drawTriangle(Graphics g, int[] xPoints, int[] yPoints) {
        g.drawPolygon(xPoints, yPoints, 3);
    }
}

public class ShapeDrawer extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw shapes
        new Shape(g, 100, 100, 50); // Circle
        new Shape(g, 200, 100, 80, 40); // Rectangle
        new Shape(g, new int[]{300, 350, 250}, new int[]{200, 300, 300}); // Triangle
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shape Drawer");
        ShapeDrawer shapeDrawer = new ShapeDrawer();
        
        frame.add(shapeDrawer);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
