package com.ti2cc;

public class Usuario {
	private int idUsuario;
	private String usuario;
	private String senha;
	
	public Usuario() {
		this.idUsuario = -1;
		this.usuario = "";
		this.senha = "";
	}
	
	public Usuario(int idUsuario, String usuario, String senha) {
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.senha = senha;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", usuario=" + usuario + ", senha=" + senha + "]";
	}
	
}
