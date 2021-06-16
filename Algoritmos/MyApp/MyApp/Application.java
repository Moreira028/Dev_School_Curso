# MyApp - Application

package myApp;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import factory.FabricaCadastro;
import cadastro.CD;
import cadastro.Cadastro;
import pedido.PedidoItem;
import pedido.Pedido;

public class Application_01 {
	public static void main (String [] args) {
			// REQUISITO
			// 1 CRIAR OBJETOS QUE RELACIONANDO-SE EU TEREI UMA PERSPECTIVA DE TER UM PEDIDO
			// TODAS AS INFORMAÇÕES
	
			// 2 IMPRIMIR ESTE PEDIDO ESTILO CUPOM
	
			Cadastro artista = FabricaCadastro.criarCadastro("GLEISON", "a@a", 898943828L);
	
			CD p1 = new CD(); // Livro()
			p1.setCodigoBarras("7897454564");
			p1.setTitulo("IRON MADEN");
			p1.setValorVenda(19.90);
			p1.setArtista(artista);
			p1.setFaixa(10);
	
			artista = FabricaCadastro.criarCadastro ("PINK FLOYD", null, 9089029304890L);
	
			// Cadastro artista2 = new Cadastro();
			// artista2.setNome("CLEBER");
 	
	
			// artista = p1.getArtista();
		
			CD p2 = new CD(); // Livro()
			p2.setCodigoBarras("7897454564");
			p2.setTitulo("THE WALL");
			p2.setValorVenda(190.58);
			// p2.setArtista(artista);
			p2.setFaixa(8);
	
			// System.out.println(p1.getArtista().getNome());
			// System.out.println(p2.getArtista().getNome());

			Pedido pedido = new Pedido();
			Cadastro comprador = FabricaCadastro.criarCadastro("Cleber","m@2", null);
		
			pedido.setComprador(comprador);
			pedido.setData(new Date(2021,6,16));
			pedido.setValorTotal(325.0);
			pedido.setId(1234);
			
			List<PedidoItem> itens = new ArrayList<>();
			PedidoItem item = new PedidoItem();
			item.setProduto(p1);
			item.setQuantidade(2.0);
			item.setValorVenda(p1.getValorVenda());
			item.setValorTotal(item.getQuantidade() * item.getValorVenda());
			
			itens.add(item);
		
			item = new PedidoItem();
			item.setProduto(p2);
			item.setQuantidade(4.0);
			item.setValorVenda(p2.getValorVenda());
			item.setValorTotal(item.getQuantidade() * item.getValorVenda());
			
			pedido.setItens(itens);
		
			System.out.println("Pedido cliente " + pedido.getComprador(). getNome());
			for (PedidoItem i: pedido.getItens()) {
				System.out.println(i.getProduto().getTitulo() + " " + i.getValorVenda() + " " + i.getValorTotal());
			}
			
		}	
	}
    

Ferreira , Gabriel . moreira028 @ . gmail . com

Dados :  16 / 06 / 2021