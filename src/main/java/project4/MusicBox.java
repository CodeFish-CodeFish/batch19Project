package project4;

import java.util.Scanner;

public class MusicBox {
    public static void main(String[] args) {

        /*
create an app that will provide songs based on genres,
 genres are = Classical, Pop, Country
 Under each genre we have 3 songs for each genre
 Classical songs = 'Four Season', 'Fur Elise', 'Finlandia', 'Vocalize', 'The Planet '
 Pop songs = 'Bad Guy', 'Talk', 'Please me', '7 Rings', 'Without me'
 Country songs = 'Meant to be', 'Heaven', 'Simple', 'One Number Away', 'Get Along'

 Application should have exit option available in the beginning
 Application should not throw any exception, meaning no error message in the console.
 If user enters wrong song or wrong genre, app should give proper instruction to correct their way with proper message.
 If the payment is equal to price message should be given and application should ask to listen more songs?
 If payment is less, then user should be notified with proper message and should not play the music
 If the payment is more than the price, the app should give a message with change and music plays


 Prices:
 Pop = $4
 Classic = $2
 Country = $3

 */


        System.out.println("Hello, This is music box application");
        System.out.println("Please Enter the music type! Or type exit to quit.");
        System.out.println("Available music types are Classical , Pop , Country.");

        Scanner scanner = new Scanner(System.in);
        int countOfwhileLoop = 0;

        while (true) {

            if(countOfwhileLoop > 0 ){
                System.out.println("Please Enter the music type! Or type exit to quit.");
                System.out.println("Available music types are Classical , Pop , Country.");
            }

            String musicType = scanner.nextLine().trim();

            if (musicType.equalsIgnoreCase("exit")) {
                System.out.println("Exiting application. Bye Bye");
                break;
            }


            switch (musicType.toLowerCase().trim()) {

                case "classical":
                    System.out.println("Available songs in CLASSICAL music: ");
                    System.out.println("Four Season, Fur Elise, Finlandia, Vocalize, The Planet");
                    break;
                case "pop":
                    System.out.println("Available songs in POP music: ");
                    System.out.println("'Bad Guy', 'Talk', 'Please me', '7 Rings', 'Without me'");
                    break;
                case "country":
                    System.out.println("Available songs in COUNTRY music: ");
                    System.out.println("Meant to be, Heaven, Simple, One Number Away, Get Along");
                    break;
                default:
                    System.out.println(musicType + " type of music is not available song.");
                    System.out.println("Please try again.");
                    System.out.println("Please Enter the music type! Or type exit to quit.");
                    System.out.println("Available music types are Classical , Pop , Country.");
                    continue;
            }


            System.out.println("Which one do you want to listen? Or type exit to quit.");

            String chosenSong = scanner.nextLine().trim();

            if (chosenSong.equalsIgnoreCase("exit")) {
                System.out.println("Exiting application. Bye Bye");
                break;
            }


            switch (musicType.toLowerCase().trim()) {
                case "classical":
                    switch (chosenSong.toLowerCase()) {
                        case "four season":
                        case "fur elise":
                        case "finlandia":
                        case "vocalize":
                        case "the planet":
                            System.out.println("Please enter $2 dollars for this song: ");
                            break;
                        default:
                            System.out.println(chosenSong + " is not available song");
                            System.out.println("You are returned back to main menu.");
                            System.out.println("Please Enter the music type! Or type exit to quit.");
                            System.out.println("Available music types are Classical , Pop , Country.");
                            continue;
                    }
                    break;
                case "pop":
                    switch (chosenSong.toLowerCase().trim()) {
                        case "bad guy"://Talk', 'Please me', '7 Rings', 'Without me'
                        case "talk":
                        case "please me":
                        case "7 rings":
                        case "without me":
                            System.out.println("Please enter $4 dollars for this song: ");
                            break;
                        default:
                            System.out.println(chosenSong + " is not available song");
                            System.out.println("You are returned back to main menu.");
                            System.out.println("Please Enter the music type! Or type exit to quit.");
                            System.out.println("Available music types are Classical , Pop , Country.");
                            continue;
                    }
                    break;

                case "country":
                    switch (chosenSong.toLowerCase()) {
                        case "meant to be":
                        case "heaven":
                        case "simple":
                        case "one number away":
                        case "get along":
                            System.out.println("Please enter $3 dollars for this song: ");
                            break;
                        default:
                            System.out.println(chosenSong + " is not available song");
                            System.out.println("You are returned back to main menu.");
                            System.out.println("Please Enter the music type! Or type exit to quit.");
                            System.out.println("Available music types are Classical , Pop , Country.");
                            continue;
                    }
                    break;
            }

            int songPrice = scanner.nextInt();
            int expectedPrice;

            switch (musicType.toLowerCase()) {
                case "classical":
                    expectedPrice = 2;
                    break;
                case "pop":
                    expectedPrice = 4;
                    break;
                case "country":
                    expectedPrice = 3;
                    break;

                default:
                    continue;
            }

            if (songPrice < expectedPrice) {
                System.out.println("Entered price is not enough, Please try it later.");
                System.out.println("Take your money back.");
            } else if (songPrice == expectedPrice) {
                System.out.println(chosenSong + " is playing. Enjoy the song!");
            } else if (songPrice > expectedPrice) {
                    int change = songPrice - expectedPrice;
                System.out.println("You have entered $" + change + " more. Please wait for your change.");
                System.out.println(chosenSong + " is playing. Enjoy the song.");
            }

            scanner.nextLine();
            countOfwhileLoop ++;
        }
        scanner.close();
        //Classical songs = 'Four Season', 'Fur Elise', 'Finlandia', 'Vocalize', 'The Planet '

    }

}
