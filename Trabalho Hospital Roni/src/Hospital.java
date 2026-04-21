import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String cnpj;
    private String nome;
    private List<Ala> alas;
    private List<Plano> planos;
    private List<Medico> medicos = new ArrayList<>();


    
    public Hospital(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public List<Ala> getAlas() {
        return alas;
    }

    public List<Plano> getPlanos() {
        return planos;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void addMed(Medico medico) {
        medicos.add(medico);
    }

    public void mostrarMed(){
        for (Medico m: medicos) {
            System.out.println(m);
        }
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return cnpj +"\n"+  nome;
    }

    
}
