package one.digitalinovation.laboojava.entidade;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa a entidade pedido, qual é a compra dos produtos por um
 * cliente.
 * 
 * @author thiago leite
 */
public class Pedido {

	private String codigo;
	private List<Cliente> clientes;
	private List<Produto> produtos;
	private double total;

	public Pedido() {
		this.produtos = new ArrayList<>();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<Cliente> getCliente() {
		return clientes;
	}

	public void setCliente(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	private String getProdutosComprados() {

		StringBuilder produtos = new StringBuilder();
		produtos.append("[");
		for (Produto produto : getProdutos()) {
			produtos.append(produto.toString());
			produtos.append("Qtd:");
			produtos.append(produto.getQuantidade());
			produtos.append(" ");
		}
		produtos.append("]");

		return produtos.toString();
	}

	@Override
	public String toString() {
		return "Pedido [codigo=" + codigo + ", cliente=" + clientes + ", produtos=" + getProdutosComprados() + ", total="
				+ total + "]";
	}

}
