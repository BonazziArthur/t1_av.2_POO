import java.util.ArrayList;
import java.util.Objects;

public class Conglomerado { //implementar os metodos antes de tudo!!!!!
    private ArrayList<Usina> listaDeUsinas;

    public boolean CadastraUsina(Usina usina) {
        if (!Objects.equals(usina.getNome(), usina.getNome())) {
            listaDeUsinas.add(usina);
            return true;
        }
        return false;
    }

    public Usina pesquisaUsina(String nome) { //?
        if (listaDeUsinas.contains(nome)) {
            return null;
        }
        return Usina;
    }

    public ArrayList<Usina> listaTodasUsinas() {
        listaDeUsinas = new ArrayList<>();
        if (listaDeUsinas.isEmpty()) {
            return null;
        }
        return listaDeUsinas;

    }

    public double consultaPreco(String nome) {
        if(listaDeUsinas.contains(nome)) {
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
