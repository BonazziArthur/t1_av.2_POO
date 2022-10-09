import java.util.ArrayList;
import java.util.Objects;

public class Conglomerado { //implementar os metodos antes de tudo!!!!!
    private ArrayList<Usina> listaDeUsinas;

    public boolean CadastraUsina(Usina usina) {
        if (usina.getNome().equals(usina)) {
            return false;
        }
        else {
            listaDeUsinas.add(usina);
            return true;
        }
    }

    public Usina pesquisaUsina(String nome) { //?
        ArrayList<Usina> listaDesejadaNome = new ArrayList<>();
        if (listaDeUsinas.contains(nome)) {
            return listaDesejadaNome;
        }
        return null;
    }

    public ArrayList<Usina> listaTodasUsinas() {
        ArrayList<Usina> listaDesejada = new ArrayList<>();
        if (listaDeUsinas.isEmpty()) {
            return null;
        }
        return listaDesejada;

    }

    public double consultaPreco(String nome) {
        if (listaDeUsinas.contains(nome)) {
            return usina.getCustoMHw();
        }
        return -1.0;
    }

    public boolean salvaDadosArquivo(String nomeArquivo) { //CSV

    }

    public ArrayList<Usina> getListaDeUsinas() {
        return listaDeUsinas;
    }

    public void setListaDeUsinas(ArrayList<Usina> listaDeUsinas) {
        this.listaDeUsinas = listaDeUsinas;
    }
}
