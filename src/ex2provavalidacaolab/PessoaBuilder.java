
package ex2provavalidacaolab;

/**
 *
 * @author Pedro Nunes
 */
public class PessoaBuilder {
    private String nome;
    private int idade;
    private String sexo;
    private String telefone;

    public PessoaBuilder() {}

    public PessoaBuilder setNome(String name) {
        this.nome = name;
        return this;
    }

    public PessoaBuilder setIdade(int age) {
        this.idade = age;
        return this;
    }

    public PessoaBuilder setSexo(String address) {
        this.sexo = address;
        return this;
    }

    public PessoaBuilder setTelefone(String phoneNumber) {
        this.telefone = phoneNumber;
        return this;
    }

    public Pessoa build() {
        return new Pessoa(nome, idade, sexo, telefone);
    }
}
