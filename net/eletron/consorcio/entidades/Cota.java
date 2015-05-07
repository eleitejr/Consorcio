package net.eletron.consorcio.entidades;

public class Cota {
	private String tipo;
	private int numero;
	private Pessoa consorciado;
	private Pagamento[] pagamento;
	private String status;

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setConsorciado(Pessoa consorciado) {
		this.consorciado = consorciado;
	}

	public void setPagamento(Pagamento[] pagamento) {
		this.pagamento = pagamento;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTipo() {
		return tipo;
	}

	public int getNumero() {
		return numero;
	}

	public Pessoa getConsorciado() {
		return consorciado;
	}

	public Pagamento[] getPagamento() {
		return pagamento;
	}

	public String getStatus() {
		return status;
	}

	public Cota(String tipo, int numero, Pessoa consorciado,
			Pagamento[] pagamento, String status) {
		super();
		this.tipo = tipo;
		this.numero = numero;
		this.consorciado = consorciado;
		this.pagamento = pagamento;
		this.status = status;
	}

}

