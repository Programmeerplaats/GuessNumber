import java.util.Random;
import java.util.Scanner;

public class Game {

  public static void main(String[] args) {
    
    // Random nummer en nummer van gebruiker variables opzetten
    int randomNummer, gebruikerNummer;
    
    // Tellen van beurten variable opzetten
    int telBeurten = 0;
    
    // Object maken van Random class
    Random random = new Random();
    
    // Random nummer geven aan randomNummer variable (0-10)
    randomNummer = random.nextInt(11);
    
    // Object maken van Scanner class om invoer van gebruiker te krijgen
    Scanner scanner = new Scanner(System.in);
    
    do {
      // 1 bij beurt optellen in telBeurten variable
      telBeurten++;
      
      // Als telBeurten gelijk is aan 4
      if (telBeurten == 4) {
        System.out.println("Je beurten zijn helaas voorbij en je hebt verloren.");
        break;
      }
      
      // Aangeven in console dat gebruiker een getal moet invullen
      System.out.println("Vul een getal in van 0 t/m 10: ");
      
      // Waarde van invoer opslaan in gebruikerNummer variable
      gebruikerNummer = scanner.nextInt();
      
      // Als randomNummer gelijk is aan gebruikerNummer
      if (randomNummer == gebruikerNummer) {
        System.out.println("Gefeliciteerd! Je hebt het goed geraden!");
        System.out.println("Je hebt er " + telBeurten + " beurt(en) over gedaan.");
      }
      // Als randomNummer kleiner is dan gebruikerNummer
      else if (randomNummer < gebruikerNummer) {
        System.out.println("Het random nummer is lager dan jouw ingevulde nummer.");
      }
      // Als randomNummer groter is dan gebruikerNummer
      else if (randomNummer > gebruikerNummer) {
        System.out.println("Het random nummer is hoger dan jouw ingevulde nummer.");
      }
    } while (randomNummer != gebruikerNummer);
  }
}
