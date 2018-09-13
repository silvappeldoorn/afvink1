import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Hello World");
        String naam = JOptionPane.showInputDialog(null, "Wat is uw naam?");
        JOptionPane.showMessageDialog(null, "De naam van de gebruiker is '" + naam + "'.");
        System.out.printf("The user's name is '%s'.\n", naam);
    }
}