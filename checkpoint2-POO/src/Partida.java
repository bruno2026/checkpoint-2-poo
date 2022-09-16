import java.time.LocalDate;

public class Partida {
	private Integer id;
	private LocalDate data;
	private Integer pontuacaoMandante;
	private Integer pontuacaoVisitante;
	private Time timeVisitante;
	private Time timeMandante;

	public Partida() {
		super();
	}

	public Partida(Integer id, LocalDate data, Integer pontuacaoMandante, Integer pontuacaoVisitante) {
		super();
		this.id = id;
		this.data = data;
		this.pontuacaoMandante = pontuacaoMandante;
		this.pontuacaoVisitante = pontuacaoVisitante;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Integer getPontuacaoMandante() {
		return pontuacaoMandante;
	}

	public void setPontuacaoMandante(Integer pontuacaoMandante) {
		this.pontuacaoMandante = pontuacaoMandante;
	}

	public Integer getPontuacaoVisitante() {
		return pontuacaoVisitante;
	}

	public void setPontuacaoVisitante(Integer pontuacaoVisitante) {
		this.pontuacaoVisitante = pontuacaoVisitante;
	}

	public Time getTimeVisitante() {
		return timeVisitante;
	}

	public void setTimeVisitante(Time timeVisitante) {
		this.timeVisitante = timeVisitante;
	}

	public Time getTimeMandante() {
		return timeMandante;
	}

	public void setTimeMandante(Time timeMandante) {
		this.timeMandante = timeMandante;
	}

	
}
