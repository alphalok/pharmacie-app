import javax.swing.*;
import java.awt.*;
public class ImageBackground 
{
  public static void main(String args[]) 
  {
    JFrame frame = new JFrame("Afficher une image en arrière-plan");
    final ImageIcon icon = new ImageIcon("1.jpeg");
    JTextArea text = new JTextArea() 
    {
      Image img = icon.getImage();
      // initialiseur d'instance
      {setOpaque(false);}
      public void paintComponent(Graphics graphics) 
      {
        graphics.drawImage(img, 0, 0, this);
        super.paintComponent(graphics);
      }
    };
    JScrollPane pane = new JScrollPane(text);
    Container content = frame.getContentPane();
    content.add(pane, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(3);
    frame.setSize(400, 300);
    frame.setVisible(true);
  }
}