import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio3 extends JFrame implements ActionListener {

    private JLabel lblNumero1;
    private JTextField txtNumero1;
    private JLabel lblNumero2;
    private JTextField txtNumero2;

    private JLabel lblPeso1;
    private JTextField txtPeso1;
    private JLabel lblPeso2;
    private JTextField txtPeso2;

    private JLabel lblMediaPonderada;


    private JButton btnCalcular;
    private Container ctn;

    public Exercicio3 (){
        setSize(400,200);
        setTitle("Terceiro Exercício");

        ctn = getContentPane();
        lblNumero1 = new JLabel("Número 1:");
        txtNumero1 = new JTextField();
        lblNumero2 = new JLabel("Número 2:");
        txtNumero2 = new JTextField();

        lblPeso1 = new JLabel("Peso 1:");
        txtPeso1 = new JTextField();
        lblPeso2 = new JLabel("Peso 2:");
        txtPeso2 = new JTextField();

        lblMediaPonderada = new JLabel("Média Ponderada:");

        btnCalcular = new JButton("CALCULAR");

        ctn.setLayout(null);
        ctn = getContentPane();
        lblNumero1.setBounds(5,5,100,25);
        txtNumero1.setBounds(70,5,70,25);
        lblNumero2.setBounds(5,30,100,25);
        txtNumero2.setBounds(70,30,70,25);

        lblPeso1.setBounds(205,5,100,25);
        txtPeso1.setBounds(270,5,70,25);
        lblPeso2.setBounds(205,30,100,25);
        txtPeso2.setBounds(270,30,70,25);

        btnCalcular.setBounds(150,70,100,25);

        lblMediaPonderada.setBounds(5,100,200,25);

        setVisible(true);
        setLayout(null);


        ctn.add(lblNumero1);
        ctn.add(txtNumero1);
        ctn.add(lblNumero2);
        ctn.add(txtNumero2);
        ctn.add(lblPeso1);
        ctn.add(txtPeso1);
        ctn.add(lblPeso2);
        ctn.add(txtPeso2);
        ctn.add(btnCalcular);
        ctn.add(lblMediaPonderada);
        btnCalcular.addActionListener(this);

        getContentPane().add(btnCalcular);

    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("CALCULAR"))
        {
            float mediaPonderada;

            float num1 = Float.parseFloat(txtNumero1.getText());
            float num2 = Float.parseFloat(txtNumero2.getText());
            float peso1 = Float.parseFloat(txtPeso1.getText());
            float peso2 = Float.parseFloat(txtPeso2.getText());

            mediaPonderada = (((num1 * peso1) + (num2 * peso2)) / (peso1 + peso2));

            lblMediaPonderada.setText("Média Ponderada: " + Float.toString(mediaPonderada));
        }
    }
}
