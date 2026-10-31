public class Lista {
    private Registro[] vetor;
    private int cont;

    public Lista() {
        this.vetor = new Registro[10];
        this.cont = 0;
    }

    public String imprimeVetor() {
        String txt = "";
        for(Registro val : this.vetor) {
            txt += val + " + ";
        }
        return "Vetor: " + txt;
    }

    public String imprimeLista() {
        if(this.cont == 0) {
            return "A lista está vazia.";
        }

        String txt = "";
        for(int i = 0; i < this.cont; i++) {
            txt += this.vetor[i] + " + ";
        }
        return "Lista: " + txt;
    }

    public boolean insere(Registro registro) {
        if(this.cont >= this.vetor.length) {
            return false;
        }
        // Inserir no final
        this.vetor[this.cont] = registro;
        this.cont++;

        ///
        System.out.println("INSERIDO");
        int registroId = registro.getId();
        String registroNome = registro.getNome();
        System.out.println(registroId + registroNome);
        ///


        return true;
    }

    public boolean insere(Registro registro, int posicao) {
        if(this.cont >= this.vetor.length) {
            return false;
        }
        if(this.cont == 0 && posicao == 0) {
            return insere(registro);
        }
        if(posicao < 0 || posicao > this.cont) {
            return false;
        }

        for(int i = this.cont - 1; i >= posicao; i--) {
            this.vetor[i + 1] = this.vetor[i];
        }
        this.vetor[posicao] = registro;
        this.cont++;
        return true;
    }

    public int tamanho() {
        if(this.cont == 0) {
            return 0;
        }
        return this.cont;
    }

    public void limpaLista() {
        for(int i = 0; i < this.vetor.length; i++) {
            this.vetor[i] = null;
        }
        this.cont = 0;
    }

    public void remocao() {
        this.vetor[cont - 1] = null;
        this.cont--;
    }

    public boolean remocao(int posicao) {
        Registro registroARemover = this.vetor[posicao];
        if(posicao > this.cont) {
            return false;
        }
        if(posicao < 0) {
            return false;
        }

        this.vetor[posicao] = null;
        for(int i = posicao; i < tamanho(); i++) {
            this.vetor[i] = this.vetor[i + 1];
        }
        System.out.println("Elemento removido: " + registroARemover + ", posicao: " + posicao);
        this.cont--;
        return true;
    }

    // Busca por id
    public boolean contem(int id) {
        for(Registro registro : this.vetor) {
            if(registro.getId() == id) {
                return true;
            }
        }
        return false;
    }

    // Busca por nome
    public boolean contem(String nome) {
        for(Registro var : this.vetor) {
            if(nome.equals(var.getNome())) {
                return true;
            }
        }
        return false;
    }
}