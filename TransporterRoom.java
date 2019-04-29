import java.util.*;
/**
 * Write a description of class TransporterRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TransporterRoom extends Room
{
    // instance variables - replace the example below with your own
    
    
    public TransporterRoom(String description){
        super(description);
    }
    
    /**
     * Returns a random room, independent of the direction parameter
     * @param direction Ignored.
     * @return A randomly selected room.
     */
    public  Room getExit(String direction)
    {
        // initialise instance variables
        return findRandomRoom();
    }
    
    private Room findRandomRoom()
    {
        Random r = new Random();
        return allRooms.get(r.nextInt(allRooms.size() - 1));
    }

    
}
