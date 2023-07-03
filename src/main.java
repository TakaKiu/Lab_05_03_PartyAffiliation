import java.util.Scanner;

class PartyAffiliationChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Party Affiliation Menu:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.println("Enter your party affiliation choice: ");
        String choice = scanner.nextLine();

        String partyAffiliation;
        if (choice.equalsIgnoreCase("D")) {
            partyAffiliation = "Democrat";
        } else if (choice.equalsIgnoreCase("R")) {
            partyAffiliation = "Republican";
        } else if (choice.equalsIgnoreCase("I")) {
            partyAffiliation = "Independent";
        } else {
            partyAffiliation = "Other";
        }

        String response = switch (partyAffiliation) {
            case "Democrat" -> "Donkey";
            case "Republican" -> "Elephant";
            case "Independent" -> "Person";
            default -> "Other";
        };

        System.out.println("You get a " + partyAffiliation + " " + response + ".");
    }
}