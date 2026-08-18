import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio1 extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("Enviar"));
        {

            /*int num1 = Integer.parseInt(txtNome.getText());
            int num2 = num1+10;
            txtNome.setText(Integer.toString(num2));*/

            txtNome.setText("Botão clicado!");
        }
    }


    private JLabel lblNome;
    private JTextField txtNome;



    private JButton btnOk;
    private Container ctn;

    public Exercicio1 (){
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
        btnOk.addActionListener(this);

        getContentPane().add(btnOk);

    }
}
