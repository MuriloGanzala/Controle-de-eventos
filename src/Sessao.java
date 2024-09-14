public class Sessao {
    private String tema;
    private String horario;
    private Palestrante palestrante;

    public Sessao(String tema, String horario, Palestrante palestrante) {
        this.tema = tema;
        this.horario = horario;
        this.palestrante = palestrante;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }
}
