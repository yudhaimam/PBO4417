public class GamePlayer {
    private double width;
    private double height;
    private int positionX;
    private int positionY;

    public GamePlayer(){
        
    }

    public GamePlayer(double width, double height){
        this.width = width;
        this.height = height;
    }

    public GamePlayer(double width, double height, int positionX, int positionY){
        this.width = width;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void setDimension(double setWidth, double setHeight){
        width = setWidth;
        height = setHeight;
    }
    
    public void setPosition(int setPositionX, int setPositonY){
        positionX = setPositionX;
        positionY = setPositonY;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public int getX(){
        return positionX;
    }

    public int getY(){
        return positionY;
    }

    public void Run(){
        System.out.println("Player is running");
    }

    public void Run(int incrementX){
        positionX = positionX + incrementX;
        System.out.print("Player still running.... ");
        System.out.println("current positionX = "+ positionX);
    }

    
}