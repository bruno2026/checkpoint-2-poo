public class Endereco {
	private Integer id;
	private String rua;
	private String estado;
	private String pais;

	public Endereco(Integer id, String rua, String estado, String pais) {
		this.id = id;
		this.rua = rua;
		this.estado = estado;
		this.pais = pais;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
}
