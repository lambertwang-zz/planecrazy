package planecrazy.world;

import planecrazy.objects.IObject;
import planecrazy.objects.ObjectList;
import planecrazy.objects.ObjectListIterator;

/**
 *
 *
 * @author Lambert Wang
 */
public class World implements IWorld {

    // List of objects to add this frame
    private ObjectList toAdd;
    // List of objects to delete this frame
    private ObjectList toDelete;

    // List of all active objects in the world.
    private ObjectList objects;

    /**
     * Constructor
     */
    public World() {
        toAdd = new ObjectList();
        toDelete = new ObjectList();
        objects = new ObjectList();
    }

    public void run() {
        

        // Update world objects
        ObjectListIterator oli = new ObjectListIterator(objects);
        while (oli.hasNext()) {
            IObject temp = oli.next();
            temp.update();
        }
        // Display world's objects
        oli.start();
        while (oli.hasNext()) {
            IObject temp = oli.next();
            temp.draw();
        }

        // Draw world objects


        // Update inhabitants of the world
        ObjectListIterator oli1 = new ObjectListIterator(toAdd);
        while (oli1.hasNext()) {
            IObject temp = oli1.next();
            objects.insert(temp);
        }

        ObjectListIterator oli2 = new ObjectListIterator(toDelete);
        while (oli2.hasNext()) {
            IObject temp = oli2.next();
            objects.remove(temp);
        }
    }

    public void remove(IObject obj) {
        toDelete.insert(obj);
    }

    public void add(IObject obj) {
        toAdd.insert(obj);
    }


    /**
     *
     * @return The objects in the world
     */
    @Override
    public ObjectList getObjects() {
        return objects;
    }
}
