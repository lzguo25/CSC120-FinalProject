import java.io.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Images {
    String filepath;

    public Images(String filepath) {
        this.filepath = filepath;
    }

    public void make() throws IOException {
        BufferedImage HHImage = ImageIO.read(new File(this.filepath));
        JLabel HHLabel = new JLabel(new ImageIcon(HHImage));
        JPanel panel = new JPanel();
        panel.add(HHLabel);
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(HHImage.getWidth(), HHImage.getHeight()));
        frame.add(panel);
        frame.setVisible(true);
    }
}
