package com.ti2cc;

public class Comentarios {
	private int id;
	private boolean gostei;
	private boolean naoGostei;
	private int candidaturaId;
	
	
	public Comentarios() {
		this.id = -1;
		this.gostei = false;
		this.naoGostei = false;
		this.candidaturaId = -1;	
	}
	
	public Comentarios(int id, boolean gostei, boolean naoGostei,  int candidaturaId) {
		this.id = id;
		this.gostei = gostei;
		this.naoGostei = naoGostei;
		this.candidaturaId = candidaturaId;
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

	@Override
	public String toString() {
		return "Avaliacao [id=" + id + ", gostei=" + gostei + ", naoGostei=" + naoGostei + ", candidaturaId="
				+ candidaturaId + ", getId()=" + getId() + ", isGostei()=" + isGostei() + ", isNaoGostei()="
				+ isNaoGostei() + ", getCandidaturaId()=" + getCandidaturaId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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
	
	
}
