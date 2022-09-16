import java.util.ArrayList;

public class Time {
    private Integer id;
    private String nome;
    private ArrayList<Jogador> listaJogadores = new ArrayList<>();

    public Time(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public void addPartida(Jogador jogador) {
    	listaJogadores.add(jogador);
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
