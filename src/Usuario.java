/**
 * A classe Usuario representa um usuário que fornece valores para operações
 * matemáticas.
 *
 * @author Camilo Almeida
 * @version 1.0
 * @since 02/09/2023
 */
import java.util.Locale;
import java.util.Scanner;
public class Usuario {
    static double number1;
    static double number2;
    static String operator;
    /**
     * Define os valores do usuário a partir da entrada com a classe Scanner.
     */
    public static void setValue(){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite o primeiro número: ");
        number1 = scanner.nextDouble();
        System.out.print("Qual a operação? [+,-,*,/,%]: ");
        operator = scanner.next();
        System.out.print("Digite o segundo número: ");
        number2 = scanner.nextDouble();
        scanner.close();
    }
    /**
     * Obtém o primeiro número fornecido pelo usuário.
     *
     * @return O primeiro número.
     */
    public double getNumber1(){
        return number1;
    }
    /**
     * Obtém o operador fornecido pelo usuário.
     *
     * @return O operador.
     */
    public String getOperator(){
        return operator;
    }
    /**
     * Obtém o segundo número fornecido pelo usuário.
     *
     * @return O segundo número.
     */
    public double getNumber2(){
        return number2;
    }
}
