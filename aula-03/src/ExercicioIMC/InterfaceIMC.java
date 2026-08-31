package ExercicioIMC;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceIMC extends JFrame implements ActionListener {

    //ATRIBUTOS
    private MassaCorporal massaCorporal;
    private int index;

    private JLabel lblPeso;
    private JTextField txtPeso;

    private JLabel lblAltura;
    private JTextField txtAltura;

    private JLabel lblImc;
    private JLabel lblMensagemImc;

    private JButton btnCadastrar;
    private JButton btnRelatorio;

    private JLabel lblMensagemMaiorPeso;
    private JLabel lblMensagemMenorPeso;
    private JLabel lblMensagemMediaPeso;

    private JLabel lblMensagemMaiorAltura;
    private JLabel lblMensagemMenorAltura;
    private JLabel lblMensagemMediaAltura;

    private JLabel lblMensagemMaiorIMC;
    private JLabel lblMensagemMenorIMC;
    private JLabel lblMensagemMediaIMC;

    private Container ctn;

    //CONSTRUTOR

    public InterfaceIMC()
    {
        setSize(400,450);
        setTitle("Quarto Exercício");

        ctn = getContentPane();
        lblPeso = new JLabel("Peso:");
        txtPeso = new JTextField();


        lblAltura = new JLabel("Altura:");
        txtAltura = new JTextField();


        lblImc = new JLabel("Resultado IMC: ");
        lblMensagemImc = new JLabel("");

        lblMensagemMaiorPeso = new JLabel("Maior peso:");
        lblMensagemMenorPeso = new JLabel("Menor peso:");
        lblMensagemMediaPeso = new JLabel("Media peso:");
        lblMensagemMaiorAltura = new JLabel("Maior altura:");
        lblMensagemMenorAltura = new JLabel("Menor altura:");
        lblMensagemMediaAltura = new JLabel("Media altura");
        lblMensagemMaiorIMC = new JLabel("Maior IMC:");
        lblMensagemMenorIMC = new JLabel("Menor IMC:");
        lblMensagemMediaIMC = new JLabel("Media IMC:");

        btnCadastrar = new JButton("CADASTRAR");
        btnRelatorio = new JButton("RELATÓRIO");

        ctn.setLayout(null);
        ctn = getContentPane();
        lblPeso.setBounds(5,5,100,25);
        txtPeso.setBounds(70,5,70,25);


        lblAltura.setBounds(205,5,100,25);
        txtAltura.setBounds(270,5,70,25);


        btnCadastrar.setBounds(25,40,150,25);
        btnRelatorio.setBounds(175,40,150,25);

        lblImc.setBounds(5,70,200,25);
        lblMensagemImc.setBounds(5,100,200,25);

        lblMensagemMaiorPeso.setBounds(5,130,200,25);
        lblMensagemMenorPeso.setBounds(5,160,200,25);
        lblMensagemMediaPeso.setBounds(5,190,200,25);
        lblMensagemMaiorAltura.setBounds(5,220,200,25);
        lblMensagemMenorAltura.setBounds(5,250,200,25);
        lblMensagemMediaAltura.setBounds(5,280,200,25);
        lblMensagemMaiorIMC.setBounds(5,310,200,25);
        lblMensagemMenorIMC.setBounds(5,340,200,25);
        lblMensagemMediaIMC.setBounds(5,370,200,25);

        setVisible(true);
        setLayout(null);


        ctn.add(lblPeso);
        ctn.add(txtPeso);

        ctn.add(lblAltura);
        ctn.add(txtAltura);
        ctn.add(btnCadastrar);
        ctn.add(btnRelatorio);
        ctn.add(lblImc);
        ctn.add(lblMensagemImc);

        ctn.add(lblMensagemMaiorPeso);
        ctn.add(lblMensagemMenorPeso);
        ctn.add(lblMensagemMediaPeso);
        ctn.add(lblMensagemMaiorAltura);
        ctn.add(lblMensagemMenorAltura);
        ctn.add(lblMensagemMediaAltura);
        ctn.add(lblMensagemMaiorIMC);
        ctn.add(lblMensagemMenorIMC);
        ctn.add(lblMensagemMediaIMC);

        btnCadastrar.addActionListener(this);
        btnRelatorio.addActionListener(this);

        massaCorporal = new MassaCorporal();
        index = 0;

        getContentPane().add(btnCadastrar);

    }
    //MÉTODOS
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("CADASTRAR"))
        {

            Double peso = Double.parseDouble(txtPeso.getText());
            Double altura = Double.parseDouble(txtAltura.getText());

            massaCorporal.Cadastrar(peso,altura);

            lblImc.setText("Resultado IMC:  " + Double.toString(massaCorporal.getIMCs().get(index)));

            if(massaCorporal.getIMCs().get(index) >= 25)
            {
                lblMensagemImc.setText("Você está acima do peso ideal.");
            }
            else if (massaCorporal.getIMCs().get(index) <= 18.5)
            {
                lblMensagemImc.setText("Você está abaixo do peso ideal.");
            }
            else{
                lblMensagemImc.setText("Peso ideal.");
            }

            index++;
        }
        else if (e.getActionCommand().equals("RELATÓRIO"))
        {
            lblMensagemMaiorPeso.setText("Maior peso: " + Double.toString(massaCorporal.MaiorPeso()));
            lblMensagemMenorPeso.setText("Menor peso: " + Double.toString(massaCorporal.MenorPeso()));
            lblMensagemMediaPeso.setText("Media peso: " + Double.toString(massaCorporal.MediaPeso()));
            lblMensagemMaiorAltura.setText("Maior altura: " + Double.toString(massaCorporal.MaiorAltura()));
            lblMensagemMenorAltura.setText("Menor altura: " + Double.toString(massaCorporal.MenorAltura()));
            lblMensagemMediaAltura.setText("Media altura: " + Double.toString(massaCorporal.MediaAltura()));
            lblMensagemMaiorIMC.setText("Maior IMC: " + Double.toString(massaCorporal.MaiorIMC()));
            lblMensagemMenorIMC.setText("Menor IMC: " + Double.toString(massaCorporal.MenorIMC()));
            lblMensagemMediaIMC.setText("Media IMC: " + Double.toString(massaCorporal.MediaIMC()));
        }
    }
}
