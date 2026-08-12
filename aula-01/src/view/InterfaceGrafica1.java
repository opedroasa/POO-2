package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import java.awt.Container;
import java.text.ParseException;

public class InterfaceGrafica1 extends JFrame {

    //Atributos
    private JLabel lblNome;
    private JTextField txtNome;

    private JLabel lblCpf;
    private JFormattedTextField txtCpf;

    private JLabel lblTipoUser;
    private JComboBox cmbUser;

    private JButton btnEnviar;

    private Container ctn;

    public InterfaceGrafica1(){

        setSize(400,300);
        setTitle("Exericio 01");
        ctn = getContentPane();

        //Labels
        lblNome = new JLabel("NOME:");
        lblCpf = new JLabel("CPF:");
        lblTipoUser = new JLabel("TIPO USUÁRIO:");

        //Input's
        txtNome = new JTextField();
        try
        {
            txtCpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
        } catch (ParseException e)
        {
            e.printStackTrace();
        }
        cmbUser = new JComboBox(new String[] {"ADM", "GERAL"});
        btnEnviar = new JButton("ENVIAR");

        //Organização
        ctn.setLayout(null);
        lblNome.setBounds(0,0,100,25);
        txtNome.setBounds(150,0,200,25);

        lblCpf.setBounds(0,50,100,25);
        txtCpf.setBounds(150,50,200,25);

        lblTipoUser.setBounds(0,100,100,25);
        cmbUser.setBounds(150,100,200,25);

        btnEnviar.setBounds(150,150,100,100);


        ctn.add(lblNome);
        ctn.add(txtNome);
        ctn.add(lblCpf);
        ctn.add(txtCpf);
        ctn.add(lblTipoUser);
        ctn.add(cmbUser);
        ctn.add(btnEnviar);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
