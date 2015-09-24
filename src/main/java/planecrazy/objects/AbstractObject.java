package planecrazy.objects;

import processing.core.PVector;

/**
 *
 *
 * @author Lambert Wang
 */
public abstract class AbstractObject {
    private final int id; 

    public AbstractObject() {
        System.out.println("Abstract Object Constructor");
        id = ObjectIdGenerator.getInstance().generateId();
    }
    /**
     *
     * @return The unique id of the object
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @param other  
     */
    public void collide(IObject other) {

    }

    /**
     * 
     */
    public void update() {

    }

    /**
     * Draws this object to the screen
     */
    public void draw() {

    }

    /**
     *
     * @return The object's position
     */
    public PVector getPos() {
        return new PVector(0, 0);
    }
}
