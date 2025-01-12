public class Evento {
    private String nome;
    private String data;
    private String local;
    private Sessao sessao;

    public Evento(String nome, String data, String local) {
        this.nome = nome;
        this.data = data;
        this.local = local;
    }

    public void adicionarSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Sessao getSessao() {
        return sessao;
    }
}
