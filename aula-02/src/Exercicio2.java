import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio2 extends JFrame {
    private JLabel lblNome;
    private JTextField txtNome;



    private JButton btnOk;
    private Container ctn;

    public Exercicio2 (){
        setSize(400,200);
        setTitle("Primeiro Exercício");

        ctn = getContentPane();
        lblNome = new JLabel("Nome");
        txtNome = new JTextField();


        btnOk = new JButton("Enviar");

        ctn.setLayout(null);
        ctn = getContentPane();
        lblNome.setBounds(0,0,100,25);
        txtNome.setBounds(150,0,200,25);

        btnOk.setBounds(100,50,100,25);

        setVisible(true);
        setLayout(null);


        ctn.add(lblNome);
        ctn.add(txtNome);
        ctn.add(btnOk);
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNome.setText("Enviado 2 !!!!!!!");
            }
        });

        getContentPane().add(btnOk);

    }
}
