import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI {
    public static void main(String[] args) {
        // Crear una instancia de la calculadora y mostrar la interfaz gráfica
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);  // Centrar la ventana

        // Crear panel para contener los componentes
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Crear etiquetas y campos de texto
        JLabel label1 = new JLabel("Numero a:");
        label1.setBounds(10, 20, 100, 25);
        panel.add(label1);

        JTextField textField1 = new JTextField(20);
        textField1.setBounds(150, 20, 100, 25);
        panel.add(textField1);

        JLabel label2 = new JLabel("Numero b:");
        label2.setBounds(10, 50, 100, 25);
        panel.add(label2);

        JTextField textField2 = new JTextField(20);
        textField2.setBounds(150, 50, 100, 25);
        panel.add(textField2);

        JLabel resultLabel = new JLabel("Resultado:");
        resultLabel.setBounds(10, 150, 120, 25);
        panel.add(resultLabel);

        JTextField resultField = new JTextField(20);
        resultField.setBounds(130, 150, 165, 25);
        resultField.setEditable(false);  // Este campo es solo para mostrar el resultado
        panel.add(resultField);

        // Crear los botones de las operaciones
        JButton addButton = new JButton("+");
        addButton.setBounds(10, 100, 80, 25);
        panel.add(addButton);

        JButton subtractButton = new JButton("-");
        subtractButton.setBounds(100, 100, 80, 25);
        panel.add(subtractButton);

        JButton multiplyButton = new JButton("*");
        multiplyButton.setBounds(190, 100, 80, 25);
        panel.add(multiplyButton);

        JButton divideButton = new JButton("/");
        divideButton.setBounds(280, 100, 80, 25);
        panel.add(divideButton);

        JButton exitButton = new JButton("Salir");
        exitButton.setBounds(160, 200, 80, 25);
        panel.add(exitButton);

        // Acciones de los botones
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(textField1.getText());
                    float num2 = Float.parseFloat(textField2.getText());
                    float result = num1 + num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    resultField.setText("Error");
                }
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(textField1.getText());
                    float num2 = Float.parseFloat(textField2.getText());
                    float result = num1 - num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    resultField.setText("Error");
                }
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(textField1.getText());
                    float num2 = Float.parseFloat(textField2.getText());
                    float result = num1 * num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    resultField.setText("Error");
                }
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(textField1.getText());
                    float num2 = Float.parseFloat(textField2.getText());
                    if (num2 == 0) {
                        resultField.setText("No se puede dividir entre 0");
                    } else {
                        float result = num1 / num2;
                        resultField.setText(String.valueOf(result));
                    }
                } catch (NumberFormatException ex) {
                    resultField.setText("Error");
                }
            }
        });

        // Botón de salir
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);  // Cierra la aplicación
            }
        });
    }
}
