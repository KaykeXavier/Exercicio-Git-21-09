package Exercicio_Git_21_09;

class PopMusica extends Musica {
    private String album;

    public PopMusica(String nome, String artista, String album) {
        super(nome, artista);
        this.album = album;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public void estiloMusical() {
        System.out.println("Estilo musical: Pop");
    }

    public void exibirAlbum() {
        System.out.println("Álbum: " + album);
    }
}