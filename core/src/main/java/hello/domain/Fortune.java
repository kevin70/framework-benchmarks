package hello.domain;

public final class Fortune implements Comparable<Fortune> {

    private volatile long id;
    public volatile String message;

    public Fortune(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return this.id;
    }

    public String getMessage() {
        return this.message;
    }

    /**
     * For our purposes, Fortunes sort by their message text.
     */
    @Override
    public int compareTo(Fortune other) {
        return message.compareTo(other.message);
    }
}
