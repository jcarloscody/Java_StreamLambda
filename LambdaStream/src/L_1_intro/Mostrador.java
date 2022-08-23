package L_1_intro;

import java.util.function.Consumer;

//classe que implementa essa nova interface do Java 8
public class Mostrador implements Consumer<Usuario> {
    //‘Consumir’ aqui é realizar alguma tarefa que faça sentido
    //pra você
    public void accept(Usuario u) {
        System.out.println(u.getNome());
    }
}
