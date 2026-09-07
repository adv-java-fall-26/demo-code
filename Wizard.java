package java112.demos;

/**
 * A Wizard is a combatant that fights from a distance with spells. It
 * implements the Combatant interface, so it promises a combat behavior and
 * a way to report its name and health.
 *
 * @author kkschumacher
 *
 */
public class Wizard implements Combatant {

    /** The label used when describing this kind of combatant. */
    public static final String TYPE_LABEL = "Wizard";

    /**
     * A running count of how many Wizard objects have been created. This
     * is a class (static) variable: one copy shared by every Wizard, not
     * one per object.
     */
    private static int wizardsCreated;

    /** This wizard's name. */
    private String name;

    /** This wizard's health as a whole number. */
    private int health;

    /**
     * Creates a new Wizard.
     *
     * @param name the wizard's name
     * @param health the wizard's health, raised to MINIMUM_HEALTH if lower
     */
    public Wizard(String name, int health) {
        this.name = name;
        this.health = health;
        wizardsCreated++;
    }

    /**
     * Gets this wizard's name.
     *
     * @return the wizard's name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Gets this wizard's health.
     *
     * @return the wizard's health
     */
    @Override
    public int getHealth() {
        return health;
    }

    /**
     * Gets the total number of Wizard objects created so far.
     *
     * @return the number of Wizards created
     */
    public static int getWizardsCreated() {
        return wizardsCreated;
    }

    /**
     * Describes how a Wizard fights.
     *
     * @return the wizard's fighting description
     */
    @Override
    public String combat() {
        return name + " raises a staff and hurls a bolt of lightning!";
    }

    /**
     * Returns a readable description of this wizard.
     *
     * @return the label, name, and health
     */
    @Override
    public String toString() {
        return TYPE_LABEL + "{name='" + name + "', health=" + health + "}";
    }
}
