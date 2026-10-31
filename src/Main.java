public class Main {
    public static void main(String[] args) {
        Lista banco = new Lista();
        Registro registro = new Registro(0, "Nome");
        Cadastro cadastro = new Cadastro();

        Registro registro2 = new Registro(25, "NaoEstouNaLista");

        cadastro.Cadastrar(registro, banco);
        cadastro.Cadastrar(registro2, banco);

        if(cadastro.consultaId(0, banco)) {
            System.out.println("Busca por id: elemento está na lista");
        } else {
            System.out.println("Busca por id: elemento ão está na lista");
        }
//
//        if(cadastro.consultaNome("NomeAleatorio", banco)) {
//            System.out.println("Busca por nome: elemento está na lista");
//        } else {
//            System.out.println("Busca por nome: elemento não está na lista");
//        }
    }
}
