
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "March 8th";
		String dadsBirthday = "March 27th";
		String myBirthday = "July 13th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		int userMood = JOptionPane.showOptionDialog(null, "Who's birthday do you wish to find", "need a reminder", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Dad ", "Mom ", "Me " }, null);
		
			if ( userMood == 0) {
			JOptionPane.showMessageDialog(null, "Dad's birthday is " +dadsBirthday);
			}
					if (userMood == 1) {
						JOptionPane.showMessageDialog(null, "Mom's birthday is " +momsBirthday);
					}
			
			if ( userMood == 2) {
				JOptionPane.showMessageDialog(null, "Your birthday (dummy) is " +myBirthday);
				
			}
			}
		
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 

