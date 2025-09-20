class Musica {
    private String nome;
    private String artista;

    public Musica(String nome, String artista) {
        this.nome = nome;
        this.artista = artista;
    }

    public void tocar() {
        System.out.println("Tocando a música: " + nome + " de " + artista);
    }

    public void estiloMusical() {
        System.out.println("Estilo musical: Geral");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

}