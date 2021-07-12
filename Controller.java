import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random; 
        
public class Controller extends JPanel implements ActionListener{
    Rect ball;
    Rect bot;
    Timer t;
    boolean hasCollide=false;
    int botHeight,ball_x,dodge_counter=0;
    
    Controller(){
       
        setFocusable(true);
        addKeyListener(new Jump(this));
        ball_x=650;
        botHeight=0;
        ball=new Rect(ball_x,400,50,50);
        bot=new Rect(65,400,10,35);
        t=new Timer(5,this);
        t.start();
        
    }

    public void actionPerformed(ActionEvent e){
        int ball_move_left=6;
        ball.x_axis-=ball_move_left;
        bot.y_axis=420-botHeight;
        if(ball.x_axis<0){
            ball.x_axis=650;
            dodge_counter++;
        }
        collision();
        repaint();
    }
    
     
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.black);

        //ball
        g.setColor(Color.blue);
        g.fillOval(ball.x_axis,ball.y_axis,ball.width,ball.height);
        
        //bot head
        g.setColor(Color.yellow);
        g.fillOval(28, 310-botHeight, 40, 40);
        //bot body
        g.setColor(Color.red);
        g.fillRect(30, 350-botHeight, 45, 70);
        //bot right leg
        g.setColor(Color.green);
        g.fillRect(30, 420-botHeight, 10, 35);
        //bot left leg
        g.fillRect(bot.x_axis,bot.y_axis,10,35);
        //bot hand
        g.setColor(Color.blue);
        g.fillRect(35, 350-botHeight, 10, 45);
        //bot eye
        g.setColor(Color.black);
        g.fillOval(55, 320-botHeight, 7, 7);
        
        if(hasCollide){
            g.setFont(new Font("TimesRoman", Font.PLAIN,22));
            g.setColor(Color.yellow); 
            g.drawString("GAME OVER", 270, 200);
            g.setColor(Color.white);
            g.drawString("SCORE:" + dodge_counter, 270, 250);
            t.stop();
        }
    }
    
    public void collision(){
       Rectangle rectangle1=ball.bounds();
       Rectangle rectangle2=bot.bounds();
        
       if(rectangle1.intersects(rectangle2)){
           hasCollide=true;
       }
       else{
           hasCollide=false;
        }
    }
}

