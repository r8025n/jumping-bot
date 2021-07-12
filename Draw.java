import java.awt.*;

public class Draw extends JPanel{

	@Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.black);

        //ball
        g.setColor(Color.blue);
        g.fillOval(ball.x_axis,ball.y_axis,ball.width,ball.height);
        //bot body
        g.setColor(Color.red);
        g.fillRect(30, 350-botHeight, 45, 70);
        //bot head
        g.setColor(Color.yellow);
        g.fillOval(28, 310-botHeight, 40, 40);
        //bot leg1
        g.setColor(Color.green);
        g.fillRect(30, 420-botHeight, 10, 35);
        //bot leg2
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

}