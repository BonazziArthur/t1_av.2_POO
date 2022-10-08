public  abstract class Usina extends Conglomerado {
    private String nome;
    private double producaoMWh;
    private double custoMWh;

    public abstract double calculaPrecoMWh();

    public abstract String geraResumo(); //aonde implemento a classe
}
