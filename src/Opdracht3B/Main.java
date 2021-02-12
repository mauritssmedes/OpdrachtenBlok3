package Opdracht3B;public class Main {
    public static void main(String[] args) {
        Cirkel c1 = null, c2 = null;
        try {
            c1 = new Cirkel(10, 0, 0);
            c2 = new Cirkel(0, 10, 10);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println(c1);
        System.out.println(c2);
    }
}
// Wat ik denk dat er gaat gebeuren:
// Ik denk dat de code zou kunnen werken op het c2 object, het c1 object gaat niet werken.
// Wat er gebeurde:
// De code stopt met werken door throw, dus de c2 print statement werkt ook niet