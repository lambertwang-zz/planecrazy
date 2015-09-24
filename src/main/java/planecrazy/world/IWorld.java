package planecrazy.world;

import planecrazy.objects.IObject;
import planecrazy.objects.ObjectList;

/**
 *
 *
 * @author Lambert Wang
 */
public interface IWorld {

    /**
     *
     *
     */
    public void run();

    /**
     *
     * @param obj to remove from the world
     */
    public void remove(IObject obj);

    /**
     *
     * @param obj to add to the world
     */
    public void add(IObject obj);

    /**
     *
     * @return The objects in the world
     */
    public ObjectList getObjects();
}
