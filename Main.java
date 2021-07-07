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
    public static JButton b1,b2;
    public static Font f1;
    public static Cursor cr;
    
    
    public static void main(String[] args) {
        
        JFrame f=new JFrame("STARTING WINDOW");
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 50));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setVisible(true);
        f.setResizable(false);

        f.getContentPane().setBackground(Color.yellow);

        //c=f.getContentPane();
        //c.setBackground(Color.yellow);
        
        JLabel l=new JLabel();
        l.setText("JUMPING BOT");
        f.add(l);
        
        Font o=new Font("ARIAL",Font.BOLD,20);
        l.setFont(o);
        
        b1=new JButton("START");
        b2=new JButton("EXIT");
        //b1.setBounds(100, 110, 200, 80);
        //b2.setBounds(210, 110, 100, 50);
        b1.setToolTipText("Press to START the Game ");
        b2.setToolTipText("Press to EXIT the Game");
        f.add(b1);
        f.add(b2);
        f1=new Font("ARIAL",Font.ITALIC,16);
        b1.setFont(f1);
        b2.setFont(f1);
        b1.setBackground(Color.red);
        b1.setForeground(Color.black);
        b2.setBackground(Color.red);
        b2.setForeground(Color.black);
        
        cr=new Cursor(Cursor.HAND_CURSOR);
        b1.setCursor(cr);
        b2.setCursor(cr);
        
        b1.addActionListener(new ActionListener() {
           
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
        
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                f.dispose();
                
            }
        });
        f.add(b1);
        f.add(b2);
    }
    
}
