public class PongPaddle {
    private int y,x,width,height;

    public PongPaddle(int top, int left, int w, int h){
        y = top;
        x = left;
        width = w;
        height = h; 
    }
    public int getBottomY(){
        return y + height -1 ;
    }
    public int getLeftX(){
        
        return x; 
    }
    public int getRightX(){

        return x + width -1 ;
    }
    public int getTopY(){
        
        return y;
    }
    public void moveDown(int d){
        y += d;
    }
    public void moveUp(int d){
        y -= d;
    }
}
