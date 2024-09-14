public class Principal {
         public static void main(String[] args) {

            Evento evento = new Evento("Aula de Java com Hariel", "10/10/2024", "Dois Vizinhos");

            Palestrante palestrante = new Palestrante("Hariel", "Java Avançado");


            Sessao sessao = new Sessao("Desenvolvendo com Java", "10:00 - 12:00", palestrante);


            evento.adicionarSessao(sessao);


            Participante participante = new Participante("Carlos Lima", "carlos@gmail.com");
            Inscricao inscricao = new Inscricao(participante, sessao);


            System.out.println("Evento: " + evento.getNome() + " - Local: " + evento.getLocal());
            System.out.println("Sessão: " + sessao.getTema() + " - Horário: " + sessao.getHorario());
            System.out.println("Palestrante: " + sessao.getPalestrante().getNome() + " - Especialidade: " + sessao.getPalestrante().getEspecialidade());
            System.out.println("Participante: " + inscricao.getParticipante().getNome() + " - E-mail: " + inscricao.getParticipante().getEmail());
        }
    }


