import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GameWindow{
	

	GameWindow(){
		Controller newController=new Controller();
		JFrame j=new JFrame("MAIN GAME");
		j.add(newController);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(700,500);
		j.setVisible(true);
		j.setResizable(false);
	}	
}
