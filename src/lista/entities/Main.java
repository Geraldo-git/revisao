package lista.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> func = new ArrayList<>();

        System.out.println("Quantos funcionários deseja cadastrar: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("Funcionario #" + i);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            func.add(new Funcionario(id, nome, salario));
        }

        System.out.println("Digite o id do funcionário que receberá o aumento: ");
        int opt = sc.nextInt();
        Funcionario ident = func.stream().filter(x -> x.getId() == opt).findFirst().orElse(null);
        if (ident == null) {
            System.out.println("Id inválido");
        } else {
            System.out.println("Digite o percentual do aumento: ");
            double percent = sc.nextDouble();
            ident.aumentaSalario(percent);
        }
        func.forEach(System.out::println);

        sc.close();
    }
}
