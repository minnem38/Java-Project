//Voor de GUI(Graphical User Interface), moeten we een gedeelte uit de swing library gebruiken
import javax.swing.JOptionPane
//we maken het standaard gedeelte aan,
public class JOptionPaneTutorial {
    public static void main(String[] args){
// en dan kunnen we beginnen!
// laten we eerst een simpel stukje maken dan vraagt om een naam
        String naam = javax.swing.JOptionPane.showInputDialog("Voer je naam in.");
        javax.swing.JOptionPane.showMessageDialog(null,"Hallo, "+naam);
        //Integers zijn net wat lastiger helaas
        //Omdat showInputDialog een string geeft moeten we het dus omzetten
        int leeftijd = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Voer je leeftijd in"));
        javax.swing.JOptionPane.showMessageDialog(null, "Je bent "+leeftijd+" jaar oud");

    }
}

