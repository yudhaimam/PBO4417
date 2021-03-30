public class GameEnemy {
    private double width;
    private double height;
    private int positionX;
    private int positionY;

    public GameEnemy(){
        
    }
    public GameEnemy(double width, double height){
        this.width = width;
        this.height = height;
    }
    public GameEnemy(double width, double height, int positionX, int positionY){
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
        System.out.println("Enemy is running");
    }

}