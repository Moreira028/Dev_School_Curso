# pedido - PedidoItem

package pedido;

import cadastro.Produto;

public class PedidoItem {
	
	// quais são as classes do Java
	
	private Integer id;
	private Double quantidade;
	private Double valorVenda;
	private Double valorTotal;
	private Produto produto;
	
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	public Double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}
	public Double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
			
}

Ferreira , Gabriel . moreira028 @ . gmail . com

Dados :  16 / 06 / 2021