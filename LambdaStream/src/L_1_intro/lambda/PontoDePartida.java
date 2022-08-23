package L_1_intro.lambda;

import L_1_intro.Mostrador;
import L_1_intro.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PontoDePartida {
    public static void main(String ... args) {
        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        //Cria uma lista imutável: asList
        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        //é um lambda do Java 8
        Consumer<Usuario> mostrador =
                (Usuario u) -> {System.out.println(u.getNome());};



    }


}
