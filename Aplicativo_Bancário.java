package Aplicativo_Bancário;

import java.util.Random;
import java.util.Scanner;

public class Aplicativo_Bancário {

	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
		
		// Registro:
		
    System.out.println("Olá Usuário! Vamos começar?");
	System.out.println("Digite seu nome de usuário no campo abaixo: ");
    String criar_nome = sc.nextLine(); 
    System.out.println();
		
	String regex = "^[a-zA-Z0-9._%+-]+@(outlook|gmail|hotmail|yahoo)\\.(com|com\\.br)$";
		
	 System.out.println("Digite seu e-mail no campo abaixo: ");
	 String usar_email = "";
	 while (true) {  
	 usar_email = sc.nextLine(); 
	 System.out.println();
		
	 
	   // E-mail:
	 
	 if (usar_email.matches(regex)) { 
     break; 
     } else {
     System.err.println("E-mail inválido. Certifique-se de que o e-mail tenha um dos seguintes domínios: "
     + "outlook, @gmail, @hotmail, @yahoo.com");
     System.out.println("Tente novamente:");
       }
	 }
	 
	 
	  // Criar senha:
	 
	System.out.println("Crie uma senha:");
	String criar_senha = sc.nextLine();
	System.out.println();
		
	System.out.println("Conta Craida! Agora vamos ao login:");
		
	
		
	// Login
	
	String op;
    
    System.out.print("Você deseja logar usando seu e-mail ou seu nome de usuário? ");
	System.out.println("Se deseja usar o e-mail, digite 'e'");
	System.out.println("Se deseja usar o nome de usuário, digite 'n'");
	while (true) {
	op = sc.nextLine();
	System.out.println();
		
	if (op.equals("e") || op.equals("n")) {
        break; 
    } else {
        System.err.println("Erro: Método de login inválido. Tente novamente:");
    }
    }

	// Login com e-mail:
		
	if (op.equals("e")) {
		
	System.out.println("Digite seu e-mail no campo abaixo: ");
	while (true) {     		 
	String email = sc.nextLine();
	System.out.println();
		
	if (email.equals(usar_email)) {
	break; 
	
    } else { 
    System.err.println("Este e-mail não existe ou está incorreto. Tente novamente: ");
    }
	}
	}
	
	
	// Login com nome de usuário:
		
	if (op.equals("n")) {
			
	System.out.println("Digite seu nome de usuário no campo abaixo: ");
	while (true) {
	String nome = sc.nextLine();
	     
	if (nome.equals(criar_nome)) {
	System.out.println();
	break;
	
	} else {
	System.err.println("Este nome de usuário não existe ou está incorreto. Tente novamente: ");
	  }
	 }
	}
	
	System.out.println("Digite sua senha no campo abaixo: ");
    while (true) {
	String senha = sc.nextLine();
	System.out.println();
	
		
	if (senha.equals(criar_senha)) {
	System.out.println("Login realizado com sucesso! Seja bem vindo, "+criar_nome+"!");
	System.out.println();
	break;
	} else { 
    System.err.println("Senha incorreta. Tente novamente: ");
    }
    }
		
    Random rd = new Random();
    double saldo = rd.nextDouble(501) + 500;
    
    while (true) {
    
    System.out.println("Qual operação bancária você deseja realizar?");
    System.out.println("Para depósito, digite 'dp'");
    System.out.println("Para saque, digite 'sq'");
    System.out.println("Para consultar seu saldo, digite 'cs'");
    System.out.println("Para sair, digite 'sair'");
   
    while (true) {
    System.out.print("Operação: ");
    String op1 = sc.nextLine();
    System.out.println();
      
    // Consultar saldo:
    
    if (op1.equals("cs")) {
    System.out.printf("Seu saldo é de R$ %.2f\n", saldo);
    System.out.println();
    break;
   
    // Depósito:
    
    } else if (op1.equals("dp")) {
    System.out.printf("Seu saldo é de R$ %.2f\n", saldo);
    System.out.println();
    System.out.print("Quanto você deseja depositar? ");
    double dpst = sc.nextDouble();
    sc.nextLine();
    saldo += dpst;
    System.out.printf("Saldo atual: %.2f\n", + saldo + dpst);
    System.out.println();
    break;
   
    // Saque:
    
    } else if (op1.equals("sq")) {
    System.out.printf("Depósito realizado! Novo saldo: R$ %.2f\n", saldo);
    System.out.print("Quanto deseja sacar? ");
    double saque = sc.nextDouble();
    sc.nextLine();

    if (saque > saldo) {
    System.err.println("Erro: Saldo insuficiente.");
    } else {
    saldo -= saque;
    System.out.printf("Saque realizado! Novo saldo: R$ %.2f\n", saldo);
    }
    
    // Sair:
    
    } else if (op1.equals("sair")) {
    System.out.println("Você saiu.");
    sc.close();
    return;
    
    // Operação Inválida:
    
    } else {
    System.err.println("Erro: Operação inválida.");
    
        }
      }
    }
  }
}
  
