package Palette;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author mahar
 */
public class JPanelGradient extends JPanel {

    private Color colorstart = Color.BLACK;
    private Color colorend = Color.WHITE;

    public Color getColorstart() {
        return colorstart;
    }

    public void setColorstart(Color colorstart) {
        this.colorstart = colorstart;
    }

    public Color getColorend() {
        return colorend;
    }

    public void setColorend(Color colorend) {
        this.colorend = colorend;
    }
    
    public JPanelGradient() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(0,0,colorstart, getWidth(), getHeight(), colorend);
        g2d.setPaint(gradient);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
       
}
