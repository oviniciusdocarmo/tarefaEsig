
package model;



public class tarefa {
    
    private int numero;
    private String titulo;
    private String descricao;
    private String responsavel;
    private String prioridade;
    private String deadline;
    private String situacao;
    
    private int num;

    public tarefa(String titulo, String descricao, String responsavel, String prioridade, String deadline) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.prioridade = prioridade;
        this.deadline = deadline;
    } 

    public tarefa(int numero, String titulo, String responsavel, String situacao) {
        this.numero = numero;
        this.titulo = titulo;
        this.responsavel = responsavel;
        this.situacao = situacao;
    }

    public tarefa() {

    }
    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
        
        num = this.numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getNum() {
        return num;
    }
    
    
    
    
}
