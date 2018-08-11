package aula6;

public class Mainnnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap h = new Heap(5);
		h.add(10);
		h.add(13);
		h.add(18);
		h.add(24);
		//h.add(4);
		h.imprimir();
		h.remove(1);
		//h.add(21);
		System.out.println("\n");
		h.imprimir();
		
	}

}
