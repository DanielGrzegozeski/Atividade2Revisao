import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLoginAdmin extends JFrame {
    public JPanel JPanelUm;
    public JTextField textUsuario;
    public JTextField textSenha;
    private JButton loginButton;
    private JButton limparButton;

    private String usuario;

    private String senha;

public TelaLoginAdmin() {



    loginButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {


            usuario = textUsuario.getText();
            senha = textSenha.getText();

            if(usuario.equals("admin") && senha.equals("admin")){

                JOptionPane.showMessageDialog(null,"logado com sucesso");


            }else{
                JOptionPane.showMessageDialog(null,"Senha ou Usuário Incorreto");
            }

            }

    });
    limparButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textUsuario.setText("");
            textSenha.setText("");
        }
    });
}
}
