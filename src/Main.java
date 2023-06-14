import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        TelaLoginAdmin form = new TelaLoginAdmin();
        form.setContentPane(form.JPanelUm);
        form.setVisible(true);
        form.setSize(400,500);
    }
}
