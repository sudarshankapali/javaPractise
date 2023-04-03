package Main;

public class GameManager {
    private Player player = new Player();
    public GameManager(){
        Background background = new Background(player);
        player.requestFocus();
    }
}
