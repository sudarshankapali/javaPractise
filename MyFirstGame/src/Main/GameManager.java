package Main;

public class GameManager implements Runnable{
//    Game class
    private Player player = new Player();
    private Thread gameThread;
    private final int FPS_set =120;
    public GameManager(){
        Background background = new Background(player);
        player.requestFocus();
        startGameLoop();
    }

    private void startGameLoop(){
        gameThread = new Thread(this);
    }
    @Override
    public void run() {
        double timePerFrame = 1000000000.0/FPS_set;
        long lastFrame = System.nanoTime();
        long now = System.nanoTime();
        while(true){
            now = System.nanoTime();
            if(System.nanoTime()-lastFrame >= timePerFrame){
                player.repaint();
                lastFrame = now;
            }
        }
    }
}
