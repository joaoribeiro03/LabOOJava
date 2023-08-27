package one.digitalinovation.laboojava.negocio;

import one.digitalinovation.laboojava.basedados.Banco;
import one.digitalinovation.laboojava.entidade.Cliente;

import java.util.Optional;

/**
 * Classe para manipular a entidade {@link Cliente}.
 * 
 * @author thiago leite
 */
public class ClienteNegocio {

	/**
	 * {@inheritDoc}.
	 */
	private Banco bancoDados;

	/**
	 * Construtor.
	 * 
	 * @param banco Banco de dados para ter acesso aos clientes cadastrados
	 */
	public ClienteNegocio(Banco banco) {
		this.bancoDados = banco;
	}

	/**
	 * Consulta o cliente pelo seu CPF.
	 * 
	 * @param cpf CPF de um cliente
	 * @return O cliente que possuir o CPF passado.
	 */
	public Optional<Cliente> consultar(String cpf) {
	    for (Cliente cliente : bancoDados.getCliente()) {
	        if (cliente.getCpf().equals(cpf)) {
	            return Optional.of(cliente);
	        }
	    }
	    return Optional.empty();
	}


	/**
	 * Cadastra um novo cliente.
	 * 
	 * @param cliente Novo cliente que terá acesso a aplicação
	 */
	// TODO Fazer a inclusão de cliente
	public void salvar(Cliente novoCliente) {
		this.bancoDados.adicionarCliente(novoCliente);
		System.out.println("Pessoa cadastrada com sucesso.");
	}

	/**
	 * Exclui um cliente específico.
	 * 
	 * @param cpf CPF do cliente
	 */
	// TODO Fazer a exclusão de cliente
	public void excluir(String cpf) {
		for (int i = 0; i < bancoDados.getCliente().length; i++) {
			if (bancoDados.getCliente()[i].getCpf().equals(cpf)) {
				bancoDados.removerCliente(i);
				break;
			}
		}
	}
}
