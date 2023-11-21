/**
 * @author gmao8.
 * @version 1.1
 */
public class Catchphrase {
    private final String catchphrase;
    private final double statIncrease;

    /**
     * Constructor for Catchphrase object.
     * @param catchphrase the string of the catchphrase
     * @param statIncrease the double that becomes the stat increase
     */
    public Catchphrase(String catchphrase, double statIncrease) {
        if (catchphrase == null || catchphrase.equals("")) {
            this.catchphrase = "I can do this all day.";
        } else {
            this.catchphrase = catchphrase;
        }

        if (statIncrease < 1 || statIncrease > 20) {
            this.statIncrease = 15.0;
        } else {
            this.statIncrease = statIncrease;
        }
    }
    /**
     * puts catchphrase and statIncrease in a string for output.
     * @return the stat increase with the catchphrase
     */
    @Override
    public String toString() {
        return String.format("%s! Stats are increased by %.2f",
                this.catchphrase, this.statIncrease) + "%";
    }

    /**
     * getter for the actual String catchphrase.
     * @return the String field of Catchphrase
     */
    public String getCatchphrase() {
        return this.catchphrase;
    }

    /**
     * getter for statIncrease.
     * @return the statIncrease
     */
    public double getStatIncrease() {
        return statIncrease;
    }
}
