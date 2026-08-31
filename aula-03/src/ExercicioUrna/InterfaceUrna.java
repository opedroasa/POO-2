package ExercicioUrna;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceUrna extends JFrame implements ActionListener {

    //ATRIBUTOS
    private JLabel lblCandidatos;
    private JLabel lblTotal;
    private JLabel lblBranco;
    private JLabel lblCandidato1;
    private JLabel lblCandidato2;

    private JTextField txtVoto;
    private JLabel lblTotalVotoBranco;
    private JLabel lblTotalVotoCandidato1;
    private JLabel lblTotalVotoCandidato2;
    private JLabel lblTotalVotacao;

    private JLabel lblNome;
    private JLabel lblNome1;
    private JLabel lblNome2;
    private JLabel lblNome3;
    private JLabel lblMensagemVotacao;

    private JButton btnApurar;
    private JButton btnVotar;

    private Container ctn;

    public Votacao objetoVotacao;

    //CONSTRUTOR
    public InterfaceUrna()
    {
        setSize(300,430);
        setTitle("URNA ELETRÔNICA");
        ctn = getContentPane();
        ctn.setLayout(null);

        lblCandidatos = new JLabel("Candidatos");
        lblCandidatos.setBounds(10,10,100,25);

        lblNome1 = new JLabel("1 - Joaquim Santos");
        lblNome1.setBounds(150,10,150,25);

        lblNome2 = new JLabel("2 - Karina Costas");
        lblNome2.setBounds(150,30,150,25);

        lblNome3 = new JLabel("3 - Voto em Branco");
        lblNome3.setBounds(150,50,150,25);

        lblNome = new JLabel("Voto:");
        lblNome.setBounds(10,80,100,25);

        lblMensagemVotacao = new JLabel("Digite o seu voto!");
        lblMensagemVotacao.setBounds(60,180,200,25);

        txtVoto = new JTextField();
        txtVoto.setBounds(40,80,25,25);

        btnVotar = new JButton("VOTAR");
        btnVotar.setBounds(170,80,75,25);

        btnApurar = new JButton("APURAR VOTOS");
        btnApurar.setBounds(10,260,250,25);

        lblTotal = new JLabel("Total de Votos");
        lblTotal.setBounds(10,290,250,25);
        lblTotalVotacao = new JLabel("--");
        lblTotalVotacao.setBounds(170,290,30,25);

        lblBranco = new JLabel("Total em branco");
        lblBranco.setBounds(10,310,350,25);
        lblTotalVotoBranco = new JLabel("--");
        lblTotalVotoBranco.setBounds(170,310,30,25);

        lblCandidato1 = new JLabel("Votos em candidato 1");
        lblCandidato1.setBounds(10,330,250,25);
        lblTotalVotoCandidato1 = new JLabel("--");
        lblTotalVotoCandidato1.setBounds(170,330,30,25);

        lblCandidato2 = new JLabel("Votos em candidato 2");
        lblCandidato2.setBounds(10,350,250,25);
        lblTotalVotoCandidato2 = new JLabel("--");
        lblTotalVotoCandidato2.setBounds(170,350,30,25);

        ctn.add(lblCandidatos);
        ctn.add(lblTotal);
        ctn.add(lblBranco);
        ctn.add(lblCandidato1);
        ctn.add(lblCandidato2);

        ctn.add(txtVoto);
        ctn.add(lblTotalVotoBranco);
        ctn.add(lblTotalVotoCandidato1);
        ctn.add(lblTotalVotoCandidato2);
        ctn.add(lblTotalVotacao);

        ctn.add(lblNome);
        ctn.add(lblNome1);
        ctn.add(lblNome2);
        ctn.add(lblNome3);
        ctn.add(lblMensagemVotacao);

        ctn.add(btnApurar);
        ctn.add(btnVotar);

        btnVotar.addActionListener(this);
        btnApurar.addActionListener(this);

        objetoVotacao = new Votacao();

        setVisible(true);

    }


    //MÉTODOS
    @Override
    public void actionPerformed(ActionEvent e)
    {

        if(e.getActionCommand().equals("VOTAR"))
        {

            //int numero = Integer.parseInt(txtVoto.getText());
            int numero = !txtVoto.getText().isEmpty() ?  Integer.parseInt(txtVoto.getText()) : -1;

            int resultado = objetoVotacao.Votar(numero);

            if(resultado == 1){
                lblMensagemVotacao.setText("Voto computado com sucesso!");
            }
            else{
                lblMensagemVotacao.setText("Erro! Candidato inválido!");
            }

            txtVoto.setText("");
        }

        if(e.getActionCommand().equals("APURAR VOTOS"))
        {
            lblTotalVotacao.setText(Integer.toString(objetoVotacao.getTotalVotos()));
            lblTotalVotoBranco.setText(Integer.toString(objetoVotacao.getVotoBranco()));
            lblTotalVotoCandidato1.setText(Integer.toString(objetoVotacao.getCandidato1()));
            lblTotalVotoCandidato2.setText(Integer.toString(objetoVotacao.getCandidato2()));
        }
    }
}
