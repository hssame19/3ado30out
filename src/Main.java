public class Main {
    public static void main(String[] args) {
        Lista banco = new Lista();
        Registro registro = new Registro(0, "Nome");
        Cadastro cadastro = new Cadastro();

        Registro registro2 = new Registro(25, "NaoEstouNaLista");

        cadastro.Cadastrar(registro, banco);
        cadastro.Cadastrar(registro2, banco);

        System.out.println("///");

        if(cadastro.consultaId(5, banco)) {
            System.out.println("Busca por id: elemento está na lista");
        } else {
            System.out.println("Busca por id: elemento não está na lista");
        }

        if(cadastro.consultaNome("NomeAleatorio", banco)) {
            System.out.println("Busca por nome: elemento está na lista");
        } else {
            System.out.println("Busca por nome: elemento não está na lista");
        }
    }
}
