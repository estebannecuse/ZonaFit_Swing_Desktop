import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JPanel panelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarButton;

    public LoginForm(){
        inicializarForma();
        enviarButton.addActionListener(e -> validar());
    }

    private void inicializarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
    }

    private void validar(){
        // leer los valores
        var usuario = this.usuarioTexto.getText();
        var password = new String(this.passwordTexto.getPassword()); // hacemos un objeto String porque getPassword devuelve un array de caracteres
        if("root".equals(usuario) && "Ferrari22!".equals(password))
            mostrarMensaje("Datos correctos, bienvenido");
        else
            mostrarMensaje("datos incorrectos");
    }

    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);

    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}
