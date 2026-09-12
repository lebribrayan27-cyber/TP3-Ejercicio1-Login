package tp3_ejercicio1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {

    private JTextField txtMail;
    private JPasswordField txtPassword;
    private JButton btnRegistrar, btnOcultar, btnVer;

    public LoginFrame() {
        setTitle("Inicio de sesion");
        setSize(380, 260);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel lblMail = new JLabel("Usuario:");
        lblMail.setBounds(30, 30, 80, 25);
        panel.add(lblMail);

        JLabel lblPass = new JLabel("Contraseña:");
        lblPass.setBounds(30, 70, 80, 25);
        panel.add(lblPass);

        txtMail = new JTextField();
        txtMail.setBounds(110, 30, 200, 25);
        panel.add(txtMail);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(110, 70, 200, 25);
        panel.add(txtPassword);

        btnOcultar = new JButton("Ocultar");
        btnOcultar.setBounds(110, 105, 95, 25);
        panel.add(btnOcultar);

        btnVer = new JButton("Ver");
        btnVer.setBounds(215, 105, 95, 25);
        panel.add(btnVer);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(110, 145, 200, 30);
        panel.add(btnRegistrar);

        btnRegistrar.addActionListener(e -> {
            String mail = txtMail.getText().trim();
            String pass = new String(txtPassword.getPassword());

            if (mail.equalsIgnoreCase("alumno@ulp.edu.ar") && pass.equals("12345678")) {
                JOptionPane.showMessageDialog(this, "¡Bienvenido/a al sistema!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectos", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        });

        btnOcultar.addActionListener(e -> txtPassword.setEchoChar('*'));
        btnVer.addActionListener(e -> txtPassword.setEchoChar((char) 0));

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginFrame().setVisible(true));
    }
}
