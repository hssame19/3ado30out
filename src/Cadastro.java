public class Cadastro {
    public boolean Cadastrar(Registro registro, Lista banco) {
        banco.insere(registro);
        return true;
    }

    public boolean consultaId(int id, Lista banco) {
        if(banco.contem(id)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean consultaNome(String nome, Lista banco) {
        if(banco.contem(nome)) {
            return true;
        } else {
            return false;
        }
    }
}
