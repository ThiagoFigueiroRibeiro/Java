import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumeroNaoRepetido {
    public static void main(String[] args) {
        // Criando a lista
        List<Integer> lista = new ArrayList<>();
        // Adicionando elementos na lista
        lista.add(1);
        lista.add(6);
        lista.add(2); // < esse é o número não repetido
        lista.add(1);
        lista.add(3);
        lista.add(6);
        lista.add(3);

        // Testando o método
        System.out.println(numeroNaoRepetido(lista));
    }

    public static Integer numeroNaoRepetido(List<Integer> numeros) {

        // Exibir a lista original:
        System.out.println(numeros);

        // Ordenando a lista
        Collections.sort(numeros);

        // Exibir a lista ordenada:
        System.out.println(numeros);

        // Teste de números repetidos.
        // Note que a lista tem que ter pelo menos 3 elementos.

        // Se o primeiro número é diferente do segundo em uma lista ordenada,
        // o primeiro não repete.
        if (numeros.getFirst() != numeros.get(1)){
            return numeros.getLast();
        }

        // Se o último número é diferente do penúltimo em uma lista ordenada,
        // o último não repete.
        if (numeros.getLast() != numeros.get(numeros.size()-2)){
            return numeros.getLast();
        }

        // Se o número testado é diferente do número anterior e diferente do posterior
        // em uma lista ordenada então este número não repete.
        for (int i = 1; i < numeros.size() - 1; i++) {
            if (numeros.get(i) != numeros.get(i - 1) && numeros.get(i) != numeros.get(i + 1)) {
                return i;
            }
        }
        // Lista sem números repetidos;
        return null;
    }
}