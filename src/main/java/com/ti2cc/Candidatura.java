package com.ti2cc;

public class Candidatura {
	private int id;
	private String ano;
	private String cidade;
	private String uf;
	private String cargo;
	private String partidoComposicao;
	private int dispesaMax;
	private Candidato candidato;
	private int qtdLike;
	private int qtdDeslike;
	private boolean liked;
	private boolean desliked;
	private Avaliacoes avaliacoes;
	
	public Candidatura(int id, String ano, String cidade, String uf, String cargo, String partidoComposicao,
			int dispesaMax, boolean liked, boolean desliked, Candidato candidato, Avaliacoes avaliacao) {
		super();
		this.id = id;
		this.ano = ano;
		this.cidade = cidade;
		this.uf = uf;
		this.cargo = cargo;
		this.partidoComposicao = partidoComposicao;
		this.dispesaMax = dispesaMax;
		this.candidato = candidato;
		this.qtdDeslike = 0;
		this.qtdDeslike = 0;
		this.liked = liked;
		this.desliked = desliked;
		this.avaliacoes = avaliacao;
	}
	
	


	public boolean isLiked() {
		return liked;
	}




	public void setLiked(boolean liked) {
		this.liked = liked;
	}




	public boolean isDesliked() {
		return desliked;
	}




	public void setDesliked(boolean desliked) {
		this.desliked = desliked;
	}




	@Override
	public String toString() {
		return "Candidatura [id=" + id + ", ano=" + ano + ", cidade=" + cidade + ", uf=" + uf + ", cargo=" + cargo
				+ ", partidoComposicao=" + partidoComposicao + ", dispesaMax=" + dispesaMax + ", candidato=" + candidato
				+ ", qtdLike=" + qtdLike + ", qtdDeslike=" + qtdDeslike + ", liked=" + liked + ", desliked=" + desliked
				+ ", avaliacoes=" + avaliacoes + ", getId()=" + getId() + ", getAno()=" + getAno() + ", getCidade()="
				+ getCidade() + ", getUf()=" + getUf() + ", getCargo()=" + getCargo() + ", getPartidoComposicao()="
				+ getPartidoComposicao() + ", getDispesaMax()=" + getDispesaMax() + ", getCandidato()=" + getCandidato()
				+ ", getQtdLike()=" + getQtdLike() + ", getQtdDeslike()=" + getQtdDeslike() + ", getAvaliacoes()="
				+ getAvaliacoes() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getAno() {
		return ano;
	}




	public void setAno(String ano) {
		this.ano = ano;
	}




	public String getCidade() {
		return cidade;
	}




	public void setCidade(String cidade) {
		this.cidade = cidade;
	}




	public String getUf() {
		return uf;
	}




	public void setUf(String uf) {
		this.uf = uf;
	}




	public String getCargo() {
		return cargo;
	}




	public void setCargo(String cargo) {
		this.cargo = cargo;
	}




	public String getPartidoComposicao() {
		return partidoComposicao;
	}




	public void setPartidoComposicao(String partidoComposicao) {
		this.partidoComposicao = partidoComposicao;
	}




	public int getDispesaMax() {
		return dispesaMax;
	}




	public void setDispesaMax(int dispesaMax) {
		this.dispesaMax = dispesaMax;
	}




	public Candidato getCandidato() {
		return candidato;
	}




	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}




	public int getQtdLike() {
		return qtdLike;
	}




	public void setQtdLike(int qtdLike) {
		this.qtdLike = qtdLike;
	}




	public int getQtdDeslike() {
		return qtdDeslike;
	}




	public void setQtdDeslike(int qtdDeslike) {
		this.qtdDeslike = qtdDeslike;
	}




	public Avaliacoes getAvaliacoes() {
		return avaliacoes;
	}




	public void setAvaliacoes(Avaliacoes avaliacoes) {
		this.avaliacoes = avaliacoes;
	}



	
	

	
	
	
	
	
	
}
