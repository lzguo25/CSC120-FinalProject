/*
 * Rooms class
 * Contains the attributes and constructor for Rooms, which can be used to create instances in the GameLoop
 * @param String roomName, String roomDescription
 * @return The room name and room description of the room instance that a Player enters.
 */

public class Rooms
{
    public String roomName;
    public String roomDescription;

    /*Constructor */
    public Rooms(String roomName, String roomDescription)
    {
        this.roomName = roomName;
        this.roomDescription = roomDescription;

    }

    /*Accessors */
    public String getName()
    {
        return this.roomName;
    }
    
    public String getDescription()
    {
        return this.roomDescription;
    }




    public String toString(){//prints out the roomName and roomDescription of the called upon instance in GameLoop
        return (this.roomName +  this.roomDescription);
        }

  
    }
       

    


    
