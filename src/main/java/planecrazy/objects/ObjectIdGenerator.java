package planecrazy.objects;

/**
 *
 *
 * @author Lambert Wang
 */
public class ObjectIdGenerator {
    // The singleton instance of this class
    private static ObjectIdGenerator instance = null;

    // The id incrementor for generating unique ids
    private static int idIncrementor;

    /**
     * Exists only to defeat instantiation
     *
     */
    private ObjectIdGenerator() {
        idIncrementor = 0;
    }

    /**
     *
     * @return The singleton insance of this class
     */
    public static ObjectIdGenerator getInstance() {
        if (instance == null) {
            instance = new ObjectIdGenerator();
        }
        return instance;
    }

    /**
     *
     * @return The unique id of the object
     */
    public synchronized static int generateId() {
        idIncrementor ++;
        return idIncrementor;
    }
}
