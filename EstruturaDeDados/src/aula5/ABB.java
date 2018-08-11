package aula5;

public class ABB {
	private No raiz;

 
    public No buscaR(No p, int k) {
    	if(p != null) {
    		if(k < p.valor) {
    			p.esq = buscaR(p.esq, k);
    		}else if(k > p.valor) {
    			p.dir = buscaR(p.dir, k);
    		}
    	}
    	return p;
    }
    public boolean buscaboll(int k) {
    	No aux = buscaR(raiz, k);
    	if(aux == null)return false;
    	return true;
    }
    public void preOrder(No p) {
    	if(p != null) {
    		System.out.println(p.valor);
    		preOrder(p.esq);
    		preOrder(p.dir);
    	}
    }
    public void inOrdem(No p) {
    	if(p != null) {
    		inOrdem(p.esq);
    		System.out.println(p.valor);
    		inOrdem(p.dir);
    	}
    }
    public void posOrdem(No p) {
    	if(p != null) {
    		
    		posOrdem(p.esq);
    		posOrdem(p.dir);
    		System.out.println(p.valor);
    	}
    }
    
    public void inserirI(int dado) {
    	No novo = new No(dado);
    	if(raiz == null)
    		raiz = novo;
    		
    	else {
    		No aux = raiz;
    		No ant = null;
    		while(aux != null) {
    			ant = aux;
    			if(dado < aux.valor)
    				aux = aux.esq;
    			else if(dado > aux.valor)
    				aux = aux.dir;
    			else if(dado == aux.valor)
    				return;
    		}
    		if(dado < ant.valor)
    			ant.esq = novo;
    			else
    			ant.dir = novo;
    	}
    }
    public void mostrar() {
    	preOrder(raiz);
    	inOrdem(raiz);
    }

}
