public class Filme {
    private Plataforma plataforma;
    private Tema tema;
    private String nome;
    private int  duracao;

    public Filme(){};

    public Filme(final Plataforma plataforma, final Tema tema, final String nome){
        this.plataforma = plataforma;
        this.tema = tema;
        this.nome = nome;
    };

    public Filme(final Plataforma plataforma, final Tema tema, final String nome, final int duracao){
        this.plataforma = plataforma;
        this.tema = tema;
        this.nome = nome;
        this.duracao = duracao;
    };

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append(this.plataforma + ":\n");
        str.append("Tema: " + this.tema + "\n");
        str.append("Nome: " + this.nome + "\n");
        str.append("Duracao em minutos: " + this.duracao);
        return String.valueOf(str);
    }
}
