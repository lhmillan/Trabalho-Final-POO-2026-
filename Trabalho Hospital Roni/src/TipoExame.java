public enum TipoExame {
    SANGUE(100),
    IMAGEM(150),
    RAIOX(200),
    ULTRASSOM(250);

    private double valor;

    private TipoExame(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

}
