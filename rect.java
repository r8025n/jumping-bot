import java.awt.Rectangle;

public class rect {
    int m,n,o,p;
    rect(int u,int v,int x,int y){
        m=u;
        n=v;
        o=x;
        p=y;
        
    }
    
     public Rectangle bounds(){
        return (new Rectangle(m,n,o,p));
    }
}
