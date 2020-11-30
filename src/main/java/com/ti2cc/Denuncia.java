package com.ti2cc;

public class Denuncia {
	private int id;
	private String acusado;
	private int quantidade;
	private int id_usuario;
	
	public Denuncia() {
		this.id = -1;
		this.acusado = "";
		this.quantidade = 0;
		this.id_usuario = -1;
	}
	
	public Denuncia(int id, String acusado, int quantidade, int idUsuario) {
		this.id = id;
		this.acusado = acusado;
		this.quantidade = quantidade;
		this.id_usuario = idUsuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAcusado() {
		return acusado;
	}

	public void setAcusado(String acusado) {
		this.acusado = acusado;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	@Override
	public String toString() {
		return "Denuncia [id=" + id + ", acusado=" + acusado + ", quantidade=" + quantidade + ", id_usuario="
				+ id_usuario + ", getId()=" + getId() + ", getAcusado()=" + getAcusado() + ", getQuantidade()="
				+ getQuantidade() + ", getId_usuario()=" + getId_usuario() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
