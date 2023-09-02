/**
 * A classe Operacoes contém o método para realizar operações matemáticas.
 *
 * @author Camilo Almeida
 * @version 1.0
 * @since 02/09/2023
 */
public class Operacoes {
    /**
     * Realiza uma operação matemática com base nos valores fornecidos pelo usuário.
     *
     * @param number1 O primeiro número da operação.
     * @param operaction O operador da operação (+, -, *, /, %).
     * @param number2 O segundo número da operação.
     * @return O resultado da operação ou uma mensagem de erro, se a operação for inválida.
     */
    public static String operacoes(double number1, String operaction, double number2){
        String result;
       switch (operaction){
           case "+":
               result = String.valueOf(number1 + number2);
               break;
           case "-":
               result = String.valueOf(number1 - number2);
               break;
           case "*":
               result = String.valueOf(number1 * number2);
               break;
           case "/":
               if(number2 == 0){
                   result = "Não é possível dividir por zero";
               }else {
                   result = String.valueOf(number1 / number2);
               }
               break;
           case "%":
               result = String.valueOf(number1 % number2);
               break;
           default:
               result = "Operação invalida!";
       }
        return result;
    }

}
