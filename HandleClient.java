package Company.Handle;

import java.util.Scanner;

public class HandleClient 
{
	Scanner in;

    public void HandleClients(Scanner in){
        this.in = in;
        // start handling the client's input
        handleChoice();
    }

    private void handleChoice(){
        // prompt user for country
        System.out.println("                        Hello user please enter the Country you want to book for                        ");
        System.out.println("Country list: ");
        System.out.println("Lesotho \nBotswana \nEswatini \nMozambique \nZambia \nMalawi \nMadagascar \nMauritius \nTanzania");
        System.out.print("Type the country you are choosing here: ");
        while(in.hasNextLine()){
            // get input from user
            String input = in.nextLine();
            // check input
            switch (input){
                case "Lesotho":
                    LesothoHandler();
                    break;
                case "Botswana":
                    BotswanaHandler();
                    break;
                case "Eswatini":
                    EswatiniHandler();
                    break;
                case "Zambia":
                    ZambiaHandler();
                    break;
                case "Malawi":
                    MalawiHandler();
                    break;
                case "Mozambique":
                    MozambiqueHandler();
                    break;
                case "Madagascar":
                    MadagascarHandler();
                    break;
                case "Mauritius":
                    MauritiusHandler();
                    break;
                case "Tanzania":
                    TanzaniaHandler();
                    break;
                case null:
                    System.out.println("Please enter a valid choice");
                default:
                    System.out.println("Country " + input + " does not appear on our list. Try another one");
                    break;
            }
            // end
            break;
        }
    }

