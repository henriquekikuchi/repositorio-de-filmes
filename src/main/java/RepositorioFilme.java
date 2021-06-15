import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class RepositorioFilme {
    Set hsRepositorio;

    public RepositorioFilme(){
        hsRepositorio = new HashSet();
    }

    public void adicionar(final Filme filme){
        if (this.hsRepositorio.contains(filme)) {
            System.out.println("Este filme já foi cadastrado");
        } else {
            this.hsRepositorio.add(filme);
        }
    }

    public boolean remover(final Filme filme){
        boolean foiRemovido;
        foiRemovido = hsRepositorio.remove(filme);
        return foiRemovido;
    }

    public int totalCadastrado(){
        int total = hsRepositorio.size();
        return total;
    }

    public void formAdicionar(){
        String plataforma,tema,nome;
        int duracao;

        Scanner sc1,sc2,sc3,sc4;

        System.out.println("Escolha uma das opções abaixo: ");

        for (Plataforma plat : Plataforma.values()){
            System.out.println("- " + plat);
        }

        sc1 = new Scanner(System.in);
        plataforma = sc1.nextLine();

        for (Tema tem : Tema.values()){
            System.out.println("- " + tem);
        }

        System.out.println("Tema: ");
        sc2 = new Scanner(System.in);
        tema = sc2.nextLine();

        System.out.println("Nome: ");
        sc3 = new Scanner(System.in);
        nome = sc3.nextLine();

        System.out.println("Duracao: ");
        sc4 = new Scanner(System.in);
        duracao = sc4.nextInt();

        Filme filme = new Filme(Plataforma.valueOf(plataforma), Tema.valueOf(tema), nome, duracao);
        this.adicionar(filme);
    }

    public void relatorioDeFilmes(){
        Iterator iterator = hsRepositorio.iterator();
        while (iterator.hasNext()){
            Filme filme = (Filme)iterator.next();
            System.out.println(filme);
            System.out.println();
        }
    }
}
