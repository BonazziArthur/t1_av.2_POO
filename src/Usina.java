public abstract class Usina {
    private String nome;
    private double producaoMWh;
    private double custoMWh;

    public abstract double calculaPrecoMWh();

    public abstract String geraResumo(); //aonde implemento a classe

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getProducaoMWh() {
        return producaoMWh;
    }

    public void setProducaoMWh(double producaoMWh) {
        this.producaoMWh = producaoMWh;
    }

    public double getCustoMWh() {
        return custoMWh;
    }

    public void setCustoMWh(double custoMWh) {
        this.custoMWh = custoMWh;
    }
}
