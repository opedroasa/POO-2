package view;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;
import java.awt.Container;

public class InterfaceGrafica3 extends JFrame {

    //atributos
    private Container ctn;
    private JLabel lblCep;
    private JFormattedTextField txtCep;
    private JLabel lblCnpj;
    private JFormattedTextField txtCnpj;
    private JLabel lblCodigoFornecedor;
    private JFormattedTextField txtCodigoFornecedor;

    public InterfaceGrafica3(){
        setSize(370,200);
        setTitle("Exericio 03");
        ctn = getContentPane();

        //Labels
        lblCep = new JLabel("CEP:");
        lblCnpj = new JLabel("CNPJ:");
        lblCodigoFornecedor = new JLabel("CÓDIGO FORNECEDOR:");

        //Input's
        try{
            txtCep = new JFormattedTextField(new MaskFormatter("#####-###"));
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        try{
            txtCnpj = new JFormattedTextField(new MaskFormatter("###.###.###/####-##"));
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        try{
            txtCodigoFornecedor = new JFormattedTextField(new MaskFormatter("UU-#####L"));
        } catch (Exception e)
        {
            e.printStackTrace();
        }


        //Organização
        ctn.setLayout(null);

        lblCep.setBounds(0,0,100,25);
        lblCnpj.setBounds(0,50,100,25);
        lblCodigoFornecedor.setBounds(0,100,350,25);

        txtCep.setBounds(210,0,130,25);
        txtCnpj.setBounds(210,50,130,25);
        txtCodigoFornecedor.setBounds(210,100,130,25);

        ctn.add(lblCep);
        ctn.add(txtCep);
        ctn.add(lblCnpj);
        ctn.add(txtCnpj);
        ctn.add(lblCodigoFornecedor);
        ctn.add(txtCodigoFornecedor);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
