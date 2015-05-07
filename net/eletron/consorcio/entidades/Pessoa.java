package net.eletron.consorcio.entidades;

import java.util.Date;

public class Pessoa {
	private String cpf;
	private String rg;
	private String pnome;
	private String sobrenome;
	private Date dataNasc;


	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getPnome() {
		return pnome;
	}
	public void setPnome(String pnome) {
		this.pnome = pnome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}


	public Pessoa(String cpf, String rg, String pnome, String sobrenome,
			Date dataNasc) {
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.pnome = pnome;
		this.sobrenome = sobrenome;
		this.dataNasc = dataNasc;
	}


}
