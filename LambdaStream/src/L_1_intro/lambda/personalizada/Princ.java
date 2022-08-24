package L_1_intro.lambda.personalizada;

public class Princ {
    public static void main(String[] args) {
        Validador<String> validador = new Validador<String>() {
            @Override
            public boolean valida(String s) {
                return false;
            }
        };

        System.out.println(validador.valida("sd"));

        //usando lambda
        Validador<String> v = s -> s.matches("[0-9]{5}-[0-9]{3}");
        System.out.println(v.valida("335"));
    }



}
