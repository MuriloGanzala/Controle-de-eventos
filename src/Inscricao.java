public class Inscricao {

        private Participante participante;
        private Sessao sessao;

        public Inscricao(Participante participante, Sessao sessao) {
            this.participante = participante;
            this.sessao = sessao;
        }

        // Getters e setters
        public Participante getParticipante() {
            return participante;
        }

        public void setParticipante(Participante participante) {
            this.participante = participante;
        }

        public Sessao getSessao() {
            return sessao;
        }

        public void setSessao(Sessao sessao) {
            this.sessao = sessao;
        }
    }


