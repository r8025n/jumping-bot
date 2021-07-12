import java.awt.Rectangle;

public class Rect {

    int x_axis,y_axis,width,height;
    
    Rect(int x,int y,int w,int h){
        x_axis=x;
        y_axis=y;
        width=w;
        height=h;
        
    }
    
     public Rectangle bounds(){
        return (new Rectangle(x_axis,y_axis,width,height));
    }
}
