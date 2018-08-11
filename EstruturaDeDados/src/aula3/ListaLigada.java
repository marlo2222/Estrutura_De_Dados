package aula3;

import aula2.No;

public class ListaLigada {
	public No inicio;
	public No fim;
	public int contador;
	
	ListaLigada (){
	}
	
	public boolean isVazia() {
		return (inicio == null && fim == null);
	}
	
	public void addInicio(int valor) {
		
		No novoNo = new No(valor);
		if (contador == 0) {
			inicio = novoNo;
			fim = novoNo;
		} else {
			novoNo.prox = inicio;
			inicio = novoNo;
		}
		this.contador++;
	}
	public void addFinal(int valor)	{
		
		No novoNo = new No(valor);
		if (isVazia())
			inicio = novoNo;
		else
			fim.prox = novoNo;
		fim = novoNo;
		contador++;
	}
	
	public int getNroNos() {
		return contador;
	}
	
	public void addMeio(int posicao, int valor)	{
		
		No novoNo = new No(valor);
		if(posicao <= 1) {
			addInicio(valor);
			return;
		}
		if (posicao > contador) { //Outra abordagem seria lançar exceção para posição inválida (>nroNos+1)
			addFinal(valor);
			return;
		}
		No noTemp = inicio.prox;
		for(int posAux=1;posAux<posicao;posAux++) 
			noTemp = noTemp.prox;
		novoNo.prox = (noTemp.prox).prox;
		noTemp.prox = novoNo;
		contador++;
	}
	public void emprime() {
		for (No aux = this.inicio; aux != null; aux = aux.prox) {
			System.out.println(aux.valor);

		}
	}
}
