package exercicio02;

public class Carro {
    
    private String nome;
	private String marca;
	private int id;
	private String cor;
	
	public Carro() {
		this.nome = "";
		this.marca = "";
		this.id = 0;
		this.cor = "";
	}

    public Carro(String nome, String marca, int id, String cor) {
		this.nome = nome;
		this.marca = marca;
		this.id = id;
		this.cor = cor;
	}
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String toString() {
		return "Carro [nome=" + nome + ", marca=" + marca + ", id=" + id + ", cor=" + cor + "]";
	}	
    
}
