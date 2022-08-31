p2

## Interfaces funcionais
- um **lambda** no Java é uma maneira mais simples de implementar uma interface que só tem um único método
- Podemos dizer então que **toda interface** do Java que possui apenas **um método** abstrato pode ser instanciada como um **código lambda**!

```
interface Validador<T> {
    boolean valida(T t);
}

Validador<String> validadorCEP = new Validador<String>() {
    public boolean valida(String valor) {
        return valor.matches("[0-9]{5}-[0-9]{3}");
    }
};
```