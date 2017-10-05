package statsgenerator;

/**
 * Base class for any object performing statistical operations.
 */
public abstract class StatsGenerator {

    String name;

    public StatsGenerator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
