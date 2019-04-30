/*
 * Created on 4/30/19 6:44 PM by Joshua Tapp
 * Student at John Tyler Community College
 */

/*
 * Created on 4/30/19 1:49 AM by Joshua Tapp
 * Student at John Tyler Community College
 */

package project05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.util.Collections.*;

public class TestEvent {

    public static void main(String[] args) throws ParseException {

        Date dateTime;

        dateTime = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse("07/28/2018 10:00");
        new project05.SoccerGame("Ultimate Cup", "River City Sportsplex", dateTime, 1000, new String[]{"UR", "VCU"}, new int[]{1, 0}, "Professional", new project05.Weather(true, 95.0, 2.0, 0.8));

        dateTime = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse("07/29/2018 13:30");
        new BasketBallGame("NCAA", "Siegel Center", dateTime, 2000, new String[]{"UR", "VCU"}, new int[]{30, 40}, "College");

        dateTime = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse("08/01/2018 13:00");
        new Concert("Folk Festival", "Browns Island", dateTime, 900, new String[]{"The Green Fields of America", "Be‚Äôla Dona", "Dale Ann Bradley"}, "Folk Music", new Weather(false, 85.0, 2.0, 0.5));

        dateTime = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse("08/01/2018 20:00");
        new Orchestra("Dominion Energy Casual Fridays", "Dominion Arts Center", dateTime, 800, new String[]{"Richmond Symphony"}, true);

        dateTime = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse("08/02/2018 10:00");
        new SoccerGame("Jefferson Cup", "River City Sportsplex", dateTime, 2000, new String[]{"UR", "VCU"}, new int[]{1, 1}, "College", new Weather(true, 85.0, 2.0, 0.5));

        dateTime = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse("08/02/2018 20:30");
        new Concert("Innsbrook After Hours", "Innsbrook", dateTime, 500, new String[]{"Lee Brice"}, "Jazz", new Weather(true, 65.0, 2.0, 0.5));

        dateTime = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse("08/03/2018 10:30");
        new ArtEvent("Abstract Art in Dialogue", "Virginia Museum of Fine Arts", dateTime, 500, "Abstract Art");

        System.out.println("Events:");

        Iterator<Event> eventListIterator = Event.getEventList().iterator();
        Event event;
        int eventNumber;
        while (eventListIterator.hasNext()) {
            event = eventListIterator.next();
            eventNumber = Event.getEventList().indexOf(event) + 1;
            System.out.printf("Event %s: Class: %-15s Name: %-33s Audience: %s\n", eventNumber, event.getClass().getSimpleName() + ";", event.getName() + ";", event.getAudience());
        }  // while

        System.out.println("\nStatistics of audiences (all events):");
        System.out.printf("All Events:\t Count: %s\t Sum: %s\t Average: %s\t Max: %s\t Min: %s\n\n", Event.getNumberOfObjects() + ";", Event.getSum() + ";", Event.getAverage() + ";", Event.getMax() + ";", Event.getMin() + ";");

        ArrayList<Event> popList = new ArrayList<>();

        for (int i = 0; i < Event.getEventList().size(); i++) {
            if (Event.getEventList().get(i).getAudience() == Event.getMax()) {
                popList.add(Event.getEventList().get(i));
            }
        }
        sort(popList, Comparator.comparing(o -> o.getClass().getName()));


        System.out.println("Number of most popular events: " + popList.size());
        System.out.println("Most popular events (sorted by name):");
        for (int i = 0; i < popList.size(); i++) {
            System.out.printf("Event %s: %s\n", Event.getEventList().indexOf(popList.get(i)) + 1, popList.get(i).getName());
        }

        ArrayList<Event> copy = new ArrayList<>(Event.getEventList());

        sort(copy, Comparator.comparing(Event::getName));
        sort(copy, Comparator.comparing(o -> o.getClass().getName()));

        System.out.println("\nEvents (sorted by class name then by name):");

        eventListIterator = copy.iterator();

        while (eventListIterator.hasNext()) {
            event = eventListIterator.next();
            eventNumber = Event.getEventList().indexOf(event) + 1;
            String eventClassName = event.getClass().getSimpleName() + ";";
            String eventName = event.getName() + ";";
            int audienceSize = event.getAudience();

            System.out.printf("Event %s: Class: %-15s Event Name: %-33s Audience: %s\n", eventNumber, eventClassName, eventName, audienceSize );
        }  // while

        System.out.println("\nStatistics of audiences (by event class name):");

        ArrayList<Event> copy2 = new ArrayList<>(Event.getEventList());
        sort(copy2, Comparator.comparing(o -> o.getClass().getName()));

        ArrayList<Event> copy3 = new ArrayList<>();


        LinkedHashMap<String, ArrayList<Event> > eventMap = new LinkedHashMap<>();
        Iterator<Event> copy2Iterator = copy2.iterator();

        while(copy2Iterator.hasNext()){
            Event eventTemp = copy2Iterator.next();
            String key = eventTemp.getClass().getSimpleName();
            eventMap.computeIfAbsent(key, k -> new ArrayList<Event>()).add(eventTemp);
        }

        for (Map.Entry<String, ArrayList<Event>> entry : eventMap.entrySet()) {
            ArrayList<Event> list = entry.getValue();
            String name = entry.getKey();
            int count = list.size();
            int sum = Event.getSum(list);
            int average = Event.getAverage(list);
            int max = Event.getMax(list);
            int min = Event.getMin(list);

            System.out.printf("%-15s Count: %-1s \t Sum: %4s\t Average: %5s\t Max: %5s  Min: %s\n", name + ":", count + ";", sum + ";", average + ";", max + ";", min);
        }

    }  // main()

    public static void getNumberOfObjects() {
        System.out.println("Events: " + Event.getNumberOfObjects());
        System.out.println("Sport Events: " + SportEvent.getNumberOfObjects());
        System.out.println("Music Events: " + MusicEvent.getNumberOfObjects());
        System.out.println("Art Events: " + ArtEvent.getNumberOfObjects());
        System.out.println("Soccer Games: " + SoccerGame.getNumberOfObjects());
        System.out.println("Basketball Games: " + BasketBallGame.getNumberOfObjects());
        System.out.println("Concerts: " + Concert.getNumberOfObjects());
        System.out.println("Orchestras: " + Orchestra.getNumberOfObjects());
    }  // getNumberOfObjects()

}// class TestEvent

