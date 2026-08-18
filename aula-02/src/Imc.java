public class Imc {

    private float valorImc;

    public Imc(float _peso, float _altura)
    {
        valorImc = _peso / (_altura * _altura);
    }

    public float getValorImc() {
        return valorImc;
    }

    public void setValorImc(float valorImc) {
        this.valorImc = valorImc;
    }
}
