import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    public void setView()
    {
        JFrame mainFrame = new JFrame("The Game");
        mainFrame.setSize(1024, 750);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

    }

}
