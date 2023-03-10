
package ex2provavalidacaolab;

/**
 *
 * @author Pedro Nunes
 */
public class Ex2ProvaValidacaoLab {

    
    public static void main(String[] args) {
        Pessoa pessoa = new PessoaBuilder()
                    .setNome("Pedro")
                    .setIdade(19)
                    .setSexo("Masculino")
                    .setTelefone("123456789")
                    .build();
        
        System.out.println(pessoa.toString());
    }
    
}
