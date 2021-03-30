public class TestGame{
    public static void main(String[] args) {
        //new object from GAME PLAYER
        GamePlayer hero1 = new GamePlayer();
        hero1.setDimension(12, 12);
        hero1.setPosition(10, 220);
        System.out.println("Posisi Player " + hero1.getX() + ", " + hero1.getY());
        hero1.Run(12);
        System.out.println("Posisi Player " + hero1.getX() + ", " + hero1.getY());

        //new object from GAME PLAYER
        GamePlayer hero2 = new GamePlayer();
        hero2.setDimension(12, 32);
        hero2.setPosition(10, 10);

        //new object from GAME ENEMY
        GameEnemy monster = new GameEnemy();
        monster.setDimension(12, 32);
        monster.setPosition(10, 10);

        //new object from GAME ENVIRONMENT
        GameEnvironment scene = new GameEnvironment();
        scene.addPlayer(hero1);
        scene.addPlayer(hero1);
        scene.addPlayer(hero2);
        scene.getAllPlayers();
        scene.removePlayer(hero1);
        scene.getAllPlayers();
        scene.addEnemy(monster);
        scene.Interaction();
    }
}