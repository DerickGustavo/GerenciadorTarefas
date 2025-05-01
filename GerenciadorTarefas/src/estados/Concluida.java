package estados;

import gerenciador.Tarefa;

public class Concluida implements Estados{
    private Tarefa tarefa;
    private String rotulo="tarefa concluída";

    private Concluida(Tarefa tarefa){
        this.tarefa = tarefa;
    }

    @Override
    public void concluir() {
        tarefa.setEstado(new Concluida(tarefa));
    }

    @Override
    public void atrasar() {
        System.out.println("Já está atrasada");
    }

    @Override
    public void pendente() {
        System.out.println("Já está pendente");
    }

    @Override
    public String toString() {
        return "Concluida{" + "rotulo='" + rotulo + '\'' + '}';
    }
}
