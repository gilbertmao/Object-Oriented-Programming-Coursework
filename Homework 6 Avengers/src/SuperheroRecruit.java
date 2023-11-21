/**
 * @author gmao8.
 * @version 1.1
 */
public class SuperheroRecruit {
    protected final String name;
    private int speed;
    private final double strength;
    private int intelligence;
    private static int totalRecruits = 10;
    /**
     * constructor for SuperheroRecruit.
     * @param name the name of the superhero
     * @param speed the speed of the superhero
     * @param strength the strength of the superhero
     * @param intelligence the intelligence of the superhero
     */
    public SuperheroRecruit(String name, int speed, double strength, int intelligence) {
        if ((name == null) || name.equals("")) {
            this.name = "Steve Rogers";
        } else {
            this.name = name;
        }

        if (speed < 0) {
            this.speed = 20;
        } else {
            this.speed = speed;
        }

        if (strength < 0) {
            this.strength = 220;
        } else {
            this.strength = strength;
        }

        if (intelligence < 0) {
            this.intelligence = 100;
        } else {
            this.intelligence = intelligence;
        }

    }

    /**
     * constructor for SuperheroRecruit.
     * @param name the name of the superhero
     * @param speed the speed of the superhero
     * @param strength the strength of the superhero
     */
    public SuperheroRecruit(String name, int speed, double strength) {
        this(name, speed, strength, 100);
    }

    /**
     * constructor for SuperheroRecruit.
     * @param name the name of the superhero
     * @param speed the speed of the superhero
     */
    public SuperheroRecruit(String name, int speed) {
        this(name, speed, 220, 100);
    }

    /**
     * constructor for SuperheroRecruit.
     * @param toCopy another SuperHeroRecruit object
     */
    public SuperheroRecruit(SuperheroRecruit toCopy) {
        this(toCopy.name, toCopy.speed, toCopy.strength, toCopy.intelligence);
    }

    /**
     * Powerscales the hero by averaging speed, strength, and intelligence.
     * @return the powerScaling value of the SuperHeroRecruit
     */
    public double powerScaling() {
        return (this.speed + this.strength + this.intelligence) / 3.0;
    }

    /**
     * Puts everything about the superhero into a string.
     * @return the String that puts together name, intelligence, speed, strength, and powerScaling.
     */
    public String toString() {
        return String.format("%s has %d IQ, runs at %d miles per hour, and can lift %.2f pounds. "
                + "The Power Scaling is %.2f", this.name, this.intelligence, this.speed, this.strength, powerScaling());
    }

    /**
     * checks to see if the program can add another superhero recruit.
     * @param station the name of the station that the SuperHero will be assigned to
     * @return String that lets the user know if their superhero was added
     */
    public String recruit(String station) {
        if (totalRecruits != 0 && powerScaling() > 120.0) {
            totalRecruits--;
            return toString() + " Recruit is enlisted to " + station;
        } else if (totalRecruits < 1) {
            return "Cannot recruit anyone, there are no slots left!";
        } else if (powerScaling() <= 120.0) {
            return "Rejected. Take a look at our sidekick program!";
        }
        return "Not enlisted";
    }

    /**
     * getter for speed.
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * setter for speed.
     * @param speed the user input
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * getter for strength.
     * @return the strength
     */
    public double getStrength() {
        return strength;
    }

    /**
     * getter for intelligence.
     * @return the intelligence
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * sets intelligence.
     * @param intelligence the user input
     */
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    /**
     * getter for totalRecruits.
     * @return the totalRecruits
     */
    public static int getTotalRecruits() {
        return totalRecruits;
    }

    /**
     * setter for totalRecruits.
     * @param totalRecruits the user input
     */
    public static void setTotalRecruits(int totalRecruits) {
        SuperheroRecruit.totalRecruits = totalRecruits;
    }
}
