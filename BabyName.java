import javax.swing.*;
import java.util.Random;

public class BabyName 
{

    public static void main (String[] args) 
	{
		String nameA;
		String nameB;
		String nameC;

		nameA = JOptionPane.showInputDialog(null, "Please Enter a name");
		nameB = JOptionPane.showInputDialog(null, "Please Enter a name");
		nameC = JOptionPane.showInputDialog(null, "Please Enter a name");
		
         String[] names = {nameA, nameB, nameC};
         Random random = new Random();

         // randomly selects an index from the arr
         int select1 = random.nextInt(names.length); 
		 int select2 = random.nextInt(names.length); 

         // prints out the value at the randomly selected index
         System.out.println("Your Baby name is " + names[select1] + " " + names[select2]); 
    }
}