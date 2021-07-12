import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Jump implements KeyListener {


    Controller newController;
    boolean jumped=false;

    Jump(Controller c){
        newController=c;
    }

    @Override
    public void keyTyped(KeyEvent e){
        return;
    }
    
    @Override
    public void keyPressed(KeyEvent pressSpace){
            int key=pressSpace.getKeyCode();
            if(key == KeyEvent.VK_SPACE && !jumped){
                newController.botHeight+=150;
                jumped=true;
        }
    }

    @Override
    public void keyReleased(KeyEvent releaseSpace){
        int key=releaseSpace.getKeyCode();
        if(key == KeyEvent.VK_SPACE && jumped){
            newController.botHeight-=150;
            jumped=false;
        }
    }
}
