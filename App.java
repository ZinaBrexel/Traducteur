import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        English vEnglish = new English();
        vEnglish.addDictionary("Bonjour", "Hello");
        Breton vBreton = new Breton();
        vBreton.addDictionary("Bonjour", "Demat");
        Togolais vTogolais = new Togolais();
        vTogolais.addDictionary("Bonjour", "ŋdi");

// Afficher les langues disponibles
        System.out.println("Langues disponibles : ");
        for (MyLanguage language : MyLanguage.values()) {
            System.out.println(language.name() + " - " + language.getDisplayName());
        }

        MyLanguage selectedLanguage = null;
        boolean isValidLanguage = false;
        do {
            // Demander à l'utilisateur de choisir une langue
            System.out.println("Dans quelle langue souhaitez-vous dire 'Bonjour' ?");
            String input = scan.nextLine();

            // Vérifier que la langue saisie est valide
            try {
                selectedLanguage = MyLanguage.valueOf(input.toUpperCase());
                isValidLanguage = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Langue invalide.");
            }
        } while (!isValidLanguage);

// Utiliser la langue sélectionnée
        switch (selectedLanguage) {
            case ANGLAIS:
                System.out.println(vEnglish.getTraduction("Bonjour"));
                break;
            case BRETON:
                System.out.println(vBreton.getTraduction("Bonjour"));
                break;
            default:
                break;
        }
    }
}