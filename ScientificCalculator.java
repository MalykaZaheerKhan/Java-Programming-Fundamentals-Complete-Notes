import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ScientificCalculator extends JFrame implements ActionListener {
    // Display field
    private JTextField display;

    // Buttons
    private JButton[] numberButtons = new JButton[10];
    private JButton[] functionButtons = new JButton[9];
    private JButton addButton, subButton, mulButton, divButton, sinButton, cosButton, tanButton, sqrtButton, equalButton;
    private JButton clearButton, logButton, lnButton, powerButton, dotButton;

    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public ScientificCalculator() {
        // Frame properties
        setTitle("Scientific Calculator");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Display field
        display = new JTextField();
        display.setBounds(30, 20, 320, 50);
        display.setFont(new Font("Arial", Font.BOLD, 18));
        display.setEditable(false);
        add(display);

        // Buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        sinButton = new JButton("sin");
        cosButton = new JButton("cos");
        tanButton = new JButton("tan");
        sqrtButton = new JButton("√");
        equalButton = new JButton("=");
        clearButton = new JButton("C");
        logButton = new JButton("log");
        lnButton = new JButton("ln");
        powerButton = new JButton("^");
        dotButton = new JButton(".");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = sinButton;
        functionButtons[5] = cosButton;
        functionButtons[6] = tanButton;
        functionButtons[7] = sqrtButton;
        functionButtons[8] = powerButton;

        for (int i = 0; i < functionButtons.length; i++) {
            functionButtons[i].addActionListener(this);
        }

        clearButton.addActionListener(this);
        equalButton.addActionListener(this);
        logButton.addActionListener(this);
        lnButton.addActionListener(this);
        dotButton.addActionListener(this);

        // Number buttons
        for (int i = 0; i < numberButtons.length; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        // Panel for buttons
        JPanel panel = new JPanel();
        panel.setBounds(30, 90, 320, 400);
        panel.setLayout(new GridLayout(5, 4, 10, 10));

        // Adding buttons to panel
        for (int i = 1; i <= 9; i++) {
            panel.add(numberButtons[i]);
        }

        panel.add(dotButton);
        panel.add(numberButtons[0]);
        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(sinButton);
        panel.add(cosButton);
        panel.add(tanButton);
        panel.add(sqrtButton);
        panel.add(powerButton);
        panel.add(logButton);
        panel.add(lnButton);
        panel.add(clearButton);
        panel.add(equalButton);

        add(panel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                display.setText(display.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == dotButton) {
            display.setText(display.getText().concat("."));
        }

        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(display.getText());
            operator = '+';
            display.setText("");
        }

        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(display.getText());
            operator = '-';
            display.setText("");
        }

        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(display.getText());
            operator = '*';
            display.setText("");
        }

        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(display.getText());
            operator = '/';
            display.setText("");
        }

        if (e.getSource() == powerButton) {
            num1 = Double.parseDouble(display.getText());
            operator = '^';
            display.setText("");
        }

        if (e.getSource() == equalButton) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '^':
                    result = Math.pow(num1, num2);
                    break;
            }
            display.setText(String.valueOf(result));
            num1 = result;
        }

        if (e.getSource() == clearButton) {
            display.setText("");
        }

        if (e.getSource() == sqrtButton) {
            num1 = Double.parseDouble(display.getText());
            display.setText(String.valueOf(Math.sqrt(num1)));
        }

        if (e.getSource() == sinButton) {
            num1 = Double.parseDouble(display.getText());
            display.setText(String.valueOf(Math.sin(Math.toRadians(num1))));
        }

        if (e.getSource() == cosButton) {
            num1 = Double.parseDouble(display.getText());
            display.setText(String.valueOf(Math.cos(Math.toRadians(num1))));
        }

        if (e.getSource() == tanButton) {
            num1 = Double.parseDouble(display.getText());
            display.setText(String.valueOf(Math.tan(Math.toRadians(num1))));
        }

        if (e.getSource() == logButton) {
            num1 = Double.parseDouble(display.getText());
            display.setText(String.valueOf(Math.log10(num1)));
        }

        if (e.getSource() == lnButton) {
            num1 = Double.parseDouble(display.getText());
            display.setText(String.valueOf(Math.log(num1)));
        }
    }

    public static void main(String[] args) {
        new ScientificCalculator();
    }
}
