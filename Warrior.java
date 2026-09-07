package java112.demos;

/**
 * A Warrior is a combatant that fights with strength and steel.
 * It implements the Combatant interface, so it promises a combat behavior
 * and a way to report its name and health.
 *
 *
 * @author kkschumacher
 */
public class Warrior implements Combatant {

    /** The label used when describing this kind of combatant. */
    public static final String TYPE_LABEL = "Warrior";

    /**
     * A running count of how many Warrior objects have been created. 
     * 
     * This is a class (static) variable: one copy shared by every Warrior, 
     * not one per object.
     */
    private static int warriorsCreated;

    /** This warrior's name. */
    private String name;

    /** This warrior's health as a whole number. */
    private int health;

    /**
     * Creates a new Warrior.
     * The Constructor.
     *
     * @param name the warrior's name
     * @param health the warrior's health, raised to MINIMUM_HEALTH if lower
     */
    public Warrior(String name, int health) {
        this.name = name;
        this.health = health;
        warriorsCreated++;
    }

    /**
     * Gets this warrior's name.
     *
     * @return the warrior's name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Gets this warrior's health.
     *
     * @return the warrior's health
     */
    @Override
    public int getHealth() {
        return health;
    }

    /**
     * Gets the total number of Warrior objects created so far.
     *
     * @return the number of Warriors created
     */
    public static int getWarriorsCreated() {
        return warriorsCreated;
    }

    /**
     * Describes how a Warrior fights.
     *
     * @return the warrior's fighting description
     */
    @Override
    public String combat() {
        return name + " charges in and swings a heavy broadsword!";
    }

    /**
     * Returns a readable description of this warrior.
     *
     * @return the label, name, and health
     */
    @Override
    public String toString() {
        return TYPE_LABEL + " name='" + name + "', health=" + health;
    }
}
