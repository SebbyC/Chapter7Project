package SportProject;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class iconTest {
    
    public static void main(String[] args) {
        
        ImageIcon icon = new ImageIcon("D:\\javaworkarea\\maxresdefault.jpg");
        String Teams[]={"Patriots","jags"};
        String name=(String)JOptionPane.showInputDialog(null,
                                                 "Whos going to win! Cast Your vote!", 
                                                 "Team Confirmation", 
                                                 JOptionPane.PLAIN_MESSAGE,
                                                 icon, 
                                                 Teams, 
                                                 Teams[0]);
        if(name == Teams[0])
        {
            icon = new ImageIcon("D:\\javaworkarea\\download.jpg");
            JOptionPane.showMessageDialog(null,
                                          "Thank's for your Vote!",
                                          "Team Confirmation",
                                          JOptionPane.INFORMATION_MESSAGE,
                                          icon);
        }
        else if(name == Teams[1])
        {
            icon = new ImageIcon("D:\\javaworkarea\\jags.jpg");
            JOptionPane.showMessageDialog(null,
                                          "Thank's for your Vote!",
                                          "Team Confirmation",
                                          JOptionPane.INFORMATION_MESSAGE,
                                          icon);
        }
       
    }     
}