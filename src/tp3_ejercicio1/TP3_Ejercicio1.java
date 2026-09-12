package tp3_ejercicio1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TP3_Ejercicio1 extends JFrame {

    private JTextField txtMail;
    private JPasswordField txtPassword;
    private JButton btnRegistrar;
    private JButton btnOcultar;
    private JButton btnVer;

    public TP3_Ejercicio1() {
        setTitle("Inicio de sesion");[cite: 1]
        setSize(380, 260);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);[cite: 1]

        JPanel panel = new JPanel();[cite: 1]
        panel.setLayout(null);

        JLabel lblMail = new JLabel("Usuario:");
        lblMail.setBounds(30, 30, 80, 25);
        panel.add(lblMail);

        JLabel lblPass = new JLabel("Contraseña:");
        lblPass.setBounds(30, 70, 80, 25);
        panel.add(lblPass);

        txtMail = new JTextField();[cite: 1]
        txtMail.setBounds(110, 30, 200, 25);
        panel.add(txtMail);

        txtPassword = new JPasswordField();[cite: 1]
        txtPassword.setBounds(110, 70, 200, 25);
        panel.add(txtPassword);

        btnOcultar = new JButton("Ocultar");[cite: 1]
        btnOcultar.setBounds(110, 105, 95, 25);
        panel.add(btnOcultar);

        btnVer = new JButton("Ver");[cite: 1]
        btnVer.setBounds(215, 105, 95, 25);
        panel.add(btnVer);

        btnRegistrar = new JButton("Registrar");[cite: 1]
        btnRegistrar.setBounds(110, 145, 200, 30);
        panel.add(btnRegistrar);

        // Evento Registrar / Verificar[cite: 1]
        btnRegistrar.addActionListener(e -> {
            String mail = txtMail.getText().trim();
            String pass = new String(txtPassword.getPassword());

            if (mail.equalsIgnoreCase("alumno@ulp.edu.ar") && pass.equals("12345678")) {[cite: 1]
                JOptionPane.showMessageDialog(this, "¡Bienvenido/a al sistema!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);[cite: 1]
            } else {
                JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectos", "Mensaje", JOptionPane.ERROR_MESSAGE);[cite: 1]
            }
        });

        // Eventos Ocultar y Ver[cite: 1]
        btnOcultar.addActionListener(e -> txtPassword.setEchoChar('*'));[cite: 1]
        btnVer.addActionListener(e -> txtPassword.setEchoChar((char) 0));[cite: 1]

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TP3_Ejercicio1().setVisible(true));
    }
}
