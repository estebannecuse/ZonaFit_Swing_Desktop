import javax.swing.*;

public class Forma extends JFrame {
    private JPanel panel1;

    public Forma(){
        inicializarForma();
    }

    private void inicializarForma(){
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cierra la app cuando se da click en cerrar
        setSize(600,400);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Forma forma = new Forma();
        forma.setVisible(true);
    }
}
