/**
 * @author gmao8.
 * @version 1.1
 */
public class FlyingHero extends SuperheroRecruit {
    private double altitude;
    /**
     * Constructor for FlyingHero, which is a child of SuperheroRecruit.
     * @param name the name of the FlyingHero
     * @param speed the speed of the FlyingHero
     * @param strength the strength of the FlyingHero
     * @param intelligence the intelligence of the FlyingHero
     * @param altitude the altitude of the FlyingHero
     */
    public FlyingHero(String name, int speed, double strength, int intelligence, double altitude) {
        super(name, speed, strength, intelligence);
        if (altitude < 10 || altitude > 100) {
            this.altitude = 50.0;
        } else {
            this.altitude = altitude;
        }

    }

    /**
     * Constructor for FlyingHero, which is a child of SuperheroRecruit.
     * @param name the name of the FlyingHero
     * @param speed the speed of the FlyingHero
     */
    public FlyingHero(String name, int speed) {
        super(name, speed);
        this.altitude = 50.0;
    }

    /**
     * Constructor for FlyingHero, which is a child of SuperheroRecruit.
     * @param name the name of the FlyingHero
     */
    public FlyingHero(String name) {
        super(name, 20);
        this.altitude = 50.0;
    }

    /**
     * Constructor for FlyingHero, which is a child of SuperheroRecruit.
     * @param toCopy the FlyingHero needed to be copied
     */
    public FlyingHero(FlyingHero toCopy) {
        super(toCopy.name, toCopy.getSpeed(), toCopy.getStrength(), toCopy.getIntelligence());
        this.altitude = toCopy.altitude;
    }
    @Override
    /**
     * Powerscales the hero by averaging speed, strength, altitude and intelligence.
     * @return the powerScaling value of the FlyingHero
     */
    public double powerScaling() {
        return (super.powerScaling() + this.altitude);
    }
    @Override
    /**
     * prints out the information about the FlyingHero.
     * @return the String the puts name, altitude, name, intelligence, and speed together
     */
    public String toString() {
        return String.format("%s can fly %.2f feet in the air! %s has %d IQ, "
                        + "runs at %d miles per hour, and can lift %.2f pounds. The Power Scaling is %.2f",
                this.name, this.altitude, this.name, this.getIntelligence(),
                this.getSpeed(), this.getStrength(), powerScaling());
    }
    /**
     * getter for altitude.
     * @return the altitude
     */
    public double getAltitude() {
        return altitude;
    }

    /**
     * setter for altitude.
     * @param altitude the user input for altitude
     */
    public void setAltitude(double altitude) {
        this.altitude = altitude;
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
     * setter for the speed.
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
     * getter of FlyingHero intelligence.
     * @return the FlyingHero's intelligence
     */
    @Override
    public int getIntelligence() {
        return super.getIntelligence();
    }

    /**
     * setter of FlyingHero intelligence.
     * @param intelligence the user input of intelligence
     */
    @Override
    public void setIntelligence(int intelligence) {
        super.setIntelligence(intelligence);
    }
}
