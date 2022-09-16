public class Jogador implements Comparable<Jogador> {
	private Integer id;
	private String nome;
	private int anoNascimento;
	private String genero;
	private Double altura;
	private Boolean aptoAjogar;
	private Time time;
	
	
	//sobre carga
	public Jogador() {
		super();
	}

	public Jogador(Integer id, String nome, int anoNascimento, String genero, Double altura, Boolean aptoAjogar) {
		super();
		this.id = id;
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.genero = genero;
		this.altura = altura;
		this.aptoAjogar = aptoAjogar;
	}

	public Jogador(Integer id, String nome, int anoNascimento, String genero, Double altura, Boolean aptoAjogar,
			Time time) {
		super();
		this.id = id;
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.genero = genero;
		this.altura = altura;
		this.aptoAjogar = aptoAjogar;
		this.time = time;
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

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Boolean getAptoAjogar() {
		return aptoAjogar;
	}

	public void setAptoAjogar(Boolean aptoAjogar) {
		this.aptoAjogar = aptoAjogar;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	//uso da sobreEscrita
	@Override
	public int compareTo(Jogador o) {
		if(o.anoNascimento == this.anoNascimento) {
			System.out.println("O jogador " + o.nome + " tem a mesma idade que o " + this.nome);
			return 0;
		}else if (o.anoNascimento < this.anoNascimento){
			System.out.println("O jogador " + o.nome + " é mais velho que o " + this.nome);
			return -1;
		} else {
			System.out.println("O jogador " + o.nome + " é mais novo que o " + this.nome);
			return 1;
		}
		}

}
