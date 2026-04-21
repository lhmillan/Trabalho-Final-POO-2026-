public class Enfermeira {
    private final String cre;
    private String nome;
    private Turno turno;
    private TipoAla ala;

    public Enfermeira(String cre, String nome, Turno turno, TipoAla ala) {
        this.cre = cre;
        this.nome = nome;
        this.turno = turno;
        this.ala = ala;
    }

    @Override
    public String toString() {
        return "Cre:" + cre + "| Nome: " + nome + "| Turno:" + turno + "| Ala: " + ala;  
    }

}
