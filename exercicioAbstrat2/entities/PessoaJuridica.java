package entities;

public class PessoaJuridica extends Pessoa {
	private Integer numFuncionarios;

	public PessoaJuridica() {
	}

	public PessoaJuridica(String nome, Double rendaAnual, int numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public Double impostoPago() {
		if (numFuncionarios > 10) {
			return getRendaAnual() * 0.14;
		} else {
			return getRendaAnual() * 0.16;
		}

	}

}
