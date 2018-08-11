package projeto_final;
import java.util.Scanner;

public class Control {
	private ListaEncadeada listaProcessos = new ListaEncadeada();
	private Scanner input = new Scanner(System.in);
	private Scanner inputS = new Scanner(System.in);
	private Hash listaUsuario = new Hash();
	private Usuario usuario;
	private Heap heap = new Heap(100);
	private int cont = 1;

	public Control() {
		listaUsuario.adicionar(new Usuario("warlim", 2324, 2222, "secretario"));
		listaUsuario.adicionar(new Usuario("terezinha", 1114, 12345, "secretario"));
		listaUsuario.adicionar(new Usuario("maria", 2222, 2222, "secretario"));
		listaUsuario.adicionar(new Usuario("geralt", 5678, 12345, "transportador"));
		listaUsuario.adicionar(new Usuario("buker", 1200, 12345, "transportador"));
		listaUsuario.adicionar(new Usuario("clove", 1313, 12345, "transportador"));
		listaUsuario.adicionar(new Usuario("sam", 2202, 12345, "transportador"));
		listaUsuario.adicionar(new Usuario("alex", 1699, 12345, "transportador"));
	}

	public void documentacaoInicial() {
		limpar();
		Documento doc = new Documento(cont);

		System.out.println("Informe o nome do aluno: ");
		doc.getAluno().setNome(inputS.nextLine());
		limpar();

		System.out.println("Informe os dados do livro:");
		System.out.println("-> nome:");
		doc.getLivro().setNome(inputS.nextLine());
		System.out.println("-> autor:");
		doc.getLivro().setAutor(inputS.nextLine());
		System.out.println("-> volume:");
		doc.getLivro().setVolumeDoLivro(inputS.nextLine());
		limpar();

		listaProcessos.adicionar(doc);
		System.out.println("Pedido cadastrado.");
		enter();

		cont++;
	}

	private Documento cadastraDocumento(Documento documento) {
		do {
			System.out.println("Defina a prioridade do documento: \n => Valor entre <0 e 100>.");
			documento.setPrioridade(input.nextInt());

			if (documento.getPrioridade() < 0 || documento.getPrioridade() > 100)
				System.out.println("Prioridade invalida");
			enter();
			limpar();

		} while (documento.getPrioridade() < 0 || documento.getPrioridade() > 100);

		System.out.println("Usuario: " + usuario.getNome() + " Ativo.");

		System.out.println("Informe o campus atual do livro: ");
		documento.getLivro().setCampuLivro(inputS.nextLine());

		System.out.println("Informe o campus atual do aluno: ");
		documento.getAluno().setCampus(inputS.nextLine());

		return documento;
	}

	private Usuario verificar(String credencial) {
		limpar();
		int cpf, senha;
		System.out.println("digite seu cpf:");
		cpf = input.nextInt();

		System.out.println("Digite sua senha:");
		senha = input.nextInt();

		usuario = listaUsuario.buscar(cpf, senha, credencial);

		return usuario;
	}

	public void autenticarSecretario() {
		verificar("secretario");
		limpar();
		if (usuario != null) {
			System.out.println("Usuario: " + usuario.getNome() + " Ativo.");
			if (listaProcessos.contador > 0) {

				Documento doc = listaProcessos.removes();
				doc.conteudoDocumento();
				enter();
				limpar();
				doc.setResponsavel(usuario.getNome());
				heap.add(cadastraDocumento(doc));
				limpar();
				System.out.println("Documento adicionado a fila.");
				enter();
				return;
			}
			System.out.println("Nenhum documento disponivel.");
			enter();
			return;
		} else {
			System.out.println("usuario invalido.");
			enter();
			return;
		}
	}

	public void autenticarTransportador() {
		verificar("transportador");
		limpar();
		if (usuario != null) {
			limpar();
			System.out.println("Usuario: " + usuario.getNome() + " ativo");
			if (heap.getCont() > 0) {
				Documento doc = heap.remove();
				System.out.println("Documento transportado");
				enter();
				return;
			}
			System.out.println("Nenhum documento disponivel para transporte.");
			enter();
			return;
		}else {
			System.out.println("usuario invalido.");
			enter();
			return;
		}
	}

	public void limpar() {
		System.out.println(
				"\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n  ");
	}

	private void enter() {
		System.out.println("Pressione ENTER para continuar!");
		inputS.nextLine();
	}

	public Heap getHeap() {
		return heap;
	}
	

}
