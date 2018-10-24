//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		int userMood = JOptionPane.showOptionDialog(null, "How many Cat's do you have", ":3", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "none ", "1 ", "2 ", "3", "MOOORREE >0<" }, null);

		// 2. Convert their answer into an int
		if (userMood == 0) {
			playVideo("https://www.youtube.com/watch?v=sxAlWUSkACs");
		}
				
				if(userMood == 1) {
					playVideo("https://www.youtube.com/watch?v=xG35abphZi0");
				}
				
		if (userMood == 2) {
			playVideo("https://www.youtube.com/watch?v=xG35abphZi0");
		}
		
				if (userMood == 3) {
					JOptionPane.showMessageDialog(null, "WTH IS WRONG WITH YOU!!");
				}
				
		if ( userMood == 4) {
			JOptionPane.showMessageDialog(null, "I have lost all respect for you as a human being ");
			
			playVideo("https://www.youtube.com/watch?v=2LZsx_0CpDs");
		}

		// 3. If they have 3 or more cats, tell them they are a crazy cat lady

		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video

		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

