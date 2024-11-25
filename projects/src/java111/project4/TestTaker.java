/**
 *  The TestTaker interface
 *  For Projet 4 - Part 2
 *  @author Nick Hanson
 *      - Created 11/24/24
 */

public interface TestTaker {

    /** This method creates a contract for test taking on any classes that
     *  implement TestTaker
     *  @return a string containing Student info.
     */
    public void takeTest();

    /** This method creates a contract for getting test results on any
     *  classes that implement TestTaker
     *  @return a string containing Student info.
     */
    public String getTestResults();

}
