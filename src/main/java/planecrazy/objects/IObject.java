package planecrazy.objects;

import processing.core.PVector;

/**
 *
 *
 * @author Lambert Wang
 */
public interface IObject {

    /**
     *
     * @return The unique id of the object
     */
    public int getId();
    /**
     * 
     * @param other  
     */
    public void collide(IObject other);

    /**
     * 
     */
    public void update();

    /**
     * Draws this object to the screen
     */
    public void draw();

    /**
     *
     * @return The object's position
     */
    public PVector getPos();
}
