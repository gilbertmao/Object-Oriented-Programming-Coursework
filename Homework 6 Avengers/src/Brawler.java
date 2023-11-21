/**
 * @author gmao8.
 * @version 1.1
 */
public class Brawler extends SuperheroRecruit {
    private Catchphrase catchphrase;
    /**
     * Creates a Brawler, which is a child of SuperheroRecruit.
     * @param name the name of the Brawler
     * @param speed the speed of the Brawler
     * @param strength the strength of the Brawler
     * @param intelligence the intelligence of the Brawler
     * @param catchphrase the catchphrase of the Brawler
     */
    public Brawler(String name, int speed, double strength, int intelligence, Catchphrase catchphrase) {
        super(name, speed, strength, intelligence);
        if (catchphrase == null) {
            this.catchphrase = null;
        } else {
            this.catchphrase = catchphrase;
        }
    }

    /**
     * Creates a Brawler, which is a child of SuperheroRecruit.
     * @param name the name of the Brawler.
     * @param speed the speed of the Brawler
     */
    public Brawler(String name, int speed) {
        super(name, speed);
        this.catchphrase = null;
    }

    /**
     * Creates a Brawler from another Brawler, which is a child of SuperheroRecruit.
     * @param toCopy the Brawler that the user wants to copy
     */
    public Brawler(Brawler toCopy) {
        super(toCopy.name, toCopy.getSpeed(), toCopy.getStrength(), toCopy.getIntelligence());
        this.catchphrase = toCopy.catchphrase;
    }

    /**
     * Powerscales the hero by averaging speed, strength, and intelligence and adds a stat bonus.
     * @return the powerScaling value of the Brawler
     */
    @Override
    public double powerScaling() {
        if (this.catchphrase != null) {
            return (this.getSpeed() + this.getStrength() + this.getIntelligence()) / 3.0
                    * (1.0 + this.catchphrase.getStatIncrease() / 100.0);
        }
        return (this.getSpeed() + this.getStrength() + this.getIntelligence()) / 3.0;
    }

    /**
     * getter for speed.
     * @return the speed
     */
    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    /**
     * setter for speed.
     * @param speed the user input for speed
     */
    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    /**
     * getter for strength.
     * @return the strength
     */
    @Override
    public double getStrength() {
        return super.getStrength();
    }

    /**
     * getter for intelligence.
     * @return the intelligence
     */
    @Override
    public int getIntelligence() {
        return super.getIntelligence();
    }

    /**
     * setter for intelligence.
     * @param intelligence the user input for intelligence
     */
    @Override
    public void setIntelligence(int intelligence) {
        super.setIntelligence(intelligence);
    }

    /**
     * prints the stats before and after stat increasing.
     */
    public void statChange() {
        if (catchphrase != null) {
            System.out.println("Catchphrase: " + this.catchphrase.getCatchphrase());
            System.out.println(String.format("Original Speed and Strength: %d and %.2f",
                    this.getSpeed(), this.getStrength()));
            System.out.println(String.format("Stat Increase: %.2f", this.catchphrase.getStatIncrease()) + "%");
            System.out.println(String.format("Final Power Scaling: %.2f", powerScaling()));
        } else {
            System.out.println("Catchphrase: null");
            System.out.println(String.format("Original Speed and Strength: %d and %.2f",
                    this.getSpeed(), this.getStrength()));
            System.out.println("Stat Increase: 0%");
            System.out.println(String.format("Final Power Scaling: %.2f", powerScaling()));
        }

    }

    /**
     * getter for Catchphrase.
     * @return the catchphrase
     */
    public Catchphrase getCatchphrase() {
        return this.catchphrase;
    }
}
