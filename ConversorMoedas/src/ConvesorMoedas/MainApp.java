package ConvesorMoedas;
/**
 * @author Marcio Manso
 */

import javax.swing.JOptionPane;



public class MainApp {
    public static void main(String[] args) {
        boolean keepRunning = true;
        
        while (keepRunning) {
            String[] options = {"Conversor de Moedas", "Conversor de Temperaturas", "Sair"};
            
            int choice = JOptionPane.showOptionDialog(null,"Escolha uma opção:","Conversores",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
            
            switch (choice) {
                case 0:
                    ConversorMoedasApp.run();
                    break;
                case 1:
                    ConversorTemperaturaApp.run();
                    break;
                case 2:
                    keepRunning = false;
                    break;
            }
        }
    }
}
