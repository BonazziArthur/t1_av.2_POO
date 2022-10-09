import java.util.ArrayList;
import java.util.Scanner;

public class ACMEEnergy {
    private Conglomerado conglomerado;
    private Usina usina;
    private Scanner in;

    public ACMEEnergy() {
        conglomerado = new Conglomerado();
        usina = new Usina(); //?
        in = new Scanner(System.in);
    }

    public void executa() {
        int escolha;
        do {
            menu();
            escolha = in.nextInt();
            in.nextLine();
            switch (escolha) {
                case 0:
                    break;
                case 1:
                    cadastrarNovaUsina();
                    break;
                case 2:
                    pesquisarUsina();
                    break;
                case 3:
                    listarTodasUsinas();
                    break;
                case 4:
                    consultarPrecoMwh();
                    break;
                case 5:
                    salvarUsinasArquivo();
                    break;
            }
        } while (escolha != 0);
    }

    private void menu() {
        System.out.println("=============================");
        System.out.println("Opcoes:");
        System.out.println("[0] Sair");
        System.out.println("[1] Cadastrar nova usina");
        System.out.println("[2] Pesquisar uma usina");
        System.out.println("[3] Listas todas as usinas");
        System.out.println("[4] Consulta o preço do MWh:");
        System.out.println("[5] Salvar usinas em arquivo");
        System.out.println("Opcao desejada: ");
    }

    public void inicializa() { //implementar a sublcasse de Conglomerado primeiro - METODO PRE CADASTRA

    }

    public void cadastrarNovaUsina() { //adiciona na lista ou retorna que ja existe uma usina com esse nome
        ArrayList<Usina> usinasCadastradas = conglomerado.getListaDeUsinas();
        System.out.println("Insira os dados de uma nova usina para cadastrá-la");

        System.out.println("Nome: ");
        String nome = in.nextLine();
        System.out.println("Producao MWh: ");
        double producaoMWh = in.nextDouble();
        System.out.println("Custo Mwh: ");
        double custoMWh = in.nextDouble();

        if (usina.getNome().equals(nome)) {
            System.out.println("Ja existe uma usina com esse nome. Usina repetida!");
        } else {
            usinasCadastradas.add(usina);
        }
        //iterar com for each para ver se a usina ja exsite
        //caso nao, adicinoar a usina na lista de usinas cadastradas
    }

    public void pesquisarUsina() {
        System.out.println("Insira o nome de uma usina para pesquisá-la: ");
        String nome = in.nextLine();
        ArrayList<Usina> usinasCadastradas = conglomerado.pesquisaUsina(nome);
        if (usinasCadastradas.contains(nome)) {
            for (Usina usina :
                    usinasCadastradas) {
                System.out.println("Nome: ");
            }
        } else {
            System.out.println("Nenhuma usina localizada com este nome.");
        }


    }

    private void listarTodasUsinas() {
        ArrayList<Usina> usinasCadastradas = conglomerado.getListaDeUsinas();
        if (usinasCadastradas.isEmpty()) {
            System.out.println("Nenhuma usina cadastrada.");
        } else {
            for (Usina usina :
                    usinasCadastradas) {
                System.out.println("Nome: "+usina.getNome());
                System.out.println("Producao de MWh: "+usina.getProducaoMWh());
                System.out.println("Custo de MWh: "+usina.getCustoMWh());
            }
        }
    }

    private void consultarPrecoMwh() {
        System.out.println("Insira o nome de uma usina para consultar seu preco por MWh: ");
        double preco = in.nextDouble();
        ArrayList<Usina> listaDeUsinas = conglomerado.consultaPreco(preco);
    }
}
