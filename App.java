import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        English vEnglish = new English();
        vEnglish.addDictionary("Bonjour", "Hello");
        Breton vBreton = new Breton();
        vBreton.addDictionary("Bonjour", "Demat");

        // Afficher les langues disponibles
        System.out.println("Langues disponibles : ");
        for (MyLanguage language : MyLanguage.values()) {
            System.out.println(language.name() + " - " + language.getDisplayName());
        }

        // Demander à l'utilisateur de choisir une langue
        System.out.println("Dans quelle langue souhaitez-vous dire 'Bonjour' ?");
        String input = scan.nextLine();


        // Vérifier que la langue saisie est valide
        MyLanguage selectedLanguage = null;
        try {
            selectedLanguage = MyLanguage.valueOf(input.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Langue invalide.");
        }

        // Utiliser la langue sélectionnée
        if (selectedLanguage != null) {
            switch (selectedLanguage) {
                case LANGUAGE1:
                    System.out.println(vEnglish.getTraduction("Bonjour"));
                    break;
                case LANGUAGE2:
                    System.out.println(vBreton.getTraduction("Bonjour"));
                    break;
                default:
                    break;
            }
        }
    }
}