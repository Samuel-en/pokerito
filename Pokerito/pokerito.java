package Pokerito;

import java.util.Scanner;

public class pokerito{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler.");
        System.out.println("- There are two players, you and the computer.");
        System.out.println("- The dealer will give each player one card.");
        System.out.println("- Then, the dealer will draw five cards (the river)");
        System.out.println("- The player with the most river matches wins!");
        System.out.println("- If the matches are equal, everyone's a winner");
        System.out.println("- Ready? Type anything if you are.");
        scan.nextLine();
        

        String yourCard = randomCard();
        String computerCard = randomCard();

        System.out.println("\nHere is your card: ");
        System.out.print(yourCard);
        System.out.println("\nHere is computer card: ");
        System.out.print(computerCard);

        
        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        for (int i = 1; i <= 5 ; i++) {
            scan.nextLine();
            String draw = randomCard();
            System.out.println("Card " + i);
            System.out.println(draw);
            
        }
        scan.close();
    }

    public static String randomCard(){

        double randomNum = Math.random() * 13;
        randomNum += 1;
        int randomInt = (int)randomNum;
        
        switch (randomInt) {
            case 1: return  "   _____ \n"+
                            "  |A _  |\n"+
                            "  | ( ) |\n"+
                            "  |(_'_)|\n"+
                            "  |  |  |\n"+
                            "  |____V|\n";
            case 2: return  "   _____ \n"+
                            "  |2    |\n"+
                            "  |  o  |\n"+
                            "  |     |\n"+
                            "  |  o  |\n"+
                            "  |____Z|\n";
            case 3: return  "   _____ \n"+
                            "  |3    |\n"+
                            "  | o o |\n"+
                            "  |     |\n"+
                            "  |  o  |\n"+
                            "  |____E|\n";
            case 4: return  "   _____ \n"+
                            "  |4    |\n"+
                            "  | o o |\n"+
                            "  |     |\n"+
                            "  | o o |\n"+
                            "  |____h|\n";
            case 5: return  "   _____ \n"+
                            "  |5    |\n"+
                            "  | o o |\n"+
                            "  |  o  |\n"+
                            "  | o o |\n"+
                            "  |____S|\n";
            case 6: return  "   _____ \n"+
                            "  |6    |\n"+
                            "  | o o |\n"+
                            "  | o o |\n"+
                            "  | o o |\n"+
                            "  |____6|\n";
            case 7: return  "   _____ \n"+
                            "  |7    |\n"+
                            "  | o o |\n"+
                            "  |o o o|\n"+
                            "  | o o |\n"+
                            "  |____7|\n";
            case 8: return  "   _____ \n"+
                            "  |8    |\n"+
                            "  |o o o|\n"+
                            "  | o o |\n"+
                            "  |o o o|\n"+
                            "  |____8|\n";
            case 9: return  "   _____ \n"+
                            "  |9    |\n"+
                            "  |o o o|\n"+
                            "  |o o o|\n"+
                            "  |o o o|\n"+
                            "  |____9|\n";
            case 10: return "   _____ \n"+
                            "  |10  o|\n"+
                            "  |o o o|\n"+
                            "  |o o o|\n"+
                            "  |o o o|\n"+
                            "  |___10|\n";
            case 11: return "   _____ \n"+
                            "  |j  ww|\n"+
                            "  | o {}|\n"+
                            "  |o o% |\n"+
                            "  | | % |\n"+
                            "  |__%%[|\n";
            case 12: return "   _____ \n"+
                            "  |j  ww|\n"+
                            "  | o {(|\n"+
                            "  |o o%%|\n"+
                            "  | |%%%|\n"+
                            "  |_%%%0|\n";
            case 13: return "   _____ \n"+
                            "  |K  WW|\n"+
                            "  | o {)|\n"+
                            "  |o o%%|\n"+
                            "  | |%%%|\n"+
                            "  |_%%%>|\n";
                
            default: return "this shouldn't get called";
                
        }
    }
    // public static void printRules(){

    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Let's play Pokerito. Type anything when you're ready.");
    //     scan.nextLine();
    //     System.out.println("It's like Poker, but a lot simpler.");
    //     System.out.println("- There are two players, you and the computer.");
    //     System.out.println("- The dealer will give each player one card.");
    //     System.out.println("- Then, the dealer will draw five cards (the river)");
    //     System.out.println("- The player with the most river matches wins!");
    //     System.out.println("- If the matches are equal, everyone's a winner");
    //     System.out.println("- Ready? Type anything if you are.");
    //     scan.nextLine();

    //     scan.close();
    // }

    // public static void riverCards(){

    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
    //     scan.nextLine();
    //     for (int i = 1; i < 5 ; i++) {
    //         System.out.println(randomCard());
    //     }
    //     scan.close();
    // }
}