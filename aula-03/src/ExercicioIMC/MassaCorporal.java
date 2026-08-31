package ExercicioIMC;

import java.util.ArrayList;

public class MassaCorporal {

    //ATRIBUTOS
    private ArrayList<Double> alturas;
    private ArrayList<Double> pesos;
    private ArrayList<Double> IMCs;

    //CONSTRUTOR
    public MassaCorporal()
    {
        alturas = new ArrayList<>();
        pesos = new ArrayList<>();
        IMCs = new ArrayList<>();
    }

    //MÉTODOS
    public void Cadastrar(Double _peso, Double _altura)
    {
        pesos.add(_peso);
        alturas.add(_altura);

        IMCs.add(_peso/(_altura*_altura));
    }

    //PESO
    public double MaiorPeso(){

        double maiorPeso = 0.0;

        for( int i = 0; i < this.pesos.size() ; i++)
        {
            if(maiorPeso < pesos.get(i))
                maiorPeso = pesos.get(i);
        }

        return maiorPeso;
    }

    public double MenorPeso(){

        double menorPeso = 999.999;

        for( int i = 0; i < this.pesos.size() ; i++)
        {
            if(menorPeso > pesos.get(i))
                menorPeso = pesos.get(i);
        }

        return menorPeso;
    }

    public double MediaPeso(){

        double totalPeso = 0;


        for( int i = 0; i < this.pesos.size() ; i++)
        {
            totalPeso = totalPeso + pesos.get(i);
        }

        double mediaPeso = totalPeso / pesos.size();

        return mediaPeso;
    }

    //ALTURA
    public double MaiorAltura(){

        double maiorAltura = 0.0;

        for( int i = 0; i < this.alturas.size() ; i++)
        {
            if(maiorAltura < alturas.get(i))
                maiorAltura = alturas.get(i);
        }

        return maiorAltura;
    }

    public double MenorAltura(){

        double menorAltura = 999.999;

        for( int i = 0; i < this.alturas.size() ; i++)
        {
            if(menorAltura > alturas.get(i))
                menorAltura = alturas.get(i);
        }

        return menorAltura;
    }

    public double MediaAltura(){

        double totalAltura = 0;


        for( int i = 0; i < this.alturas.size() ; i++)
        {
            totalAltura = totalAltura + alturas.get(i);
        }

        double mediaAltura = totalAltura / alturas.size();

        return mediaAltura;
    }

    //IMC
    public double MaiorIMC(){

        double maiorIMC = 0.0;

        for( int i = 0; i < this.IMCs.size() ; i++)
        {
            if(maiorIMC < IMCs.get(i))
                maiorIMC = IMCs.get(i);
        }

        return maiorIMC;
    }

    public double MenorIMC(){

        double menorIMC = 999.999;

        for( int i = 0; i < this.IMCs.size() ; i++)
        {
            if(menorIMC > IMCs.get(i))
                menorIMC = IMCs.get(i);
        }

        return menorIMC;
    }

    public double MediaIMC(){

        double totalIMC = 0;


        for( int i = 0; i < this.IMCs.size() ; i++)
        {
            totalIMC = totalIMC + IMCs.get(i);
        }

        double mediaIMC = totalIMC / IMCs.size();

        return mediaIMC;
    }

    public ArrayList<Double> getAlturas() {
        return alturas;
    }

    public ArrayList<Double> getPesos() {
        return pesos;
    }

    public ArrayList<Double> getIMCs() {
        return IMCs;
    }
}
