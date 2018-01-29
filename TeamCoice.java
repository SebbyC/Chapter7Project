package SportProject;
import javax.swing.JOptionPane;

public class TeamCoice
{
	 public static void main(String[] args) {
		 String[] choices = {"Jaguars", "Patriots","None","Quit"};
		 
		 	int JaguarsCount = 0;
	        int PatriotsCount = 0;
	        int noAnswerCount = 0;

	while (true) {
        int response = JOptionPane.showOptionDialog(
                           null                       
                         , "Who's Going To Win?"        
                         , "Playoff Game!"               
                         , JOptionPane.YES_NO_OPTION  
                         , JOptionPane.PLAIN_MESSAGE  
                         , null                     
                         , choices
                         , "None of your business"    
                       );
	
	  switch (response) {
      case 0: 
    	  JaguarsCount++;
          break;
      case 1:
    	  PatriotsCount++;
          break;
      case 2:
          noAnswerCount++;
          break;
      case 3:
      case -1:
          System.exit(0);     
      default:
         
          JOptionPane.showMessageDialog(null, "Unexpected response " + response);
	  }
	  	JOptionPane.showMessageDialog(null, "Response = " + response
              + "\nJag = " + JaguarsCount
              + "\nPat = " + PatriotsCount
              + "\nOther = " + noAnswerCount);
  }
	
}
}
