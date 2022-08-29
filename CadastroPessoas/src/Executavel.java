import java.util.ArrayList;
import java.util.Scanner;

public class Executavel {
	public static void main(String[] args) {
		int QntPessoas, CPF, idade;
		String Nome;
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<CadastroPessoas> listaDePessoas = new ArrayList<>();

		do {
			System.out.println("MENU" 
					+ "\n1 - Cadastrar uma pessoa" 
					+ "\n2 - Editar um cadastro" 
					+ "\n3 - Remover um cadastro"
					+ "\n4 - Listar os cadastros" 
					+ "\n5 - Fechar");
			
			int escolha = sc.nextInt();
			
			switch (escolha) {
			case 1:
		System.out.println("Qual o nome da pessoa que você deseja cadastrar");
		Nome = sc.next();
		System.out.println("Qual o CPF desta pessoa");
		CPF = sc.nextInt();
		System.out.println("Qual a idade desta pessoa");
		idade = sc.nextInt();
		
			}
			switch (escolha) {
			case 2:
				System.out.println("Digite o novo nome");
				Nome = sc.next();
			}
			switch (escolha) {
			case 3:
				System.out.println("Digite o CPF da pessoa que você deseja tirar da lista de cadastro");
				CPF = (Integer) null;
			}
			switch (escolha) {
			case 4:
				System.out.println("ArrayList");
			}
		} while(true);
	}
}