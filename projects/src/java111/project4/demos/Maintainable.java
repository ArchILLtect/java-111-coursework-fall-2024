/**
 * The maintainable interface for any itme that needs to
 * maintained
 * @author Nick Hanson Sr.
 */

public interface Maintainable {
    
    /** Determines the cost of maintainance
     * @return maintenance cost
     */
    public abstract double determineMaintenanceCost();

}
