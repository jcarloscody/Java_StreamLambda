package L_1_intro;

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

        for(Usuario u : usuarios) {
            System.out.println(u.getNome());

        }

        Mostrador mostrador = new Mostrador();
        usuarios.forEach(mostrador);


        //classes anônimas
        Consumer<Usuario> mostradorr = new Consumer<Usuario>() {
            @Override
            public void accept(Usuario usuario) {
                System.out.println(usuario.getNome());
            }
        };

        usuarios.forEach(mostradorr);


        usuarios.forEach(new Consumer<Usuario>() {
            public void accept(Usuario u) {
                System.out.println(u.getNome());
            }
        });
    }


}
