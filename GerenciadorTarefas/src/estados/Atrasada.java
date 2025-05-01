package estados;

import gerenciador.Tarefa;

public class Atrasada implements Estados{
    private Tarefa tarefa;
    private String rotulo="tarefa atrasada";

    private Atrasada(Tarefa tarefa){
        this.tarefa = tarefa;
    }

    @Override
    public void concluir() {
        System.out.println("Já está concluída");
    }

    @Override
    public void atrasar() {
        System.out.println("Já está atrasada");
    }

    @Override
    public void pendente() {
        tarefa.setEstado(new Pendente(tarefa));
    }

    @Override
    public String toString() {
        return "Atrasada{" + "rotulo='" + rotulo + '\'' + '}';
    }
}
