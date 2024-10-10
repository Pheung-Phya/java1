// class សម្រាប់ធ្វើឲ្យ ប្រអប់មូល ប្រើជាមួយJl

package gui;
import javax.swing.*;
import java.awt.*;
class RoundedLabel extends JLabel {

    public RoundedLabel(String text) {
        super(text);
        setOpaque(false);
    }
    public RoundedLabel() {
        super();
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);

        // Set the color for the text
        g2.setColor(getForeground());

        // Draw the text manually in the center
        FontMetrics fm = g2.getFontMetrics();
        int x = (getWidth() - fm.stringWidth(getText())) / 2;
        int y = (getHeight() + fm.getAscent()) / 2 - fm.getDescent();
        g2.drawString(getText(), x, y);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        g2.setColor(getForeground());
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 30, 30);
    }
}