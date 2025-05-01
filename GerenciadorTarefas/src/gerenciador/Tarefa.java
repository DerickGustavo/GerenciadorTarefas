package gerenciador;

import estados.Estados;
import estados.Pendente;

public class Tarefa { //contexto

    private String codigo;
    private String descricao;
    private Estados estado;

    public Tarefa (String codigo, String descricao){
        estado = new Pendente(this);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
        System.out.println(getEstado());
    }

    public void marcarAtrasada(){
        estado.atrasar();
    }

    public void marcarPendente(){
        estado.pendente();
    }

    public void marcarConcluida(){
        estado.concluir();
    }
}
