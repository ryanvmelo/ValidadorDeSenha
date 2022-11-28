import java.util.Scanner;

public class ValidadorDeSenha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = 2022;
		System.out.println("Digite a senha:");
		senha = sc.nextInt();
		if (senha == 2022) {
			System.out.println("Acesso garantido!");
		}else{
			System.out.println("Acesso negado!");
		}
		while (senha != 2022) {
		senha = sc.nextInt();
		if (senha == 2022) {
			System.out.println("Acesso garantido!");
		}else{
			System.out.println("Acesso negado");
		}
		}
		
	}

}
