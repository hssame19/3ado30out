import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean func = true;
        int idCounter = 0;

        Cadastro cadastro = new Cadastro();
        Lista banco = new Lista();

        do {
            System.out.println("######### Oq vc quer fazer ? #########");
            System.out.println("#1 - Cadastrar usuario\n#2 - Consulta por id\n#3 - Consulta por nome\n#4 - Sair");

            int opcao = -1;
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } catch(InputMismatchException e) {
                System.out.println("Erro - opção deve ser um número");
                break;
            }

            scanner.nextLine();
            System.out.println();
            switch(opcao) {
                case 1:
                    System.out.println(">>Vc selecionou: cadastrar usuario");
                    System.out.println("[Cadastro] Digite o nome do usuario: ");
                    String nome = scanner.nextLine();
                    int id = idCounter;
                    Registro registro = new Registro(id, nome);
                    banco.insere(registro);
                    idCounter++;
                    break;
                case 2:
                    System.out.println(">>Vc selecionou: consultar cadastro por id");
                    System.out.println("[BuscaId] Digite o id que vc quer pesquisar: ");
                    int idBuscado = scanner.nextInt();
                    if(cadastro.consultaId(idBuscado, banco)) {
                        System.out.println("[BuscaId] Elemento está na lista");
                    } else {
                        System.out.println("[BuscaId] elemento não está na lista");
                    }
                    break;
                case 3:
                    System.out.println(">>Vc selecionou: consultar cadastro por nome");
                    System.out.println("[BuscaNome] Digite o nome a ser buscado: ");
                    String nomeBuscado = scanner.nextLine();
                    if(cadastro.consultaNome(nomeBuscado, banco)) {
                        System.out.println("[BuscaNome] Elemento está na lista");
                    } else {
                        System.out.println("[BuscaNome] Elemento não está na lista");
                    }
                    continue;
                case 4:
                    System.out.println(">>Vc escolheu: Saida");
                    func = false;
                    break;
            }
        } while (func);
    }
}
