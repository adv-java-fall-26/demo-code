package java112.demos;

/**
 * The Combatant interface is the single shared type in this game. Anything
 * that takes part in a battle implements it. It has no constructor and no
 * regular fields, it only lists what a fighting participant must provide:
 * the ability to fight, and a way to report its name and its health.
 *
 * @author kkschumacher
 * 
 */
public interface Combatant {

    /**
     * Describes how this combatant fights.
     *
     * @return a sentence describing this combatant's fighting style
     */
    String combat();

    /**
     * Gets this combatant's name.
     *
     * @return the combatant's name
     */
    String getName();

    /**
     * Gets this combatant's health.
     *
     * @return the combatant's health
     */
    int getHealth();
}
