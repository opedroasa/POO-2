import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio4 extends JFrame implements ActionListener {

    private Imc imc;

    private JLabel lblPeso;
    private JTextField txtPeso;

    private JLabel lblAltura;
    private JTextField txtAltura;

    private JLabel lblImc;
    private JLabel lblMensagemImc;

    private JButton btnCalcular;
    private Container ctn;

    public Exercicio4 (){
        setSize(400,200);
        setTitle("Quarto Exercício");

        ctn = getContentPane();
        lblPeso = new JLabel("Peso:");
        txtPeso = new JTextField();


        lblAltura = new JLabel("Altura:");
        txtAltura = new JTextField();


        lblImc = new JLabel("Resultado IMC: ");
        lblMensagemImc = new JLabel("");

        btnCalcular = new JButton("CALCULAR");

        ctn.setLayout(null);
        ctn = getContentPane();
        lblPeso.setBounds(5,5,100,25);
        txtPeso.setBounds(70,5,70,25);


        lblAltura.setBounds(205,5,100,25);
        txtAltura.setBounds(270,5,70,25);


        btnCalcular.setBounds(150,40,100,25);

        lblImc.setBounds(5,70,200,25);
        lblMensagemImc.setBounds(5,100,200,25);

        setVisible(true);
        setLayout(null);


        ctn.add(lblPeso);
        ctn.add(txtPeso);

        ctn.add(lblAltura);
        ctn.add(txtAltura);
        ctn.add(btnCalcular);
        ctn.add(lblImc);
        ctn.add(lblMensagemImc);
        btnCalcular.addActionListener(this);

        getContentPane().add(btnCalcular);

    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("CALCULAR"))
        {

            float peso = Float.parseFloat(txtPeso.getText());
            float altura = Float.parseFloat(txtAltura.getText());

            imc = new Imc(peso,altura);

            lblImc.setText("Resultado IMC:  " + Float.toString(imc.getValorImc()));

            if(imc.getValorImc() >= 25)
            {
                lblMensagemImc.setText("Você está acima do peso ideal.");
            }
            else if (imc.getValorImc() <= 18.5)
            {
                lblMensagemImc.setText("Você está abaixo do peso ideal.");
            }
            else{
                lblMensagemImc.setText("Peso ideal.");
            }
        }
    }
}
