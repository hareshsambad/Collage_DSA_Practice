import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TaxCalculatorUI extends JFrame {

    private JTextField amountField;
    private JLabel resultLabel;

    public TaxCalculatorUI() {
        setTitle("Tax Calculator");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center the window

        // UI Elements
        JLabel amountLabel = new JLabel("Enter Amount:");
        amountField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate Tax");
        resultLabel = new JLabel("Final Amount: ₹0.00");

        // Layout
        setLayout(new GridLayout(4, 1));
        JPanel panel1 = new JPanel();
        panel1.add(amountLabel);
        panel1.add(amountField);
        add(panel1);
        add(calculateButton);
        add(resultLabel);

        // Button action
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateAndShowTax();
            }
        });
    }

    private void calculateAndShowTax() {
        try {
            double amount = Double.parseDouble(amountField.getText());

            double finalAmount = applyTax(amount);
            resultLabel.setText("Final Amount: ₹" + finalAmount);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter a valid number.");
        }
    }

    private double applyTax(double amount) {
        TreeMap<Integer, Integer> taxRules = new TreeMap<>(Collections.reverseOrder());

        // Rules: threshold → tax %
        taxRules.put(50000, 18);
        taxRules.put(10000, 12);
        taxRules.put(5000, 5);

        int taxPercent = 0;

        for (Map.Entry<Integer, Integer> rule : taxRules.entrySet()) {
            if (amount > rule.getKey()) {
                taxPercent = rule.getValue();
                break;
            }
        }

        double finalAmount = amount + (amount * taxPercent / 100.0);
        return Math.round(finalAmount * 100.0) / 100.0; // 2 decimal places
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TaxCalculatorUI().setVisible(true);
        });
    }
}
