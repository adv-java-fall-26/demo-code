package java112.demos;

/**
 * Launcher holds the main method that starts the program. Its only
 * job is to create a CombatGame and start it running.
 * 
 * @author kkschumacher
 */
public class CombatLauncher {

    /**
     * The starting point of the application.
     *
     * @param arguments command line arguments are not used in this game
     */
    public static void main(String[] arguments) {
        CombatGame game = new CombatGame();
        game.run();
    }
}
