package Módulo1;

import java.util.Scanner;

public class CriarConta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Registro
		
		System.out.println("Olá Usuário! Vamos começar?");
		System.out.println("Digite seu nome de usuário no campo abaixo: ");
		String criar_nome = sc.nextLine(); 
		
		System.out.println("Digite seu e-mail no campo abaixo: ");
		String usar_email = sc.nextLine(); 
        
		System.out.println("Crie uma senha:");
		int criar_senha = sc.nextInt();
		
		System.out.println("Conta Craida! Agora vamos ao login:");
		
		sc.nextLine();
		
		//Login
		
		System.out.print("Você deseja logar usando seu e-mail ou seu nome de usuário? ");
		System.out.println("Se deseja usar o e-mail, digite 'e'");
		System.out.println("Se deseja usar o nome de usuário, digite 'n'");
		String op = sc.nextLine();
		
		if (op.equals("e")) {
		
		 System.out.println("Digite seu e-mail no campo abaixo: ");
		 while (true) {
		 String email = sc.nextLine();
		
		 if (email.equals(usar_email)) {
		 System.out.println();
		 break;
		 } else { 
         System.err.println("Este e-mail não existe ou está incorreto. Tente novamente: ");
		 }
		 }
		}
		 
		if(op.equals)
		 
		 
		 
		 
		System.out.println("Digite sua senha no campo abaixo: ");
		while (true) {
		int senha = sc.nextInt();
		
		if (senha == criar_senha) {
		System.out.println();
	    System.out.println("Login realizado com sucesso! Seja bem vindo, "+criar_nome);
		break;
		} else { 
        System.err.println("Senha incorreta. Tente novamente: ");
		}
		}
		
		sc.close();
		
		
	}

}
