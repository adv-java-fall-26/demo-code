package java112.demos;

import java.util.ArrayList;

/**
 * CombatGame is the main processing class for the game. It creates a
 * Warrior and a Wizard using hard-coded values, has each one combat, and
 * then declares the fighter with the higher health the winner.
 *
 * @author kkschumacher
 */
public class CombatGame {

    /**
     * Runs one full game from start to finish: create the fighters, show
     * how each one fights, and announce the result.
     */
    public void run() {
        System.out.println("=== Welcome to Combat! ===");
        System.out.println();

        Combatant warrior = new Warrior("Conan", 80);
        Combatant wizard = new Wizard("Merlin", 120);

        ArrayList<Combatant> fighters = new ArrayList<Combatant>();
        fighters.add(warrior);
        fighters.add(wizard);
        fightAllCombatants(fighters);

        announceWinner(warrior, wizard);

        System.out.println();
        System.out.println("Warriors created: " + Warrior.getWarriorsCreated());
        System.out.println("Wizards created:  " + Wizard.getWizardsCreated());
    }

    /**
     * Loops through the list of combatants and prints how each one fights.
     * Same call, different behavior: this is polymorphism!
     *
     * @param fighters the list of combatants in this battle
     */
    private void fightAllCombatants(ArrayList<Combatant> fighters) {
        System.out.println("--- Combat! ---");
        for (Combatant fighter : fighters) {
            System.out.println(fighter.combat());
        }
        System.out.println();
    }

    /**
     * Compares the two combatants by health and prints the winner, or a tie. 
     *
     * @param first the first combatant
     * @param second the second combatant
     */
    private void announceWinner(Combatant first, Combatant second) {
        System.out.println("--- Result ---");
        System.out.println(first);
        System.out.println(second);
        System.out.println();

        if (first.getHealth() > second.getHealth()) {
            System.out.println(first.getName() + " wins with more health!");
        } else if (second.getHealth() > first.getHealth()) {
            System.out.println(second.getName() + " wins with more health!");
        } else {
            System.out.println("It is a tie. Both fighters have "
                    + first.getHealth() + " health.");
        }
    }
}
