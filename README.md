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

- A anotação **@FunctionalInterface**

- **Interfaces funcionais são o coração** do recurso de Lambda. O Lambda por si só não existe, e sim expressões lambda, quando atribuídas/inferidas a uma interface funcional

```
Runnable o = () -> {
    System.out.println("O que sou eu? Que lambda?");
};
System.out.println(o);
System.out.println(o.getClass());   
```
> Capitulo3$$Lambda$1@1fc625e

> class Capitulo3$$Lambda$1

- Repare que não foi gerado um .class no seu diretório, essa classe é criada dinamicamente!

- OBS: Captura de variáveis locais

## A interface Consumer não tem só um método
> uma interface funcional é aquela que possui apenas um método abstrato! Ela pode ter sim mais métodos, desde que sejam métodos default.

```
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
    default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };
    }
}
```


# Default Methods
- **forEach** na interface Iterable
- 