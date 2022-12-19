/*
 * Object class
 * Contains the attributes and constructor of Object, so we can create instances of objects in the GameLoop for the Player to interact with.
 * @param String roomObjects, String objectDescriptions
 * @return Prints information of the Object instances that Player can interact with as they explore.
 */

public class Object {

    public String roomObjects;
    public String objectDescriptions;

    /* Constructor */
    public Object(String roomObjects, String objectDescriptions) {
        this.roomObjects = roomObjects;
        this.objectDescriptions = objectDescriptions;

    }

    /* Accessors */
    public String getObject() {
        return this.roomObjects;
    }

    public String objectDescription() {
        return this.objectDescriptions;
    }

    public String toString() { // prints out the object name and the object description
        return (this.roomObjects + this.objectDescriptions);
    }

    public String action() {
        if (this.roomObjects.equals("ROCKING HORSE \n")) {
            return "You approach the rocking horse cautiously, inspecting it the entire time. It's made of wood with the once colorful paint now chipping off. \n The air around you is suddenly colder than before. The horse begins to rock back and forth. \n You blink, and its back in it's original position.";
        } else if (this.roomObjects.equals("BROKEN MIRROR \n")) {
            return "You step towards the broken mirror, looking at yourself with the cracked lines obscuring your view. There seems to be a figure behind you. It starts in the far corner, but it gets larger as it approaches. \n You turn around, but nothing is there. It must've just been your eyes seeing things. \n Right?";
        } else if (this.roomObjects.equals("OLD VANITY \n")) {
            return "You look at the vintage vanity. The wood is covered in dust and dead bugs, most likely rotting underneath all the dirt. The mirror is so dirty you can't see anything. \n Nothing alarms you.";
        } else if (this.roomObjects.equals("BABY DOLL \n")) {
            return "The baby doll sits on the bed, propped up so it looks as if it's looking at you. As you step closer, the open mouth meant for a baby bottle turns into a smirk. \n A chill runs down your spine. The mouth is now stuck in a smile";
        } else if (this.roomObjects.equals("HAND MIRROR \n")) {
            return "You approach the fire place mantel where a hand mirror is laying flat. The bronze handle looks as if it was just washed and polished. \n You pick it up. \n You stare at yourself for a moment. Nothing seems to happen.";
        } else if (this.roomObjects.equals("BALLERINA JEWELRY BOX \n")) {
            return "Atop of Sally's vanity, there is a jewelery box with a ballerina figurine. It's perminently posed on one leg with her arms above her head. \n You reach to pick it up. \n Before you get the chance, the ballerina begins to slowly spin as some notes play.";
        } else if (this.roomObjects.equals("CREEPY PORTRAIT \n")) {
            return "Across the room, a portrait of a woman hangs. Her blank stare pierced through you. \n As you move closer, her eyes seem to follow you. \n She blinks, or at least you think she blinks.";
        } else if (this.roomObjects.equals("RUSTY KNIFE \n")) {
            return "A rusty olf knife sits on the kitchen counter. The blade is completely brown and bumpy, and the wooden handle is nearly falling off. \n You pick it up to examine it. Flipping it over, a thick black liquid begins to ooze off of it \n You put it back down and whip you hands off. What is that stuff?";
        } else if (this.roomObjects.equals("OLD NEWSPAPER \n")) {
            return "A rolled up newspaper sits on the dining table. You pick it up and unroll it to read. \n The top says THE CLAREFIELD CHRONICLE. Its the paper from July 9, 1952. \n There's an advertisement on the front page stating this house is on sale.";
        } else if (this.roomObjects.equals("CREAKING CHAIR \n")) {
            return "You approach the chair on the side of the room. The floor squeaks underneath your feet. \n The wood has water damage all over, but nothing else really stands out. ";
        } else if (this.roomObjects.equals("DUFFLE BAG \n")) {
            return "You walk to the back corner where a large duffle bag is placed on the floor. You avoid the black puddle around it. The bag is fill of something, seeming like it'd rip apart if it was filled anymore. \n As you crouch down to examine further, you think you see something move. \n You take a step back. ";
        } else if (this.roomObjects.equals("BROKEN GRANDFATHER CLOCK \n")) {
            return "The large grandfather clock faces you in the entry way of the basement. You walk closer to get a better look at it. \n The arms and pendulum are still, although they look to be in good condition. \n You see yourself reflected in the glass of the clock. You look different, maybe even older.";
        } else {
            return "Sorry, we could not find that object";
        }
    }

}