    private void LesothoHandler(){
        System.out.println("                    Welcome to the Lesotho country with capital city Maseru.                    ");
        System.out.println("Below are the things you can do for fun in Lesotho: ");
        System.out.println("1. Maletsunyane Waterfall.");
        System.out.println("2. Hiking, Camping, Snow Sports, Horseback during winter months.");
        System.out.println("3. Drakensburg Mountain day Tour into Lesotho.");
        System.out.print("Please enter choice: ");
        // get the choice
        try{
            int choice = in.nextInt();
            // create a switch statement
            switch (choice){
                case 1:
                    System.out.println("You selected Maletsunyane Waterfall. It's a stunning place to visit, known for its beautiful scenery.");
                    break;
                case 2:
                    System.out.println("You selected Hiking, Camping, Snow Sports, Horseback riding. Enjoy the outdoor activities during winter months!");
                    break;
                case 3:
                    System.out.println("You selected Drakensburg Mountain day Tour. A perfect adventure to explore the beauty of the mountains.");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }catch(Exception e){
            System.out.println("Error ");
        }
    }
    private void BotswanaHandler(){
        System.out.println("                    Welcome to the Botswana country with capital city Gaborone.                     ");
        System.out.println("Below are the things you can do for fun in Botswana.");
        System.out.println("1. Victoria Falls");
        System.out.println("2. Central Kalahari Game Reserve");
        System.out.println("3. Mokolodi Nature Reserve");
        System.out.print("Enter choice: ");
        // get choice from user
        int choice = in.nextInt();
        // create a switch case
        switch (choice){
            case 1:
                System.out.println("Victoria Falls\r\n"
                        + "One of the largest and most famous waterfalls in the world, located on the border of Zambia and Zimbabwe.");
                break;
            case 2:
                System.out.println("Central Kalahari Game Reserve\r\n"
                        + "One of the largest game reserves globally, featuring vast landscapes and diverse wildlife in the heart of Botswana.");
                break;
            case 3:
                System.out.println("Mokolodi Nature Reserve\r\n"
                        + "A private nature reserve near Gaborone, home to various wildlife, offering guided walks and educational programs on conservation.");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    private void EswatiniHandler(){
        System.out.println("                    Welcome to the Eswatini country with capital cities Mbabane and Lobamba.                        ");
        System.out.println("Below are the things you can do for fun in Eswatini.");
        System.out.println("1. Hlane Royal National Park");
        System.out.println("2. Mkahaya Game Reserve");
        System.out.println("3. Mlilwane Game Sanctuary");
        System.out.print("Enter choice: ");
        // get choice
        int choice = in.nextInt();
        // create switch case
        switch (choice){
            case 1:
                System.out.println("You selected Maletsunyane Waterfall. It's a stunning place to visit, known for its beautiful scenery.");
                break;
            case 2:
                System.out.println("You selected Hiking, Camping, Snow Sports, Horseback riding. Enjoy the outdoor activities during winter months!");
                break;
            case 3:
                System.out.println("You selected Drakensburg Mountain day Tour. A perfect adventure to explore the beauty of the mountains.");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    private void MozambiqueHandler(){
        System.out.println("                        Welcome to the Mozambique country with capital city Maputo.                     ");
        System.out.println("Below are the things you can do for fun in Mozambique.");
        System.out.println("1. Maputo Special Reserve");
        System.out.println("2. Bazaruto Archipelago");
        System.out.println("3. Kruger National Park");
        System.out.print("Enter choice: ");
        // get choice
        int choice = in.nextInt();
        // create switch case
        switch (choice){
            case 1:
                System.out.println("You selected Maletsunyane Waterfall. It's a stunning place to visit, known for its beautiful scenery.");
                break;
            case 2:
                System.out.println("You selected Hiking, Camping, Snow Sports, Horseback riding. Enjoy the outdoor activities during winter months!");
                break;
            case 3:
                System.out.println("You selected Drakensburg Mountain day Tour. A perfect adventure to explore the beauty of the mountains.");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    private void ZambiaHandler(){
        System.out.println("                        Welcome to the Zambia country with capital city Lusaka.                         ");
        System.out.println("Below are the things you can do for fun in Zambia.");
        System.out.println("1. Lake Kariba");
        System.out.println("2. RIVER RAFTING");
        System.out.println("3. HORSE TRAILS");
        System.out.print("Enter choice: ");
        // get choice
        int choice = in.nextInt();
        // create switch case
        switch (choice){
            case 1:
                System.out.println("You selected Maletsunyane Waterfall. It's a stunning place to visit, known for its beautiful scenery.");
                break;
            case 2:
                System.out.println("You selected Hiking, Camping, Snow Sports, Horseback riding. Enjoy the outdoor activities during winter months!");
                break;
            case 3:
                System.out.println("You selected Drakensburg Mountain day Tour. A perfect adventure to explore the beauty of the mountains.");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    private void MalawiHandler(){
        System.out.println("                        Welcome to the Malawi country with capital city Lilongwe.                       ");
        System.out.println("Below are the things you can do for fun in Malawi.");
        System.out.println("1. Mumbo Island");
        System.out.println("2. Chongoni Rock Art Area");
        System.out.println("3. Liwonde National Park");
        System.out.print("Enter choice: ");
        // get choice
        int choice = in.nextInt();
        // create switch case
        switch (choice){
            case 1:
                System.out.println("Mumbo Island details");
                break;
            case 2:
                System.out.println("Chongoni Rock art details");
                break;
            case 3:
                System.out.println("Liwonde National Park Details");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    private void MadagascarHandler(){
        System.out.println("                        Welcome to the Madagascar country with capital city Antananarivo.                       ");
        System.out.println("Below are the things you can do for fun in Madagascar.");
        System.out.println("1. Lemurs Park");
        System.out.println("2. Isalo National Park");
        System.out.println("3. Queen's Palace");
        System.out.print("Enter choice: ");
        // get choice
        int choice = in.nextInt();
        // create switch case
        switch (choice){
            case 1:
                System.out.println("Lemurs Park");
                break;
            case 2:
                System.out.println("Isalo National Park.");
                break;
            case 3:
                System.out.println("Queens Palace details");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    private void MauritiusHandler(){
        System.out.println("                        Welcome to the Mauritius country with capital city Port Louis.                      ");
        System.out.println("Below are the things you can do for fun in Mauritius.");
        System.out.println("1. Mauritius Island");
        System.out.println("2. Grand Bassin");
        System.out.println("3. Visit to the Green Dormant Volcano named Trou Aux Cerfs");
        System.out.print("Enter choice: ");
        // get choice
        int choice = in.nextInt();
        switch (choice){
            case 1:
                System.out.println("Maritius Island details");
                break;
            case 2:
                System.out.println("Grand Bassin Details");
                break;
            case 3:
                System.out.println("Green Dormant Volcano Details");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    private void TanzaniaHandler(){
        System.out.println("                        Welcome to the Tanzania country with capital city Port Louis.                       ");
        System.out.println("Below are the things you can do for fun in Tanzania.");
        System.out.println("1. Tarangire National Park");
        System.out.println("2. Serengeti National Park");
        System.out.println("3. Serengeti");
        System.out.print("Enter choice: ");
        // get choice
        int choice = in.nextInt();
        // create switch case
        switch (choice){
            case 1:
                System.out.println("Tarangire National Park");
                break;
            case 2:
                System.out.println("Serengeti National park details");
                break;
            case 3:
                System.out.println("Serengeti details");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
