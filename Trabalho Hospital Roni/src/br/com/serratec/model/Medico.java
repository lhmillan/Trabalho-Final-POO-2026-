package br.com.serratec.model;

public class Medico {

    private Integer id;
    private String nome;
    private String crm;
    private Especialidade especialidadeId;

    public Medico(Integer id, String nome, String crm, Especialidade especialidadeId) {
        this.id = id;
        this.nome = nome;
        this.crm = crm;
        this.especialidadeId = especialidadeId;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCrm() {
        return crm;
    }

    public Especialidade getEspecialidadeId() {
        return especialidadeId;
    }

    @Override
    public String toString() {
        return "Medico [id=" + id + ", nome=" + nome + ", crm=" + crm + ", especialidadeId=" + especialidadeId + "]";
    }

}
