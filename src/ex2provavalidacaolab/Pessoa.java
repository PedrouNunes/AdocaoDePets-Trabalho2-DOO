
package ex2provavalidacaolab;

/**
 *
 * @author Pedro Nunes
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private String telefone;

    public Pessoa(String nome, int idade, String sexo, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", telefone=" + telefone + '}';
    }
}
