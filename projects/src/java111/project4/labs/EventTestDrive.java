import java.util.*;
/**
 * This class (EventTestDrive) is used to instantiate and display events (Lab 4 Unit 4)
 * @author Nick Hanson Sr.
 *  - Created on: November 20, 2024
 */

public class EventTestDrive {

    public static void main(String[] args) {

        // Create an ArrayList for objects
        ArrayList<Event> events = new ArrayList<Event>();

        // Instantiate meeting and marathon events
        Meeting meeting = new Meeting();
        Marathon marathon = new Marathon();

        // Add the new event objects to the array list
        events.add(meeting);
        events.add(marathon);

        // Iterate through and call display() on all events in the array list
        for (Event meetings : events) {
            meetings.display();
        }

    }
}
