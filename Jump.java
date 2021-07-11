import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Jump implements KeyListener {


    jp newJp;
    boolean jumped=false;

    Jump(jp j){
        newJp=j;
    }

    public void keyTyped(KeyEvent e){
        return;
    }
    
    public void keyPressed(KeyEvent e){
            int key=e.getKeyCode();
            if(key == KeyEvent.VK_SPACE && !jumped){
                newJp.botHeight+=150;
                jumped=true;
        }
    }
    public void keyReleased(KeyEvent f){
        int key=f.getKeyCode();
        if(key == KeyEvent.VK_SPACE && jumped){
            newJp.botHeight-=150;
            jumped=false;
        }
    }
}
