import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Timer;


public class jp2 extends KeyAdapter {
    Timer l;
    
    public void keyPressed(KeyEvent e){
            int key=e.getKeyCode();
            if(key == KeyEvent.VK_SPACE){
                jp.k+=150;
        }
    }
    public void keyReleased(KeyEvent f){
        int key=f.getKeyCode();
        if(key == KeyEvent.VK_SPACE){
            jp.k-=150;
        }
    }
}
