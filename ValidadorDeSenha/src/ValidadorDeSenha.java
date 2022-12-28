import java.util.Scanner;

public class ValidadorDeSenha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		System.out.print("Digite a senha:");
		senha = sc.nextInt();
		
		do {
			System.out.println("Acesso negado!");
			System.out.print("Digite novamente: ");
			senha = sc.nextInt();
		}while (senha != 2022);
		
		System.out.println("Acesso garantido");
	}

}
