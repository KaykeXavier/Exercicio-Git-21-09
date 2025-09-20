class RockMusica extends Musica {
    private String subgenero;

    public RockMusica(String nome, String artista, String subgenero) {
        super(nome, artista);
        this.subgenero = subgenero;
    }

    public String getSubgenero() {
        return subgenero;
    }

    public void setSubgenero(String subgenero) {
        this.subgenero = subgenero;
    }

    @Override
    public void estiloMusical() {
        System.out.println("Estilo musical: Rock");
    }

    public void exibirSubgenero() {
        System.out.println("Subgenero: " + subgenero);
    }
}