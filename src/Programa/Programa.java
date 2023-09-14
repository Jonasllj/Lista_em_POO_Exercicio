package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("Digite quantos funcionarios são: ");
		int n;
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Funcionario #"+i +": ");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome : ");
			String nome = sc.nextLine();
			System.out.println("Salario");
			double salario = sc.nextDouble();
			lista.add(new Funcionario(id, nome, salario));
		}
		
		System.out.println("Digite o ID do funcionario que vai ter o salario incrementado:");
		int id;
		id =sc.nextInt();
		Funcionario f1 = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (f1 == null) {
			System.out.println("Esse ID nao existe!");
		}
		else {
			System.out.print("Entre com o percentual ");
			double percentage = sc.nextDouble();
			f1.incrementoSalario(percentage);
		}
		
		
		System.out.println();
		System.out.println("List of employees:");
		for (Funcionario obj : lista) {
			System.out.println(obj);
		}

	}
}

