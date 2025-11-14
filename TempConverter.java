package jdbc;
import javax.swing.*;
import java.awt.event.*;

public class TempConverter {
    public static void main(String[] args) {
        JFrame f = new JFrame("Temperature Converter");
        JTextField t = new JTextField();
        JLabel result = new JLabel();
        JButton c = new JButton("To Celsius");
        JButton fBtn = new JButton("To Fahrenheit");

        t.setBounds(50, 50, 150, 30);
        c.setBounds(50, 100, 150, 30);
        fBtn.setBounds(50, 140, 150, 30);
        result.setBounds(50, 180, 200, 30);

        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double v = Double.parseDouble(t.getText());
                double r = (v - 32) * 5 / 9;
                result.setText(String.valueOf(r));
            }
        });

        fBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double v = Double.parseDouble(t.getText());
                double r = (v * 9 / 5) + 32;
                result.setText(String.valueOf(r));
            }
        });

        f.add(t);
        f.add(c);
        f.add(fBtn);
        f.add(result);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
