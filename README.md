# Exercicio-Git-21-09

Kayke Xavier de Souza Nogueira Braga - 42421656
Stephanie Meireles Miranda - 42422045

O projeto tem como tema a modelagem de um sistema simples para representar diferentes tipos de músicas utilizando os conceitos de programação orientada a objetos (POO) em Java. A ideia é mostrar como usar herança, polimorfismo, e sobrescrita de métodos, organizando o código de forma reutilizável e escalável.

Na hierarquia do sistema, temos uma superclasse chamada Musica, que define atributos e comportamentos comuns a todas as músicas, como nome, artista e o método tocar(). A partir dela, criamos duas subclasses especializadas: PopMusica e RockMusica, que estendem a superclasse e adicionam seus próprios atributos (album e subgenero, respectivamente). Ambas sobrescrevem o método estiloMusical() para exibir o gênero específico. No Main, utilizamos polimorfismo ao armazenar objetos das subclasses em uma lista do tipo Musica, e invocamos os métodos de forma dinâmica, conforme o tipo real do objeto.
