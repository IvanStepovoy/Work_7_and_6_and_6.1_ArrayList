import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_Task {

    public static void main(String[] args) {

        while (true) {

            System.out.println();
            System.out.println("If you want to quite, press 0");
            System.out.print("Please enter your number of channel from 1 to 9, if you want to quite, press 0: ");

            int inpValue = new Scanner(System.in).nextInt();

//            String channels [] = {"Discovery", "Animal Planet", "National Geographic", "NatGeoWild", "Euronews",
//                    "EuroSport", "Science", "MTV", "VIP Comedy"};

            List<String> channels = new ArrayList<>();

            channels.add("Discovery");
            channels.add("Animal Planet");
            channels.add("National Geographic");
            channels.add("NatGeoWild");
            channels.add("Euronews");
            channels.add("EuroSport");
            channels.add("Science");
            channels.add("MTV");
            channels.add("VIP Comedy");

            if (inpValue != 0) {

                switch (inpValue) {
                    case 1:
                        System.out.println();
                        System.out.println(channels.get(0));
                        break;
                    case 2:
                        System.out.println();
                        System.out.println(channels.get(1));
                        break;
                    case 3:
                        System.out.println();
                        System.out.println(channels.get(2));
                        break;
                    case 4:
                        System.out.println();
                        System.out.println(channels.get(3));
                        break;
                    case 5:
                        System.out.println();
                        System.out.println(channels.get(4));
                        break;
                    case 6:
                        System.out.println();
                        System.out.println(channels.get(5));
                        break;
                    case 7:
                        System.out.println();
                        System.out.println(channels.get(6));
                        break;
                    case 8:
                        System.out.println();
                        System.out.println(channels.get(7));
                        break;
                    case 9:
                        System.out.println();
                        System.out.println(channels.get(8));
                        break;
                    default:
                        System.out.println("There is no such channel number, please re-enter number of channel.");
                        break;

                }

            } else {
                break;
            }


        }


    }
}