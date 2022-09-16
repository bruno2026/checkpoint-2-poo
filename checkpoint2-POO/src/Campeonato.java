import java.util.ArrayList;
import java.time.LocalDate;

public class Campeonato {
	private Integer id;
	private int ano;
	private String nome;
	private ArrayList<Partida> listaPartidas = new ArrayList<>();

	public Campeonato(Integer id, int ano, String nome) {
		super();
		this.id = id;
		this.ano = ano;
		this.nome = nome;
	}

	public void addPartida(Partida partida) throws CampeonatoExeception {
		if (partida == null) {
			throw new CampeonatoExeception("Você precisa inserir uma partida valida!");
		}
		listaPartidas.add(partida);
	}
	
	public void partidaOcorrida() {
		LocalDate dataAtual = LocalDate.now();
			for (Partida partida : listaPartidas) {
				LocalDate dataPartida = partida.getData();
				if (dataPartida.isBefore(dataAtual)) {
					System.out.println("A partida de id  " + partida.getId() + " ja foi ocorrida!");
				} else if (dataPartida.isEqual(dataAtual)) {
					System.out.println("A partida " + partida.getId() + " ocorrerá no dia de hoje!");
				} else {
					System.out.println("A partida " + partida.getId() + " ainda vai ocorrer!");
				}
			}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public ArrayList<Partida> getListaPartidas() {
		return listaPartidas;
	}

	public void setListaPartidas(ArrayList<Partida> listaPartidas) {
		this.listaPartidas = listaPartidas;
	}

}
