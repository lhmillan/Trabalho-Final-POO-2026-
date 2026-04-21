public class Plano {
    private final String nome;
    private String telefone;
    private TipoPlano tipo;
    
    public Plano(String nome, String telefone, TipoPlano tipo) {
        this.nome = nome;
        this.telefone = telefone;
        this.tipo = tipo;
    }
}
