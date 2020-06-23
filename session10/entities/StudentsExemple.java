package entities;

public class StudentsExemple {
	private String nome;
	private Integer serie;
	private Double nota1;
	private Double nota2;
	private Double media;
	private String situacao;
	
	public StudentsExemple() {
	}
	
	public StudentsExemple(String nome, Integer serie, Double nota1, Double nota2) {
		this.nome = nome;
		this.serie = serie;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getSerie() {
		return serie;
	}

	public void setSerie(Integer serie) {
		this.serie = serie;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	
	public void setMedia(Double nota1, Double nota2) {
		this.media = (nota1 + nota2) / 2;
	}
	
	public Double getMedia() {
		setMedia(this.nota1, this.nota2);
		return media;
	}

	public String getSituacao() {
		setSituacao(this.media);
		return situacao;
	}

	public void setSituacao(Double media) {
		if (media > 6) {
			this.situacao = "Aprovado";
		}else {
			this.situacao = "Reprovado";
		}
	}
	
	public String toString() {
		return nome + " ," + " Serie:" + serie + " , Media " + getMedia() + " , Situação:" + getSituacao();
	}
}
