/*
 * HauntedHouse class
 * Contains the attributes and constructor for the HauntedHouse, which the Player will enter to start the game.
 * @param String name, String address, int numRooms, String description
 * @return Prints out the instance of HauntedHouse, which will be the house Players explore once they enter.
 */
 
public class HauntedHouse{
    private String address;
    private String name;
    private int numRooms;
    private String description;

    /*Constructor */
    public HauntedHouse(String name, String address, int numRooms, String description){
        this.name = name;
        this.address= address;
        this.numRooms = numRooms;
        this.description = description;
    }

    /*Accessors */
    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public int numRooms(){
        return this.numRooms;
    }

    public String description(){
        return this.description;
    }

    /*Enter Method -- starts the game*/
    public HauntedHouse enter(){
        System.out.println("You've entered " + this.name +".");
        return this;
    }

    // public void showOptions(){
    //     System.out.println("Here are the ");
    
    // }

    public String toString(){//prints out the information of the HauntedHouse instance.
        return (this.name + " is a haunted house located at " + this.address + "." + this.description);
    }
    public static void main(String args[]){

    }
}
