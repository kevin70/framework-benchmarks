package hello.domain;

public final class World {

    private volatile long id;
    private volatile int randomNumber;

    public World(long id, int randomNumber) {
        this.id = id;
        this.randomNumber = randomNumber;
    }

    public long getId() {
        return id;
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}
