package project02;

public abstract class MusicEvent extends Event {
    private String[] performers;
    private static int NumberOfObjects = 0;

    public MusicEvent() {
        this.setNumberOfObjects(this.getNumberOfObjects() + 1);
    }



    public static int getNumberOfObjects() {
        return NumberOfObjects;
    }

    public static void setNumberOfObjects(int numberOfObjects) {
        NumberOfObjects = numberOfObjects;
    }

    public String[] getPerformers() {
        return performers;
    }

    public void setPerformers(String[] performers) {
        this.performers = performers;
    }

    public MusicEvent(String[] performers) {
        this.performers = performers;
    }
}
