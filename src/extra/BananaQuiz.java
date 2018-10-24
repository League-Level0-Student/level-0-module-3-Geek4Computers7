//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		int userMood = JOptionPane.showOptionDialog(null, "Do you like bannaners", "this is a thing i guess that this thing does a thing ahh forget it", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "yes ", "no ", "RRREEEEEEH", "OOOOOOOH", "AAAAHHH" }, null);
		
		if (userMood == 0) {
			JOptionPane.showMessageDialog(null, "ok cool... here is a.. the.. aaa. a, a thing");
			playVideo("https://www.youtube.com/watch?v=I10gwVEoRRc");
		}
		
				if ( userMood == 1) {
					JOptionPane.showMessageDialog(null, "k");
				} 
		if (userMood == 2) {
			JOptionPane.showMessageDialog(null, "you are...BANANAS");
			playVideo("https://www.youtube.com/watch?v=ZrUIx_lVFQo");
		}
		
				if

		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
	
	}

}
