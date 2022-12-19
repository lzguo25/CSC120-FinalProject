/*
 * GameLoop class
 * Runs the game and prints out the instructions and questions for the Player to answer, progress, and explore.
 * @param HauntedHouse, Room, Player, Object
 * @return Futher actions and questions to determine how the Player will proceed and their ending.
 */

import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class GameLoop {

    public static void main(String[] args) throws IOException {
        HauntedHouse hollowsHouse = new HauntedHouse("Hollow's House", "1234 Somewhere Ave", 4,
                " Hollow's House is [supposedly] a haunted house, haunted by the late resident's daughter, Sally. Ever since the family passed away, nobody has been able to move in. Eerie incidents, screams heard at night, and strange shadows lurking around the corners of each room have left the house deserted. \n ");

        Player Investigator = new Player("Paranormal Investigator",
                "After several incidents and paranormal activity sightings surrounding Hollow's House, you, a PARANORMAL INVESTIGATOR, have been called by the neighborhood to explore Hollow's House.");

        Rooms one = new Rooms("THE ATTIC ", " - It's too quiet in here, you can hear every creak and shuffle...\n"
                + "All you see is a BROKEN MIRROR, an OLD VANITY -- There are too many mirrors in this house. -- and a ROCKING HORSE.\n");
        Rooms two = new Rooms("SALLY'S ROOM ",
                " - According to legends, you can hear the giggles of a little ghost girl in here... \n"
                        + "The room doesn't look suspicious, just old. You see a BABY DOLL on the bed, and a HAND MIRROR and BALLERINA JEWELRY BOX on the vanity.\n");
        Rooms three = new Rooms("THE KITCHEN", " - Home cooked meals and flying plates...\n"
                + "You see the typical dining utensils -- except they're floating in the air. A KNIFE and an OLD NEWSPAPER particularly stand out to you for some reason. On the wall is an EERIE FAMILY PORTRAIT.\n");
        Rooms four = new Rooms("THE BASEMENT",
                " - Separated from the rest of the other rooms, the atmosphere feels completely different. This room reportedly has the most paranormal activity...\n"
                        + "Seemingly random objects are strewn across the floor. This room could just be another storage space. You see a BROKEN GRANDFATHER CLOCK, a DUFFLE BAG, and a CREAKING CHAIR.\n");
        Rooms foyer = new Rooms("FOYER", " - You've returned back to the foyer. \n");

        Object rockinghorse = new Object("ROCKING HORSE \n",
                "There has been recorded footage of this rocking by itself \n");
        Object brokenmirror = new Object("BROKEN MIRROR \n",
                "If you stare at yourself too long you'll start to see your features become distorted\n");
        Object oldvanity = new Object("OLD VANITY \n",
                "The current real estate owners have no idea how this even got in the attic, it weighs close to 250 pounds!\n");

        Object doll = new Object("BABY DOLL \n", "inanimate objects are often believed to be vessels for ghosts...\n");
        Object handmirror = new Object("HAND MIRROR \n",
                "You caught your reflection and something else when you accidently looked into the mirror...\n");
        Object ballerinajewelrybox = new Object("BALLERINA JEWELRY BOX \n",
                "The box, now empty still plays a tune. It's somewhat out of tune but after a few seconds you can tell that it's playing Beetoven's Moonlight Sonata\n");

        Object creepyportraits = new Object("CREEPY PORTRAIT \n",
                "There's so many pictures in here, no matter where you go you can feel their eyes on you.\n");
        Object rustyknifes = new Object("RUSTY KNIFE \n",
                "We should put these away somewhere more safe. There have been reports of knifes flying around\n");
        Object oldnewspaper = new Object("OLD NEWSPAPER \n", "Wow, this paper dates back to the 50's!\n");

        Object creakingchair = new Object("CREAKING CHAIR \n",
                "This chair would be too dangerous to try and sit in. It's rotting and falling apart.\n");
        Object dufflebag = new Object("DUFFLE BAG \n",
                "EEK! The scent of mildew is surrounding this bag, it also seems to be leaking a dark liquid?!\n");
        Object grandfatherclock = new Object("BROKEN GRANDFATHER CLOCK \n",
                "Every now and then this clock lets out a lound chime. I wonder how it's still ticking?\n");

        Images hhImage = new Images("Images/HauntedHouse.jpg");

        // This is a "flag" to let us know when the loop should end
        boolean stillPlaying = true;

        // We'll use this to get input from the user.
        Scanner userInput = new Scanner(System.in);

        // Storage for user's responses
        String userResponse = "";

        // This could be replaced with a more interesting opening
        System.out.println("******************************************");
        System.out.println("WELCOME TO THE HAUNTING OF HOLLOW'S HOUSE");
        System.out.println("******************************************\n");

        System.out.println(hollowsHouse);
        hhImage.make();

        // Instructions are sometimes helpful
        System.out.println(
                "The purpose of this game is to explore Hollow's House. As you explore, you can interact and collect objects as evidence to prove (or disprove) the existence of a ghost. By obtaining enough evidence, you will come out of Hollow's House safe and sound. But make sure to pay attention as you explore, or you might have a ghost following you from now on. Right now you're standing outside of Hollow's House. It appears to be haunted by a ghost. \n");

        /*
         * if yes then use P1 if no then use P2 <==================================
         * choosing character before starting game
         */
        // Player believer = new Player(userResponse, stillPlaying)
        // Player denier = new Player(userResponse, stillPlaying)

        System.out.println("Type ENTER HOUSE to continue playing: \n");
        userResponse = userInput.nextLine().toUpperCase();

        do {// The do...while structure means we execute the body of the loop once before
            // checking the stopping condition

            // ************************************************
            // The stuff that happens in your game will go here
            // ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓

            if (userResponse.equals("ENTER HOUSE")) {
                hollowsHouse.enter();
                // System.out.println("You are still playing. Follow the instructions if you
                // want to win/lose...\n");

                /* Description for when Player enters */
                System.out.println(
                        "You've entered THE FOYER of the house. After looking around for little, you find that almost all of the doors are locked. However, there appear to be four rooms that can be entered:\n");
                // Lists out room options for player. Does not mprovide roomDescription unless
                // the Player enters the house.

                String continueExploring = "";

                Boolean stillExploring = true; // condition that will allow the player to continue exploring or stop
                                               // exploring at any point
                if (continueExploring.equals("NO")) {
                    stillExploring = false;
                }

                System.out.println("Which room would you like to explore?"); // asks Player to select a room to explore
                while (stillExploring) {

                    System.out.println("\n" + one.roomName + "\n" + two.roomName + "\n" + three.roomName + "\n"
                            + four.roomName + "\n" + foyer.roomName + "\n");
                    userResponse = userInput.nextLine().toUpperCase(); // scans and stores the user response

                    if (userResponse.equals("THE ATTIC")) {
                        System.out.println("\n" + one + "\n");
                        System.out.println("Let's explore, looks like there's some odd items in here");
                        System.out.println("\n" + rockinghorse + "\n" + brokenmirror + "\n" + oldvanity);
                        System.out.println("\n" + "Which object would you like to record for evidence?");

                        userResponse = userInput.nextLine().toUpperCase();
                    }

                    else if (userResponse.equals("SALLY'S ROOM")) {
                        System.out.println("\n" + two);
                        System.out.println("Let's see what objects we can learn about in here");
                        System.out.println("\n" + doll + "\n" + handmirror + "\n" + ballerinajewelrybox);
                        System.out.println("\n" + "Which object would you like to pick up?");

                        userResponse = userInput.nextLine().toUpperCase();

                    }

                    else if (userResponse.equals("THE KITCHEN")) {
                        System.out.println("\n" + three);
                        System.out.println("There's a lot of activity in this room");
                        System.out.println("\n" + creepyportraits + "\n" + rustyknifes + "\n" + oldnewspaper);
                        System.out.println("\n" + "Which item would you like to pick up?");

                        userResponse = userInput.nextLine().toUpperCase();
                    }

                    else if (userResponse.equals("THE BASEMENT")) {
                        System.out.println("\n" + four);
                        System.out.println("It's so cold down here but we should still explore.");
                        System.out.println("\n" + creakingchair + "\n" + dufflebag + "\n" + grandfatherclock);
                        System.out.println("\n" + "What do you want to record?");

                        userResponse = userInput.nextLine().toUpperCase();
                    }

                    else if (userResponse.equals("FOYER")) {
                        System.out.println("\n" + foyer);
                    }

                    else {
                        System.out.println("This room can't be accessed.");
                    }

                    if (userResponse.equals("ROCKING HORSE")) {
                        System.out.println("\n" + "Rocking Horse! : object description recorded");
                        System.out.println(rockinghorse.action());
                        Investigator.addMemory(userResponse, rockinghorse.action());
                        System.out.println("\n" + "PRESS ENTER");

                    }

                    else if (userResponse.equals("BROKEN MIRROR")) {
                        System.out.println("\n" + "Broken Mirror! : object description recorded");
                        System.out.println(brokenmirror.action());
                        Investigator.addMemory(userResponse, brokenmirror.action());
                        System.out.println("\n" + "PRESS ENTER");

                    } else if (userResponse.equals("OLD VANITY")) {
                        System.out.println("\n" + "Old vanity!: object description recorded");
                        System.out.println(oldvanity.action());
                        Investigator.addMemory(userResponse, oldvanity.action());
                        System.out.println("\n" + "PRESS ENTER");

                    }

                    else if (userResponse.equals("BABY DOLL")) {
                        System.out.println("\n" + "Baby doll!: object collected");
                        System.out.println(doll.action());
                        Investigator.addMemory(userResponse, doll.action());
                        System.out.println("\n" + "PRESS ENTER");

                    } else if (userResponse.equals("HAND MIRROR")) {
                        System.out.println("\n" + "Hand mirror!: object collected");
                        System.out.println(handmirror.action());
                        Investigator.addMemory(userResponse, handmirror.action());
                        System.out.println("\n" + "PRESS ENTER");

                    } else if (userResponse.equals("BALLERINA JEWELRY BOX")) {
                        System.out.println("\n" + "Ballerina jewelrybox!: object collected");
                        System.out.println(ballerinajewelrybox.action());
                        Investigator.addMemory(userResponse, ballerinajewelrybox.action());
                        System.out.println("\n" + "PRESS ENTER");

                    }

                    else if (userResponse.equals("CREEPY PORTRAIT")) {
                        System.out.println("\n" + "Creepy portrait!: object collected");
                        System.out.println(creepyportraits.action());
                        Investigator.addMemory(userResponse, creepyportraits.action());
                        System.out.println("\n" + "PRESS ENTER");

                    } else if (userResponse.equals("RUSTY KNIFE")) {
                        System.out.println("\n" + "Rusty knife!: object collected");
                        System.out.println(rustyknifes.action());
                        Investigator.addMemory(userResponse, rustyknifes.action());
                        System.out.println("\n" + "PRESS ENTER");

                    } else if (userResponse.equals("OLD NEWSPAPER")) {
                        System.out.println("\n" + "Old newspaper!: object collected");
                        System.out.println(oldnewspaper.action());
                        Investigator.addMemory(userResponse, oldnewspaper.action());
                        System.out.println("\n" + "PRESS ENTER");

                    }

                    else if (userResponse.equals("CREAKING CHAIR")) {
                        System.out.println("\n" + "Creaking chair!: object description recorded");
                        System.out.println(creakingchair.action());
                        Investigator.addMemory(userResponse, creakingchair.action());
                        System.out.println("\n" + "PRESS ENTER");

                    } else if (userResponse.equals("DUFFLE BAG")) {
                        System.out.println("\n" + "Duffle bag!: object description recorded");
                        System.out.println(dufflebag.action());
                        Investigator.addMemory(userResponse, dufflebag.action());
                        System.out.println("\n" + "PRESS ENTER");

                    } else if (userResponse.equals("BROKEN GRANDFATHER CLOCK")) {
                        System.out.println("\n" + "Broken grandfather clock!: object description recorded");
                        System.out.println(grandfatherclock.action());
                        Investigator.addMemory(userResponse, grandfatherclock.action());
                        System.out.println("\n" + "PRESS ENTER");
                    

                    } else if (userResponse.equals("BACK")) {
                        System.out.println(
                                "\n" + "If you would like to try a different room, keep exploring. Press Enter");


                    }else if (userResponse.equals("HELP")) {
                        System.out.println("\n" + ">To start the game you must type ENTER HOUSE in the terminal. Once started you will be in the house Foyer and will be given 4 room options to explore." + "\n" + ">To choose a room and explore you must enter the name of one of these 4 room options : THE ATTIC, SALLY'S ROOM, THE KITCHEN, or THE BASEMENT." +"\n"+ "After choosing a room, you will be given a description of the room and a list of collectable objects." +"\n"+ "To collect an object the player must enter it's name. To continue exploring after collecting an object you will need to type in ENTER." +"\n"+ "When you are finished looking through the house's rooms and collecting objects you can type in NO when asked the Would you like to keep exploring question. This will take us to the end of the game where your final choice based on your collected evidence will determine your fate.");}


                    

                    else {
                        System.out.println(
                                "Sorry, I didn't understand that. Please enter the name of an object in the room!");
                        System.out.println("\n" + "Press ENTER to take another look around");

                    }
                    userResponse = userInput.nextLine().toUpperCase();

                    System.out.println("Would you like to keep exploring? Press Enter to continue or type NO to stop."); // will print out the list of
                                                                                         // rooms if Player enters YES
                    continueExploring = userInput.nextLine().toUpperCase();
                    if (continueExploring.equals("NO")) {
                        stillExploring = false;
                    }

                }

                /* The ending conditions */
                System.out
                        .println("\n Here's everything you experienced in Hollow's House \n"
                                + Investigator.printMemory());
                System.out.println("\n Do you believe in ghosts?\n");
                String ghostResponse = userInput.nextLine().toUpperCase();
                Hashtable memory = Investigator.giveMemory();
                Set<java.lang.String> keys = memory.keySet();

                if (ghostResponse.equals("YES")) {
                    if (keys.contains("BROKEN MIRROR") || (keys.equals("BABY DOLL")) || (keys.equals("RUSTY KNIFE"))
                            || (keys.equals("DUFFLE BAG"))) {
                        System.out.println(
                                "You believe in ghosts and your experiences in Hollow's House make you even more confident. \nYou become a reknown ghost-hunter, being the first to prove the existence of ghosts!");
                    } else {
                        System.out.println(
                                "You believe in ghosts, but you didn't get any solid evidence from Hollow's House. \nYou begin your new life mission to prove their existence, traveling to every haunted house you can find.");
                    }
                } else if (ghostResponse.equals("NO")) {
                    if (keys.contains("BROKEN MIRROR") || (keys.equals("BABY DOLL")) || (keys.equals("RUSTY KNIFE"))
                            || (keys.equals("DUFFLE BAG"))) {
                        System.out.println(
                                "You don't believe in ghosts, but some of the objects you interacted with may imply otherwise. \nYou may come to regret that. \nBut you don't know that. You don't believe in them.");
                    } else {
                        System.out.println(
                                "You don't believe in ghosts and nothing in Hollow's House seemed to imply otherwise. \nYou give up ghost-hunting as you no longer see a need to continue.");
                    }
                } else {
                    System.out.println("Sorry, I didn't understand that. Do you think ghosts exist?");
                }

            }

            else { // if the Player doesn't enter the house
                System.out.println(
                        "Sorry, I didn't understand that. If you would like to start playing, please type ENTER HOUSE.");

            }
            userResponse = userInput.nextLine().toUpperCase();

            // ***********************************************************************
            // And as the player interacts, you'll check to see if the game should end
            // ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
            if (userResponse.equals("LEAVE") || userResponse.equals("LOSE")) {
                stillPlaying = false;
                System.out.println("Come back if you want to test your courage.");
            }

            /************************************************************************
             * // Potential messages that will print out based on the players win status
             * //↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
             */

        } while (stillPlaying);

        // Tidy up
        userInput.close();

        // Once you exit the loop, you may need to deal with various possible stopping
        // conditions

        if (userResponse.equals("WIN")) {
            System.out.println("Yay, you won!");
        } else { // userResponse.equals("LOSE")
            System.out.println("Better luck next time.");
        }

    }

}
