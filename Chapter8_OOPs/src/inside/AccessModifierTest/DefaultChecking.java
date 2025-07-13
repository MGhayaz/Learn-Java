package inside.AccessModifierTest;

import inside.AccessModifiers.Car;

public class DefaultChecking {
    Default newwDefault = new Default(); // same pacakge mai default class bulasakte,
    // private nai bula sakte
    Car toyota = new Car("white", 520000,
            "legender", 490000, 54); // car yahan bi agayi kyuki ye public thi,
    // public wale poure project mai ghum sakte.
}
