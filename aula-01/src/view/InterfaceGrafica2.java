package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import java.awt.Container;

public class InterfaceGrafica2 extends JFrame {

    //atributos
    private Container ctn;
    private JLabel lblNome;
    private JTextField txtNome;
    private JLabel lblEndereco;
    private JTextField txtEndereco;
    private JLabel lblTelefone;
    private JFormattedTextField txtTelefone;
    private JLabel lblCpf;
    private JFormattedTextField txtCpf;
    private JLabel lblTipoSang;
    private JComboBox cmbTipoSang;
    private JLabel lblFatorRh;
    private JComboBox cmbFatorRh;
    private JLabel lblCurso;
    private JComboBox cmbCurso;
    private JLabel lblContatoEmerg;
    private JTextField txtContatoEmerg;
    private JLabel lblTelefoneContatoEmerg;
    private JFormattedTextField txtTelefoneContatoEmerg;
    private JButton btnInserir;
    private JButton btnCancelar;

    //Máscaras
    private JFormattedTextField mascaraCpf(){
        try {
            return new JFormattedTextField(new MaskFormatter("###.###.###-##"));
        } catch (Exception e)
        {
            e.printStackTrace();
            return new JFormattedTextField();
        }
    }

    private JFormattedTextField mascaraTelefone(){
        try{
            return new JFormattedTextField(new MaskFormatter("(##) #####-####"));
        } catch (Exception e)
        {
            e.printStackTrace();
            return new JFormattedTextField();
        }
    }

    public InterfaceGrafica2(){
        setSize(440,500);
        setTitle("Exericio 02");
        ctn = getContentPane();

        //Labels
        lblNome = new JLabel("NOME:");
        lblEndereco = new JLabel("ENDEREÇO:");
        lblTelefone = new JLabel("TELEFONE:");
        lblCpf = new JLabel("CPF:");
        lblTipoSang = new JLabel("TIPO SANGUINEO:");
        lblFatorRh = new JLabel("FATOR RH:");
        lblCurso = new JLabel("CURSO:");
        lblContatoEmerg = new JLabel("CONTATO EMERGÊNCIA:");
        lblTelefoneContatoEmerg = new JLabel("TELEFONE CONTATO EMERGÊNCIA:");
        btnInserir = new JButton("INSERIR");
        btnCancelar = new JButton("CANCELAR");
        
        //Input's
        txtNome = new JTextField();
        txtEndereco = new JTextField();
        txtTelefone = mascaraTelefone();
        txtCpf = mascaraCpf();
        cmbTipoSang = new JComboBox(new String[] {"A", "B","AB","O"});
        cmbFatorRh = new JComboBox(new String[] {"+","-"});
        cmbCurso = new JComboBox(new String[] {"CIÊNCIA DA COMPUTAÇÃO", "SISTEMAS DE INFORMAÇÃO", "ENGENHARIA DA COMPUTAÇÃO"});
        cmbCurso.setEditable(true);
        txtContatoEmerg = new JTextField();
        txtTelefoneContatoEmerg = mascaraTelefone();

        //Organização
        ctn.setLayout(null);
        lblNome.setBounds(0,0,100,25);
        lblEndereco.setBounds(0,50,100,25);
        lblTelefone.setBounds(0,100,100,25);
        lblCpf.setBounds(0,150,100,25);
        lblTipoSang.setBounds(0,200,100,25);
        lblFatorRh.setBounds(270,200,100,25);
        lblCurso.setBounds(0,250,100,25);
        lblContatoEmerg.setBounds(0,300,150,25);
        lblTelefoneContatoEmerg.setBounds(0,350,200,25);
        btnInserir.setBounds(120,400,100,50);
        btnCancelar.setBounds(220,400,100,50);

        txtNome.setBounds(210,0,200,25);
        txtEndereco.setBounds(210,50,200,25);
        txtTelefone.setBounds(210,100,200,25);
        txtCpf.setBounds(210,150,200,25);
        cmbTipoSang.setBounds(210,200,50,25);
        cmbFatorRh.setBounds(340,200,50,25);
        cmbCurso.setBounds(210,250,200,25);
        txtContatoEmerg.setBounds(210,300,200,25);
        txtTelefoneContatoEmerg.setBounds(210,350,200,25);


        ctn.add(lblNome);
        ctn.add(lblEndereco);
        ctn.add(lblTelefone);
        ctn.add(lblCpf);
        ctn.add(lblTipoSang);
        ctn.add(lblFatorRh);
        ctn.add(lblCurso);
        ctn.add(lblContatoEmerg);
        ctn.add(lblTelefoneContatoEmerg);
        ctn.add(txtNome);
        ctn.add(txtEndereco);
        ctn.add(txtTelefone);
        ctn.add(txtCpf);
        ctn.add(cmbTipoSang);
        ctn.add(cmbFatorRh);
        ctn.add(cmbCurso);
        ctn.add(txtContatoEmerg);
        ctn.add(txtTelefoneContatoEmerg);
        ctn.add(btnInserir);
        ctn.add(btnCancelar);


        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
