import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GameWindow{
	

	GameWindow(){
		jp p=new jp();
		JFrame j=new JFrame("MAIN GAME");
        j.add(p);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(700,500);
        j.setVisible(true);
        j.setResizable(false);
	}	
}