import java.util.Arrays;

public class ChallengeCapgemini {

    /**
     * # Questão 01
     * A mediana de uma lista de números é basicamente o elemento que se encontra no meio da lista após a ordenação.
     * Dada uma lista de números com um número ímpar de elementos, desenvolva um algoritmo que encontre a mediana.
     *
     * @param values Lista de inteiros com tamanho ímpar.
     * @return Retorna a mediana
     */
    static int questionOne(int[] values) {
        if (values.length % 2 == 0) {
            throw new IllegalArgumentException("Input list size should be odd");
        }

        Arrays.sort(values);

        return values[values.length / 2];
    }

    /**
     * # Questão 02
     * Dado um vetor de inteiros n e um inteiro qualquer x. Construa um algoritmo que determine o número de
     * elementos pares do vetor que tem uma diferença igual ao valor de x.
     *
     * @param values     Lista de inteiros
     * @param difference Inteiro utilizado para procurar em values quais inteiros tem a diferença igual ao valor passado
     * @return Retorna quantos pares dentro de values tem diferença igual a difference
     */
    public static int questionTwo(int[] values, int difference) {
        int output = 0;

        for (int i = 0; i < values.length; i++) {
            for (int j = values.length - 1; j > i; j--) {
                if (Math.abs(values[j] - values[i]) == difference) {
                    output++;
                }
            }
        }

        return output;
    }

    /**
     * # Questão 03
     * <p>
     * Um texto precisa ser encriptado usando o seguinte esquema. Primeiro, os espaços são removidos do texto. Então, os
     * caracteres são escritos em um grid, no qual as linhas e colunas tem as seguintes regras:
     * <p>
     * √T <= linha <= coluna <= √T
     * <p>
     * * Considere T, como o tamanho do texto.
     * <p>
     * * Se certifique de que linhas x colunas >= √T.
     * <p>
     * * Se múltiplos grids satisfazem as condições, escolha aquele com a menor área.
     * <p>
     * Escreva um algoritmo que ao receber uma string s, mostre a mensagem encriptada de acordo com as regras descritas.
     *
     * @param value String para criptografar
     * @return Retorna value criptografado
     */
    public static String questionThree(String value) {
        StringBuilder encrypt = new StringBuilder();
        int square;

        value = value.replaceAll("\\s+", "");
        square = (int) Math.ceil(Math.sqrt(value.length()));

        String[] valueSplit = value.split("(?<=\\G.{" + square + "})");
        
        for (int column = 0; column < square; column++) {
            if (column != 0) {
                encrypt.append(" ");
            }

            for (String line : valueSplit) {
                if (column < line.length()) {
                    encrypt.append(line.charAt(column));
                }
            }
        }

        return encrypt.toString();
    }
}
