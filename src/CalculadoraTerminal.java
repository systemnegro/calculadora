/**
 * Esta classe é a classe principal da calculadora.
 * Ela cria uma instância da classe Usuario para coletar os valores
 * fornecidos pelo usuário e, em seguida, chama a classe Operacoes
 * para realizar a operação matemática com esses valores.
 *
 * @author Camilo Almeida
 * @version 1.0
 * @since 02/09/2023
 */
public class CalculadoraTerminal {
    public static void main(String[] args) {
        // Cria uma instância da classe Usuario para coletar os valores do usuário
         Usuario usuario = new Usuario();
         Usuario.setValue();
        // Chama a classe Operacoes para realizar a operação com os valores fornecidos
         String result = Operacoes.operacoes(usuario.getNumber1(),usuario.getOperator(),usuario.getNumber2());
         System.out.println(result);
    }
}