import java.util.ArrayList;

public class GameEnvironment {
    private double width;
    private double height;
    private ArrayList<GamePlayer> arrPlayer = new ArrayList<GamePlayer>();
    private ArrayList<GameEnemy> arrEnemy = new ArrayList<GameEnemy>();

    public GameEnvironment(){}
    public GameEnvironment(double width, double height){}
    
    public void addPlayer(GamePlayer name){
        arrPlayer.add(name);
    }

    public void removePlayer(GamePlayer name){
        arrPlayer.remove(name);
    }

    public void getAllPlayers(){
        System.out.println("All of Players: " + arrPlayer);
    }

    public void addEnemy(GameEnemy name){
        arrEnemy.add(name);
    }

    public void removeEnemy(GameEnemy name){
        arrEnemy.remove(name);
    }

    public void getAllEnemies(){
        System.out.println("All of Enemies: " + arrEnemy);
    }

    public void Interaction(){
        if(arrPlayer == null || arrEnemy == null){
            System.out.println("Player or enemy not sets");
        } 
        
        for(int i=0; i<arrPlayer.size(); i++){
            for(int j=0; j<arrEnemy.size(); j++){
                if(arrPlayer.get(i).getY() != arrEnemy.get(j).getY()){
                    System.out.println("Player: "+ arrPlayer.get(i) + " and Enemy: "+ arrEnemy.get(j) + " not in the same position");
                }

                if(EuclideanDistance(arrPlayer.get(i).getX(), arrPlayer.get(i).getY(), arrEnemy.get(j).getX(), arrEnemy.get(j).getY()) < 2){
                    System.out.println("Player " + arrPlayer.get(i) + " Attacked");
                    System.out.println("Enemy " + arrEnemy.get(j) + " loses");
                } else{
                    System.out.println("==> Player " + arrPlayer.get(i));
                    arrPlayer.get(i).Run((int) Math.ceil(Math.random() * 10));
                    System.out.println("current x postion = " + arrPlayer.get(i).getX() + " <==");
                }
            }
        }   
    }

    public int EuclideanDistance(int x1, int y1, int x2, int y2){
        return (int) Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
    }
}
