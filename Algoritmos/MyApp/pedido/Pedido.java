# pedido - Pedido

package pedido;

import java.util.Date;
import java.util.List;
import cadastro.Cadastro;

public class Pedido {
	
	// private não acessa o método direto, esses métodos poderam ser.
	
	private  Integer id;
	private Date data;
	private Double ValorTotal;
	private Cadastro comprador;
	
	public Cadastro getComprador() {
		return comprador;
	}
	
	public void setComprador(Cadastro comprador) {
		this.comprador = comprador;
	}
	
	
	private List<PedidoItem> itens;
	
	public List<PedidoItem> getItens() {
		return itens;
	}
	
	public void setItens(List<PedidoItem> itens) {
		this.itens = itens;
	}
	
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	Integer getId() {
		return id;
		
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Double getValorTotal() {
		return ValorTotal;
	}
	
	public void setValorTotal(Double valorTotal) {
		ValorTotal = valorTotal;
	}
		
}

Ferreira , Gabriel . moreira028 @ . gmail . com

Dados :  16 / 06 / 2021