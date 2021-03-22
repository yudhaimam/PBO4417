public class GameTest{
    public static void main(String[] args) {
        GamePlayer Player1 = new GamePlayer(1.1, 2.2, 3, 4);

        System.out.println(Player1.getWidth());
        System.out.println(Player1.getHeight());
        System.out.println(Player1.getX());
        System.out.println(Player1.getY());
        System.out.println();

        Player1.setDimension(6.6, 7.7);
        Player1.setPosition(10, 20);

        System.out.println(Player1.getWidth());
        System.out.println(Player1.getHeight());
        System.out.println(Player1.getX());
        System.out.println(Player1.getY());
        System.out.println();

        Player1.Run();
        System.out.println();

        Player1.Run(10);
    }
}