package estados;

import gerenciador.Tarefa;

public class Pendente implements Estados{
    private Tarefa tarefa;
    private String rotulo = "tarefa pendente";

    public Pendente(Tarefa tarefa){
        this.tarefa= tarefa;
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
        System.out.println("Já está pendente");
    }

    @Override
    public String toString() {
        return "Pendente{" + "rotulo='" + rotulo + '\'' + '}';
    }
}
