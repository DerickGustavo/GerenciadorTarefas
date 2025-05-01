package gerenciador;

public class GerenciadorTarefas {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa("PI-4","sacrificar alguém até o fim do semestre, o viado");
        tarefa.marcarPendente();
        tarefa.marcarConcluida();
    }
}
