import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean func = true;
        int idCounter = 0;

        Cadastro cadastro = new Cadastro();
        Lista banco = new Lista();

        do {
            System.out.println("Oq vc quer fazer?\n1. Cadastrar usuario\n2.Consultar por id\n3.Consultar por nome\n4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch(opcao) {
                case 1:
                    System.out.println("Vc selecionou: cadastrar usuario");
                    System.out.println("Digite o nome do usuario: ");
                    String nome = scanner.nextLine();
                    int id = idCounter;
                    Registro registro = new Registro(id, nome);
                    banco.insere(registro);
                    idCounter++;
                    break;
                case 2:
                    System.out.println("Vc selecionou: consultar cadastro por id");
                    System.out.println("Digite o id que vc quer pesquisar: ");
                    int idBuscado = scanner.nextInt();
                    if(cadastro.consultaId(idBuscado, banco)) {
                        System.out.println("Busca por id: elemento está na lista");
                    } else {
                        System.out.println("Busca por id: elemento não está na lista");
                    }
                    break;
                case 3:
                    System.out.println("Vc selecionou: consultar cadastro por nome");
                    System.out.println("Digite o nome a ser buscado: ");
                    String nomeBuscado = scanner.nextLine();
                    if(cadastro.consultaNome(nomeBuscado, banco)) {
                        System.out.println("Busca por nome: elemento está na lista");
                    } else {
                        System.out.println("Busca por nome: elemento não está na lista");
                    }
                    continue;
                case 4:
                    System.out.println("Saida");
                    func = false;
                    break;
            }
        } while (func);
    }
}
