/*
 * Brittany Hanford
 * ID: 991633307
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * 
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clubs", 9);
        nineClubs.setSuit("Clubs");
        System.out.println("nineClubs:"+nineClubs.getValue());
        
        Card sevenSpades = new Card("Spades", 7);
        sevenSpades.setSuit("Spades");
        System.out.println("sevenSpades:"+sevenSpades.getValue());
        
        //THIS IS TO COMMIT A BRANCH
        Card fiveHearts = new Card("Hearts", 7);
        fiveHearts.setSuit("Hearts");
        System.out.println("fiveHearts:"+fiveHearts.getValue());        
       
        //NEW CARD FROM GITHUB TO NETBEANS
        Card threeDiamonds = new Card("Diamonds", 3);
        threeDiamonds.setSuit("Diamonds");
        System.out.println("threeDiamonds:"+threeDiamonds.getValue());
        
        
    }
}
