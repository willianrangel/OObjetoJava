package javabanco;

import java.util.ArrayList;
import java.util.Date;

import javabanco.entidade.ContaCorrente;
import javabanco.entidade.Operacao;

public class TiposDeVariaveis {

	public static void main(String[] args) {
		int umNumero = 42;
		
		Integer umNumeroObj = new Integer(42);
		
		System.out.println("umNumero: " + umNumero);
		System.out.println("umNumeroObj: " + umNumeroObj);
		
		ArrayList<Integer> contas = new ArrayList<Integer>();
		
		contas.add(12345);
		
		contas.add(12765);
		
		contas.add(76543);
		
		System.out.println("contas: " + contas);
		
		ContaCorrente cc1 = new ContaCorrente();
		System.out.println("cc1.getSaldo()" + cc1.getSaldo());
		
		cc1.credito(umNumero);
		System.out.println("cc1.getSaldo() após crédito: " + cc1.getSaldo());
		
		cc1.debito(20);
		System.out.println("cc1.getSaldo() após débito: " + cc1.getSaldo());
		
		System.out.println("cc1.extrato():" + cc1.extrato());
		
		Operacao o1 = new Operacao(500, "CREDITO", new Date());
		Operacao o2 = new Operacao(675, "DEBITO", new Date());
		
		System.out.println("o1: " + o1.getValor() + ", " + o1.getTipoOperacao() + ", " + o1.getDataHora()
		);
		System.out.println("o2: " + o2.getValor() + ", " + o2.getTipoOperacao() + ", " + o2.getDataHora()
		);
		
	}

}
