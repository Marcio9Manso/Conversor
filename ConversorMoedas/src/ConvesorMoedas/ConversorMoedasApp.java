package ConvesorMoedas;

import javax.swing.JOptionPane;


public class ConversorMoedasApp {
    public static void run() {
        String[] currencies = {"Dólar", "Euro", "Libra Esterlina", "Peso Argentino", "Peso Chileno"};
        
        String selectedCurrency = (String) JOptionPane.showInputDialog(
            null,
            "Selecione a moeda de destino:",
            "Conversor de Moedas",
            JOptionPane.QUESTION_MESSAGE,
            null,
            currencies,
            currencies[0]
        );
        

        
        double amount = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em Reais:"));                
        double convertedAmount = 0.0;
        
        switch (selectedCurrency) {
            case "Dólar":
                convertedAmount = realToDollar(amount);
                break;
            case "Euro":
                convertedAmount = realToEuro(amount);
                break;
            case "Libra Esterlina":
                convertedAmount = realToPound(amount);
                break;
            case "Peso Argentino":
                convertedAmount = realToArgentinePeso(amount);
                break;
            case "Peso Chileno":
                convertedAmount = realToChileanPeso(amount);
                break;
        }
        
        JOptionPane.showMessageDialog(
            null,
            String.format("%.2f Reais equivalem a %.2f %s", amount, convertedAmount, selectedCurrency),
            "Resultado da Conversão",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
    
    public static double realToDollar(double amount) {
        return amount / 5.34;  // Taxa de câmbio aproximada em setembro de 2021
    }
    
    public static double realToEuro(double amount) {
        return amount / 6.28;  // Taxa de câmbio aproximada em setembro de 2021
    }
    
    public static double realToPound(double amount) {
        return amount / 7.08;  // Taxa de câmbio aproximada em setembro de 2021
    }
    
    public static double realToArgentinePeso(double amount) {
        return amount / 0.055;  // Taxa de câmbio aproximada em setembro de 2021
    }
    
    public static double realToChileanPeso(double amount) {
        return amount / 0.007;  // Taxa de câmbio aproximada em setembro de 2021
    }





    }


    