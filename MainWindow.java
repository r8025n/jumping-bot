import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor; 
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main extends jp2{

    public static ImageIcon icon;
    public static Container c;
    public static JButton startButton,exitButton;
    public static Font font1;
    public static Cursor crsr;
    
    
    public static void main(String[] args) {
        
        JFrame newFrame=new JFrame("STARTING WINDOW");
        newFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 50));
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.setSize(500,500);
        newFrame.setVisible(true);
        newFrame.setResizable(false);

        newFrame.getContentPane().setBackground(Color.yellow);
        
        JLabel newLabel=new JLabel();
        newLabel.setText("JUMPING BOT");
        newFrame.add(newLabel);
        
        Font o=new Font("ARIAL",Font.BOLD,20);
        newLabel.setFont(o);
        
        startButton=new JButton("START");
        exitButton=new JButton("EXIT");
        //startButton.setBounds(100, 110, 200, 80);
        //exitButton.setBounds(210, 110, 100, 50);
        startButton.setToolTipText("Press to START the Game ");
        exitButton.setToolTipText("Press to EXIT the Game");
        newFrame.add(startButton);
        newFrame.add(exitButton);
        font1=new Font("ARIAL",Font.ITALIC,16);
        startButton.setFont(font1);
        exitButton.setFont(font1);
        startButton.setBackground(Color.red);
        startButton.setForeground(Color.black);
        exitButton.setBackground(Color.red);
        exitButton.setForeground(Color.black);
        
        crsr=new Cursor(Cursor.HAND_CURSOR);
        startButton.setCursor(crsr);
        exitButton.setCursor(crsr);
        
        startButton.addActionListener(new ActionListener() {
           
            public void actionPerformed(ActionEvent ae){
                jp p=new jp();
                JFrame j=new JFrame("MAIN GAME");
                j.add(p);
                j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                j.setSize(700,500);
                j.setVisible(true);
                j.setResizable(false);
            }
        });
        
        exitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                newFrame.dispose();
                
            }
        });
        newFrame.add(startButton);
        newFrame.add(exitButton);
    }
    
}
