import java.util.*;



public class EventTestDrive {

    public static void main(String[] args) {

        // Create an ArrayList for objects
        ArrayList<Event> events = new ArrayList<Event>();

        Meeting meeting = new Meeting();
        Marathon marathon = new Marathon();

        events.add(meeting);
        events.add(marathon);

        for (Event meetings : events) {
            meetings.display();
        }

    }
}
