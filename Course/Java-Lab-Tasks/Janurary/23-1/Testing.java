/*Question: Mobile Phone SIM Card Interaction
_______________________________________________

You are tasked with implementing a simulation of a mobile phone interacting with different SIM cards. The goal is to create a system where mobile phones can insert, remove, and use SIM cards from different providers.

Components:
--------------

-> SIMCardInterface: An interface that defines methods for getting phone number, network provider, and activation/deactivation of a SIM card.

-> Jio, Airtel, and BSNL Classes: These classes should implement the SIMCardInterface. Each class represents a SIM card from a different network provider (Jio, Airtel, and BSNL) and should have provider-specific details.

-> MobilePhoneInterface: An interface that defines methods for inserting, removing SIM cards, making calls, and sending text messages.

-> MobilePhone Class: This class should implement the MobilePhoneInterface. It should have a slot for inserting a SIM card and methods for making calls and sending texts.

Tasks:
----------

-> Implement the SIMCardInterface and the classes Jio, Airtel, and BSNL that implement this interface. Include methods for getting phone number, network provider, and activating/deactivating the SIM card.

-> Implement the MobilePhoneInterface and the MobilePhone class that implements this interface. The MobilePhone class should allow inserting and removing SIM cards, making calls, and sending texts.

-> Demonstrate the interaction between mobile phones and different SIM cards:

->Create instances of Jio, Airtel, and BSNL SIM cards.
->Create a MobilePhone instance.
->Insert a SIM card into the mobile phone.
->Make a call and send a text message using the inserted SIM card.
->Remove the SIM card from the mobile phone.
->Discuss how the use of interfaces (SIMCardInterface and MobilePhoneInterface) promotes a loosely coupled architecture and allows flexibility in swapping different SIM cards.

[Note: You can provide the classes with appropriate constructors and methods as needed for the implementation.]

Hints:
--------------
Define the interfaces with the required methods and let the classes implement them.
Consider including print statements to indicate the activation, deactivation, insertion, and removal of SIM cards.
Focus on encapsulation, polymorphism, and the benefits of using interfaces in promoting modular and flexible code.
Feel free to adjust the details and wording of the question according to your preferences and the level of understanding you want to assess. */

public class Testing {

    public static void main(String[] args) {

        SIMCardInterface jioSIM = new Jio("9876543210");
        SIMCardInterface airtelSIM = new Airtel("9123456789");
        SIMCardInterface bsnlSIM = new BSNL("9012345678");

        MobilePhoneInterface phone = new MobilePhone();

        phone.insertSim(jioSIM);
        phone.makeCall("9999999999");
        phone.makeMessage("8888888888", "Hello from Jio");
        phone.removeSim();

        IO.println("----------------------");

        phone.insertSim(airtelSIM);
        phone.makeCall("7777777777");
        phone.makeMessage("6666666666", "Hello from Airtel");
        phone.removeSim();

        IO.println("----------------------");

        phone.insertSim(bsnlSIM);
        phone.makeCall("5555555555");
        phone.makeMessage("4444444444", "Hello from BSNL");
        phone.removeSim();
    }
}

interface SIMCardInterface {

    String getPhoneNumber();
    String getNetworkProvider();
    void activateSIM();
    void deactivateSIM();
}

class Jio implements SIMCardInterface {

    private String phoneNumber;

    Jio(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getNetworkProvider() {
        return "Jio";
    }

    public void activateSIM() {
        IO.println("SIM activated with phone number " + phoneNumber);
    }

    public void deactivateSIM() {
        IO.println("SIM deactivated");
    }
}

class Airtel implements SIMCardInterface {

    private String phoneNumber;

    Airtel(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getNetworkProvider() {
        return "Airtel";
    }

    public void activateSIM() {
        IO.println("SIM activated with phone number " + phoneNumber);
    }

    public void deactivateSIM() {
        IO.println("SIM deactivated");
    }
}

class BSNL implements SIMCardInterface {

    private String phoneNumber;

    BSNL(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getNetworkProvider() {
        return "BSNL";
    }

    public void activateSIM() {
        IO.println("SIM activated with phone number " + phoneNumber);
    }

    public void deactivateSIM() {
        IO.println("SIM deactivated");
    }
}

interface MobilePhoneInterface {

    void insertSim(SIMCardInterface sim);
    void removeSim();
    void makeCall(String phoneNumber);
    void makeMessage(String phoneNumber, String message);
}

class MobilePhone implements MobilePhoneInterface {

    private SIMCardInterface sim;

    public void insertSim(SIMCardInterface sim) {
        this.sim = sim;
        sim.activateSIM();
        IO.println(sim.getNetworkProvider() + " SIM inserted into mobile phone");
    }

    public void removeSim() {
        if (sim != null) {
            sim.deactivateSIM();
            IO.println(sim.getNetworkProvider() + " SIM removed from mobile phone");
            sim = null;
        } else {
            IO.println("No SIM card to remove");
        }
    }

    public void makeCall(String number) {
        if (sim != null) {
            IO.println("Calling " + number + " using " +
                       sim.getNetworkProvider() + " SIM (" +
                       sim.getPhoneNumber() + ")");
        } else {
            IO.println("Please insert a SIM card to make a call");
        }
    }

    public void makeMessage(String number, String message) {
        if (sim != null) {
            IO.println("Sending SMS to " + number + " using " +
                       sim.getNetworkProvider() + ": " + message);
        } else {
            IO.println("Please insert a SIM card to send a message");
        }
    }
}
