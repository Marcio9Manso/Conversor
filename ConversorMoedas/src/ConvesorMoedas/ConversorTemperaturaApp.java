package ConvesorMoedas;

import javax.swing.JOptionPane;



public class ConversorTemperaturaApp {
    public static void run() {
        String[] options = {"Celsius para Fahrenheit", "Fahrenheit para Celsius"};
        
        int choice = JOptionPane.showOptionDialog(
            null,
            "Escolha uma opção de conversão:",
            "Conversor de Temperaturas",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
        );
        
        double inputTemperature = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura:"));
        
                double convertedTemperature = 0.0;
                
                if (choice == 0) {
                    convertedTemperature = celsiusToFahrenheit(inputTemperature);
                } else if (choice == 1) {
                    convertedTemperature = fahrenheitToCelsius(inputTemperature);
                }
                
                JOptionPane.showMessageDialog(
                    null,
                    String.format("%.2f graus equivalem a %.2f graus", inputTemperature, convertedTemperature),
                    "Resultado da Conversão",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
            
            public static double celsiusToFahrenheit(double celsius) {
                return (celsius * 9 / 5) + 32;
            }
            
            public static double fahrenheitToCelsius(double fahrenheit) {
                return (fahrenheit - 32) * 5 / 9;
            }
        

    }

