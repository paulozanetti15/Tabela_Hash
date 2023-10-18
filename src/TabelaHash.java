import java.util.ArrayList;

public class TabelaHash {
    private ArrayList<Dado>[] tabela;
    private int tamanho;
    private int capacidade;
    private float fatorCargaLimite = 0.75f;

    public TabelaHash(int capacidade) {
        this.tamanho = 0;
        this.capacidade = capacidade;
        this.tabela = new ArrayList[capacidade];
    }

    private int calcularIndice(int chave) {
        return chave % capacidade;
    }

    private int calcularIndice(Dado dado) {
        return dado.hashCode() % capacidade;
    }

    public void inserir(Dado dado) {
        if (tamanho >= fatorCargaLimite * capacidade) {
            redimensionar();
        }

        int indice = calcularIndice(dado);
        if (tabela[indice] == null) {
            tabela[indice] = new ArrayList<>();
        }
        tabela[indice].add(dado);
        tamanho++;
    }

    public Dado buscar(int chave) {
        int indice = calcularIndice(chave);
        if (tabela[indice] != null) {
            for (Dado dado : tabela[indice]) {
                if (dado.getNumero() == chave) {
                    return dado;
                }
            }
        }
        return null;
    }

    public Dado remover(int chave) {
        int indice = calcularIndice(chave);
        if (tabela[indice] != null) {
            ArrayList<Dado> listaColisao = tabela[indice];
            for (Dado dado : listaColisao) {
                if (dado.getNumero() == chave) {
                    listaColisao.remove(dado);
                    tamanho--;
                    if (listaColisao.isEmpty()) {
                        tabela[indice] = null;
                    }
                    return dado;
                }
            }
        }
        return null;
    }

    private void redimensionar() {
        int novaCapacidade = capacidade * 2;
        ArrayList<Dado>[] novaTabela = new ArrayList[novaCapacidade];

        for (int i = 0; i < capacidade; i++) {
            if (tabela[i] != null) {
                for (Dado dado : tabela[i]) {
                    int novoIndice = calcularIndice(dado);
                    if (novaTabela[novoIndice] == null) {
                        novaTabela[novoIndice] = new ArrayList<>();
                    }
                    novaTabela[novoIndice].add(dado);
                }
            }
        }

        tabela = novaTabela;
        capacidade = novaCapacidade;
    }
}
