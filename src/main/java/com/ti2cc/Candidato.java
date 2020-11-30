package com.ti2cc;


public class Candidato {
	private String cpf;
	private String nome;
	private String email;
	private String nomeUrna;
	private String nascionalidade;
	private String municipioNascimento;
	private String ufNascimento;
	private String idade;
	private String genero;
	private String ocupacao;
	private String grauInstrucao;
	
	
	
	
	public Candidato(String cpf, String nome, String email, String nomeUrna, String nascionalidade,
			String municipioNascimento, String ufNascimento, String idade, String genero, String ocupacao,
			String grauInstrucao) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.nomeUrna = nomeUrna;
		this.nascionalidade = nascionalidade;
		this.municipioNascimento = municipioNascimento;
		this.ufNascimento = ufNascimento;
		this.idade = idade;
		this.genero = genero;
		this.ocupacao = ocupacao;
		this.grauInstrucao = grauInstrucao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNomeUrna() {
		return nomeUrna;
	}
	public void setNomeUrna(String nomeUrna) {
		this.nomeUrna = nomeUrna;
	}
	public String getNascionalidade() {
		return nascionalidade;
	}
	public void setNascionalidade(String nascionalidade) {
		this.nascionalidade = nascionalidade;
	}
	public String getMunicipioNascimento() {
		return municipioNascimento;
	}
	public void setMunicipioNascimento(String municipioNascimento) {
		this.municipioNascimento = municipioNascimento;
	}
	public String getUfNascimento() {
		return ufNascimento;
	}
	public void setUfNascimento(String ufNascimento) {
		this.ufNascimento = ufNascimento;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getOcupacao() {
		return ocupacao;
	}
	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}
	public String getGrauInstrucao() {
		return grauInstrucao;
	}
	public void setGrauInstrucao(String grauInstrucao) {
		this.grauInstrucao = grauInstrucao;
	}
	@Override
	public String toString() {
		return "Candidato [cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", nomeUrna=" + nomeUrna
				+ ", nascionalidade=" + nascionalidade + ", municipioNascimento=" + municipioNascimento
				+ ", ufNascimento=" + ufNascimento + ", idade=" + idade + ", genero=" + genero
				+ ", ocupacao=" + ocupacao + ", grauInstrucao=" + grauInstrucao + ", getCpf()=" + getCpf()
				+ ", getNome()=" + getNome() + ", getEmail()=" + getEmail() + ", getNomeUrna()=" + getNomeUrna()
				+ ", getNascionalidade()=" + getNascionalidade() + ", getMunicipioNascimento()="
				+ getMunicipioNascimento() + ", getUfNascimento()=" + getUfNascimento() + ", getDataNasicmento()="
				+ getIdade() + ", getGenero()=" + getGenero() + ", getOcupacao()=" + getOcupacao()
				+ ", getGrauInstrucao()=" + getGrauInstrucao() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
