package com.ti2cc;

public class Avaliacao {
	private int id;
	private boolean gostei;
	private boolean naoGostei;
	private int candidaturaId;
	private int usuarioId;
	private String comentario;
	private String nomeUsuario;
	
	public Avaliacao(int id, boolean gostei, boolean naoGostei,  int candidaturaId, int usuarioId, String comentario, String nomeUsuario) {
		this.id = id;
		this.gostei = gostei;
		this.naoGostei = naoGostei;
		this.candidaturaId = candidaturaId;
		this.usuarioId = usuarioId;
		this.setComentario(comentario);
		this.setNomeUsuario(nomeUsuario);
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public boolean isGostei() {
		return gostei;
	}


	public void setGostei(boolean gostei) {
		this.gostei = gostei;
	}


	public boolean isNaoGostei() {
		return naoGostei;
	}


	public void setNaoGostei(boolean naoGostei) {
		this.naoGostei = naoGostei;
	}


	public int getCandidaturaId() {
		return candidaturaId;
	}


	public void setCandidaturaId(int candidaturaId) {
		this.candidaturaId = candidaturaId;
	}


	public int getUsuarioId() {
		return usuarioId;
	}


	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}


	@Override
	public String toString() {
		return "Avaliacao [id=" + id + ", gostei=" + gostei + ", naoGostei=" + naoGostei + ", candidaturaId="
				+ candidaturaId + ", usuarioId=" + usuarioId + ", getId()=" + getId() + ", isGostei()=" + isGostei()
				+ ", isNaoGostei()=" + isNaoGostei() + ", getCandidaturaId()=" + getCandidaturaId()
				+ ", getUsuarioId()=" + getUsuarioId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	public String getComentario() {
		return comentario;
	}


	public void setComentario(String comentario) {
		this.comentario = comentario;
	}


	public String getNomeUsuario() {
		return nomeUsuario;
	}


	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	
}
