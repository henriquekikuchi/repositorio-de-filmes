import java.util.Scanner;

public class Programa {
    public static void main (String[] args) {

        boolean continuar = true;
        Scanner sc;
        RepositorioFilme repositorio = new RepositorioFilme();

        while (continuar) {
            repositorio.formAdicionar();
            System.out.println("Deseja Adicionar mais filmes?\n1.SIM\n2.NÃO");
            sc = new Scanner(System.in);
            int op = sc.nextInt();
            continuar = (op == 1);
            System.out.println();
        }

        repositorio.relatorioDeFilmes();

    }
}
