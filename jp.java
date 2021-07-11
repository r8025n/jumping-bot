import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random; 
        
public class jp extends JPanel implements ActionListener{
    Random r=new Random();
    rect r1;
    rect r2;
    int z;
    boolean coll=false;
    
    public static int botHeight;
    Timer t;
    int x,y,c=0,q=0;
    
    jp(){
       
        setFocusable(true);
        addKeyListener(new Jump(this));
        x=650;
        botHeight=0;
        r1=new rect(x,400,50,50);
        r2=new rect(65,z,10,35);
        t=new Timer(5,this);
        t.start();
        
    }

    public void actionPerformed(ActionEvent e){
        //int q=r.nextInt(3);
        int sp=6;
        //(r)x-=sp;
        r1.m-=sp;
        r2.n=420-botHeight;
        if(r1.m<0){
            //(r)x=650;
            r1.m=650;
            c++;
        }
        collision();
        repaint();
    }
    
     
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.black);
        g.setColor(Color.blue);
        //(r)g.fillOval(x,400,40,50);//moving object
        g.fillOval(r1.m,r1.n,r1.o,r1.p);
        g.setColor(Color.red);
        //Static Object
        g.fillRect(30, 350-botHeight, 45, 70);//static_body
        g.setColor(Color.yellow);
        g.fillOval(28, 310-botHeight, 40, 40);//static_head
        g.setColor(Color.green);
        g.fillRect(30, 420-botHeight, 10, 35);//static_leg1
       //(r) g.fillRect(65, z, 10, 35);//static_leg2
        g.fillRect(r2.m,r2.n,r2.o,r2.p);
        g.setColor(Color.blue);
        g.fillRect(35, 350-botHeight, 10, 45);//static_hand
        g.setColor(Color.black);
        g.fillOval(55, 320-botHeight, 7, 7);//static_eye
        
        if(coll){
            //q++;
            //if(q==5){
                g.setFont(new Font("TimesRoman", Font.PLAIN,22));
                g.setColor(Color.yellow); 
                g.drawString("GAME OVER", 270, 200);
                g.setColor(Color.white);
                g.drawString("SCORE:" + c, 270, 250);
                t.stop();
            //}
        }
    }
    
    public void collision(){
       Rectangle rectangle1=r1.bounds();
       Rectangle rectangle2=r2.bounds();
        
       if(rectangle1.intersects(rectangle2)){
           coll=true;
       }
       else{
           coll=false;
        }
    }
}

